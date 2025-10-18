import java.time.LocalDate;

public class PredioResidencial_CaioIgorMilena extends Imovel_CaioIgorMilena{
    protected int andar;
    protected float valorCondominio;

    //---------Construtores---------

    public PredioResidencial_CaioIgorMilena(int codigoImovel, String endereco, LocalDate dataConstrucao, float areaTotal, float areaConstruida, int qtdDormitorios, int qtdBanheiros, int qtdVagasGaragem, float valorIPTU, float valorVenda, float valorAluguel, int andar, float valorCondominio, Boolean disponivelVenda, Boolean disponivelLocacao){
        super(codigoImovel, endereco, dataConstrucao, areaTotal, areaConstruida, qtdDormitorios, qtdBanheiros, qtdVagasGaragem, valorIPTU, valorVenda, valorAluguel, disponivelVenda, disponivelLocacao);
        this.andar = andar;
        this.valorCondominio = valorCondominio;
    }

    public PredioResidencial_CaioIgorMilena(){
        super();
    }

    //---------Getters e Setters---------

    public void setAndar(int andar){
        this.andar = andar;
    }
    public int getAndar(){
        return andar;
    }

    public void setValorCondominio(float valorCondominio){
        this.valorCondominio = valorCondominio;
    }
    public float getValorCondominio(){
        return valorCondominio;
    }

    // ---- MÉTODOS ----
    public String toString(){
        return super.toString() +
                "\nAndar: " + this.andar +
                "\nValor Condominio: " + this.valorCondominio;
    }



}
