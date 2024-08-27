package Questoes_5_11;

public class Funcionario {
    private String nome;
    private int codigoFuncional;
    private double rendaBasica = 1000;
    private Cargo cargo;
    private double comissao;
    private double rendaTotal = 0;

    public Funcionario(String nome, int codigoFuncional, Cargo cargo) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoFuncional() {
        return codigoFuncional;
    }

    public void setCodigoFuncional(int codigoFuncional) {
        this.codigoFuncional = codigoFuncional;
    }

    public double getRendaBasica() {
        return rendaBasica;
    }

    public void setRendaBasica(double rendaBasica) {
        this.rendaBasica = rendaBasica;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double getRendaTotal() {
        return rendaTotal;
    }

    public void setRendaTotal(double rendaTotal) {
        this.rendaTotal = rendaTotal;
    }

    public void atribuirComissao(Cargo cargo) {
        //Cada vez que instanciar um objeto e passar o cargo, ou quando mudar o cargo, a comissao vai ser atribuida
        switch (cargo) {
            case GERENTE:
                setComissao(1500);
                break;
            case SUPERVISOR:
                setComissao(600);
                break;
            case VENDEDOR:
                setComissao(250);
                break;
            default:
                throw new AssertionError();
        }
    }

    public void calcularRendaTotal(){
        double novarenda = (this.rendaBasica + getComissao());
        setRendaTotal(novarenda);
    }

    @Override
    public String toString() {
        return "Funcionario{"
                + "nome = " + nome
                + ", comissao = " + comissao
                + ", rendaTotal = " + getRendaTotal()
                + '}';
    }
}
