

public class Gerente extends Funcionario{
    private double bonificacao;
    private String tipo;

    public Gerente(String nome, String telefone, String cpf, String data_nascimento, String sexo, int matricula, double salario, String data_ingresso, String cargo, double bonificacao, String tipo){
        super(nome, telefone, cpf, data_nascimento, sexo, matricula, salario, data_ingresso, cargo);
        this.bonificacao = bonificacao;
        this.tipo = tipo;
    }

    public Gerente(Funcionario f, double bonificacao, String tipo) {
        super(f.getNome(), f.getTelefone(), f.getCpf(), f.getData_nascimento(), f.getSexo(), f.getMatricula(), f.getSalario(), f.getData_ingresso(), f.getCargo());
        this.bonificacao = bonificacao;
        this.tipo = tipo;
    }

    public double getRecebimentoAnual(){
        return (getSalario() + this.bonificacao) * 12;
    }

    public String toString(){
        return "\nNome: " + getNome() +
                "\nTelefone: " + getTelefone() +
                "\nCPF: " + getCpf() +
                "\nData de nascimento: " + getData_nascimento() +
                "\nSexo: " + getSexo() +
                "\nMatricula: " + getMatricula() +
                "\nSalario: " + getSalario() +
                "\nData de ingresso: " + getData_ingresso() +
                "\nSexo: " + getSexo() +
                "\nCargo: " + getCargo() +
                "\nTipo: " + this.tipo +
                "\n--------------------\n";
    }
}

