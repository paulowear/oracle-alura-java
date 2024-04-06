public class Menu {
    public static void main(String[] args) {
        int opcao = 2;
        switch (opcao){
            case 1:
                double lado = 5;
                double areaDoQuadrado = lado * lado;
                System.out.println("calcular a area do quadrado" + areaDoQuadrado);
                break;
            case 2:
                double raio = 5.0;
                double pi = 3.14159;
                double areaDoCirculo = pi * raio * raio;
                System.out.println("calcular a area do quadrado" + areaDoCirculo);
                break;
        }


        System.out.println();
    }
}
