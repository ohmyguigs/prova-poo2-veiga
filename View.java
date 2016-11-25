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

        JLabel rotuloNome = new JLabel("Nome:");  // Criação de um Label
        textoNome = new JTextField(10);  // Criação de uma caixa de texto com tamanho 10
        JLabel rotuloBairros = new JLabel("Quantidade Bairros:");
        textoBairros = new JTextField(10);
        JLabel rotuloNiver = new JLabel("Aniversário:");
        textoNiver = new JTextField(10);

        JButton btn = new JButton("Salvar!");   // Criação de um botão
        TratEventos trat = new TratEventos();   // Criação do objeto ouvinte
        btn.addActionListener(trat);   // Ligação do objeto origem (botão) ao objeto ouvinte trat

        tela.add(rotuloNome);
        tela.add(textoNome); // Adicionando componentes ao Container tela
        tela.add(rotuloBairros);
        tela.add(textoBairros);
        tela.add(rotuloNiver);
        tela.add(textoNiver);

        tela.add(btn);

        setSize(500, 600);
        setVisible(true);
    }

    public static void main(String args[]) {
        View app = new View();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private class TratEventos implements ActionListener{   // Classe ouvinte definida como Interna para facilitar
        public void actionPerformed(ActionEvent evento){     // Método que trata o evento
          String txt = "Você digitou: " + textoNome.getText();  // Acessando a variável texto da classe externa
          JOptionPane.showMessageDialog(null, txt);  // Caixa de diálogo tipo mensagem
        }
    }
    
    public class Cidade {
        
    }
}
