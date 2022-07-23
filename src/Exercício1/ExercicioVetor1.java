
package Exercício1;

import javax.swing.JOptionPane;

public class ExercicioVetor1 
{
public static void main (String[] args)
{
    int sorteio ;
    String recebe="";
String alunos[]={"Carolina","Jessica Ismerim","Mayara","Esther","Thays","Thayane","Jhonatan",
    "Thainan","Venâncio","Boaventura","Elton","Jéssica Gaudio","Israel","Carolina","Sérgio",
    "Marcos","Juliano","Rodrigo", "Pedro","Ueliton","Laíz","Diego"};

int numSort[] = new int[alunos.length];


for (int i= alunos.length -1; i>=0 ; i--)
{
   sorteio = (int) (Math.random()*i);
  recebe+= alunos[sorteio] + "\n";
  alunos[sorteio]= alunos[i];
}
   JOptionPane.showInputDialog(null,"Seleção de alunos: \n\n"+recebe);
 

}
}
