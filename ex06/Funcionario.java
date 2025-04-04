public class Funcionario {
    private String nome;
    private int matricula;
    private String telefone;
    private double salario;
    private String sexo;

    public Funcionario(String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
        this.telefone = "";
        this.salario = 0;
        this.sexo = "";
    }

    public String getNome() {
        return this.nome;
    }

    public int getMatricula() {
        return this.matricula;
    }



}


