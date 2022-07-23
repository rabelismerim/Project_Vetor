/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vetores;

/**
 *
 * @author Umbrella
 */
public class VetoresNumericos {
    
   public static void main(String[] args) {
        // Os vetores numéricos não diferem em nada de um vetor de Strings quanto suas posições e seu dinamismo limitado, veja:
        // Abaixo, cria-se um vetor de inteiros de 6 posições, para guardar os números de uma aposta na mega-sena:
         int[] apostaMegaSena = new int[6];
         
        // Vamos preencher esse vetor com 6 números aleatórios...
         for(int i=0; i<6; i++)
         {
             apostaMegaSena[i] = 1+(int)(Math.random()*60); // Números aleatórios de 1 a 60
         }
         
        // Imprimindo os números sorteados...
        for(int elementoVetor:apostaMegaSena) // Usando uma forma reduzida do FOR para vetores
        {
            System.out.println(elementoVetor);
        }
    }
}
