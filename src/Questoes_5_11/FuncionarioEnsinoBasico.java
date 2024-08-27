package Questoes_5_11;

public class FuncionarioEnsinoBasico extends Funcionario{
    private String escola;
    private double rendaBasica = 1100;


    public FuncionarioEnsinoBasico(String nome, int codigoFuncional, Cargo cargo, String escola) {
        super(nome, codigoFuncional, cargo);
        this.escola = escola;
    }

    public String getEscola() {
        return escola;
    }

    @Override
    public void calcularRendaTotal() {
        double novaRenda = (this.rendaBasica + getComissao());
        setRendaTotal(novaRenda);
    }
}
