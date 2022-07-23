
package Exercicio4;

import java.util.Arrays;
import javax.swing.JOptionPane;


public class ExercicioVetor4 {
    public static void main (String[] args)
    {
    int i, j, k= 0;
    int cont = 0;
    int vet1[] = new int[10];
    String result = "";
    
    for(i=0;i<vet1.length; i++)
    {
         vet1[i]=Integer.parseInt(JOptionPane.showInputDialog(null, "Informe 10 números inteiros", 0));   
    }
            for(i=0; i<vet1.length; i++)
        {
            for(j=0; j<vet1.length; j++)
            {
          if(vet1[j]<vet1[i])
            {
            cont = vet1[i];
            vet1[i] = vet1[j];
            vet1[j]=cont;
            }
            }
        }
      for(i=0; i<vet1.length; i++){
      result = result + vet1[i] + "\n";
      }
      JOptionPane.showMessageDialog(null,"Números em ordem decrescente.\n"+result,"Lálálá" , 2);
    }
}