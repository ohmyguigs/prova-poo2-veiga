import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.GregorianCalendar;

public class View extends JFrame{
  JTextField textoNome;  // variável texto declarada como variável de instância
  JTextField textoBairros;
  JTextField textoNiver;
    public View(){
        super("Cidades do meu Brasil!");
        Container tela = getContentPane();
        FlowLayout layout = new FlowLayout(FlowLayout.LEFT); // Ajusta a exibição dos componentes
        tela.setLayout(layout);

        // Cria uma barra de menu para o JFrame
        JMenuBar menuBar = new JMenuBar();
        // Adiciona a barra de menu ao  frame
        setJMenuBar(menuBar);
        // Define e adiciona dois menus drop down na barra de menus
        JMenu menu = new JMenu("Menu");
        menuBar.add(menu);
        JMenuItem addItem = new JMenuItem("Incluir");
        JMenuItem editItem = new JMenuItem("Alterar");
        JMenuItem deleteItem = new JMenuItem("Excluir");
        JMenuItem consultItem = new JMenuItem("Pesquisar");
        JMenuItem sortItem = new JMenuItem("Ordenar");
        menu.add(addItem);
        menu.add(editItem);
        menu.add(deleteItem);
        menu.add(consultItem);
        menu.add(sortItem);

        Controller controller = new Controller();   // Criação do objeto ouvinte

        addItem.addActionListener(controller.menuItemIncluir());

        JLabel rotuloNome = new JLabel("Nome:");  // Criação de um Label
        textoNome = new JTextField(10);  // Criação de uma caixa de texto com tamanho 10
        JLabel rotuloBairros = new JLabel("Quantidade Bairros:");
        textoBairros = new JTextField(10);
        JLabel rotuloNiver = new JLabel("Aniversário:");
        textoNiver = new JTextField(10);

        tela.add(rotuloNome);
        tela.add(textoNome); // Adicionando componentes ao Container tela
        tela.add(rotuloBairros);
        tela.add(textoBairros);
        tela.add(rotuloNiver);
        tela.add(textoNiver);

        JButton btn = new JButton("Salvar!");   // Criação de um botão
        btn.addActionListener(controller.salvar());   // Ligação do objeto origem (botão) ao objeto ouvinte trat
        tela.add(btn);

        setSize(500, 600);
        setVisible(true);
    }

    public static void main(String args[]) {
        View app = new View();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private class Controller {   // Classe ouvinte definida como Interna para facilitar
      Model m;
      public ActionListener menuItemIncluir() {
        return new ActionListener() {
          @Override public void actionPerformed (ActionEvent e) {
            m.incluiObjeto();
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

    public class Model {
      private String nome;
      private int idade;
      private GregorianCalendar niver;

      public void incluiObjeto(){
        JOptionPane.showMessageDialog(null, "clicou no incluir");
      }

    }
}
