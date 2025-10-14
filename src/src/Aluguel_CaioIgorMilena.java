import java.util.ArrayList;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Aluguel_CaioIgorMilena {
    private int codigoAluguel;
    private Cliente_CaioIgorMilena cliente;
    private Corretor_CaioIgorMilena corretor;
    private Imovel_CaioIgorMilena imovel;
    private LocalDate dataAluguel;
    private LocalDate dataDevolucao;
    private LocalDate dataPagamentoMensal;
    private float valorTotalAluguel;
    private Pagamento_CaioIgorMilena formaPagamemnto;
    private ArrayList<Seguro_CaioIgorMilena> segurosContratados;
    private boolean finalizado;
    private boolean pago;

    //---------Construtores---------

    public Aluguel_CaioIgorMilena(int codigoAluguel, Cliente_CaioIgorMilena cliente, Corretor_CaioIgorMilena corretor, Imovel_CaioIgorMilena imovel, LocalDate dataAluguel, LocalDate dataDevolucao, LocalDate dataPagamentoMensal,  float valorTotalAluguel, ArrayList<Seguro_CaioIgorMilena> segurosContratados, boolean finalizado, boolean pago) {
        this.codigoAluguel = codigoAluguel;
        this.cliente = cliente;
        this.corretor = corretor;
        this.imovel = imovel;
        this.dataAluguel = dataAluguel;
        this.dataDevolucao = dataDevolucao;
        this.dataPagamentoMensal = dataPagamentoMensal;
        this.valorTotalAluguel = valorTotalAluguel;
        this.formaPagamemnto = formaPagamemnto;
        this.segurosContratados =  segurosContratados;
        this.finalizado = finalizado;
    }

    public Aluguel_CaioIgorMilena() {
    }

    //---------Getters e Setters---------

    public int getCodigoAluguel() {
        return codigoAluguel;
    }

    public void setCodigoAluguel(int codigoAluguel) {
        this.codigoAluguel = codigoAluguel;
    }

    public Cliente_CaioIgorMilena getCliente() {
        return cliente;
    }

    public void setCliente(Cliente_CaioIgorMilena cliente) {
        this.cliente = cliente;
    }

    public Corretor_CaioIgorMilena getCorretor() {
        return corretor;
    }

    public void setCorretor(Corretor_CaioIgorMilena corretor) {
        this.corretor = corretor;
    }

    public Imovel_CaioIgorMilena getImovel() {
        return imovel;
    }

    public void setImovel(Imovel_CaioIgorMilena imovel) {
        this.imovel = imovel;
    }

    public LocalDate getDataAluguel() {
        return dataAluguel;
    }

    public void setDataAluguel(LocalDate dataAluguel) {
        this.dataAluguel = dataAluguel;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public LocalDate getDataPagamentoMensal() {
        return dataPagamentoMensal;
    }

    public void setDataPagamentoMensal(LocalDate dataPagamentoMensal) {
        this.dataPagamentoMensal = dataPagamentoMensal;
    }

    public float getValorTotalAluguel() {
        return valorTotalAluguel;
    }

    public void setValorTotalAluguel(float valorTotalAluguel) {
        this.valorTotalAluguel = valorTotalAluguel;
    }

    public Pagamento_CaioIgorMilena getFormaPagamemnto() {
        return formaPagamemnto;
    }

    public void setFormaPagamemnto(Pagamento_CaioIgorMilena formaPagamemnto) {
        this.formaPagamemnto = formaPagamemnto;
    }

    public ArrayList<Seguro_CaioIgorMilena> getSegurosContratados() {
        return segurosContratados;
    }

    public void setSegurosContratados(ArrayList<Seguro_CaioIgorMilena> segurosContratados) {
        this.segurosContratados = segurosContratados;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public float calcularValorTotal() {
        if (this.imovel == null) {
            return 0.0f;
        }

        float valorBase = this.imovel.getValorAluguel();
        float valorSeguros = 0.0f;

        if (this.segurosContratados != null) {
            for (Seguro_CaioIgorMilena seguro : segurosContratados) {
                valorSeguros += seguro.getValor();
            }
        }

        this.valorTotalAluguel = valorBase + valorSeguros;
        return this.valorTotalAluguel;
    }

    public Boolean possuiSeguro() {
        return this.segurosContratados != null && !this.segurosContratados.isEmpty();
    }

    public Boolean verificarAtraso() {
        if (this.pago) {
            return false;
        }

        if (this.dataPagamentoMensal == null) {
            return false;
        }

        LocalDate hoje = LocalDate.now();
        int diaVencimento = this.dataPagamentoMensal.getDayOfMonth();

        LocalDate dataVencimento;

        try {
            dataVencimento = hoje.withDayOfMonth(diaVencimento);
        } catch (java.time.DateTimeException e) {
            dataVencimento = hoje.withDayOfMonth(hoje.lengthOfMonth());
        }

        return hoje.isAfter(dataVencimento);
    }

    @Override
    public String toString() {
        return "\nAluguel:" +
                "\nCódigo do Aluguel: " + codigoAluguel +
                "\nCliente: " + (cliente != null ? cliente.getClass().getSimpleName() : "N/A") +
                "\nImovel: " + (imovel != null ? imovel.getClass().getSimpleName() : "N/A") +
                "\nData do aluguel: " + dataAluguel +
                "\nDia do vencimento: " + (dataPagamentoMensal != null ? dataPagamentoMensal.getDayOfMonth() : "N/A") +
                "\nValor tootal do aluguel: " + String.format("%.2f", calcularValorTotal()) +
                "\nFinalizado? - " + finalizado +
                "\nPago? - " + pago +
                "\n";
    }
}
