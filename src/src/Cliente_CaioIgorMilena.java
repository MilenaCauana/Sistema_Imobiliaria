import java.time.LocalDate;
import java.time.ZoneId;

public class Cliente_CaioIgorMilena extends Usuario_CaioIgorMilena{
    protected LocalDate dataCadastro;

    // ---- CONSTRUTORES ----
    Cliente_CaioIgorMilena (){
        super();
        this.dataCadastro = LocalDate.now();
    }

    Cliente_CaioIgorMilena(int codigoUsuario, String nome, String cpf, String rg,String endereco, String cep, String telefone, String email, int anoNascimento, int mesNascimento, int diaNascimento){
        super(codigoUsuario, nome, cpf, rg,endereco, cep, telefone, email, anoNascimento, mesNascimento, diaNascimento);
        this.dataCadastro = LocalDate.now();
    }

    // ---- GETTERS E SETTERS ----
    public LocalDate getDataCadastro(){
        return this.dataCadastro;
    }

    public void setDataCadastro(){
        this.dataCadastro = LocalDate.now();
    }

    // ---- MÉTODOS ----

    //Retorna uma string com todos os atributos
    public String toStringUsuario(){
        return super.toString() +
                "\nData de Cadastro: " + this.dataCadastro;

    }
}
