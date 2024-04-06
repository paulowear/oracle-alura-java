public class Desconto {
    public static void main(String[] args) {
        double precoOriginal = 50.0;
        double percentualDesconto = 10.0;
        double precoComDesconto = (precoOriginal * percentualDesconto) / 100.0;
        double NovoPreco = precoOriginal - precoComDesconto;
        System.out.println(NovoPreco);
    }
}
