
package Exercicio2;

import javax.swing.JOptionPane;

public class ExercicioVetor2 
{
    public static void main (String[] args)
{
int n;
int vet1[] = new int[10];
int maior =0;

for(n=0;n<10; n++)
{
    vet1[n] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe 10 números inteiros", 0));
    maior = (int)Math.max(vet1[n],maior);
    
}
JOptionPane.showMessageDialog(null, "O maior número informado é " +maior, null, 2);
}  
}
