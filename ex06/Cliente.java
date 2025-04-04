public class Cliente {
    private String nome;
    private String telefone;
    private String cpf;
    private int idade;
    private String status;

    public Cliente(String nome, String telefone, String cpf, int idade) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
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
        return "\n-----------\n" + nome + " - Tel: " + telefone + " - idade: " + idade + " anos - CPF: " + cpf + " - " + status;

    }
}


