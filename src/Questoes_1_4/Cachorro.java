package Questoes_1_4;

public class Cachorro extends Animal{

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Questoes_1_4.Cachorro latindo...");
    }

    @Override
    public void emMovimento() {
        super.emMovimento();
    }
}
