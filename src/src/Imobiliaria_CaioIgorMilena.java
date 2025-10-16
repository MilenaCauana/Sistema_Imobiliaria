import java.util.ArrayList;

public class Imobiliaria_CaioIgorMilena {
    private  String nome;
    private  String endereco;
    private  ArrayList<Aluguel_CaioIgorMilena> alugueisImobiliaria;
    private  ArrayList<Venda_CaioIgorMilena>  vendasImobiliaria;
    private  ArrayList<Imovel_CaioIgorMilena> imoveisImobiliaria;
    private  ArrayList<Usuario_CaioIgorMilena> clientesImobiliaria;
    private  ArrayList<Usuario_CaioIgorMilena> corretoresImobiliaria;
    private  ArrayList<Seguro_CaioIgorMilena>  segurosImobiliaria;
    private  Configuracao_CaioIgorMilena configuracoes;


    //---------Construtores---------

    public Imobiliaria_CaioIgorMilena(String nome, String endereco,ArrayList<Aluguel_CaioIgorMilena> alugueisImobiliaria, ArrayList<Venda_CaioIgorMilena>  vendasImobiliaria, ArrayList<Imovel_CaioIgorMilena> imovelsImobiliaria, ArrayList<Usuario_CaioIgorMilena> clientesImobiliaria, ArrayList<Usuario_CaioIgorMilena> corretoresImobiliaria, ArrayList<Seguro_CaioIgorMilena>  segurosImobiliaria){
        this.nome = nome;
        this.endereco = endereco;
        this.alugueisImobiliaria = new ArrayList<>();
        this.vendasImobiliaria = new ArrayList<>();
        this.imoveisImobiliaria = new ArrayList<>();
        this.clientesImobiliaria = new ArrayList<>();
        this.corretoresImobiliaria = new ArrayList<>();
        this.segurosImobiliaria = new ArrayList<>();
        this.configuracoes = new Configuracao_CaioIgorMilena();
    }

    public Imobiliaria_CaioIgorMilena(){}

    //---------Getters e Setters---------

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    //---------Métodos Específicos---------

    //------> Alugueis Imobiliaria

    public void addAlugueis(Aluguel_CaioIgorMilena aluguel){
        this.alugueisImobiliaria.add(aluguel);
    }

    public Aluguel_CaioIgorMilena searchAluguel(int codigoAluguel){
        if (alugueisImobiliaria.isEmpty()){
            System.out.println("Lista de alugueis está vazia");
            return null;
        }
        for(Aluguel_CaioIgorMilena aluguel : alugueisImobiliaria){
            if(aluguel.getCodigoAluguel() == codigoAluguel){
                return aluguel;
            }
        }
        System.out.println("Aluguel não encontrado!");
        return null;
    }

    public void popAluguel(Aluguel_CaioIgorMilena aluguel){
        if(searchAluguel(aluguel.getCodigoAluguel()).equals(aluguel)){
            this.alugueisImobiliaria.remove(aluguel);
            System.out.println("Aluguel removido com sucesso!");
        }else{
            System.out.println("Aluguel não encontrado!");
        }
    }

    public void showAluguel(Aluguel_CaioIgorMilena aluguel){
        if(searchAluguel(aluguel.getCodigoAluguel()).equals(aluguel)){
            aluguel.toString();
        }else{
            System.out.println("Aluguel não encontrado!");
        }
    }

    public void showAllAlugueis(){
        if(this.alugueisImobiliaria.isEmpty()){
            System.out.println("Lista de alugueis vazia");
        }
        for(Aluguel_CaioIgorMilena aluguel : alugueisImobiliaria){
            aluguel.toString();
        }
    }

    //------> Vendas Imobiliaria

    public void addVendas(Venda_CaioIgorMilena venda){
        this.vendasImobiliaria.add(venda);
    }

    public Venda_CaioIgorMilena searchVenda(int codigoVenda){
        if (vendasImobiliaria.isEmpty()){
            System.out.println("Lista de vendas está vazia");
            return null;
        }
        for(Venda_CaioIgorMilena venda : vendasImobiliaria){
            if(venda.getCodigoVenda() == codigoVenda){
                return venda;
            }
        }
        System.out.println("Venda não encontrada!");
        return null;
    }

    public void popVenda(Venda_CaioIgorMilena venda){
        if(searchVenda(venda.getCodigoVenda()).equals(venda)){
            this.vendasImobiliaria.remove(venda);
            System.out.println("Venda removida com sucesso!");
        }else{
            System.out.println("Venda não encontrado!");
        }
    }

    public void showVenda(Aluguel_CaioIgorMilena venda){
        if(searchVenda(venda.getCodigoAluguel()).equals(venda)){
            venda.toString();
        }else{
            System.out.println("Venda não encontrado!");
        }
    }

    public void showAllVendas(){
        if(this.vendasImobiliaria.isEmpty()){
            System.out.println("Lista de vendas vazia");
        }
        for(Venda_CaioIgorMilena venda : vendasImobiliaria){
            venda.toString();
        }
    }

    //------> Imoveis Imobiliaria

    public void addImovel(Imovel_CaioIgorMilena imovel){
        this.imoveisImobiliaria.add(imovel);
    }

    public Imovel_CaioIgorMilena searchImovel(int codigoImovel){
        if (imoveisImobiliaria.isEmpty()){
            System.out.println("Lista de imóveis está vazia");
            return null;
        }
        for(Imovel_CaioIgorMilena imovel : imoveisImobiliaria){
            if(imovel.getCodigoImovel() == codigoImovel){
                return imovel;
            }
        }
        System.out.println("Imovel não encontrado!");
        return null;
    }

