import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, insira um número inteiro: ");

        int numero = scanner.nextInt();

        if (numero %2 == 0){
                System.out.println("Par");
            } else {
                System.out.println("impar");

        }



    }
}
