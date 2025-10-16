
//A classe de configuração é utilizada para definir o nome dos arquivos para busca
//e armazenamento das informações, e como o arquivo deve ser ÚNICO para cada tipo
//de informação, é possível definir o nome para sempre buscar o mesmo tipo.
//Deste modo, já definimos os nomes de todos os arquivos para manter a busca e
//armazenamento padronizados

public class Configuracao_CaioIgorMilena {
    private String arquivoAlugueis;
    private String arquivoVendas;
    private String arquivoImoveis;
    private String arquivoClientes;
    private String arquivoCorretores;
    private String arquivoSeguros;


    //----------Construtor-------------
    public Configuracao_CaioIgorMilena() {
        this.arquivoAlugueis = "arquivo_alugueis.txt";
        this.arquivoVendas = "arquivo_vendas.txt";
        this.arquivoImoveis = "arquivo_imoveis.txt";
        this.arquivoClientes = "arquivo_clientes.txt";
        this.arquivoCorretores = "arquivo_corretores.txt";
        this.arquivoSeguros = "arquivo_seguros.txt";
    }

    //-----------Apenas os Getters-----------


    public String getArquivoAlugueis() {
        return arquivoAlugueis;
    }

    public String getArquivoClientes() {
        return arquivoClientes;
    }

    public String getArquivoImoveis() {
        return arquivoImoveis;
    }

    public String getArquivoCorretores() {
        return arquivoCorretores;
    }

    public String getArquivoVendas() {
        return arquivoVendas;
    }

    public String getArquivoSeguros() {
        return arquivoSeguros;
    }
}