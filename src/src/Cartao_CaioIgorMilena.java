public class Cartao_CaioIgorMilena extends Pagamento_CaioIgorMilena{
    private String nome;
    private String bandeira;
    private String numero;

    //---------Construtores---------

    public Cartao_CaioIgorMilena(String nome, String bandeira, String numero){
        this.nome = nome;
        this.bandeira = bandeira;
        this.numero = numero;
    }

    public Cartao_CaioIgorMilena(){}

    //---------Getters e Setters---------

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setBandeira(String bandeira){
        this.bandeira = bandeira;
    }
    public String getBandeira() {
        return bandeira;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }
    public String getNumero() {
        return numero;
    }

}
