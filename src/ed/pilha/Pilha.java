package ed.pilha;

import java.util.LinkedList;
import java.util.List;

public class Pilha {

    private List<String> nomes = new LinkedList<String>();

    // método adiciona item na pilha
    public void push(String nome) {
        nomes.add(nome);
    }

    // método remove último item adicionado á pilha
    public String pop(){
        return nomes.remove(nomes.size()-1);
    }

    public boolean vazio() {
//        return nomes.size() == 0;
        return nomes.isEmpty();
    }

    @Override
    public String toString() {
//        return "Pilha{" + "nomes=" + nomes + '}';
        return nomes.toString();
    }
}
