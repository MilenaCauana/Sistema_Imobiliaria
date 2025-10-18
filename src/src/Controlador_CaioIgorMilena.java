import java.time.LocalDate;

public class Controlador_CaioIgorMilena {

    // ================== RELATÓRIOS OBRIGATÓRIOS ==================

    //Listar todos os imóveis cadastrados
    public void relatorioImoveis(Imobiliaria_CaioIgorMilena imobiliaria){
        imobiliaria.showAllImoveis();
    }

    //Listar todos os imóveis: Casa Residencial
    public void relatorioCasaResidencial(Imobiliaria_CaioIgorMilena imobiliaria){
        imobiliaria.showAllCasaResidencial();
    }

    //Listar todos os Imóveis de categoria: Prédio Residencial
    public void relatorioPredio(Imobiliaria_CaioIgorMilena imobiliaria){
        imobiliaria.showAllPredio();
    }

    //Listar todos os Imóveis de categoria Comercial
    public void relatorioComercial(Imobiliaria_CaioIgorMilena imobiliaria){
        imobiliaria.showAllComercial();
    }

    //Listar todos os Imóveis disponíveis para locação
    public void relatorioDispLocacao(Imobiliaria_CaioIgorMilena imobiliaria){
        imobiliaria.showAllDispLocacao();
    }

    //Listar todos os Imóveis alugados
    public void relatorioImovAlugados(Imobiliaria_CaioIgorMilena imobiliaria){
        imobiliaria.showAllImoveisAlugados();
    }

    //Listar todos os Imóveis vendidos
    public void relatorioImovVendidos(Imobiliaria_CaioIgorMilena imobiliaria){
        imobiliaria.showAllImoveisVendidos();
    }

    //Listar todos os Imóveis disponíveis para vendas
    public void relatorioDisVenda(Imobiliaria_CaioIgorMilena imobiliaria){
        imobiliaria.showAllDispVendas();
    }

    //Listar todos os Imóveis com atraso no pagamento do aluguel
    public void relatorioAtraso(Imobiliaria_CaioIgorMilena imobiliaria){
        imobiliaria.showAllImoveisAtraso();
    }

    //Listar todos os Imóveis já alugados por um Cliente em específico
    public void relatorioAluguelPorCliente(Imobiliaria_CaioIgorMilena imobiliaria, String cpf){
        imobiliaria.showAlugueisPorCliente(cpf);
    }

    //Listar todos os Imóveis já comprados por um Cliente em específico
    public void relatorioVendaPorCliente(Imobiliaria_CaioIgorMilena imobiliaria, String cpf){
        imobiliaria.showVendasPorCliente(cpf);
    }

    //Listar todos os Corretores cadastrados
    public void relatorioCorretores(Imobiliaria_CaioIgorMilena imobiliaria){
        imobiliaria.showAllCorretores();
    }

    //Listar todos os Clientes cadastrados
    public void relatorioClientes(Imobiliaria_CaioIgorMilena imobiliaria){
        imobiliaria.showAllClientes();
    }

    //Listar Clientes com aluguéis em atraso
    public void relatorioClientesAtraso(Imobiliaria_CaioIgorMilena imobiliaria){
        imobiliaria.showAllClientesAtraso();
    }

    //Listar todos os Aluguéis finalizados, ou seja, que já concluíram contrato e foram devolvidos
    public void relatorioAlugueisFinalizados(Imobiliaria_CaioIgorMilena imobiliaria){
        imobiliaria.showAllAlugueisFinalizados();
    }

    //Listar todos os Aluguéis ainda dentro do prazo de locação
    public void relatorioAluguelPrazo(Imobiliaria_CaioIgorMilena imobiliaria){
        imobiliaria.showAllAlugueisAntesPrazo();
    }

    //Listar todas as Vendas realizadas
    public void relatorioVendas(Imobiliaria_CaioIgorMilena imobiliaria){
        imobiliaria.showAllVendas();
    }

    //Listar Vendas realizadas em um mês em específico e o total de lucro gerado no mês
    public void relatorioVendasMesELucro(Imobiliaria_CaioIgorMilena imobiliaria, int mes){
        imobiliaria.showAllVendasMesELucro(mes);
    }

