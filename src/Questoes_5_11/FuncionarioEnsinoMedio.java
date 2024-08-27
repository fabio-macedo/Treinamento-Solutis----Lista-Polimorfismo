package Questoes_5_11;

public class FuncionarioEnsinoMedio extends Funcionario{
    private String escola;
    private double rendaBasica = 1650;

    public FuncionarioEnsinoMedio(String nome, int codigoFuncional, Cargo cargo, String escola) {
        super(nome, codigoFuncional, cargo);
        this.escola = escola;
    }

    @Override
    public void calcularRendaTotal() {
        double novaRenda = (this.rendaBasica + getComissao());
        setRendaTotal(novaRenda);
    }
}
