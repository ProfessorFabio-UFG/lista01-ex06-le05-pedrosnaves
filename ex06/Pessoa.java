import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pessoa p1 = new Pessoa ("Maria", "62999245687", "70308854189", "25/10/1975", "fem" );
        Pessoa p2 = new Pessoa ("Rodrigo", "62999714555", "15233321299", "02/01/1976", "masc" );
        Pessoa p3 = new Pessoa ("João", "62999725548", "75266663989", "16/05/1968", "masc" );
        Pessoa p4 = new Pessoa ("Claudio", "62999214577", "85444417969", "01/06/1951", "masc" );
        Pessoa p5 = new Pessoa ("Abadia", "62999584458", "08855415947", "28/02/1966", "fem" );

        Funcionario f1 = new Funcionario (p1, 1111, 10500.00, "05/06/2004", "gerente");
        Funcionario f2 = new Funcionario (p2, 2222, 2500.00, "01/10/2002", "caixa");

        Gerente g1 = new Gerente (f1, 500.00, "pf");

        Caixa c1 = new Caixa(f2, "8:30h");

        Cliente cli1 = new Cliente(p3, 56);
        Cliente cli2 = new Cliente(p4, 73);
        Cliente cli3 = new Cliente(p5, 59);

        c1.aumentoSalario(10);
        System.out.println(c1);
        System.out.println("Salario anual:");
        System.out.println(c1.getRecebimentoAnual());

        g1.aumentoSalario(20);
        System.out.println(g1);
        System.out.println("Salario anual:");
        System.out.println(g1.getRecebimentoAnual());

        cli2.desativar();
        System.out.println(cli2);
        System.out.println(cli1);
        System.out.println(cli3);


    }
}
