public class Comparacao {
    public static void main(String[] args) {
        int numero1 = 500;
        int numero2 = 500;
        if(numero1 == numero2){
            System.out.println("são iguais");
        } else if(numero1 != numero2){
            System.out.println("diferentes");
        } if(numero1 > numero2){
            System.out.println(numero1 + "maior");
        } if(numero2 > numero1) {
            System.out.println(numero2 + "maior");
        } if(numero1 < numero2){
            System.out.println(numero1 + "menor");
        } if(numero2 < numero1) {
            System.out.println(numero2 + "menor");
        }

    }
}
