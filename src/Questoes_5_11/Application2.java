package Questoes_5_11;

import java.util.ArrayList;

public class Application2 {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[10];

        FuncionarioEnsinoBasico funcionario1 = new FuncionarioEnsinoBasico("Marcelo", 1516, Cargo.VENDEDOR, "Escola Semear");
        FuncionarioEnsinoBasico funcionario2 = new FuncionarioEnsinoBasico("Tiago", 1517, Cargo.VENDEDOR, "Escola Semear");
        FuncionarioEnsinoBasico funcionario3 = new FuncionarioEnsinoBasico("Zezo", 1518, Cargo.VENDEDOR, "Escola Crescendo");
        FuncionarioEnsinoBasico funcionario4 = new FuncionarioEnsinoBasico("João", 1519, Cargo.VENDEDOR, "Escola Intensivo");
        FuncionarioEnsinoMedio funcionario5 = new FuncionarioEnsinoMedio("Fábio", 2020, Cargo.VENDEDOR, "Escola Renascer");
        FuncionarioEnsinoMedio funcionario6 = new FuncionarioEnsinoMedio("Salomão", 2021, Cargo.VENDEDOR, "Escola Interactivo");
        FuncionarioEnsinoMedio funcionario7 = new FuncionarioEnsinoMedio("Hibrael", 2022, Cargo.VENDEDOR, "Escola Reviver");
        FuncionarioEnsinoMedio funcionario8 = new FuncionarioEnsinoMedio("Rubem", 2023, Cargo.SUPERVISOR, "Escola Renascença");
        FuncionarioEnsinoSuperior funcionario9 = new FuncionarioEnsinoSuperior("Enzo", 9081, Cargo.SUPERVISOR, "Universidade Federal da Paraíba");
        FuncionarioEnsinoSuperior funcionario10 = new FuncionarioEnsinoSuperior("Sidney", 9082, Cargo.GERENTE, "Universidade Federal de Pernambuco");

        ArrayList<Funcionario> func = new ArrayList<>();
        func.add(funcionario1);
        func.add(funcionario2);
        func.add(funcionario3);
        func.add(funcionario4);
        func.add(funcionario5);
        func.add(funcionario6);
        func.add(funcionario7);
        func.add(funcionario8);
        func.add(funcionario9);
        func.add(funcionario10);




        double custosFuncionarioBasico = 0;
        double custosFuncionarioMedio = 0;
        double custosFuncionarioSuperior = 0;
        double gastosTotaisComSalario = 0;

        for (Funcionario funcionario : func) {
            System.out.println(funcionario);

            //Se funcionario ter Ensino Basico incrementar gasto total especifico
            if (funcionario instanceof FuncionarioEnsinoBasico) {
                custosFuncionarioBasico += funcionario.getRendaTotal();
            }

            //Se funcionario ter Ensino Medio incrementar gasto total especifico
            if (funcionario instanceof FuncionarioEnsinoMedio) {
                custosFuncionarioMedio += funcionario.getRendaTotal();
            }

            //Se funcionario ter Ensino Medio incrementar gasto total especifico
            if (funcionario instanceof FuncionarioEnsinoSuperior) {
               custosFuncionarioSuperior += funcionario.getRendaTotal();
            }

            //incrementar gasto total
            gastosTotaisComSalario += funcionario.getRendaTotal();
        }

        System.out.println("-----  CUSTOS TOTAIS DA EMPRESA COM SALÁRIOS TOTAIS");
        System.out.printf("\nGastos com Funcionarios com Ensino Basico: R$%.2f", custosFuncionarioBasico);
        System.out.printf("\nGastos com Funcionarios com Ensino Medio: R$%.2f",  custosFuncionarioMedio);
        System.out.printf("\nGastos com Funcionarios com Graduacao: R$%.2f",  custosFuncionarioSuperior);
        System.out.print("\n=========================================");
        System.out.printf("\nA empresa tem um gasto total com Salarios de: R$%.2f",  gastosTotaisComSalario);

    }
}
