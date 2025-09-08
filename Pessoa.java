public class Pessoa {
    private String nome;
    private int idade;
    private String email;
    private String token;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, String email, String token) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.token = token;
    }

    public Pessoa(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;

    }

    public String getNome(String nome) {
        return nome;
    }

    public String getEmail(String email) {
        return email;
    }

    public int getIdade(int idade) {
        return idade;
    }

    public String getToken(String token) {
        return token;
    }

    public void setName(String nome) {
        this.nome = nome;
    }

    public void setEmaill(String email) {
        this.email = email;
    }

    public void setIdades(int idade) {
        this.idade = idade;
    }

    public void seTokenn(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", email='" + email + '\'' +
                ", token='" + token + '\'' +
                '}';

    }

    public String gerarToken() {

        String tokenNumeros = "0123456789";
        StringBuilder token = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            int numero = (int) (Math.random() * tokenNumeros.length());
            token.append(tokenNumeros.charAt(numero));

        }
        return token.toString();

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEmail() {
        return email;
    }

    public String getToken() {
        return token;
    }
}