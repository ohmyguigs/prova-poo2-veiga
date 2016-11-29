import java.util.GregorianCalendar;
import javax.swing.*;

public class Model {
  private String nome;
  private int idade;
  private GregorianCalendar niver;
  private double temperaturaMedia;

  public void setNiver(int year, int month, int dayOfMonth){
    GregorianCalendar niver = new GregorianCalendar(year, month, dayOfMonth);
    this.niver = niver;
  }

  public void setIdade(int idade){
    this.idade = idade;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public void setTemperaturaMedia(double temp){
    this.temperaturaMedia = temp;
  }

  public void incluiObjeto(){
    JOptionPane.showMessageDialog(null, "clicou no incluir");
  }

}
