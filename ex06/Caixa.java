public class Caixa extends Funcionarios{
    private double salario;
    private int horario;
    

    public Caixa(Funcionarios f, double salario, int horario) {
        super(f, f.getMatricula());
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
        return "\nNome: " + getNome() +
                "\nMatricula: " + getMatricula() +
                "\nTelefone: " + getTelefone() +
                "\nSalario: " + this.salario +
                "\nHorario: " + this.horario + "h" +
                "\n--------------------\n";
    }
   
}
