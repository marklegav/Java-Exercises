/*
 * Código desenvolvido no âmbinto da disciplina de Algoritimia e Programação
 * no Instituto Superior de Engenharia do Politécnico do Porto
 * data: 10-2019
 */
package aprog;

import java.util.Scanner;

/**
 * Soma todos os algarismos pares de um número indicado pelo utilizador
 * @author Marcel
 */
public class SomarAlgarismosPares {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner (System.in);
       
        int numero, algarismo, soma;
        
        //Aguarda que o utilizador introduza um número
        do{
            numero = sc.nextInt();
        }while (numero<=0);
       
        soma = 0;
        do{
            algarismo = numero%10;
            if (algarismo%2 == 0){
                soma = soma+algarismo;
            }
            numero = numero/10;

        }while(numero!=0);
        System.out.println(soma);
         
    }
}
