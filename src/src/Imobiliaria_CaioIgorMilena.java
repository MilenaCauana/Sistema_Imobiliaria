import java.time.LocalDate;
import java.util.ArrayList;
import java.io.Serializable;

public class Imobiliaria_CaioIgorMilena implements Serializable{
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

    public Imobiliaria_CaioIgorMilena(){
        this.nome = "Imobiliaria CaioIgorMilena";
        this.endereco = "Rua Unesp, 01";
        this.alugueisImobiliaria = new ArrayList<>();
        this.vendasImobiliaria = new ArrayList<>();
        this.imoveisImobiliaria = new ArrayList<>();
        this.clientesImobiliaria = new ArrayList<>();
        this.corretoresImobiliaria = new ArrayList<>();
        this.segurosImobiliaria = new ArrayList<>();
        this.configuracoes = new Configuracao_CaioIgorMilena();
    }

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
    public Configuracao_CaioIgorMilena getConfiguracoes(){
        return this.configuracoes;
    }
    public void setAlugueisImobiliaria(ArrayList<Aluguel_CaioIgorMilena> alugueisImobiliaria){
        this.alugueisImobiliaria = alugueisImobiliaria;
    }
    public void setVendasImobiliaria(ArrayList<Venda_CaioIgorMilena> vendasImobiliaria){
        this.vendasImobiliaria = vendasImobiliaria;
    }
    public void setImoveisImobiliaria(ArrayList<Imovel_CaioIgorMilena> imoveisImobiliaria){
        this.imoveisImobiliaria = imoveisImobiliaria;
    }
    public void setClientesImobiliaria(ArrayList<Usuario_CaioIgorMilena> clientesImobiliaria){
        this.clientesImobiliaria = clientesImobiliaria;
    }
    public void setCorretoresImobiliaria(ArrayList<Usuario_CaioIgorMilena> corretoresImobiliaria){
        this.corretoresImobiliaria = corretoresImobiliaria;
    }
    public void setSegurosImobiliaria(ArrayList<Seguro_CaioIgorMilena> segurosImobiliaria){
        this.segurosImobiliaria = segurosImobiliaria;
    }

    public ArrayList<Aluguel_CaioIgorMilena> getAlugueisImobiliaria(){
        return alugueisImobiliaria;
    }

    public ArrayList<Venda_CaioIgorMilena> getVendasImobiliaria(){
        return vendasImobiliaria;
    }

    public ArrayList<Imovel_CaioIgorMilena> getImoveisImobiliaria(){
        return imoveisImobiliaria;
    }

    public ArrayList<Usuario_CaioIgorMilena> getClientesImobiliaria(){
        return clientesImobiliaria;
    }

    public ArrayList<Usuario_CaioIgorMilena> getCorretoresImobiliaria(){
        return corretoresImobiliaria;
    }

    public ArrayList<Seguro_CaioIgorMilena> getSegurosImobiliaria(){
        return segurosImobiliaria;
    }

    //---------Métodos Específicos---------

    //------> Alugueis Imobiliaria

    public void addAlugueis(Aluguel_CaioIgorMilena aluguel){
        this.alugueisImobiliaria.add(aluguel);
    }

    public Aluguel_CaioIgorMilena searchAluguel(int codigoAluguel){
        if (alugueisImobiliaria.isEmpty()){
            return null;
        }
        for(Aluguel_CaioIgorMilena aluguel : alugueisImobiliaria){
            if(aluguel.getCodigoAluguel() == codigoAluguel){
                return aluguel;
            }
        }
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
            System.out.println(aluguel.toString());
        }else{
            System.out.println("Aluguel não encontrado!");
        }

