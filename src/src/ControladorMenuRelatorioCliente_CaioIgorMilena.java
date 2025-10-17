public class ControladorMenuRelatorioCliente_CaioIgorMilena extends Controlador_CaioIgorMilena{

    public void relatorios(Imobiliaria_CaioIgorMilena imobiliaria, int opcao, String cpf){
        //Imóveis já alugados por um Cliente em específico
        if(opcao == 10){
            relatorioAluguelPorCliente(imobiliaria, cpf);
        }

        //Imóveis já comprados por um Cliente em específico
        if(opcao == 11){
            relatorioVendaPorCliente(imobiliaria, cpf);
        }
    }
}

