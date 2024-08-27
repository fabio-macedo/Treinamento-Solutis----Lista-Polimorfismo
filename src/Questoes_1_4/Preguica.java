package Questoes_1_4;

public class Preguica extends Animal{


    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("A preguiça está zumbindo...");
    }

    public void emMovimento() {
        System.out.println(this.getNome() + " está subindo na árvore");
    }
}
