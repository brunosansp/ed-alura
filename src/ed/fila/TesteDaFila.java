package ed.fila;

import java.util.LinkedList;
import java.util.Queue;

public class TesteDaFila {

    public static void main(String[] args) {
//        Fila fila = new Fila();
//
//        fila.adiciona("Mauricio");
//        fila.adiciona("Guilherme");
//
//        System.out.println(fila);
//
//        String x1 = fila.remove();
//        System.out.println(x1);
//        System.out.println(fila);


        /*
        implementando de forma nativa do java, queue
        adiciona: add
        remove: poll
         */
        Queue<String> filaDoJava = new LinkedList<String>();

        filaDoJava.add("Mauricio");
        filaDoJava.add("Paulo");
        filaDoJava.add("Guilherme");
        String x1 = filaDoJava.poll();
        filaDoJava.add("João");
        String x2 = filaDoJava.poll();

        System.out.println(filaDoJava);

    }
}
