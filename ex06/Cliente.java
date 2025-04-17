public class Cliente extends Pessoas{
    private int idade;
    private String cpf;
    private String status;

    public Cliente(Pessoas p, int idade, String cpf) {
        super(p.getNome(), p.getTelefone());
        this.idade = idade;
        this.cpf = cpf;
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
        return "\n-----------\n" + getNome() + " - Tel: " + getTelefone() + " - idade: " + idade + " anos - CPF: " + cpf + " - " + status;
    
}
}