    //Listar todos os tipos de Seguros cadastrados
    public void relatorioSeguros(Imobiliaria_CaioIgorMilena imobiliaria){
        imobiliaria.showAllSeguros();
    }

    // ================== VERIFICAÇÕES DE DISPONIBILIDADES =================

    public Boolean verificarDispVenda(Imovel_CaioIgorMilena imovel){

        if(!imovel.getDisponivelVenda()){
            System.out.println("\nImovel nao disponivel para venda.");
            return false;
        }

        return true;
    }

    public Boolean verificarDispAluguel(Imovel_CaioIgorMilena imovel){
        if(!imovel.getDisponivelLocacao()){
            System.out.println("\nImovel nao disponivel para locação.");
            return false;
        }

        return true;
    }

    // ================== REGRAS DE NEGÓCIO ==================
    
    // ================= DEFININDO DATAS ALUGUÉIS ==================
    public void dataDevolucaoUmAno(Aluguel_CaioIgorMilena aluguel){
       LocalDate data = LocalDate.now();

       int dia = data.getDayOfMonth();
       int mes = data.getMonthValue();
       int anoQueVem = data.getYear() + 1;

       data = LocalDate.of(anoQueVem, mes, dia);


        aluguel.setDataDevolucao(data);
    }

    // ---- CADASTRO SEGUROS ----
    public Boolean verificaSeguroJaCadastrado(Imobiliaria_CaioIgorMilena imobiliaria, int codigoSeguro){
        if(imobiliaria.searchSeguro(codigoSeguro) != null){
            return true; //Já está cadastrado
        }
        return false; //Não está cadastrado
    }

    public Boolean cadastroSeguro(Imobiliaria_CaioIgorMilena imobiliaria, Seguro_CaioIgorMilena seguro){
        imobiliaria.addSeguro(seguro);
        return true;
    }

    // ---- CADASTROS DE USUÁRIOS ----

    //Método para verificar se o cliente já foi cadastrado de acordo com o cpf
    public Boolean verificaClienteJaCadastrado(Imobiliaria_CaioIgorMilena imobiliaria, String cpf){
        Usuario_CaioIgorMilena cliente = imobiliaria.searchCliente(cpf);

        //Vendo se o cliente já existe
        if(cliente != null){
            return true; //Cliente existe
        }

        return false; //Cliente não existe

    }

    //Cadastro de Cliente
    public Boolean cadastroCliente(Imobiliaria_CaioIgorMilena imobiliaria, Cliente_CaioIgorMilena cliente){

        //O cliente não existe, então seu cadastro será feito
        imobiliaria.addCliente(cliente);
        return true;
    }

    public Boolean verificaCorretorJaCadastrado(Imobiliaria_CaioIgorMilena imobiliaria, String creci){
        Usuario_CaioIgorMilena corretor = imobiliaria.searchCorretor(creci);

        if(corretor != null){
            return true; //Corretor existe
        }

        return false; //Corretor não existe
    }

    //Cadastro de Corretor
    public Boolean cadastroCorretor(Imobiliaria_CaioIgorMilena imobiliaria, Corretor_CaioIgorMilena corretor){

        //O corretor não existe, então seu cadastro será feito
        imobiliaria.addCorretores(corretor);
        return true;
    }

    // ---- REMOVER USUARIO ----
    public Boolean removeCliente(Imobiliaria_CaioIgorMilena imobiliaria, String cpf){

        //Primeiro, procurando o cliente
        Usuario_CaioIgorMilena cliente = imobiliaria.searchCliente(cpf);

        if (cliente == null){
            return false;
        }

        imobiliaria.popCliente((Cliente_CaioIgorMilena) cliente);
        return true;

    }

    public Boolean removeCorretor(Imobiliaria_CaioIgorMilena imobiliaria, String creci){

        //Primeiro, procurando o cliente
        Usuario_CaioIgorMilena corretor = imobiliaria.searchCorretor(creci);

        if (corretor == null){
            return false;
        }

        imobiliaria.popCorretor((Corretor_CaioIgorMilena) corretor);
        return true;

    }

