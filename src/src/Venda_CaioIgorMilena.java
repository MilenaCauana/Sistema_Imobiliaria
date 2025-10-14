import java.time.LocalDate;

public class Venda_CaioIgorMilena {
    private int codigoVenda;
    private Cliente_CaioIgorMilena cliente;
    private Corretor_CaioIgorMilena corretor;
    private Imovel_CaioIgorMilena imovel;
    private LocalDate dataVenda;
    private float valorTotalVenda;
    private Pagamento_CaioIgorMilena formaPagamento;
    private Boolean finalizada;

    // ---- CONSTRUTORES ----
    Venda_CaioIgorMilena(){
    }

    Venda_CaioIgorMilena(int codigoVenda, Cliente_CaioIgorMilena cliente, Corretor_CaioIgorMilena corretor, Imovel_CaioIgorMilena imovel, float valorTotalVenda, Pagamento_CaioIgorMilena formaPagamento, Boolean finalizada){
        this.codigoVenda = codigoVenda;
        this.cliente = cliente;
        this.corretor = corretor;
        this.imovel = imovel;
        this.dataVenda = LocalDate.now();
        this.valorTotalVenda = valorTotalVenda;
        this.formaPagamento = formaPagamento;
        this.finalizada = finalizada;
    }

    // ---- GETTERS E SETTERS ----
    public int getCodigoVenda(){
        return this.codigoVenda;
    }

    public Cliente_CaioIgorMilena getCliente(){
        return this.cliente;
    }

    public Corretor_CaioIgorMilena getCorretor(){
        return this.corretor;
    }

    public Imovel_CaioIgorMilena getImovel(){
        return this.imovel;
    }

    public LocalDate getDataVenda(){
        return this.dataVenda;
    }

    public float getValorTotalVenda(){
        return this.valorTotalVenda;
    }

    public Pagamento_CaioIgorMilena getFormaPagamento() {
        return this.formaPagamento;
    }

    public Boolean getFinalizada(){
        return this.finalizada;
    }

    public void setCodigoVenda(int codigoVenda){
        this.codigoVenda = codigoVenda;
    }

    public void setCliente(Cliente_CaioIgorMilena cliente){
        this.cliente = cliente;
    }

    public void setCorretor(Corretor_CaioIgorMilena corretor){
        this.corretor = corretor;
    }

    public void setImovel(Imovel_CaioIgorMilena imovel){
        this.imovel = imovel;
    }

    public void setDataVenda(LocalDate dataVenda){
        this.dataVenda = dataVenda;
    }

    public void setValorTotalVenda(float valorTotalVenda){
        this.valorTotalVenda = valorTotalVenda;
    }

    public void setFormaPagamento(Pagamento_CaioIgorMilena formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public void getFinalizada(Boolean finalizada){
        this.finalizada = finalizada;
    }

    // ---- MÉTODOS ----
    public String toStringVenda(){

        String status;

        if(this.finalizada){
            status = "Finalizada!";
        } else {
            status = "Em andamento...";
        }

        return "\nVenda: " + this.codigoVenda +
                "\nCliente: " + this.cliente.getNome() + " CPF: " + this.cliente.getCpf() +
                "\nCorretor: " + this.corretor.getNome() + " CRECI: " + this.corretor.getCreci() +
                "\nImovel: " + this.imovel.toStringImovel(); +
                "\nData da Venda: " + this.dataVenda +
                "\nValor Total: " + this.valorTotalVenda +
                "\nForma de Pagamento: " + this.formaPagamento +
                "\nStatus da venda: " + status;
    }

}


