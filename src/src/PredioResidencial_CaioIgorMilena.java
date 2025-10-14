import java.time.LocalDate;

public class PredioResidencial_CaioIgorMilena extends Imovel_CaioIgorMilena{
    protected int andar;
    protected float valorCondominio;

    //---------Construtores---------

    public PredioResidencial_CaioIgorMilena(int codigoImovel, String endereco, LocalDate dataConstrucao, float areaTotal, float areaConstruida, int qtdDormitorios, int qtdBanheiros, int qtdVagasGaragem, float valorIPTU, float valorVenda, float valorAluguel, int andar, float valorCondominio){
        super(codigoImovel, endereco, dataConstrucao, areaTotal, areaConstruida, qtdDormitorios, qtdBanheiros, qtdVagasGaragem, valorIPTU, valorVenda, valorAluguel);
        this.andar = andar;
        this.valorCondominio = valorCondominio;
    }

    public PredioResidencial_CaioIgorMilena(){}

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



}
