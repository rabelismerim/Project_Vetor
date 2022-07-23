/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vetores;

/**
 *
 * @author Umbrella
 */
public class VetorDeStrings2 {
    
    public static void main(String[] args) {
        // A linha abaixo cria um vetor 'diasDaSemana', definindo seus valores diretamente
        String[] diasDaSemana = {"Domingo","Segunda","Terça","Quarta","Quinta","Sexta","Sábado"};
        
        // Todo o vetor pode-se ser percorrido através de um laço sequêncial, como um FOR, veja:
        
        for(String elementoVetor:diasDaSemana) // Usando uma forma reduzida do FOR para vetores
        {
            System.out.println(elementoVetor);
        }
    }
}