        System.out.println("\n-----------------------------------\n");
    }

    public void showAllAlugueis(){
        if(this.alugueisImobiliaria.isEmpty()){
            System.out.println("Lista de alugueis vazia");
        }
        for(Aluguel_CaioIgorMilena aluguel : alugueisImobiliaria){
            System.out.println(aluguel.toString());
        }

        System.out.println("\n-----------------------------------\n");
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
            this.vendasImobiliaria.remove(venda);
    }

    public void showVenda(Aluguel_CaioIgorMilena venda){
        if(searchVenda(venda.getCodigoAluguel()).equals(venda)){
            System.out.println(venda.toString());
        }else{
            System.out.println("Venda não encontrado!");
        }

        System.out.println("\n-----------------------------------\n");
    }

    public void showAllVendas(){
        if(this.vendasImobiliaria.isEmpty()){
            System.out.println("Lista de vendas vazia");
        }
        for(Venda_CaioIgorMilena venda : vendasImobiliaria){
            System.out.println("\n\n");
            System.out.println(venda.toString());
        }

        System.out.println("\n-----------------------------------\n");
    }

    //------> Imoveis Imobiliaria

    public void addImovel(Imovel_CaioIgorMilena imovel){
        this.imoveisImobiliaria.add(imovel);
    }

    public Imovel_CaioIgorMilena searchImovel(int codigoImovel){
        if (imoveisImobiliaria.isEmpty()){
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
            this.imoveisImobiliaria.remove(imovel);
    }

    public void showImovel(Imovel_CaioIgorMilena imovel){
        if(searchImovel(imovel.getCodigoImovel()).equals(imovel)){
            System.out.println(imovel.toString());
        }else{
            System.out.println("Imovel não encontrado!");
        }

        System.out.println("\n-----------------------------------\n");
    }

    public void showAllImoveis(){
        if(this.imoveisImobiliaria.isEmpty()){
            System.out.println("Lista de imoveis está vazia.");
        }
        for(Imovel_CaioIgorMilena imovel : imoveisImobiliaria){
            System.out.println(imovel.toString());
        }

        System.out.println("\n-----------------------------------\n");
    }

    public void showAllCasaResidencial(){
        if(this.imoveisImobiliaria.isEmpty()){
            System.out.println("\nLista de imoveis está vazia.");
            return;
        }

        Boolean encontrou = false;

        for (Imovel_CaioIgorMilena imovel : imoveisImobiliaria){
            if(imovel instanceof CasaResidencial_CaioIgorMilena){
                System.out.println("\n\n");
                System.out.println(imovel.toString());

                encontrou = true;
            }
        }

        if (!encontrou){
            System.out.println("\nNão há Casa Residencial cadastrada.");
        }

        System.out.println("\n-------------------------------\n");
    }

    public void showAllPredio(){
        if(this.imoveisImobiliaria.isEmpty()){
            System.out.println("\nLista de imoveis está vazia.");
            return;
        }

        Boolean encontrou = false;

        for (Imovel_CaioIgorMilena imovel : imoveisImobiliaria){
            if(imovel instanceof PredioResidencial_CaioIgorMilena){
                System.out.println("\n\n");
                System.out.println(imovel.toString());

                encontrou = true;
            }
        }

        if (!encontrou){
            System.out.println("\nNão há Predios cadastrados.");
        }

        System.out.println("\n-------------------------------\n");
    }

    public void showAllComercial(){
        if(this.imoveisImobiliaria.isEmpty()){
            System.out.println("\nLista de imoveis está vazia.");
            return;
        }

        Boolean encontrou = false;

        for (Imovel_CaioIgorMilena imovel : imoveisImobiliaria){
            if(imovel instanceof Comercial_CaioIgorMilena){
                System.out.println("\n\n");
                System.out.println(imovel.toString());

                encontrou = true;
            }
        }

        if (!encontrou){
            System.out.println("\nNão há Comerciais cadastrados.");
        }

        System.out.println("\n-------------------------------\n");
    }

    public void showAllDispVendas(){
        if(this.imoveisImobiliaria.isEmpty()){
            System.out.println("\nLista de imoveis está vazia.");
            return;
        }

        Boolean encontrou = false;

        for (Imovel_CaioIgorMilena imovel : imoveisImobiliaria){
            if(imovel.getDisponivelVenda()){
                System.out.println("\n\n");
                System.out.println(imovel.toString());

                encontrou = true;
            }
        }

        if (!encontrou){
            System.out.println("\nNão há imóveis disponíveis para venda.");
        }

        System.out.println("\n-------------------------------\n");
    }

    public void showAllDispLocacao(){
        if(this.imoveisImobiliaria.isEmpty()){
            System.out.println("\nLista de imoveis está vazia.");
            return;
        }

        Boolean encontrou = false;

        for (Imovel_CaioIgorMilena imovel : imoveisImobiliaria){
            if(imovel.getDisponivelLocacao()){
                System.out.println("\n\n");
                System.out.println(imovel.toString());

                encontrou = true;
            }
        }

        if (!encontrou){
            System.out.println("\nNão há imóveis disponíveis para locacao.");
        }

        System.out.println("\n-------------------------------\n");
    }

    public void showAllImoveisVendidos(){
        if(this.vendasImobiliaria.isEmpty()){
            System.out.println("\nLista de vendas está vazia.");
            return;
        }

        for (Venda_CaioIgorMilena venda : vendasImobiliaria){
                System.out.println("\n\n");
                System.out.println(venda.getImovel().toString());
        }

        System.out.println("\n-------------------------------\n");
    }

    public void showAllVendasMesELucro(int mes){
        if(this.vendasImobiliaria.isEmpty()){
            System.out.println("\nLista de vendas está vazia.");
            return;
        }

        Boolean encontrado = false;
        float lucro = 0;

        for (Venda_CaioIgorMilena venda : vendasImobiliaria){
            if (venda.getDataVenda().getMonth().getValue() == mes){
                System.out.println("\n\n");
                System.out.println(venda.getImovel().toString());

                lucro += venda.getValorTotalVenda();

                encontrado = true;
            }
        }

        if(encontrado){
            System.out.println("\nLucro: " + lucro);
        } else {
            System.out.println("\nNão houveram vendas nesse mês.");
        }

        System.out.println("\n-------------------------------\n");
    }

    public void showAllImoveisAlugados(){
        if(this.alugueisImobiliaria.isEmpty()){
            System.out.println("\nLista de alugueis está vazia.");
            return;
        }

        for (Aluguel_CaioIgorMilena aluguel : alugueisImobiliaria){
            System.out.println("\n\n");
            System.out.println(aluguel.getImovel().toString());
        }

        System.out.println("\n-------------------------------\n");
    }

    public void showAllImoveisAtraso(){
        if(this.alugueisImobiliaria.isEmpty()){
            System.out.println("\nLista de alugueis está vazia.");
            return;
        }

        Boolean encontrado = false;

        for (Aluguel_CaioIgorMilena aluguel : this.alugueisImobiliaria){
            if(!aluguel.getPago()){
                System.out.println("\n\n");
                System.out.println(aluguel.getImovel().toString());

                encontrado = true;
            }
        }

        if(!encontrado){
            System.out.println("\nNão há imóveis com atraso no pagamento de alugueis.");
        }

        System.out.println("\n-------------------------------\n");
    }

    public void showAllClientesAtraso(){
        if(this.alugueisImobiliaria.isEmpty()){
            System.out.println("\nLista de alugueis está vazia.");
            return;
        }

        Boolean encontrado = false;

        for (Aluguel_CaioIgorMilena aluguel : this.alugueisImobiliaria){
            if(!aluguel.getPago()){
                System.out.println("\n\n");
                System.out.println(aluguel.getCliente().toString());

                encontrado = true;
            }
        }

        if(!encontrado){
            System.out.println("\nNão há imóveis com atraso no pagamento de alugueis.");
        }

        System.out.println("\n-------------------------------\n");
    }

    public void showAllAlugueisAntesPrazo(){
        if(this.alugueisImobiliaria.isEmpty()){
            System.out.println("\nLista de alugueis está vazia.");
            return;
        }

        Boolean encontrado = false;

        for (Aluguel_CaioIgorMilena aluguel : this.alugueisImobiliaria){
            if(aluguel.getDataDevolucao().isBefore(LocalDate.now())){
                System.out.println("\n\n");
                System.out.println(aluguel.toString());

                encontrado = true;
            }
        }

        if(!encontrado){
            System.out.println("\nNão há alugueis finalizados.");
        }

        System.out.println("\n-------------------------------\n");
    }

    public void showAllAlugueisFinalizados(){
        if(this.alugueisImobiliaria.isEmpty()){
            System.out.println("\nLista de alugueis está vazia.");
            return;
        }

        Boolean encontrado = false;

        for (Aluguel_CaioIgorMilena aluguel : this.alugueisImobiliaria){
            if(aluguel.getFinalizado()){
                System.out.println("\n\n");
                System.out.println(aluguel.getCliente().toString());

                encontrado = true;
            }
        }

        if(!encontrado){
            System.out.println("\nNão há alugueis finalizados.");
        }

        System.out.println("\n-------------------------------\n");
    }

    public void showAlugueisPorCliente (String cpf){
        if(this.alugueisImobiliaria.isEmpty()){
            System.out.println("\nLista de alugueis está vazia.");
            return;
        }

        //Primeiro, mostrarei qual o cliente
        showCliente(cpf);

        Boolean encontrado = false;

        for (Aluguel_CaioIgorMilena aluguel : this.alugueisImobiliaria){
            if(aluguel.getCliente().getCpf().equals(cpf)){
                System.out.println("\n\n");
                System.out.println(aluguel.getImovel().toString());

                encontrado = true;
            }
        }

        if(!encontrado){
            System.out.println("\nNão há imóveis alugados por esse cliente.");
        }

        System.out.println("\n-------------------------------\n");
    }

    public void showVendasPorCliente (String cpf){
        if(this.vendasImobiliaria.isEmpty()){
            System.out.println("\nLista de vendas está vazia.");
            return;
        }

        //Primeiro, mostrarei qual o cliente
        showCliente(cpf);

        Boolean encontrado = false;

        for (Venda_CaioIgorMilena venda : this.vendasImobiliaria){
            if(venda.getCliente().getCpf() == cpf){
                System.out.println("\n\n");
                System.out.println(venda.getImovel().toString());

                encontrado = true;
            }
        }

        if(!encontrado){
            System.out.println("\nNão há imóveis comprados por esse cliente.");
        }

        System.out.println("\n-------------------------------\n");
    }



    //------> Clientes Imobiliaria

    public void addCliente(Cliente_CaioIgorMilena cliente){
        this.clientesImobiliaria.add(cliente);
    }

    public Usuario_CaioIgorMilena searchCliente(String cpf){
        if (clientesImobiliaria.isEmpty()){
            return null;
        }
        for(Usuario_CaioIgorMilena cliente : clientesImobiliaria){
            if(cliente.getCpf().equals(cpf)){
                return cliente;
            }
        }
        return null;
    }

    public void popCliente(Cliente_CaioIgorMilena cliente){
            this.clientesImobiliaria.remove(cliente);
    }

    public void showCliente(String cpf){

        //Primeiro iremos procurar o cliente
        Usuario_CaioIgorMilena cliente = searchCliente(cpf);

        if(cliente == null){
            System.out.println("\nCliente não encontrado.");
            return;
        }

        cliente.toString();

        System.out.println("\n-----------------------------------\n");
    }

    public void showAllClientes(){
        if(this.clientesImobiliaria.isEmpty()){
            System.out.println("Lista de clientes está vazia.");
        }
        for(Usuario_CaioIgorMilena cliente : clientesImobiliaria){
            System.out.println("\n\n");
            System.out.println(cliente.toString());
        }

        System.out.println("\n-----------------------------------\n");
    }

    //------>  Corretores Imobiliaria

    public void addCorretores(Corretor_CaioIgorMilena corretor){
        this.corretoresImobiliaria.add(corretor);
    }

    public Usuario_CaioIgorMilena searchCorretor(String creci){
        if (corretoresImobiliaria.isEmpty()){
            return null;
        }
        for(Usuario_CaioIgorMilena corretor : corretoresImobiliaria){

            if(((Corretor_CaioIgorMilena) corretor).getCreci().equals(creci)){
                return corretor;
            }
        }

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
        if(searchCorretor(corretor.getCpf()).equals(corretor)){
            System.out.println(corretor.toString());
        }else{
            System.out.println("Corretor não encontrado!");
        }

        System.out.println("\n-----------------------------------\n");
    }

    public void showAllCorretores(){
        if(this.corretoresImobiliaria.isEmpty()){
            System.out.println("Lista de corretores está vazia");
        }
        for(Usuario_CaioIgorMilena corretor : corretoresImobiliaria){
            System.out.println("\n\n");
            System.out.println(corretor.toString());
        }

        System.out.println("\n-----------------------------------\n");
    }

    //------>  Seguros Imobiliaria

    public void addSeguro(Seguro_CaioIgorMilena seguro){
        this.segurosImobiliaria.add(seguro);
    }

    public Seguro_CaioIgorMilena searchSeguro(int codigoSeguro){
        if (segurosImobiliaria.isEmpty()){
            return null;
        }
        for(Seguro_CaioIgorMilena seguro : segurosImobiliaria){
            if(seguro.getCodigoSeguro() == codigoSeguro){
                return seguro;
            }
        }

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
            System.out.println(seguro.toString());
        }else{
            System.out.println("Seguro não encontrado!");
        }

        System.out.println("\n-----------------------------------\n");
    }

    public void showAllSeguros(){
        if(this.segurosImobiliaria.isEmpty()){
            System.out.println("Lista de seguros vazia.");
        }

        int i = 1;
        for(Seguro_CaioIgorMilena seguro : segurosImobiliaria){
            System.out.println(i + ")");
            System.out.println(seguro.toString());
            i++;
        }

        System.out.println("\n-----------------------------------\n");
    }

}
