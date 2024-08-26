public class Preguica extends Animal{


    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("A preguiça está zumbindo...");
    }

    public void subirEmArvore(){
        System.out.println("A preguiça está subindo na árvore" );
    }
}
