import java.time.LocalDate;
import java.io.Serializable;

public class Corretor_CaioIgorMilena extends Usuario_CaioIgorMilena implements Serializable{
    protected String creci;
    protected float salario;
    protected String pis;
    protected LocalDate dataAdmissao;

    // ---- CONSTRUTORES ----
    Corretor_CaioIgorMilena(){
        super();
        this.creci = "Creci não fornecido.";
        this.salario = -1;
        this.pis = "Pis não fornecido.";
        this.dataAdmissao = LocalDate.now();
    }

    Corretor_CaioIgorMilena(int codigoUsuario, String nome, String cpf, String rg,String endereco, String cep, String telefone, String email, int anoNascimento, int mesNascimento, int diaNascimento, String creci, float salario, String pis){
        super(codigoUsuario, nome, cpf, rg, endereco, cep, telefone, email, anoNascimento, mesNascimento, diaNascimento);
        this.creci = creci;
        this.salario = salario;
        this.pis = pis;
        this.dataAdmissao = LocalDate.now();
    }

    // ---- GETTERS E SETTERS ----
    public String getCreci(){
        return this.creci;
    }

    public float getSalario(){
        return this.salario;
    }

    public String getPis(){
        return this.pis;
    }

    public LocalDate getDataAdmissao(){
        return this.dataAdmissao;
    }

    public void setCreci(String creci){
        this.creci = creci;
    }

    public void setSalario(float salario){
        this.salario = salario;
    }

    public void setPis(String pis){
        this.pis = pis;
    }

    public void setDataAdmissao(){
        this.dataAdmissao = LocalDate.now();
    }

    // ---- MÉTODOS ----

    //Retorna uma string com todos os atributos
    public String toString(){
        return super.toString() +
                "\nCreci: " + this.creci +
                "\nSalario: " + this.salario +
                "\nPis: " + this.pis +
                "\nData de Admissao: " + this.dataAdmissao;

    }
}
