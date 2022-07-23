/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

/**
 *
 * @author alunom1
 */
public class ExemploIndexOf {
    public static void main(String[] args)
    {
        int qntVirgula = 0;
        String numeros = "1,26,32,45,13,10";
        for(int i=0; i<numeros.length(); i++)
        {
            if(numeros.charAt(i) == ',')
            {
                qntVirgula++;
            }
        }
        
        if(qntVirgula != 5)
        {
            // ERRO
        }else
            {
                int posicoes;
               for(int i=0; i<5; i++)   
               {
                   posicoes = numeros.indexOf(numeros, 0);
                   System.out.println();
               }
            }
    }
}
