

public class Caixa extends Funcionario{
    private String horario;

    public Caixa(String nome, String telefone, String cpf, String data_nascimento, String sexo, int matricula, double salario, String data_ingresso, String cargo, String horario){
        super(nome, telefone, cpf, data_nascimento, sexo, matricula, salario, data_ingresso, cargo);
        this.horario = horario;
    }

    public Caixa(Funcionario f, String horario){
        super(f.getNome(), f.getTelefone(), f.getCpf(), f.getData_nascimento(), f.getSexo(), f.getMatricula(), f.getSalario(), f.getData_ingresso(), f.getCargo());
        this.horario = horario;
    }
}
