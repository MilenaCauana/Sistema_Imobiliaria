import java.io.Serializable;

public class Pagamento_CaioIgorMilena implements Serializable {
    private String tipoPagamento;

    //---------Construtores---------

    public Pagamento_CaioIgorMilena(String tipoPagamento){
        this.tipoPagamento = tipoPagamento;
    }
    public Pagamento_CaioIgorMilena(){}

    //---------Getters e Setters---------

    public void setTipoPagamento(String tipoPagamento){
        this.tipoPagamento = this.tipoPagamento;
    }
    public String getTipoPagamento(){
        return this.tipoPagamento;
    }

    public String toString(){
        return tipoPagamento;
    }
}
