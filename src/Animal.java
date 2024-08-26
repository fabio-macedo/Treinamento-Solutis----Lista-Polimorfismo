public abstract class Animal {
    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public abstract void emitirSom();

    public void correr(){
        System.out.println("O " + getClass() + " está correndo");
    }
}
