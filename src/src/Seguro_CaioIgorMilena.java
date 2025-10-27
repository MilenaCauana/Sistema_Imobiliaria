import java.io.Serializable;

public class Seguro_CaioIgorMilena implements Serializable{
    private int codigoSeguro;
    private String nomeSeguradora;
    private String tipo;
    private String descricao;
    private float valor;

    //---------Construtores---------

    public Seguro_CaioIgorMilena(int codigoSeguro, String nomeSeguradora, String tipo, String descricao, float valor) {
        this.codigoSeguro = codigoSeguro;
        this.nomeSeguradora = nomeSeguradora;
        this.tipo = tipo;
        this.descricao = descricao;
        this.valor = valor;
    }

    public Seguro_CaioIgorMilena() {
    }

    //---------Getters e Setters---------

    public int getCodigoSeguro() {
        return codigoSeguro;
    }

    public void setCodigoSeguro(int codigoSeguro) {
        this.codigoSeguro = codigoSeguro;
    }

    public String getNomeSeguradora() {
        return nomeSeguradora;
    }

    public void setNomeSeguradora(String nomeSeguradora) {
        this.nomeSeguradora = nomeSeguradora;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Seguro: " +
                "\nCódigo: " + codigoSeguro +
                "\nSeguradora: " + nomeSeguradora + '\'' +
                "\nTipo: " + tipo + '\'' +
                "\nValor: " + String.format("R$ %.2f", valor) +
                "\nDescrição: " + descricao + '\'' ;
    }
}
