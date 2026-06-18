package com.alura.artistas.service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConsultaGemini {

    public static String obterInformacao(String prompt) {
        // COLOQUE SUA CHAVE AQUI
        String apiKey = System.getenv("API_KEY");
        String url = "https://generativelanguage.googleapis.com/v1/models/gemini-2.5-flash:generateContent?key=" + apiKey;

        HttpClient client = HttpClient.newHttpClient();
        ObjectMapper mapper = new ObjectMapper();

        // O Gemini espera o JSON neste formato: { "contents": [{ "parts": [{ "text": "seu prompt" }] }] }
        String jsonBody = "{ \"contents\": [{ \"parts\": [{ \"text\": \"" + prompt + "\" }] }] }";

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(jsonBody))
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            JsonNode root = mapper.readTree(response.body());

            // 1. Verifica se houve erro na resposta da API (ex: chave inválida)
            if (root.has("error")) {
                return "Erro da API Gemini: " + root.path("error").path("message").asText();
            }

            // 2. Verifica se existem candidatos (respostas) antes de dar o get(0)
            if (root.has("candidates") && root.get("candidates").isArray() && !root.get("candidates").isEmpty()) {
                return root.path("candidates")
                        .get(0)
                        .path("content")
                        .path("parts")
                        .get(0)
                        .path("text")
                        .asText();
            }

            // 3. Se chegou aqui, a resposta veio mas sem texto (pode ser filtro de segurança)
            System.out.println("Resposta completa para análise: " + response.body());
            return "O Gemini não conseguiu gerar uma resposta para este termo.";

        } catch (Exception e) {
            return "Erro de conexão: " + e.getMessage();
        }
    }
}