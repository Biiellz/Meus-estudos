function calcular(){
    //pegando dados
    var pesoElemento = document.getElementById("ipeso");
    var alturaElemento = document.getElementById("ialtura");

    var peso = Number(pesoElemento.value);
    var altura = Number(alturaElemento.value);

    // verificar se tm algo vazio
    if(peso === 0 || altura === 0){
        alert("Por favor complete os dados");
        return;
    }

    var imc = (peso / (altura * altura)).toFixed(2);
    var classificacao = "";

    //classificando
    if(imc <= 18.5){
        classificacao = "Abaixo do peso normal";
    }else if(imc <25){
        classificacao = "Peso normal";
    }else if(imc <35){
        classificacao = "Peso Excesso de peso";
    }else{
        classificacao = "Obesidade";
    }

    //exibir resultado
    document.getElementById("res").innerHTML = `<p> Seu IMC é; <Strong>${imc}</Strong></p>
                                                <p>Classificação: <strong>${classificacao}</strong></p>`
}