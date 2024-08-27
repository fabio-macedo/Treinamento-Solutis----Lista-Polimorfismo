package Questoes_5_11;

public class FuncionarioEnsinoSuperior extends Funcionario{
    private String universidade;
    private double rendaBasica = 3300;

    public FuncionarioEnsinoSuperior(String nome, int codigoFuncional, Cargo cargo, String universidade) {
        super(nome, codigoFuncional, cargo);
        this.universidade = universidade;
    }

    public String getUniversidade() {
        return universidade;
    }

    @Override
    public void calcularRendaTotal() {
        double novaRenda = (this.rendaBasica + getComissao());
        setRendaTotal(novaRenda);
    }
}
