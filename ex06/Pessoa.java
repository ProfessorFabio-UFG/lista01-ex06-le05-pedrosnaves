public class Pessoa {
    private String nome;
    private String telefone;
    private String cpf;
    private String data_nascimento;
    private String sexo;

    public Pessoa(String nome, String telefone, String cpf, String data_nascimento, String sexo){
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.data_nascimento = data_nascimento;
        this.sexo = sexo;
    }
    

    public String getNome() {
        return this.nome;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getSexo(){
        return this.sexo;
    }

    public String getData_nascimento(){
        return this.data_nascimento;
    }
}
