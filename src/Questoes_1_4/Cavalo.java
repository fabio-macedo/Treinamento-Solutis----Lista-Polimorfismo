package Questoes_1_4;

public class Cavalo extends Animal{
    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Questoes_1_4.Cavalo relinchando...");
    }

    @Override
    public void emMovimento() {
        super.emMovimento();
    }
}
