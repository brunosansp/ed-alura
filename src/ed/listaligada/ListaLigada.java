package ed.listaligada;

public class ListaLigada {
    private Celula primeiraPosicao = null;
    private Celula ultimaPosicao = null;
    private int totalDeElementos = 0;

    public void adicionaNoComeco(Object elemento) {
        Celula nova = new Celula(elemento, primeiraPosicao);
        this.primeiraPosicao = nova;

        if(this.totalDeElementos == 0) {
            this.ultimaPosicao = this.primeiraPosicao;
        }

        this.totalDeElementos++;
    }

    @Override
    public String toString() {
        if(this.totalDeElementos == 0) {
            return "[]";
        }

        Celula atual = primeiraPosicao;
        StringBuilder builder = new StringBuilder("[");

        for(int i = 0; i < totalDeElementos; i++) {
            builder.append(atual.getElemento());
            builder.append(",");

            atual = atual.getProximo();
        }

        builder.append("]");
        return builder.toString();
    }

    public void adicionaNoFinal(Object elemento) {
        if(this.totalDeElementos == 0) {
            adicionaNoComeco(elemento);
        } else {
            Celula nova = new Celula(elemento, null);
            this.ultimaPosicao.setProximo(nova);
            this.ultimaPosicao = nova;
            this.totalDeElementos++;
        }
    }

    public void adiciona(int posicao, Object elemento) {}

    public Object pega(int posicao) { return null; }

    public void remove(int posicao) {}

    public int tamanho() { return 0; }

    public boolean contem(Object o) { return false; }
}
