public class Gerente {
    private String nome;
    private int matricula;
    private String telefone;
    private double salario;
    private double bonificacao;
    private String tipo;
    private Funcionario funcionario;

    public Gerente(Funcionario funcionario, String telefone, double salario, double bonificacao, String tipo) {
        this.nome = funcionario.getNome();
        this.matricula = funcionario.getMatricula();
        this.telefone = telefone;
        this.salario = salario;
        this.bonificacao = bonificacao;
        this.tipo = tipo;
    }


    public double AumentoSalario(double percentual) {
        this.salario = this.salario + (this.salario * (percentual / 100));
        return this.salario;
    }

    public double RecebimentoAnual(){
        return (this.salario + this.bonificacao) * 12;
    }

    public String toString(){
        return "\nNome: " + this.nome +
                "\nMatricula: " + this.matricula +
                "\nTelefone: " + this.telefone +
                "\nSalario: " + this.salario +
                "\nBonificacao: " + this.bonificacao +
                "\nTipo: " + this.tipo +
                "\n--------------------\n";
    }
}
