package ed.conjunto;

//import java.util.LinkedList;

import java.util.HashSet;
import java.util.Set;

public class TesteDeConjunto {

    public static void main(String[] args) {

//        Set<String> conjuntoDoJava = new HashSet<String>();
//        conjuntoDoJava.add("Mauricio");
//        conjuntoDoJava.add("Marcelo");
//        System.out.println(conjuntoDoJava);
//
//        conjuntoDoJava.remove("Mauricio");
//        conjuntoDoJava.add("Guilherme");
//
//        System.out.println(conjuntoDoJava);
//
//        String x = "Guilherme";
//        x.hashCode();
//        System.out.println(x);



        Conjunto conjunto = new Conjunto();

        conjunto.adiciona("Mauricio");
        conjunto.adiciona("Mauricio");
        conjunto.adiciona("Guilherme");
        conjunto.adiciona("Marcelo");
        conjunto.adiciona("Paulo");
        conjunto.adiciona("Guilherme");

        System.out.println(conjunto);

        conjunto.remove("Guilherme");

        System.out.println(conjunto);

    }
}
