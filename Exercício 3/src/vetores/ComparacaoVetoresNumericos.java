/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vetores;

/**
 *
 * @author Umbrella
 */
public class ComparacaoVetoresNumericos {
    
    public static void main(String[] args)
    {
        // A comparação de vetores segue os tipos de dados dos mesmo, mas não funciona como a
        // Comparação entre variáveis comuns, veja:
        int[] tresNumeros = {3,5,9};
        int[] outrosTresNumeros = {3,5,9};
        
        // A comparação abaixo NÃO FUNCIONA...
        if(tresNumeros == outrosTresNumeros)
        {
            System.out.println("Todos os números em ambos os vetores são IGUAIS!");
        }else{
                System.out.println("Existem DIVERGÊNCIAS quanto a igualdade dos números no vetor!");
             }
        
        // Isto porquê vetores são objetos de seus tipos primitivos, posições de memória específicas
        // e não o valor em si. Sendo assim, na impressão abaixo é impresso o nome interno do vetor, não seu conteúdo:
        System.out.println(tresNumeros);
        System.out.println(outrosTresNumeros+"\n\n");
        
        // A comparação correta entre vetores pode ocorrer através de um FOR, veja:
        int qntIguais = 0; // Variável para armazenar a quantidade de valores iguais
        
        for(int elementoVetor1:tresNumeros) // Para cada elemento do vetor1, faça...
        {
            for(int elementoVetor2:outrosTresNumeros) // Para cada elemento do vetor2, faça...
            {
                if(elementoVetor1 == elementoVetor2) // Um elemento do vetor1 é igual a todos os elementos do vetor2?
                {
                    qntIguais++;
                }
            }
        }
        
        // Se a quantidade de valores iguais for a mesma quantidade que define o tamanho do vetor, então são iguais...
        if(qntIguais == tresNumeros.length) 
        {
            System.out.println("VETORES IGUAIS");
        }else{
                System.out.println("VETORES DIFERENTES");
             }
       
    }
}
