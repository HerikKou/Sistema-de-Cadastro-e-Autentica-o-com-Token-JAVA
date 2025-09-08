import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Pessoa> pessoas = new ArrayList<>();

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int op;
        do {
            System.out.println("Menu:");
            System.out.println("1 - Cadastrar pessoa");
            System.out.println("2 - Listar pessoas");  
            System.out.println("3 - Gerar token para pessoa"); 
            System.out.println("4 - Login");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    
                    System.out.print("Nome: ");
                    String nome = sc.next();
                    System.out.print("Idade: ");
                    int idade = sc.nextInt();
                    System.out.print("Email: ");
                    String email = sc.next();
                    Pessoa p = new Pessoa(nome, idade, email);
                    pessoas.add(p);
                    System.out.println("Pessoa cadastrada com sucesso!");
                    break;
                case 2:
                    System.out.println("Lista de pessoas:");
                    if(pessoas.isEmpty()){
                        System.out.println("Nenhuma pessoa cadastrada.");
                    } else {
                        for (Pessoa pessoa : pessoas) {
                            System.out.println(pessoa);
                            System.out.println("-------------------");
                        }
                    }
                    break;
                    case 3:
                    System.out.print("Digite o email da pessoa para gerar o token: ");
                    String emailToken = sc.next();
                    boolean found = false;  
                    for (Pessoa pessoa : pessoas) {
                        if (pessoa.getEmail().equals(emailToken)) {
                            String tokenGerado = pessoa.gerarToken();
                            pessoa.setToken(tokenGerado);
                            System.out.println("Token gerado: " + tokenGerado);
                            System.out.println(pessoa);
                            found = true;  
                             System.out.println("-------------------");
                            break; 
                        }

                    }
                        break;
                    case 4:
                    System.out.print("Email: ");
                    String emailLogin = sc.next();
                    System.out.print("Token: ");
                    String tokenLogin = sc.next();
                    boolean loginSuccess = false;
                    for (Pessoa pessoa : pessoas) {
                        if (pessoa.getEmail().equals(emailLogin) && pessoa.getToken().equals(tokenLogin)) {
                            System.out.println("Login bem-sucedido! Bem-vindo, " + pessoa.getNome() + "!");
                            loginSuccess = true;
                            break;
                        }
                    }
                    if (!loginSuccess) {
                        System.out.println("Falha no login. Email ou token incorretos.");
                    }
                    
                   
                    break;
                    case 5:
                    System.out.println("Saindo...");
                    break;
                    default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
            sc.nextLine(); // Consumir a quebra de linha
        }while(op!=0);sc.close();

}}