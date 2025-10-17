import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Primeiro, irei instanciar um objeto de cada classe que não tem Array
        Aluguel_CaioIgorMilena aluguel = new Aluguel_CaioIgorMilena();
        Cartao_CaioIgorMilena cartao = new Cartao_CaioIgorMilena();
        CasaResidencial_CaioIgorMilena casaResidencial = new CasaResidencial_CaioIgorMilena();
        Cliente_CaioIgorMilena cliente = new Cliente_CaioIgorMilena();
        Comercial_CaioIgorMilena comercial = new Comercial_CaioIgorMilena();
        Configuracao_CaioIgorMilena configuracao = new Configuracao_CaioIgorMilena();
        Controlador_CaioIgorMilena controlador = new Controlador_CaioIgorMilena();
        ControladordeArquivos_CaioIgorMilena controladorArquivos = new ControladordeArquivos_CaioIgorMilena();
        Corretor_CaioIgorMilena corretor = new Corretor_CaioIgorMilena();
        Dinheiro_CaioIgorMilena dinheiro = new Dinheiro_CaioIgorMilena();
        PredioResidencial_CaioIgorMilena predioResidencial = new PredioResidencial_CaioIgorMilena();
        Seguro_CaioIgorMilena seguro = new Seguro_CaioIgorMilena();
        Venda_CaioIgorMilena venda = new Venda_CaioIgorMilena();
        Imovel_CaioIgorMilena imovel = new Imovel_CaioIgorMilena();

        Imobiliaria_CaioIgorMilena imobiliaria = new Imobiliaria_CaioIgorMilena();

        //Abrindo todas as informações que estão nos arquivos
        controladorArquivos.carregarInfdeArquivos(imobiliaria);

        System.out.println("\n\n =========== SISTEMA " + imobiliaria.getNome().toUpperCase() + "===========");
        System.out.println("Bem-vindo!");

        int opcaoMenu;
        int opcaoCadastro;
        int opcaoAlguelOuVenda;
        int opcaoRelatorio;

        int ano, mes, dia;
        int codigoImovel;
        String cpf, creci;
        Boolean removeu, cadastrado, dispVenda = false;

        //Agora, fazendo de fato o menu
        do{
            controlador.menuPrincipal();
            opcaoMenu = sc.nextInt();

            //Cadastro de Usuário
            if (opcaoMenu == 1){

                do {
                    System.out.println("\n--- Usuário a ser cadastrado:");
                    System.out.println("1) Corretor;");
                    System.out.println("2) Cliente;");
                    System.out.println("3) Voltar ao menu;");
                    System.out.println("------------\n");

                    opcaoCadastro = sc.nextInt();

                    if (opcaoCadastro == 1){
                        System.out.println(" CADASTRO DE CORRETOR: ");
                        System.out.println("-- Forneça as informações a seguir: ");

                        System.out.println("Código de Usuário: ");
                        corretor.setCodigoUsuario(sc.nextInt());
                        sc.nextLine();

                        System.out.println("Nome completo: ");
                        corretor.setNome(sc.nextLine());

                        System.out.println("CPF: ");
                        corretor.setCpf(sc.nextLine());

                        System.out.println("RG: ");
                        corretor.setRg(sc.nextLine());

                        System.out.println("Data Nascimento: ");
                        System.out.println("DIA: ");
                        dia = sc.nextInt();
                        sc.nextLine();
                        System.out.println("MÊS: ");
                        mes = sc.nextInt();
                        sc.nextLine();
                        System.out.println("ANO: ");
                        ano = sc.nextInt();
                        sc.nextLine();
                        corretor.setDataNascimento(ano, mes, dia);

                        System.out.println("Endereço: ");
                        corretor.setEndereco(sc.nextLine());
                        System.out.println("CEP: ");
                        corretor.setEndereco(sc.nextLine());

                        System.out.println("Telefone: ");
                        corretor.setTelefone(sc.nextLine());

                        System.out.println("E-mail: ");
                        corretor.setEmail(sc.nextLine());

                        System.out.println("Creci: ");
                        creci = sc.nextLine();
                        corretor.setCpf(creci);
                        if (!controlador.verificaCorretorJaCadastrado(imobiliaria, creci)){
                            System.out.println(" ! Corretor já cadastrado !");
                            System.out.println(" TENTE NOVAMENTE");
                            System.out.println("----------------------\n");
                            continue;
                        }

                        System.out.println("Salario: ");
                        corretor.setSalario(sc.nextFloat());
                        sc.nextLine();

                        System.out.println("Pis: ");
                        corretor.setPis(sc.nextLine());

                        corretor.setDataAdmissao();

                        controlador.cadastroCorretor(imobiliaria, corretor);

                        System.out.println("CADASTRADO COM SUCESSO! ");
                        System.out.println("----------------------\n");
                    }

                    if (opcaoCadastro == 2){
                        System.out.println(" CADASTRO DE CLIENTE: ");
                        System.out.println("-- Forneça as informações a seguir: ");

                        System.out.println("Código de Usuário: ");
                        cliente.setCodigoUsuario(sc.nextInt());
                        sc.nextLine();

                        System.out.println("Nome completo: ");
                        cliente.setNome(sc.nextLine());

                        System.out.println("CPF: ");
                        cpf = sc.nextLine();
                        cliente.setCpf(cpf);
                        if (controlador.verificaClienteJaCadastrado(imobiliaria, cpf)){
                            System.out.println(" ! Cliente já cadastrado !");
                            System.out.println(" TENTE NOVAMENTE");
                            System.out.println("----------------------\n");
                            continue;
                        }


                        System.out.println("RG: ");
                        cliente.setRg(sc.nextLine());

                        System.out.println("Data Nascimento: ");
                        System.out.println("DIA: ");
                        dia = sc.nextInt();
                        sc.nextLine();
                        System.out.println("MÊS: ");
                        mes = sc.nextInt();
                        sc.nextLine();
                        System.out.println("ANO: ");
                        ano = sc.nextInt();
                        sc.nextLine();
                        cliente.setDataNascimento(ano, mes, dia);

                        System.out.println("Endereço: ");
                        cliente.setEndereco(sc.nextLine());
                        System.out.println("CEP: ");
                        cliente.setEndereco(sc.nextLine());

                        System.out.println("Telefone: ");
                        cliente.setTelefone(sc.nextLine());

                        System.out.println("E-mail: ");
                        cliente.setEmail(sc.nextLine());

                        cliente.setDataCadastro();

                        controlador.cadastroCliente(imobiliaria, cliente);
                        System.out.println(" CADASTRADO COM SUCESSO! ");
                        System.out.println("----------------------\n");

                    }

                }while (opcaoCadastro != 3);
            }

            //Remover Usuario
            if (opcaoMenu == 2){
                do {
                    System.out.println("--- Usuário a ser removido:");
                    System.out.println("1) Corretor;");
                    System.out.println("2) Cliente;");
                    System.out.println("3) Voltar ao menu;");
                    System.out.println("------------\n");

                    opcaoCadastro = sc.nextInt();
                    sc.nextLine();

                    if (opcaoCadastro == 1){
                        System.out.println(" REMOVER CLIENTE: ");
                        System.out.println("CPF: ");
                        cpf = sc.nextLine();

                        removeu = controlador.removeCliente(imobiliaria,cpf);

                        if(!removeu){
                            System.out.println("! Cliente não foi encontrado !");
                            System.out.println("Não foi possível remover.");
                            System.out.println("TENTE NOVAMENTE");
                            System.out.println("----------------------\n");
                            continue;
                        }

                        System.out.println("REMOVIDO COM SUCESSO!");
                        System.out.println("----------------------\n");

                    }

                    if (opcaoCadastro == 2){
                        System.out.println(" REMOVER CORRETOR: ");
                        System.out.println("Creci: ");
                        creci = sc.nextLine();

                        removeu = controlador.removeCorretor(imobiliaria,creci);

                        if(!removeu){
                            System.out.println("! Corretor não foi encontrado !");
                            System.out.println("Não foi possível remover.");
                            System.out.println(" TENTE NOVAMENTE");
                            System.out.println("----------------------\n");
                            continue;
                        }

                        System.out.println("REMOVIDO COM SUCESSO!");
                        System.out.println("----------------------\n");

                    }

                }while (opcaoCadastro != 3);

            }

            //Cadastro de imóveis
            if(opcaoMenu == 3){
                do {
                    System.out.println("--- Imóvel a ser cadastrado:");
                    System.out.println("1) Casa Residencial;");
                    System.out.println("2) Predio Residencial;");
                    System.out.println("3) Comercial;");
                    System.out.println("4) Voltar ao Menu;");
                    System.out.println("------------\n");

                    opcaoCadastro = sc.nextInt();
                    sc.nextLine();

                    if (opcaoCadastro == 1){
                        System.out.println(" CADASTRO DE CASA RESIDENCIAL: ");
                        System.out.println("-- Forneça as informações a seguir: ");

                        System.out.println("Código do Imóvel: ");
                        casaResidencial.setCodigoImovel(sc.nextInt());
                        sc.nextLine();

                        System.out.println("Endereço: ");
                        casaResidencial.setEndereco(sc.nextLine());

                        System.out.println("Data Construção: ");
                        System.out.println("DIA: ");
                        dia = sc.nextInt();
                        sc.nextLine();
                        System.out.println("MÊS: ");
                        mes = sc.nextInt();
                        sc.nextLine();
                        System.out.println("ANO: ");
                        ano = sc.nextInt();
                        sc.nextLine();
                        casaResidencial.setDataConstrucao(ano, mes, dia);

                        System.out.println("Área Total: ");
                        casaResidencial.setAreaTotal(sc.nextFloat());
                        sc.nextLine();

                        System.out.println("Área Construida: ");
                        casaResidencial.setAreaConstruida(sc.nextFloat());
                        sc.nextLine();

                        System.out.println("Quantidade de Dormitórios: ");
                        casaResidencial.setQtdDormitorios(sc.nextInt());
                        sc.nextLine();

                        System.out.println("Quantidade de Banheiros: ");
                        casaResidencial.setQtdBanheiros(sc.nextInt());
                        sc.nextLine();

                        System.out.println("Quantidade de Vagas de Garagem: ");
                        casaResidencial.setQtdVagasGaragem(sc.nextInt());
                        sc.nextLine();

                        System.out.println("Valor IPTU: ");
                        casaResidencial.setValorIPTU(sc.nextFloat());
                        sc.nextLine();

                        do{
                            System.out.println(" -- O Imóvel estará disponível para aluguel?");
                            System.out.println("1) Sim");
                            System.out.println("2) Não");
                            opcaoAlguelOuVenda = sc.nextInt();
                            sc.nextLine();

                            if(opcaoAlguelOuVenda == 1){
                                casaResidencial.setDisponivelLocacao(true);

                                System.out.println("Valor Aluguel: ");
                                casaResidencial.setValorAluguel(sc.nextFloat());
                                sc.nextLine();
                            }

                            if(opcaoAlguelOuVenda == 2){
                                casaResidencial.setDisponivelLocacao(false);

                                casaResidencial.setValorAluguel(0);
                            }

                        }while(!(opcaoAlguelOuVenda != 1 || opcaoAlguelOuVenda != 2 ));

                        do{
                            System.out.println("-- O Imóvel estará disponível para venda?");
                            System.out.println("1) Sim");
                            System.out.println("2) Não");
                            opcaoAlguelOuVenda = sc.nextInt();
                            sc.nextLine();

                            if(opcaoAlguelOuVenda == 1){
                                casaResidencial.setDisponivelVenda(true);

                                System.out.println("Valor Venda: ");
                                casaResidencial.setValorAluguel(sc.nextFloat());
                                sc.nextLine();
                            }

                            if(opcaoAlguelOuVenda == 2){
                                casaResidencial.setDisponivelVenda(false);

                                casaResidencial.setValorVenda(0);
                            }

                        }while(!(opcaoAlguelOuVenda != 1 || opcaoAlguelOuVenda != 2 ));

                        cadastrado = controlador.cadastroCasaResidencial(imobiliaria, casaResidencial);

                        if(!cadastrado){
                            System.out.println("! Imóvel não foi cadastrado !");
                            System.out.println("Já existe esse código de Imóvel.");
                            System.out.println(" TENTE NOVAMENTE");
                            System.out.println("----------------------\n");
                            continue;
                        }

                        System.out.println("CADASTRADO COM SUCESSO! ");
                        System.out.println("----------------------\n");
                    }

                    if (opcaoCadastro == 2){
                        System.out.println(" CADASTRO DE PRÉDIO RESIDENCIAL: ");
                        System.out.println("-- Forneça as informações a seguir: ");

                        System.out.println("Código do Imóvel: ");
                        predioResidencial.setCodigoImovel(sc.nextInt());
                        sc.nextLine();

                        System.out.println("Endereço: ");
                        predioResidencial.setEndereco(sc.nextLine());

                        System.out.println("Data Construção: ");
                        System.out.println("DIA: ");
                        dia = sc.nextInt();
                        sc.nextLine();
                        System.out.println("MÊS: ");
                        mes = sc.nextInt();
                        sc.nextLine();
                        System.out.println("ANO: ");
                        ano = sc.nextInt();
                        sc.nextLine();
                        predioResidencial.setDataConstrucao(ano, mes, dia);

                        System.out.println("Área Total: ");
                        predioResidencial.setAreaTotal(sc.nextFloat());
                        sc.nextLine();

                        System.out.println("Área Construida: ");
                        predioResidencial.setAreaConstruida(sc.nextFloat());
                        sc.nextLine();

                        System.out.println("Quantidade de Dormitórios: ");
                        predioResidencial.setQtdDormitorios(sc.nextInt());
                        sc.nextLine();

                        System.out.println("Quantidade de Banheiros: ");
                        predioResidencial.setQtdBanheiros(sc.nextInt());
                        sc.nextLine();

                        System.out.println("Quantidade de Vagas de Garagem: ");
                        predioResidencial.setQtdVagasGaragem(sc.nextInt());
                        sc.nextLine();

                        System.out.println("Valor IPTU: ");
                        predioResidencial.setValorIPTU(sc.nextFloat());
                        sc.nextLine();

                        do{
                            System.out.println("-- O Imóvel estará disponível para aluguel?");
                            System.out.println("1) Sim");
                            System.out.println("2) Não");
                            opcaoAlguelOuVenda = sc.nextInt();
                            sc.nextLine();

                            if(opcaoAlguelOuVenda == 1){
                                predioResidencial.setDisponivelLocacao(true);

                                System.out.println("Valor Aluguel: ");
                                predioResidencial.setValorAluguel(sc.nextFloat());
                                sc.nextLine();
                            }

                            if(opcaoAlguelOuVenda == 2){
                                predioResidencial.setDisponivelLocacao(false);

                                predioResidencial.setValorAluguel(0);
                            }

                        }while(!(opcaoAlguelOuVenda != 1 || opcaoAlguelOuVenda != 2 ));

                        do{
                            System.out.println("-- O Imóvel estará disponível para venda?");
                            System.out.println("1) Sim");
                            System.out.println("2) Não");
                            opcaoAlguelOuVenda = sc.nextInt();
                            sc.nextLine();

                            if(opcaoAlguelOuVenda == 1){
                                predioResidencial.setDisponivelVenda(true);

                                System.out.println("Valor Venda: ");
                                predioResidencial.setValorAluguel(sc.nextFloat());
                                sc.nextLine();
                            }

                            if(opcaoAlguelOuVenda == 2){
                                predioResidencial.setDisponivelVenda(false);

                                predioResidencial.setValorVenda(0);
                            }

                        }while(!(opcaoAlguelOuVenda != 1 || opcaoAlguelOuVenda != 2 ));

                        System.out.println("Andar: ");
                        predioResidencial.setAndar(sc.nextInt());
                        sc.nextLine();

                        System.out.println("Valor Condominio: ");
                        predioResidencial.setValorCondominio(sc.nextFloat());
                        sc.nextLine();

                        cadastrado = controlador.cadastroPredioResidencial(imobiliaria, predioResidencial);

                        if(!cadastrado){
                            System.out.println("! Imóvel não foi cadastrado !");
                            System.out.println("Já existe esse código de Imóvel.");
                            System.out.println("TENTE NOVAMENTE");
                            System.out.println("----------------------\n");
                            continue;
                        }

                        System.out.println("CADASTRADO COM SUCESSO! ");
                        System.out.println("----------------------\n");

                    }

                    if (opcaoCadastro == 3){
                        System.out.println(" CADASTRO DE COMERCIAL: ");
                        System.out.println("-- Forneça as informações a seguir: ");

                        System.out.println("Código do Imóvel: ");
                        comercial.setCodigoImovel(sc.nextInt());
                        sc.nextLine();

                        System.out.println("Endereço: ");
                        comercial.setEndereco(sc.nextLine());

                        System.out.println("Data Construção: ");
                        System.out.println("DIA: ");
                        dia = sc.nextInt();
                        sc.nextLine();
                        System.out.println("MÊS: ");
                        mes = sc.nextInt();
                        sc.nextLine();
                        System.out.println("ANO: ");
                        ano = sc.nextInt();
                        sc.nextLine();
                        comercial.setDataConstrucao(ano, mes, dia);

                        System.out.println("Área Total: ");
                        comercial.setAreaTotal(sc.nextFloat());
                        sc.nextLine();

                        System.out.println("Área Construida: ");
                        comercial.setAreaConstruida(sc.nextFloat());
                        sc.nextLine();

                        System.out.println("Quantidade de Dormitórios: ");
                        comercial.setQtdDormitorios(sc.nextInt());
                        sc.nextLine();

                        System.out.println("Quantidade de Banheiros: ");
                        comercial.setQtdBanheiros(sc.nextInt());
                        sc.nextLine();

                        System.out.println("Quantidade de Vagas de Garagem: ");
                        comercial.setQtdVagasGaragem(sc.nextInt());
                        sc.nextLine();

                        System.out.println("Valor IPTU: ");
                        comercial.setValorIPTU(sc.nextFloat());
                        sc.nextLine();

                        do{
                            System.out.println("-- O Imóvel estará disponível para aluguel?");
                            System.out.println("1) Sim");
                            System.out.println("2) Não");
                            opcaoAlguelOuVenda = sc.nextInt();
                            sc.nextLine();

                            if(opcaoAlguelOuVenda == 1){
                                comercial.setDisponivelLocacao(true);

                                System.out.println("Valor Aluguel: ");
                                comercial.setValorAluguel(sc.nextFloat());
                                sc.nextLine();
                            }

                            if(opcaoAlguelOuVenda == 2){
                                comercial.setDisponivelLocacao(false);

                                comercial.setValorAluguel(0);
                            }

                        }while(!(opcaoAlguelOuVenda != 1 || opcaoAlguelOuVenda != 2 ));

                        do{
                            System.out.println("-- O Imóvel estará disponível para venda?");
                            System.out.println("1) Sim");
                            System.out.println("2) Não");
                            opcaoAlguelOuVenda = sc.nextInt();
                            sc.nextLine();

                            if(opcaoAlguelOuVenda == 1){
                                comercial.setDisponivelVenda(true);

                                System.out.println("Valor Venda: ");
                                comercial.setValorAluguel(sc.nextFloat());
                                sc.nextLine();
                            }

                            if(opcaoAlguelOuVenda == 2){
                                comercial.setDisponivelVenda(false);

                                comercial.setValorVenda(0);
                            }

                        }while(!(opcaoAlguelOuVenda != 1 || opcaoAlguelOuVenda != 2 ));

                        System.out.println("Taxa Imposto Federal: ");
                        comercial.setTaxaImpostoFederal(sc.nextFloat());
                        sc.nextLine();

                        cadastrado = controlador.cadastroComercial(imobiliaria, comercial);

                        if(!cadastrado){
                            System.out.println("! Imóvel não foi cadastrado !");
                            System.out.println("Já existe esse código de Imóvel.");
                            System.out.println("TENTE NOVAMENTE");
                            System.out.println("----------------------\n");
                            continue;
                        }

                        System.out.println(" CADASTRADO COM SUCESSO! ");
                        System.out.println("----------------------\n");

                    }

                }while (opcaoCadastro != 4);
            }

            //VENDER IMÓVEL
            if (opcaoMenu == 4){
                System.out.println(" ---- VENDA DE IMÓVEL ----");

                //Primeiro, o sistema tem de reconhecer o corretor
                System.out.println("Creci: ");
                creci = sc.nextLine();

                corretor = controlador.buscaCorretor(imobiliaria, creci);

                if(corretor == null){
                    System.out.println("! Creci não reconhecido !");
                    System.out.println("TENTE NOVAMENTE");
                    System.out.println("--------------------\n");
                    continue;
                }

                System.out.println("Bem-vindo " + corretor.getNome() + "!");
                System.out.println("Forneça as informações necessárias!");
                venda.setCorretor(corretor);

                System.out.println("Código Venda: ");
                venda.setCodigoVenda(sc.nextInt());
                sc.nextLine();

                if (!controlador.vendaExiste(imobiliaria, venda.getCodigoVenda())){
                    System.out.println("! Código de Venda já existe !");
                    System.out.println("TENTE NOVAMENTE");
                    System.out.println("--------------------\n");
                    continue;
                }

                System.out.println("CPF do Cliente: ");
                cpf = sc.nextLine();
                cliente = (Cliente_CaioIgorMilena) imobiliaria.searchCliente(cpf);

                if(cliente == null){
                    System.out.println("! Cliente não cadastrado !");
                    System.out.println("Primeiro faça o cadastro!");
                    System.out.println("TENTE NOVAMENTE");
                    System.out.println("--------------------\n");
                    continue;
                }

                venda.setCliente(cliente);

                System.out.println("Código do Imóvel: ");
                codigoImovel = sc.nextInt();
                sc.nextLine();
                imovel = imobiliaria.searchImovel(codigoImovel);

                if(imovel == null){
                    System.out.println("! Imóvel não cadastrado !");
                    System.out.println("Primeiro faça o cadastro!");
                    System.out.println("TENTE NOVAMENTE");
                    System.out.println("--------------------\n");
                    continue;
                }

                if(!imovel.disponivelVenda){
                    System.out.println("! Imóvel não disponível para venda !");
                    System.out.println("TENTE NOVAMENTE");
                    System.out.println("--------------------\n");
                    continue;
                }
                venda.setImovel(imovel);

                venda.setDataVenda();

                System.out.println("Valor total venda: ");
                venda.setValorTotalVenda(sc.nextFloat());
                sc.nextLine();

                do{
                    System.out.println(" Forma de Pagamento?");
                    System.out.println("1) Dinheiro");
                    System.out.println("2) Cartao");
                    opcaoAlguelOuVenda = sc.nextInt();
                    sc.nextLine();

                    if(opcaoAlguelOuVenda == 1){
                        dinheiro.setTipoPagamento("Dinheiro");
                        venda.setFormaPagamento(dinheiro);
                    }

                    if(opcaoAlguelOuVenda == 2){
                        cartao.setTipoPagamento("Cartão");

                        System.out.println("Nome no Cartão: ");
                        cartao.setNome(sc.nextLine());

                        System.out.println("Bandeira do Cartão: ");
                        cartao.setBandeira(sc.nextLine());

                        System.out.println("Numero do Cartão: ");
                        cartao.setNumero(sc.nextLine());

                        venda.setFormaPagamento(cartao);
                    }

                }while(!(opcaoAlguelOuVenda != 1 || opcaoAlguelOuVenda != 2 ));

                venda.setFinalizada(true);

                cadastrado = controlador.efetuarVenda(imobiliaria, imovel, venda);

                if(!cadastrado){
                    System.out.println("! Não foi possível adicionar venda ao sistema !");
                    System.out.println("");
                    System.out.println(" TENTE NOVAMENTE");
                    System.out.println("----------------------\n");
                    continue;
                }

                System.out.println(" VENDA ADICIONADA AO SISTEMA! ");
                System.out.println("----------------------\n");

            }

            //Alugar Imovel
            if (opcaoMenu == 5){
                System.out.println(" ---- ALUGUEL DE IMÓVEL ----");

                //Primeiro, o sistema tem de reconhecer o corretor
                System.out.println("Creci: ");
                creci = sc.nextLine();

                corretor = controlador.buscaCorretor(imobiliaria, creci);

                if(corretor == null){
                    System.out.println("! Creci não reconhecido !");
                    System.out.println("TENTE NOVAMENTE");
                    System.out.println("--------------------\n");
                    continue;
                }

                System.out.println("Bem-vindo " + corretor.getNome() + "!");
                System.out.println("Forneça as informações necessárias!");
                aluguel.setCorretor(corretor);

                System.out.println("Código Aluguel: ");
                aluguel.setCodigoAluguel(sc.nextInt());
                sc.nextLine();

                if (!controlador.vendaExiste(imobiliaria, venda.getCodigoVenda())){
                    System.out.println("! Código de Aluguel já existe !");
                    System.out.println("TENTE NOVAMENTE");
                    System.out.println("--------------------\n");
                    continue;
                }

                System.out.println("CPF do Cliente: ");
                cpf = sc.nextLine();
                cliente = (Cliente_CaioIgorMilena) imobiliaria.searchCliente(cpf);

                if(cliente == null){
                    System.out.println("! Cliente não cadastrado !");
                    System.out.println("Primeiro faça o cadastro!");
                    System.out.println("TENTE NOVAMENTE");
                    System.out.println("--------------------\n");
                    continue;
                }

                aluguel.setCliente(cliente);

                System.out.println("Código do Imóvel: ");
                codigoImovel = sc.nextInt();
                sc.nextLine();
                imovel = imobiliaria.searchImovel(codigoImovel);

                if(imovel == null){
                    System.out.println("! Imóvel não cadastrado !");
                    System.out.println("Primeiro faça o cadastro!");
                    System.out.println("TENTE NOVAMENTE");
                    System.out.println("--------------------\n");
                    continue;
                }

                if(!imovel.getDisponivelLocacao()){
                    System.out.println("! Imóvel não disponível para locação !");
                    System.out.println("TENTE NOVAMENTE");
                    System.out.println("--------------------\n");
                    continue;
                }
                aluguel.setImovel(imovel);

                aluguel.setDataAluguel();

                System.out.println("Valor total aluguel: ");
                aluguel.setValorTotalAluguel(sc.nextFloat());
                sc.nextLine();

                do{
                    System.out.println(" Forma de Pagamento?");
                    System.out.println("1) Dinheiro");
                    System.out.println("2) Cartao");
                    opcaoAlguelOuVenda = sc.nextInt();
                    sc.nextLine();

                    if(opcaoAlguelOuVenda == 1){
                        dinheiro.setTipoPagamento("Dinheiro");
                        aluguel.setFormaPagamemnto(dinheiro);
                    }

                    if(opcaoAlguelOuVenda == 2){
                        cartao.setTipoPagamento("Cartão");

                        System.out.println("Nome no Cartão: ");
                        cartao.setNome(sc.nextLine());

                        System.out.println("Bandeira do Cartão: ");
                        cartao.setBandeira(sc.nextLine());

                        System.out.println("Numero do Cartão: ");
                        cartao.setNumero(sc.nextLine());

                        aluguel.setFormaPagamemnto(cartao);
                    }

                }while(!(opcaoAlguelOuVenda != 1 || opcaoAlguelOuVenda != 2 ));

                aluguel.setFinalizado(false);

                controlador.dataDevolucaoUmAno(aluguel);

                aluguel.setDiaPagamentoMensal(aluguel.getDataAluguel().getDayOfMonth());

                //Se o imóvel estiver disponível para venda, vendo se ele continuará
                if (imovel.disponivelVenda){
                    do{
                        System.out.println("O imóvel continuará disponível para venda?");
                        System.out.println("1) Sim");
                        System.out.println("2) Não");
                        opcaoAlguelOuVenda = sc.nextInt();
                        sc.nextLine();

                        if(opcaoAlguelOuVenda == 1){
                            dispVenda = true;
                        }

                        if(opcaoAlguelOuVenda == 2){
                            dispVenda = false;
                        }

                    }while(!(opcaoAlguelOuVenda != 1 || opcaoAlguelOuVenda != 2 ));
                }

                do{
                    System.out.println("Deseja adicionar seguro?");
                    System.out.println("1) Sim");
                    System.out.println("2) Não");
                    opcaoAlguelOuVenda = sc.nextInt();
                    sc.nextLine();

                    if(opcaoAlguelOuVenda == 1){
                        controlador.relatorioSeguros(imobiliaria);

                        for(int i = 1; i != -1; i=i){
                            System.out.println("Numero seguro: ");
                            i = sc.nextInt();
                            sc.nextLine();

                            aluguel.addSeguro(imobiliaria.getSegurosImobiliaria().get(i+1));

                            System.out.println("Seguro Adicionado com sucesso!!");

                            System.out.println("-----------\n");
                            System.out.println("Deseja adicionar outro seguro? \n1)Sim;\n-1)Não");
                            i = sc.nextInt();
                            sc.nextLine();
                        }
                    }

                }while(opcaoAlguelOuVenda != 1);

                cadastrado = controlador.efetuarAluguel(imobiliaria, imovel, aluguel, dispVenda);

                if(!cadastrado){
                    System.out.println("! Não foi possível adicionar aluguel ao sistema !");
                    System.out.println("");
                    System.out.println("TENTE NOVAMENTE");
                    System.out.println("----------------------\n");
                    continue;
                }

                System.out.println(" ALUGUEL ADICIONADO AO SISTEMA! ");
                System.out.println("----------------------\n");

            }

            //Cadastro de Seguros
            if (opcaoMenu == 6){
                System.out.println(" CADASTRO DE SEGURO: ");
                System.out.println("-- Forneça as informações a seguir: ");

                System.out.println("Código do Seguro: ");
                codigoImovel = sc.nextInt();
                sc.nextLine();

                if(controlador.verificaSeguroJaCadastrado(imobiliaria, codigoImovel)){
                    System.out.println("! Código já cadastrado !");
                    System.out.println("TENTE NOVAMENTE");
                    System.out.println("--------------------\n");
                    continue;
                }

                seguro.setCodigoSeguro(codigoImovel);

                System.out.println("Nome seguradora: ");
                seguro.setNomeSeguradora(sc.nextLine());

                System.out.println("Tipo: ");
                seguro.setTipo(sc.nextLine());

                System.out.println("Descrição: ");
                seguro.setDescricao(sc.nextLine());

                System.out.println("Valor: ");
                seguro.setValor(sc.nextFloat());
                sc.nextLine();

                cadastrado = controlador.cadastroSeguro(imobiliaria, seguro);

                if(!cadastrado){
                    System.out.println("! Não foi possível adicionar seguro ao sistema !");
                    System.out.println("");
                    System.out.println(" TENTE NOVAMENTE");
                    System.out.println("----------------------\n");
                    continue;
                }

                System.out.println(" SEGURO ADICIONADO AO SISTEMA! ");
                System.out.println("----------------------\n");
            }

            //Acessar Relatórios
            if (opcaoMenu == 7){
                do{
                    controlador.relatoriosMenu();
                    opcaoRelatorio = sc.nextInt();
                    sc.nextLine();

                    if(opcaoRelatorio == 10 || opcaoRelatorio == 11){
                        System.out.println("Cpf do Cliente: ");
                        cpf = sc.nextLine();

                        ((ControladorMenuRelatorioCliente_CaioIgorMilena) controlador).relatorios(imobiliaria, opcaoRelatorio, cpf);
                        continue;
                    }

                    if(opcaoRelatorio == 18){
                        System.out.println("Mês: ");
                        mes = sc.nextInt();
                        sc.nextLine();

                        controlador.relatorioVendasMesELucro(imobiliaria, mes);
                        continue;
                    }

                    controlador.relatorios(imobiliaria, opcaoRelatorio);

                }while(opcaoRelatorio != 20);
            }

        }while(opcaoMenu != -1);

        controladorArquivos.salvartudonoArquivo(imobiliaria);
    }
}