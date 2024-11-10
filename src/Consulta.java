import java.time.LocalDate;

public class Consulta {
    LocalDate dataConsulta;
    
    public void realizarConsulta(Medico med, Paciente pac, LocalDate dataConsulta) {
         System.out.printf("Consulta marcada com sucesso!\n" + "O Dr. %s tratou o(a) %s no dia %s.\n", med.nome,pac.condicao,dataConsulta);

    }
    public void mostrarDados(Medico med, Paciente pac)  {
        System.out.printf("Ficha do Paciente: \n Paciente: %s \n Idade: %d \n Condição: %s \n Médico: %s ",pac.nome,pac.idade, pac.condicao,med.nome);
    }
}





