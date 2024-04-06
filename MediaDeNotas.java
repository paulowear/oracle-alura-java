public class MediaDeNotas {
    private static final double nota1 = 10;
    private static final double nota2 = 10;
    private static final double media = (nota1 + nota2) / 2;

    public static void main(String[] args) {

        String frase = """
                A média da das duas notas é: 
                """;
        System.out.println(frase + media);
    }
}
