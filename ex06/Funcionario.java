

public class Funcionario extends Pessoa {
    private int matricula;
    private double salario;
    private String data_ingresso;
    private String cargo;

    public Funcionario(String nome, String telefone, String cpf, String data_nascimento, String sexo, int matricula, double salario, String data_ingresso, String cargo) {
       super(nome, telefone, cpf, data_nascimento, sexo);
       this.matricula = matricula;
       this.salario = salario;
       this.data_ingresso = data_ingresso;
       this.cargo = cargo;
    }

    public Funcionario(Pessoa p, int matricula, double salario, String data_ingresso, String cargo){
        super(p.getNome(), p.getTelefone(), p.getCpf(), p.getData_nascimento(), p.getSexo());
        this.matricula = matricula;
        this.salario = salario;
        this.data_ingresso = data_ingresso;
        this.cargo = cargo;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public double getSalario() {
        return this.salario;
    }

    public String getData_ingresso() {
        return this.data_ingresso;
    }

    public String getCargo() {
        return this.cargo;
    }

    public double aumentoSalario(double percentual){
        this.salario = this.salario + (this.salario * (percentual/100));
        return this.salario;
    }

    public double getRecebimentoAnual(){
            return this.salario *12;
    }

    public String toString(){
        return "\nNome: " + getNome() +
                "\nTelefone: " + getTelefone() +
                "\nCPF: " + getCpf() +
                "\nData de nascimento: " + getData_nascimento() +
                "\nSexo: " + getSexo() +
                "\nMatricula: " + this.matricula +
                "\nSalario: " + this.salario +
                "\nData de ingresso: " + this.data_ingresso +
                "\nSexo: " + getSexo() +
                "\nCargo: " + this.cargo +
                "\n--------------------\n";
    }
}
