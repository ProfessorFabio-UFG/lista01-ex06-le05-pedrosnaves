public class Caixa {
    private String nome;
    private int matricula;
    private String telefone;
    private double salario;
    private int horario;
    private Funcionario funcionario;

    public Caixa(Funcionario funcionario, String telefone, double salario, int horario) {
        this.nome = funcionario.getNome();
        this.matricula = funcionario.getMatricula();
        this.telefone = telefone;
        this.salario = salario;
        this.horario = horario;
    }


    public double AumentoSalario(double percentual){
        this.salario = this.salario + (this.salario * (percentual/100));
        return this.salario;
    }

    public double RecebimentoAnual(){
        return this.salario * 12;
    }

    public String toString(){
        return "\nNome: " + this.nome +
                "\nMatricula: " + this.matricula +
                "\nTelefone: " + this.telefone +
                "\nSalario: " + this.salario +
                "\nHorario: " + this.horario + "h" +
                "\n--------------------\n";
    }
}
