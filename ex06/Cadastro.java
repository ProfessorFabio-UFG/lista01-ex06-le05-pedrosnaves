public class Cadastro {
    public static void main(String[] args) {
        

        Pessoas p1 = new Pessoas("Claudio","62999541235");
        Pessoas p2 = new Pessoas("Beatriz","62999541235");
        Pessoas p3 = new Pessoas("Paulo", "62988412587");
        Pessoas p4 = new Pessoas("Ana Julia", "62991425656");
        Pessoas p5 = new Pessoas("Joyce", "62999225644");

        Funcionarios f1 = new Funcionarios(p1, 1111);
        Funcionarios f2 = new Funcionarios(p2, 2222);

        Gerente g = new Gerente(f1, 10500.00, 500.00, "pf");
        Caixa c = new Caixa(f2, 2500.00, 7);

        Cliente c1 = new Cliente(p3, 25, "74111565488");
        Cliente c2 = new Cliente(p4, 69, "55680146520");
        Cliente c3 = new Cliente(p5, 71, "112506258400");


        c.AumentoSalario(10);
        System.out.println(c);
        System.out.println("Salario anual:");
        System.out.println(c.RecebimentoAnual());

        g.AumentoSalario(20);
        System.out.println(g);
        System.out.println("Salario anual:");
        System.out.println(g.RecebimentoAnual());

        c2.desativar();
        System.out.println(c2);
        System.out.println(c1);
        System.out.println(c3);

    }
}
