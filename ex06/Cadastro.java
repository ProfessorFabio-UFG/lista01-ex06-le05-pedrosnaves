import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Funcionario f1 = new Funcionario("Claudio", 1111);
        Funcionario f2 = new Funcionario("Beatriz", 2222);

        Caixa c1 = new Caixa(f1, "62999541235", 2500.00, 7);

        Gerente g1 = new Gerente (f2, "62999541235", 10500.00, 500.00, "pf");

        Cliente cliente1 = new Cliente ("Paulo", "62988412587", "74111565488", 25);
        Cliente cliente2 = new Cliente ("Ana Julia", "62991425656", "55680146520", 69);
        Cliente cliente3 = new Cliente ("Joyce", "62999225644", "112506258400", 71);


        c1.AumentoSalario(10);
        System.out.println(c1);
        System.out.println("Salario anual:");
        System.out.println(c1.RecebimentoAnual());

        g1.AumentoSalario(20);
        System.out.println(g1);
        System.out.println("Salario anual:");
        System.out.println(g1.RecebimentoAnual());

        cliente2.desativar();
        System.out.println(cliente2);
        System.out.println(cliente1);
        System.out.println(cliente3);

    }
}
