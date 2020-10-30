package ed.pilha;

import java.util.Stack;

public class TesteDaPilha {

    public static void main(String[] args) {
//        Pilha pilha = new Pilha();
//
//        pilha.push("Bruno");
//        System.out.println(pilha);
//
//        pilha.push("Talita");
//        System.out.println(pilha);
//
//        String r1 = pilha.pop();
//        System.out.println(r1);
//
//        String r2 = pilha.pop();
//        System.out.println(r2);
//
//        System.out.println(pilha);


        // usando Stack, modelo interno do java para pilha
        Stack<String> stack = new Stack<String>();

        // push adiciona item
        stack.push("Maurício");
        stack.push("Marcelo");
        stack.pop();
        stack.push("Guilherme");
        stack.push("Paulo");
        stack.pop();
        stack.push("João");

        System.out.println(stack);

        // pop remove o último item
//        System.out.println(stack.pop());
//        System.out.println(stack);
//
//        // mostra o último item adicionado, não remove
//        System.out.println(stack.peek());
    }
}
