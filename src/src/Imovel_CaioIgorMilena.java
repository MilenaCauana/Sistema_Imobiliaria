import java.time.LocalDate;

public class Imovel_CaioIgorMilena {
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



    //---------Construtores---------

    public Imovel_CaioIgorMilena(int codigoImovel, String endereco, LocalDate dataConstrucao, float areaTotal, float areaConstruida, int qtdDormitorios, int qtdBanheiros, int qtdVagasGaragem, float valorIPTU, float valorVenda, float valorAluguel) {
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

    public void setDataConstrucao(LocalDate dataConstrucao) {
        this.dataConstrucao = dataConstrucao;
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


}
