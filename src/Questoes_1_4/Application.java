package Questoes_1_4;

public class Application {

        public static void main(String[] args) {
                Veterinario medico = new Veterinario();
                Zoologico zoo = new Zoologico();
                Animal cao = new Cachorro("Questoes_1_4.Cachorro", 10);
                Animal cavalo = new Cavalo("Cavalao", 10);
                Animal preguica = new Preguica("Cavalao", 10);


                cao.emMovimento();
                cao.emitirSom();

                cavalo.emMovimento();
                cavalo.emitirSom();

                preguica.emMovimento();
                preguica.emitirSom();

                System.out.println("------------ EXAME VETERINÁRIO -------------");
                medico.examinar(cao);
                medico.examinar(cavalo);
                medico.examinar(preguica);

                System.out.println("--------   JAULAS   ----------");
                zoo.percorrerJaula();


        }
}
