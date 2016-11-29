import java.awt.event.*;
import javax.swing.*;
import java.util.LinkedHashMap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.lang.ClassNotFoundException;

public class Controller {   // Classe ouvinte definida como Interna para facilitar
  Model model = new Model();
  File file = new File("arquivoCidades.dat");;

  public ActionListener menuItemIncluir() {
    return new ActionListener() {
      @Override public void actionPerformed (ActionEvent e) {
        model.incluiObjeto();
      }
    };
  }

  public ActionListener menuItemAlterar() {
    return new ActionListener() {
      @Override public void actionPerformed (ActionEvent e) {
        model.incluiObjeto();
      }
    };
  }

  public ActionListener menuItemExcluir() {
    return new ActionListener() {
      @Override public void actionPerformed (ActionEvent e) {
        model.incluiObjeto();
      }
    };
  }

  public ActionListener menuItemPesquisar() {
    return new ActionListener() {
      @Override public void actionPerformed (ActionEvent e) {
        try{
          if(file.exists()){
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("arquivoCidades.dat"));
            JOptionPane.showMessageDialog(null, "tienes: " + ois.readObject());
          } else {
            JOptionPane.showMessageDialog(null, "Não há nenhum arquivo em disco");
          }
        } catch(FileNotFoundException ex) {
          JOptionPane.showMessageDialog(null, "Não há arquivo em disco");
        } catch(IOException ex) {
          JOptionPane.showMessageDialog(null, "Erro ao ler arquivo em disco");
        } catch(ClassNotFoundException ex) {
          JOptionPane.showMessageDialog(null, "Erro ao carregar classe do objeto");
        }
      }
    };
  }

  public ActionListener menuItemOrdenar() {
    return new ActionListener() {
      @Override public void actionPerformed (ActionEvent e) {
        model.incluiObjeto();
      }
    };
  }

  public ActionListener salvar(LinkedHashMap m1) {
    return new ActionListener() {
      @Override public void actionPerformed (ActionEvent e) {
        FileOutputStream fout = null;
        ObjectOutputStream oos = null;
        try {
          //escrevendo no arquivo
          if (!file.exists()) {
            file.createNewFile(); // se não existe arquivo, crie um
          }
          fout = new FileOutputStream(file);
          oos = new ObjectOutputStream(fout);

          oos.writeObject(m1);
          oos.flush();

          JOptionPane.showMessageDialog(null, "Salvo no arquivo com sucesso");
        } catch(FileNotFoundException ex) { // caso nao econtre o arquivo para salvar
          JOptionPane.showMessageDialog(null, "Erro ao salvar o arquivo");
        } catch(IOException ex) { // algum erro na hora de salvar
          JOptionPane.showMessageDialog(null, "Erro ao salvar o arquivo");
        } finally {
          try {
            if (oos != null) {
              oos.close(); // libera recurso
            }
          } catch (IOException ex) { // muito improvavel cair aqui, mas é melhor remediar né kkkjj
              JOptionPane.showMessageDialog(null, "Erro ao liberar recurso da stream");
          }
        }
      }
    };
  }
}