    // ---- CADASTRO DE IMÓVEIS ----

    //Cadastro de Casa Residencial
    public Boolean cadastroCasaResidencial(Imobiliaria_CaioIgorMilena imobiliaria, CasaResidencial_CaioIgorMilena casa){
        int codigoCasa = casa.getCodigoImovel();

        if(imobiliaria.searchImovel(codigoCasa) != null){
            return false; //Falha (casa já cadastrada)
        }

        imobiliaria.addImovel(casa);
        return true;
    }

    //Cadastro de Predio Residencial
    public Boolean cadastroPredioResidencial(Imobiliaria_CaioIgorMilena imobiliaria, PredioResidencial_CaioIgorMilena predio){
        int codigoPredio = predio.getCodigoImovel();

        if(imobiliaria.searchImovel(codigoPredio) != null){
            return false; //Falha (predio já cadastrada)
        }

        imobiliaria.addImovel(predio);
        return true;
    }

    //Cadastro de Comercial
    public Boolean cadastroComercial(Imobiliaria_CaioIgorMilena imobiliaria, Comercial_CaioIgorMilena comercio){
        int codigoComercio = comercio.getCodigoImovel();

        if(imobiliaria.searchImovel(codigoComercio) != null){
            return false; //Falha (predio já cadastrada)
        }

        imobiliaria.addImovel(comercio);
        return true;
    }

    // ---- EFETUANDO VENDAS E ALUGUEIS ----
    //Nesse caso, o efetuar significa adicionar ao sistema

    public  Corretor_CaioIgorMilena buscaCorretor (Imobiliaria_CaioIgorMilena imobiliaria, String creci){
        Corretor_CaioIgorMilena corretor = (Corretor_CaioIgorMilena) imobiliaria.searchCorretor(creci);

        return corretor;
    }

    public Boolean vendaExiste(Imobiliaria_CaioIgorMilena imobiliaria, int codigoVenda){
        if(imobiliaria.searchVenda(codigoVenda) != null){
            return false; //Já existe venda com esse código cadastrada
        }

        return true;
    }

    public Boolean efetuarVenda(Imobiliaria_CaioIgorMilena imobiliaria, Imovel_CaioIgorMilena imovel, Venda_CaioIgorMilena venda){

        //Tornando false a disponibilidade o imovel
        imovel.disponivelVenda = false;
        imovel.disponivelLocacao = false;

        //Agora que estão todos cadastrados, a venda será colocada no sistema
        imobiliaria.addVendas(venda);
        return true; //Vendas no sistema
    }

    public Boolean aluguelExiste(Imobiliaria_CaioIgorMilena imobiliaria, int codigoAluguel){
        if(imobiliaria.searchAluguel(codigoAluguel) != null){
            return false; //Já existe venda com esse código cadastrada
        }

        return true;
    }

    public Boolean efetuarAluguel(Imobiliaria_CaioIgorMilena imobiliaria, Imovel_CaioIgorMilena imovel, Aluguel_CaioIgorMilena aluguel,  Boolean statusVenda){

        //Tornando false a disponibilidade o imovel
        imovel.disponivelVenda = statusVenda;
        imovel.disponivelLocacao = false;

        //Agora que estão todos cadastrados, a venda será colocada no sistema
        imobiliaria.addAlugueis(aluguel);
        return true; //Aluguel no sistema
    }

    // ---- ATUALIZANDO STATUS DE VENDAS E ALUGUEIS ----

    public void atualizaStatusVenda(Venda_CaioIgorMilena venda, Boolean status){
        venda.setFinalizada(status);
    }

    public void atualizaStatusAluguel(Aluguel_CaioIgorMilena aluguel, Boolean status){
        aluguel.setFinalizado(status);
    }

    // ---- ATUALIZANDO STATUS DE PAGAMENTO DE ALUGUEL ----
    public void atualizaPagoAluguel(Aluguel_CaioIgorMilena aluguel, Boolean status){
        aluguel.setPago(status);
    }

