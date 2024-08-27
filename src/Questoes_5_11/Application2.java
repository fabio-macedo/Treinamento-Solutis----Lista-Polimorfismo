package Questoes_5_11;

public class Application2 {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[10];

        Funcionario basico1 = new FuncionarioEnsinoBasico("Marcelo", 1516, Cargo.VENDEDOR, "Escola Semear");
        Funcionario basico2 = new FuncionarioEnsinoBasico("Tiago", 1517, Cargo.VENDEDOR, "Escola Semear");
        Funcionario basico3 = new FuncionarioEnsinoBasico("Zezo", 1518, Cargo.VENDEDOR, "Escola Crescendo");
        Funcionario basico4 = new FuncionarioEnsinoBasico("João", 1519, Cargo.VENDEDOR, "Escola Intensivo");
        Funcionario medio1 = new FuncionarioEnsinoMedio("Fábio", 2020, Cargo.GERENTE, "Escola Renascer");
        Funcionario medio2 = new FuncionarioEnsinoMedio("Salomão", 2021, Cargo.GERENTE, "Escola Interactivo");
        Funcionario medio3 = new FuncionarioEnsinoMedio("Hibrael", 2022, Cargo.GERENTE, "Escola Reviver");
        Funcionario medio4 = new FuncionarioEnsinoMedio("Rubem", 2023, Cargo.GERENTE, "Escola Renascença");
        Funcionario superior1 = new FuncionarioEnsinoSuperior("Enzo", 9081, Cargo.SUPERVISOR, "Universidade Federal da Paraíba");
        Funcionario superior2 = new FuncionarioEnsinoSuperior("Sidney", 9082, Cargo.SUPERVISOR, "Universidade Federal de Pernambuco");

        System.out.println("-----  CUSTOS TOTAIS DA EMPRESA COM SALÁRIOS TOTAIS");

    }
}
