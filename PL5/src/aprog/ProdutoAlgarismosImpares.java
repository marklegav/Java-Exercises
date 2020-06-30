/*
 * Código desenvolvido no âmbinto da disciplina de Algoritimia e Programação
 * no Instituto Superior de Engenharia do Politécnico do Porto
 * data: 10-2019
 */

package aprog;

import java.util.Scanner;



/**
 * Calcula o produto dos algarismos impares de um número inteiro positivo introduzido pelo utilizador
 * @author Marcel
 */
public class ProdutoAlgarismosImpares {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int num, dig, produto;
        
        
        do{
            num = sc.nextInt();
        }while (num<=0);
        
        produto = 1;
        do{
            dig = num%10;
            if (dig%2 == 1){
                produto = produto * dig;
            }
            num = num/10;
        }while (dig!=0);
        if (produto == 1){
            
            System.out.println("nao ha algarismos impares");
        }else {
            System.out.println(produto);
         }
        
    }
}
