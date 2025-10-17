import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ControladordeArquivos_CaioIgorMilena {

       public void carregarInfdeArquivos(Imobiliaria_CaioIgorMilena imobiliaria) {

           //Pra carregar as informações salvas
           try {
               FileInputStream in = new FileInputStream(imobiliaria.getConfiguracoes().getArquivoAlugueis());
               ObjectInputStream ois = new ObjectInputStream(in);

               imobiliaria.setAlugueisImobiliaria((ArrayList<Aluguel_CaioIgorMilena>) ois.readObject());
               ois.close();
           } catch (Exception ex) {
           }
           try {
               FileInputStream in = new FileInputStream(imobiliaria.getConfiguracoes().getArquivoVendas());
               ObjectInputStream ois = new ObjectInputStream(in);

               imobiliaria.setVendasImobiliaria((ArrayList<Venda_CaioIgorMilena>) ois.readObject());
               ois.close();
           } catch (Exception ex) {
           }
           try {
               FileInputStream in = new FileInputStream(imobiliaria.getConfiguracoes().getArquivoImoveis());
               ObjectInputStream ois = new ObjectInputStream(in);

               imobiliaria.setImoveisImobiliaria((ArrayList<Imovel_CaioIgorMilena>) ois.readObject());
               ois.close();
           } catch (Exception ex) {
           }
           try {
               FileInputStream in = new FileInputStream(imobiliaria.getConfiguracoes().getArquivoClientes());
               ObjectInputStream ois = new ObjectInputStream(in);

               imobiliaria.setClientesImobiliaria((ArrayList<Usuario_CaioIgorMilena>) ois.readObject());
               ois.close();
           } catch (Exception ex) {
           }
           try {
               FileInputStream in = new FileInputStream(imobiliaria.getConfiguracoes().getArquivoCorretores());
               ObjectInputStream ois = new ObjectInputStream(in);

               imobiliaria.setCorretoresImobiliaria((ArrayList<Usuario_CaioIgorMilena>) ois.readObject());
               ois.close();
           } catch (Exception ex) {
           }
           try {
               FileInputStream in = new FileInputStream(imobiliaria.getConfiguracoes().getArquivoSeguros());
               ObjectInputStream ois = new ObjectInputStream(in);

               imobiliaria.setSegurosImobiliaria((ArrayList<Seguro_CaioIgorMilena>) ois.readObject());
               ois.close();
           } catch (Exception ex) {
           }
       }


       public void salvartudonoArquivo(Imobiliaria_CaioIgorMilena imobiliaria) {
           //Pra salvar
           try {
               FileOutputStream out = new FileOutputStream(imobiliaria.getConfiguracoes().getArquivoAlugueis());
               ObjectOutputStream ois = new ObjectOutputStream(out);

               ois.writeObject(imobiliaria.getAlugueisImobiliaria());
               ois.flush();
           } catch (Exception ex) {
           }
           try {
               FileOutputStream out = new FileOutputStream(imobiliaria.getConfiguracoes().getArquivoVendas());
               ObjectOutputStream ois = new ObjectOutputStream(out);

               ois.writeObject(imobiliaria.getVendasImobiliaria());
               ois.flush();
           } catch (Exception ex) {
           }
           try {
               FileOutputStream out = new FileOutputStream(imobiliaria.getConfiguracoes().getArquivoImoveis());
               ObjectOutputStream ois = new ObjectOutputStream(out);

               ois.writeObject(imobiliaria.getImoveisImobiliaria());
               ois.flush();
           } catch (Exception ex) {
           }
           try {
               FileOutputStream out = new FileOutputStream(imobiliaria.getConfiguracoes().getArquivoClientes());
               ObjectOutputStream ois = new ObjectOutputStream(out);

               ois.writeObject(imobiliaria.getClientesImobiliaria());
               ois.flush();
           } catch (Exception ex) {
           }
           try {
               FileOutputStream out = new FileOutputStream(imobiliaria.getConfiguracoes().getArquivoCorretores());
               ObjectOutputStream ois = new ObjectOutputStream(out);

               ois.writeObject(imobiliaria.getCorretoresImobiliaria());
               ois.flush();
           } catch (Exception ex) {
           }
           try {
               FileOutputStream out = new FileOutputStream(imobiliaria.getConfiguracoes().getArquivoSeguros());
               ObjectOutputStream ois = new ObjectOutputStream(out);

               ois.writeObject(imobiliaria.getSegurosImobiliaria());
               ois.flush();
           } catch (Exception ex) {
           }
       }
}
