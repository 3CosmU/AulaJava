import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean sistemaAtivo = true;

        // Loop principal do sistema
        while (sistemaAtivo) {


            //Cadastro
            System.out.println("===== CADASTRO =====");
            System.out.print("Digite seu nome: ");
            String nome = scanner.nextLine();
            System.out.print("Digite seu email: ");
            String email = scanner.nextLine();
            System.out.print("Crie uma senha: ");
            String senha = scanner.nextLine();
            System.out.print("Digite sua data de nascimento (dd/mm/yyyy): ");
            String dataStr = scanner.nextLine();
            String[] partes = dataStr.split("/");
            int dia = Integer.parseInt(partes[0]);
            int mes = Integer.parseInt(partes[1]) - 1; // Meses começam em 0
            int ano = Integer.parseInt(partes[2]) - 1900; // Ano começa em 1900
            Date dataNascimento = new Date(ano, mes, dia);
            Usuario usuario = new Usuario(1L, nome, dataNascimento, email, senha);


            //Login
            System.out.println("\n===== LOGIN =====");
            System.out.print("Email: ");
            String login = scanner.nextLine();
            System.out.print("Senha: ");
            String senhaLogin = scanner.nextLine();
            System.out.println(usuario.fazerLogin(login, senhaLogin));

            if (usuario.isLogado()) {
                usuario.mostrarDados(); // mostra perfil completo
            }

            int opcao = 0;

            while (usuario.isLogado()) {
                System.out.println("\n===== MENU =====");
                System.out.println("1 - Fazer Logoff (reinicia o sistema)");
                System.out.println("2 - Sair do sistema");
                System.out.print("Escolha: ");

                opcao = scanner.nextInt();

                // limpar buffer
                scanner.nextLine();

                if (opcao == 1) {
                    usuario.fazerLogoff();
                    System.out.println("\nReiniciando o sistema...\n");
                    break; // volta para o início do while principal
                } else if (opcao == 2) {
                    usuario.fazerLogoff();
                    System.out.println("\nSaindo do sistema...");
                    sistemaAtivo = false; // encerra o loop principal
                    break;
                } else {
                    System.out.println("Opção inválida.");
                }
            }
        }

        System.out.println("Sistema encerrado.");
        scanner.close();
    }
}