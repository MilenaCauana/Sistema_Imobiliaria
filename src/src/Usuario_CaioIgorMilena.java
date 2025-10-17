import java.time.LocalDate;
import java.io.Serializable;

public class Usuario_CaioIgorMilena implements Serializable{

    protected int codigoUsuario;
    protected String nome;
    protected String cpf;
    protected String rg;
    protected LocalDate dataNascimento;
    protected String endereco;
    protected String cep;
    protected String telefone;
    protected String email;

    // ---- CONSTRUTORES ----
    Usuario_CaioIgorMilena(){
        this.codigoUsuario = -1;
        this.nome = "Nome nao fornecido.";
        this.cpf = "CPF nao fornecido.";
        this.rg = "RG nao fornecido.";
        this.dataNascimento = LocalDate.of(1, 1, 1);
        this.endereco = "Endereco nao fornecido";
        this.cep = "CEP nao fornecido";
        this.telefone = "Telefone nao fornecido";
        this.email = "E-mail nao fornecido";
    }

    Usuario_CaioIgorMilena(int codigoUsuario, String nome, String cpf, String rg,String endereco, String cep, String telefone, String email, int anoNascimento, int mesNascimento, int diaNascimento){
        this.codigoUsuario = codigoUsuario;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = LocalDate.of(anoNascimento, mesNascimento, diaNascimento);
        this.endereco = endereco;
        this.cep = cep;
        this.telefone = telefone;
        this.email = email;
    }

    // ---- GETTERS E SETTERS ----
    public int getCodigoUsuario(){
        return this.codigoUsuario;
    }

    public String getNome(){
        return this.nome;
    }

    public String getCpf(){
        return this.cpf;
    }

    public String getRg(){
        return this.rg;
    }

    public LocalDate getDataNascimento(){
        return this.dataNascimento;
    }

    public String getEndereco(){
        return this.endereco;
    }

    public String getCep(){
        return this.cep;
    }

    public String getTelefone(){
        return this.telefone;
    }

    public String getEmail(){
        return this.email;
    }

    public void setCodigoUsuario(int codigoUsuario){
        this.codigoUsuario = codigoUsuario;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public void setRg(String rg){
        this.rg = rg;
    }

    public void setDataNascimento(int ano, int mes, int dia){
        this.dataNascimento = LocalDate.of(ano,mes,dia);
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public void setCep(String cep){
        this.cep = cep;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public void setEmail(String email){
        this.email = email;
    }

    // ---- MÉTODOS ----

    //Retorna uma string com todos os atributos
    public String toString(){
        return "Nome: " + this.nome +
                "\nCódigo de usuário: " + this.codigoUsuario +
                "\nCPF: " + this.cpf +
                "\nRG: " + this.rg +
                "\nData de Nascimento: " + this.dataNascimento +
                "\nEndereço: " + this.endereco + " - CEP: " + this.cep +
                "\nTelefone: " + this.telefone +
                "\nE-mail: " + this.email;
    }
}