    // ============== OPÇÕES DO MENU ==============
   public void menuPrincipal(){
        System.out.println("\nEscolha uma opção: ");
        System.out.println("1) Cadastro de Usuário;");
        System.out.println("2) Remover usuário;");
        System.out.println("3) Cadastro de Imóveis;");
        System.out.println("4) Vender Imóvel;");
        System.out.println("5) Alugar Imóvel;");
        System.out.println("6) Cadastro de Seguros;");
        System.out.println("7) Acessar relatórios;");
        System.out.println("-1) Encerrar sistema;");
        System.out.println("Opção: ");
   }

    public void relatoriosMenu(){
        System.out.println("\n\n -- Selecione o relatório que deseja visualizar: --");
        System.out.println("1) Imóveis cadastrados;");
        System.out.println("2) Casas Resideciais cadastradas;");
        System.out.println("3) Prédios Residenciais cadastrados;");
        System.out.println("4) Comerciais cadastrados;");
        System.out.println("5) Imóveis disponíveis para locação;");
        System.out.println("6) Imóveis disponiveis para venda;");
        System.out.println("7) Imóveis alugados;");
        System.out.println("8) Imóveis vendidos;");
        System.out.println("9) Imóveis com atraso no aluguel;");
        System.out.println("10) Imóveis já alugados por um Cliente em específico;");
        System.out.println("11) Imóveis já comprados por um Cliente em específico;");
        System.out.println("12) Corretores cadastrados;");
        System.out.println("13) Clientes cadastrados;");
        System.out.println("14) Clientes com alugueis em atraso;");
        System.out.println("15) Alugueis Finalizados;");
        System.out.println("16) Alugueis dentro do prazo de locação;");
        System.out.println("17) Vendas realizadas;");
        System.out.println("18) Vendas realizadas em um mês em específico e o total de lucro gerado no mês;");
        System.out.println("19) Seguros disponíveis;");
        System.out.println("20) Voltar ao Menu Principal;");

    }

    public void relatorios(Imobiliaria_CaioIgorMilena imobiliaria, int opcao){

        //Imóveis cadastrados
        if(opcao == 1){
            relatorioImoveis(imobiliaria);
        }

        //Casas Resideciais cadastradas
        if(opcao == 2){
            relatorioCasaResidencial(imobiliaria);
        }

        //Prédios Residenciais cadastrados
        if(opcao == 3){
            relatorioPredio(imobiliaria);
        }

        //Comerciais cadastrados
        if(opcao == 4){
            relatorioComercial(imobiliaria);
        }

        //Imóveis disponíveis para locação
        if(opcao == 5){
            relatorioDispLocacao(imobiliaria);
        }

        //Imóveis disponiveis para venda
        if(opcao == 6){
            relatorioDisVenda(imobiliaria);
        }

        //Imóveis alugados
        if(opcao == 7){
            relatorioImovAlugados(imobiliaria);
        }

        //Imóveis vendidos
        if(opcao == 8){
            relatorioImovVendidos(imobiliaria);
        }

        //Imóveis com atraso no aluguel
        if(opcao == 9){
            relatorioAtraso(imobiliaria);
        }

        //Corretores cadastrados
        if(opcao == 12){
            relatorioCorretores(imobiliaria);
        }

        //Clientes cadastrados
        if(opcao == 13){
            relatorioClientes(imobiliaria);
        }

        //Clientes com alugueis em atraso
        if(opcao == 14){
            relatorioClientesAtraso(imobiliaria);
        }

        //Alugueis Finalizados
        if(opcao == 15){
            relatorioAlugueisFinalizados(imobiliaria);
        }

        //Alugueis dentro do prazo de locação
        if(opcao == 16){
            relatorioAluguelPrazo(imobiliaria);
        }

        //Vendas realizadas
        if(opcao == 17){
            relatorioVendas(imobiliaria);
        }

        //Seguros disponíveis
        if(opcao == 19){
            relatorioSeguros(imobiliaria);
        }

        if(opcao == 20){
            return;
        }

    }

}

