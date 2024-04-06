public class PrecoProdutp {
    public static void main(String[] args) {
        double precoProduto = 50.00;
        int quantidade = 10;
        double resultado = precoProduto * quantidade;

        String frase = """
                O resultado do preçp vezes o produto é:
                """;
        System.out.println(frase + resultado);
    }
}
