/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vetores;

/**
 *
 * @author Umbrella
 */
public class VetorDeStrings {

    
    public static void main(String[] args) {
        // A linha abaixo cria um vetor 'diasDaSemana' com 7 posições
        String[] diasDaSemana = new String[7];
        
        // Com isso, pode-se inserir valores em diferentes posições da mesma variável, 
        // ou agora chamado, vetor, a partir da posição 0(zero)
        diasDaSemana[0] = "Domingo";
        diasDaSemana[1] = "Segunda";
        diasDaSemana[2] = "Terça";
        diasDaSemana[3] = "Quarta";
        diasDaSemana[4] = "Quinta";
        diasDaSemana[5] = "Sexta";
        diasDaSemana[6] = "Sábado";
        
        // Todo o vetor pode-se ser percorrido através de um laço sequêncial, como um FOR, veja:
        for(int i=0; i<diasDaSemana.length; i++)
        {
            System.out.println(diasDaSemana[i]);
        }
   }
}
