import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {

        Connection conexao = ConexaoBD.conectar();
        Scanner entrada = new Scanner(System.in);
        int opcao = 0;

        do{
            System.out.println("\nMENU");
            System.out.println("1 - Cadastro de médicos");
            System.out.println("2 - Cadastro de pacientes");
            System.out.println("3 - Agendamentos");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();

            switch(opcao){
                case 1:
                    int opcaoMedico = 0;
                    while(opcaoMedico!=5){
                        System.out.println("\n1 - Ver médicos cadastrados");
                        System.out.println("2 - Incluir novo médico");
                        System.out.println("3 - Editar dados do médico");
                        System.out.println("4 - Remover médico");
                        System.out.println("5 - Voltar");
                        System.out.print("Escolha uma opção: ");
                        opcaoMedico = entrada.nextInt();

                        switch(opcaoMedico){
                            case 1:
                                Medico.mostrarMedicos();
                                break;
                            case 2:
                                Medico.mostrarMedicos();
                                Medico.cadastrarMedico();
                                break;
                            case 3:
                                Medico.mostrarMedicos();
                                Medico.alterarMedico();
                                break;
                            case 4:
                                Medico.mostrarMedicos();
                                Medico.deletarMedico();
                                break;
                            case 5:
                                break;
                            default:
                                System.out.println("Opção inválida!");
                                break;
                        }
                    }
                    break;
                case 2:
                    Paciente.cadastrarPaciente();
                    break;
                case 3:
                    //agendamento
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }while(opcao != 4);

    }
}
