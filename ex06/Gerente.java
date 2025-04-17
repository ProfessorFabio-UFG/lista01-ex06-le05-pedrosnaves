public class Gerente extends Funcionarios{
    private double salario;
    private double bonificacao;
    private String tipo;
    

    public Gerente(Funcionarios f, double salario, double bonificacao, String tipo) {
        super(f, f.getMatricula());
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
        return "\nNome: " + getNome() +
                "\nMatricula: " + getMatricula() +
                "\nTelefone: " + getTelefone() +
                "\nSalario: " + this.salario +
                "\nBonificacao: " + this.bonificacao +
                "\nTipo: " + this.tipo +
                "\n--------------------\n";
    }
}


    
