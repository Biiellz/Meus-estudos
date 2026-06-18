import java.util.Locale;

public class idioma {
    public static void main() {
        Locale localidade = Locale.getDefault();
        System.out.println("Idioma está em " + localidade.getDisplayLanguage());
    }
}
