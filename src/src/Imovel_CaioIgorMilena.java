import java.time.LocalDate;
import java.io.Serializable;

public class Imovel_CaioIgorMilena implements Serializable{
    protected int codigoImovel;
    protected String endereco;
    protected LocalDate dataConstrucao;
    protected float areaTotal;
    protected float areaConstruida;
    protected int qtdDormitorios;
    protected int qtdBanheiros;
    protected int qtdVagasGaragem;
    protected float valorIPTU;
    protected float valorVenda;
    protected float valorAluguel;
    protected Boolean disponivelVenda;
    protected Boolean disponivelLocacao;

    //---------Construtores---------

    public Imovel_CaioIgorMilena(int codigoImovel, String endereco, LocalDate dataConstrucao, float areaTotal, float areaConstruida, int qtdDormitorios, int qtdBanheiros, int qtdVagasGaragem, float valorIPTU, float valorVenda, float valorAluguel, Boolean disponivelVenda, Boolean disponivelLocacao) {
        this.codigoImovel = codigoImovel;
        this.endereco = endereco;
        this.dataConstrucao = dataConstrucao;
        this.areaTotal = areaTotal;
        this.areaConstruida = areaConstruida;
        this.qtdDormitorios = qtdDormitorios;
        this.qtdBanheiros = qtdBanheiros;
        this.qtdVagasGaragem = qtdVagasGaragem;
        this.valorIPTU = valorIPTU;
        this.valorVenda = valorVenda;
        this.valorAluguel = valorAluguel;
        this.disponivelVenda = disponivelVenda;
        this.disponivelLocacao = disponivelLocacao;
    }

    public Imovel_CaioIgorMilena() {}


    //---------Getters e Setters---------


    public void setCodigoImovel(int codigoImovel) {
        this.codigoImovel = codigoImovel;
    }
    public int getCodigoImovel() {
        return codigoImovel;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getEndereco() {
        return endereco;
    }

    public void setDataConstrucao(int ano, int mes, int dia) {
        this.dataConstrucao = LocalDate.of(ano, mes, dia);
    }
    public LocalDate getDataConstrucao() {
        return dataConstrucao;
    }

    public void setAreaTotal(float areaTotal) {
        this.areaTotal = areaTotal;
    }
    public float getAreaTotal() {
        return areaTotal;
    }

    public void setAreaConstruida(float areaConstruida) {
        this.areaConstruida = areaConstruida;
    }
    public float getAreaConstruida() {
        return areaConstruida;
    }

    public void setQtdDormitorios(int qtdDormitorios) {
        this.qtdDormitorios = qtdDormitorios;
    }
    public int getQtdDormitorios() {
        return qtdDormitorios;
    }

    public void setQtdBanheiros(int qtdBanheiros) {
        this.qtdBanheiros = qtdBanheiros;
    }
    public int getQtdBanheiros() {
        return qtdBanheiros;
    }

    public void setQtdVagasGaragem(int qtdVagasGaragem) {
        this.qtdVagasGaragem = qtdVagasGaragem;
    }
    public int getQtdVagasGaragem() {
        return qtdVagasGaragem;
    }

    public void setValorIPTU(float valorIPTU) {
        this.valorIPTU = valorIPTU;
    }
    public float getValorIPTU() {
        return valorIPTU;
    }

    public void setValorVenda(float valorVenda) {
        this.valorVenda = valorVenda;
    }
    public float getValorVenda() {
        return valorVenda;
    }

    public void setValorAluguel(float valorAluguel) {
        this.valorAluguel = valorAluguel;
    }
    public float getValorAluguel() {
        return valorAluguel;
    }

    public void setDisponivelVenda(Boolean disponivelVenda){
        this.disponivelVenda = disponivelVenda;
    }
    public Boolean getDisponivelVenda(){
        return disponivelVenda;
    }

    public void setDisponivelLocacao(Boolean disponivelLocacao){
        this.disponivelLocacao = disponivelLocacao;
    }
    public Boolean getDisponivelLocacao(){
        return disponivelLocacao;
    }
}