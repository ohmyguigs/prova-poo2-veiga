import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

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
        addItem.addActionListener(controller.menuItemIncluir()); // adiciona listeners
        editItem.addActionListener(controller.menuItemAlterar());
        deleteItem.addActionListener(controller.menuItemExcluir());
        consultItem.addActionListener(controller.menuItemPesquisar());
        sortItem.addActionListener(controller.menuItemOrdenar());

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
}
