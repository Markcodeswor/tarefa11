package br.com.marcos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class genero {
    public static void main (String[] args) {
        System.out.println("*** Nomes Masculinos *** \n");
        List<String> lista = new ArrayList<>();
        lista.add("João Percevejo - M \n ");
        lista.add("Mario Fasconcellos - M \n");
        lista.add("Antonio João - M \n ");
        lista.add("Jacinto Oliver - M \n");
        lista.add("Paulo Eduardo - M \n");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");


        System.out.println("*** Nomes femininos *** \n ");


        lista.add("Joana Periclés - F");
        lista.add("Maria Clara - F ");
        lista.add("Antonia Eduarda -F ");
        lista.add("Joan Ninha - F ");
        lista.add("Zuneide D` Paula - F ");

        System.out.println("Joana Periclés - F ");
        System.out.println("Maria Clara - F ");
        System.out.println("Antonia Eduarda -F ");
        System.out.println("Joan Ninha - F ");
        System.out.println("Zuneide D` Paula - F ");



    }



}