    public void popImovel(Imovel_CaioIgorMilena imovel){
        if(searchImovel(imovel.getCodigoImovel()).equals(imovel)){
            this.imoveisImobiliaria.remove(imovel);
            System.out.println("Imovel removido com sucesso!");
        }else{
            System.out.println("Imovel não encontrado!");
        }
    }

    public void showImovel(Imovel_CaioIgorMilena imovel){
        if(searchImovel(imovel.getCodigoImovel()).equals(imovel)){
            imovel.toString();
        }else{
            System.out.println("Imovel não encontrado!");
        }
    }

    public void showAllImoveis(){
        if(this.imoveisImobiliaria.isEmpty()){
            System.out.println("Lista de imoveis está vazia.");
        }
        for(Imovel_CaioIgorMilena imovel : imoveisImobiliaria){
            imovel.toString();
        }
    }

    //------> Clientes Imobiliaria

    public void addCliente(Cliente_CaioIgorMilena cliente){
        this.clientesImobiliaria.add(cliente);
    }

    public Usuario_CaioIgorMilena searchCliente(String cpf){
        if (clientesImobiliaria.isEmpty()){
            System.out.println("Lista de clientes está vazia.");
            return null;
        }
        for(Usuario_CaioIgorMilena cliente : clientesImobiliaria){
            if(cliente.getCpf() == cpf){
                return cliente;
            }
        }
        System.out.println("Cliente não encontrado!");
        return null;
    }

    public void popCliente(Cliente_CaioIgorMilena cliente){
        if(searchCliente(cliente.getCpf()).equals(cliente)){
            this.clientesImobiliaria.remove(cliente);
            System.out.println("Cliente removido com sucesso!");
        }else{
            System.out.println("Cliente não encontrado!");
        }
    }

    public void showCliente(Cliente_CaioIgorMilena cliente){
        if(searchCliente(cliente.getCpf()).equals(cliente)){
            cliente.toStringUsuario();
        }else{
            System.out.println("Cliente não encontrado!");
        }
    }

    public void showAllClientes(){
        if(this.clientesImobiliaria.isEmpty()){
            System.out.println("Lista de clientes está vazia.");
        }
        for(Usuario_CaioIgorMilena cliente : clientesImobiliaria){
            cliente.toString();
        }
    }

    //------>  Corretores Imobiliaria

    public void addCorretores(Corretor_CaioIgorMilena corretor){
        this.corretoresImobiliaria.add(corretor);
    }

    public Usuario_CaioIgorMilena searchCorretor(String cpf){
        if (corretoresImobiliaria.isEmpty()){
            System.out.println("Lista de corretores está vazia");
            return null;
        }
        for(Usuario_CaioIgorMilena corretor : corretoresImobiliaria){
            if(corretor.getCpf() == cpf){
                return corretor;
            }
        }
        System.out.println("Corretor não encontrado!");
        return null;
    }

    public void popCorretor(Corretor_CaioIgorMilena corretor){
        if(searchCorretor(corretor.getCpf()).equals(corretor)){
            this.corretoresImobiliaria.remove(corretor);
            System.out.println("Corretor removido com sucesso!");
        }else{
            System.out.println("Corretor não encontrado.!");
        }
    }

    public void showCorretor(Corretor_CaioIgorMilena corretor){
        if(searchCliente(corretor.getCpf()).equals(corretor)){
            corretor.toStringUsuario();
        }else{
            System.out.println("Corretor não encontrado!");
        }
    }

    public void showAllCorretores(){
        if(this.corretoresImobiliaria.isEmpty()){
            System.out.println("Lista de corretores está vazia");
        }
        for(Usuario_CaioIgorMilena corretor : corretoresImobiliaria){
            corretor.toString();
        }
    }

    //------>  Seguros Imobiliaria

    public void addSeguro(Seguro_CaioIgorMilena seguro){
        this.segurosImobiliaria.add(seguro);
    }

    public Seguro_CaioIgorMilena searchSeguro(int codigoSeguro){
        if (segurosImobiliaria.isEmpty()){
            System.out.println("Lista de seguros está vazia");
            return null;
        }
        for(Seguro_CaioIgorMilena seguro : segurosImobiliaria){
            if(seguro.getCodigoSeguro() == codigoSeguro){
                return seguro;
            }
        }
        System.out.println("Seguro não encontrado!");
        return null;
    }

    public void popSeguro(Seguro_CaioIgorMilena seguro){
        if(searchSeguro(seguro.getCodigoSeguro()).equals(seguro)){
            this.segurosImobiliaria.remove(seguro);
            System.out.println("Seguro removido com sucesso!");
        }else{
            System.out.println("Seguro não encontrado!");
        }
    }

    public void showSeguro(Seguro_CaioIgorMilena seguro){
        if(searchSeguro(seguro.getCodigoSeguro()).equals(seguro)){
            seguro.toString();
        }else{
            System.out.println("Seguro não encontrado!");
        }
    }

    public void showAllSeguros(){
        if(this.segurosImobiliaria.isEmpty()){
            System.out.println("Lista de seguros vazia.");
        }
        for(Seguro_CaioIgorMilena seguro : segurosImobiliaria){
            seguro.toString();
        }
    }

}
