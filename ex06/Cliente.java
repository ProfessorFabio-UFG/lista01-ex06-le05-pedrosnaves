

public class Cliente extends Pessoa {
    private int idade;
    private String status;

    public Cliente(String nome, String telefone, String cpf, String data_nascimento, String sexo, int idade) {
        super(nome, telefone, cpf, data_nascimento, sexo);
        this.idade = idade;
        this.status = "ativo";
    }

    public Cliente(Pessoa p, int idade){
        super(p.getNome(), p.getTelefone(), p.getCpf(), p.getData_nascimento(), p.getSexo());
        this.idade = idade;
        this.status = "ativo";
    }

    public void desativar(){
        if(this.status.equals("ativo")){
            this.status = "inativo";
        } else {
            System.out.println("Cliente já está desativado");
        }
    }

    public String toString(){
        return "\n-----------\n" + getNome() + " - Tel: " + getTelefone() + " - idade: " + idade + " anos - CPF: " + getCpf() + " - " + status;

    }
}
