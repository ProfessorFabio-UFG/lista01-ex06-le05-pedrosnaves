public class Funcionarios extends Pessoas {
    private int matricula;
    
    public Funcionarios(Pessoas p, int matricula){
        super(p.getNome(), p.getTelefone());
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

}
