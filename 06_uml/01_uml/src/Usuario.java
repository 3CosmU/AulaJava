import java.text.SimpleDateFormat;
import java.util.Date;

public class Usuario {


    //Classes
    private long idUsuario;
    private String nome;
    private Date dataNascimento;
    private String email;
    private String senha;
    private boolean logado;


    //Construtor
    public Usuario(long idUsuario, String nome, Date dataNascimento, String email, String senha) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.senha = senha;
        this.logado = false;
    }

        //Login msg
    public String fazerLogin(String login, String senha) {
        if (login.equals(this.email) && senha.equals(this.senha)) {
            logado = true;
            return "Login realizado com sucesso!";
        } else {
            return "Login ou senha incorretos!";
        }
    }


    //Logoff msg
    public void fazerLogoff() {
        if (logado) {
            logado = false;
            System.out.println("Logoff realizado com sucesso!");
        } else {
            System.out.println("Usuário não está logado.");
        }
    }

    public boolean isLogado() {
        return logado;
    }

    public String getNome() {
        return nome;
    }

    // Metodo para mostrar informações do usuário
    public void mostrarDados() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("\n===== DADOS DO USUÁRIO =====");
        System.out.println("ID: " + idUsuario);
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + formato.format(dataNascimento));
        System.out.println("Email: " + email);
    }
}