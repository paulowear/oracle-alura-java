import java.util.ArrayList;

public class Estudos {

    public static void main(String[] args) {

        ArrayList<String> listaDeEstudo = new ArrayList<>();

        listaDeEstudo.add("Java Basico");
        listaDeEstudo.add("Programação orientada a objetos");
        listaDeEstudo.add("Collections Framework");
        listaDeEstudo.add("Spring boot");
        listaDeEstudo.add("Multithreading");

        System.out.println("Lista de estudo ");
        for (String tema : listaDeEstudo) {
            System.out.println(tema);
        }
    }
}
