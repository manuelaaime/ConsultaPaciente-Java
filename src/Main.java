import java.time.LocalDate;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Medico med = new Medico();
    Paciente pac = new Paciente();
    Consulta c = new Consulta();


    System.out.print("Digite a data da consulta (formato AAAA-MM-DD): ");

    String data = sc.next();
    c.dataConsulta = LocalDate.parse(data);

    System.out.println("Digite o nome do paciente: ");
    pac.nome = sc.nextLine();
    pac.nome = sc.nextLine();


    System.out.println("Digite a idade do paciente: ");
    pac.idade = sc.nextInt();

    System.out.println("Digite a condição do paciente: ");
    pac.condicao = sc.nextLine();
    pac.condicao = sc.nextLine();

    System.out.println("Digite o nome do médico que irá atendê-lo: ");
    med.nome = sc.nextLine();

    System.out.println("Digite a especialidade do médico: ");
    med.especialidade = sc.next();
    System.out.println(med.especialidade + " " + "está disponível!");
    c.realizarConsulta(med,pac,c.dataConsulta);
    c.mostrarDados(med,pac);
    sc.close();
    }

}
