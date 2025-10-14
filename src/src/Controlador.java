public class Controlador {

    // ---- CADASTROS DE USUÁRIOS ----

    //Cadastro de Cliente
    public Boolean cadastroCliente(Imobiliaria_CaioIgorMilena imobiliaria, Cliente_CaioIgorMilena cliente){
        String cpf = cliente.getCpf();

        //Vendo se o cliente já existe
        if(imobiliaria.searchCliente(cpf) != null){
            return false; //Falha (Cliente já cadastrado)
        }

        //O cliente não existe, então seu cadastro será feito
        imobiliaria.addCliente(cliente);
        return true;
    }

    //Cadastro de Corretor
    public Boolean cadastroCorretor(Imovel_CaioIgorMilena imobiliaria, Corretor_CaioIgorMilena corretor){
        String cpf = corretor.getCpf();

        if(imobiliaria.searchCorretor(cpf) != null){
            return false; //Falha (corretor já cadastrado)
        }

        //O corretor não existe, então seu cadastro será feito
        imobiliaria.addCorretor(corretor);
        return true;
    }

    // ---- CADASTRO DE IMÓVEIS ----

    //Cadastro de Casa Residencial
    public Boolean cadastroCasaResidencial(Imobiliaria_CaioIgorMilena imobiliaria, CasaResidencial_CaioIgorMilena casa){
        int codigoCasa = casa.getCodigoImovel();

        if(imobiliaria.searchCasa(codigoCasa) != null){
            return false; //Falha (casa já cadastrada)
        }

        imobiliaria.addCasa(casa);
        return true;
    }

    //Cadastro de Predio Residencial
    public Boolean cadastroPredioResidencial(Imobiliaria_CaioIgorMilena imobiliaria, PredioResidencial_CaioIgorMilena predio){
        int codigoPredio = predio.getCodigoImovel();

        if(imobiliaria.searchPredio(codigoPredio) != null){
            return false; //Falha (predio já cadastrada)
        }

        imobiliaria.addCasa(predio);
        return true;
    }

    //Cadastro de Comercial
    public Boolean cadastroComercial(Imobiliaria_CaioIgorMilena imobiliaria, Comercial_CaioIgorMilena comercio){
        int codigoComercio = comercio.getCodigoImovel();

        if(imobiliaria.searchComercio(codigoComercio) != null){
            return false; //Falha (predio já cadastrada)
        }

        imobiliaria.addComercio(comercio);
        return true;
    }

    // ---- EFETUANDO VENDAS E ALUGUEIS ----
    public Boolean efetuandoVenda(Imovel_CaioIgorMilena imobiliaria, Cliente_CaioIgorMilena cliente, Corretor_CaioIgorMilena corretor, Imovel_CaioIgorMilena imovel){

    }

}
