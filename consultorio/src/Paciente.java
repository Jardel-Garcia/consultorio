import java.util.Scanner;
import java.util.ArrayList;

public class Paciente {

    private int idPaciente;
    private String nomePaciente;
    private String dataNascimento;
    private String telefone;
    private String endereco;

    private static ArrayList<Paciente> listaPacientes = new ArrayList<Paciente>();

    //getters e setters

    public Paciente(){
    }

    public Paciente(String nomePaciente, String dataNascimento, String telefone,
                    String endereco) {
        this.nomePaciente = nomePaciente;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public static void cadastrarPaciente(){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do paciente: ");
        String nomePaciente = entrada.nextLine();
        System.out.print("Digite a data de nascimento do paciente: ");
        String dataNascimento = entrada.nextLine();
        System.out.print("Digite o telefone do paciente: ");
        String telefone = entrada.nextLine();
        System.out.print("Digite o endereço do paciente: ");
        String endereco = entrada.nextLine();

        Paciente novoPaciente = new Paciente(nomePaciente, dataNascimento, telefone,
                endereco);
        listaPacientes.add(novoPaciente);
        System.out.println("Paciente cadastro com sucesso!\n\n\n");
    }

}