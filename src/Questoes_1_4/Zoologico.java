package Questoes_1_4;

import java.util.Arrays;

public class Zoologico {

    private Animal[] jaulas = new Animal[10];

    public Zoologico() {
        jaulas[0] = new Cachorro("Rex", 3);
        jaulas[1] = new Cachorro("Bobby", 2);
        jaulas[2] = new Cachorro("Max", 4);
        jaulas[3] = new Cavalo("Spirit", 5);
        jaulas[4] = new Cavalo("Thunder", 6);
        jaulas[5] = new Cavalo("Lightning", 7);
        jaulas[6] = new Preguica("Sid", 2);
        jaulas[7] = new Preguica("Lazy", 3);
        jaulas[8] = new Preguica("Slow", 4);
        jaulas[9] = new Cachorro("Spike", 5);
    }

    public Animal[] getJaulas() {
        return jaulas;
    }

    public void setJaulas(Animal[] jaulas) {
        this.jaulas = jaulas;
    }

    public void percorrerJaula(){

        for (int i = 0; i < jaulas.length; i++){
            System.out.println("Jaula [" + (i+1) +"]");
            System.out.print(jaulas[i].getNome() + " => " + jaulas[i].getClass().getTypeName() + " - ");

            jaulas[i].emitirSom();

            if(jaulas[i] instanceof Preguica){
                continue;
            }else{
                System.out.print(" -- ");
                jaulas[i].emMovimento();
            }
        }


    }

    @Override
    public String toString() {
        return "Questoes_1_4.Zoologico{" +
                "jaulas=" + Arrays.toString(jaulas) +
                '}';
    }
}
