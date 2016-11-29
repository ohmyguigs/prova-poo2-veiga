import java.awt.event.*;

public class Controller {   // Classe ouvinte definida como Interna para facilitar
  Model model = new Model();
  public ActionListener menuItemIncluir() {
    return new ActionListener() {
      @Override public void actionPerformed (ActionEvent e) {
        model.incluiObjeto();
      }
    };
  }

  public ActionListener salvar() {
    return new ActionListener() {
      @Override public void actionPerformed (ActionEvent e) {
        // try {
        //   //logica para escrever no arquivo
        // }
        // catch() {//colocar alguma exception de escrever em arquivo nesse catch
        //   JOptionPane.showMessageDialog(null, "Erro ao salvar o arquivo");
        // }
      }
    };
  }
}
