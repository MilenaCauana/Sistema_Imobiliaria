import java.time.LocalDate;

public class Comercial_CaioIgorMilena extends Imovel_CaioIgorMilena{
    protected float taxaImpostoFederal;

    //---------Construtores---------

    public Comercial_CaioIgorMilena(int codigoImovel, String endereco, LocalDate dataConstrucao, float areaTotal, float areaConstruida, int qtdDormitorios, int qtdBanheiros, int qtdVagasGaragem, float valorIPTU, float valorVenda, float valorAluguel, float taxaImpostoFederal) {
        super(codigoImovel, endereco, dataConstrucao, areaTotal, areaConstruida, qtdDormitorios, qtdBanheiros, qtdVagasGaragem, valorIPTU, valorVenda, valorAluguel);
        this.taxaImpostoFederal = taxaImpostoFederal;
    }

    public Comercial_CaioIgorMilena(){}

    //---------Getters e Setters---------

    public void setTaxaImpostoFederal(float taxaImpostoFederal){
        this.taxaImpostoFederal = taxaImpostoFederal;
    }
    public float getTaxaImpostoFederal(){
        return this.taxaImpostoFederal;
    }

}
