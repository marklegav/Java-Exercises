/*
 * Código desenvolvido no âmbinto da disciplina de Algoritimia e Programação
 * no Instituto Superior de Engenharia do Politécnico do Porto
 * data: 10-2019
 */

package aprog;

import java.util.Scanner;



/**
 * Converte um número de base oito em número base decimal
 * @author Marcel
 */
public class ConveterBaseOctal {
    public static void main(String[] args){
        int base8, base10, dig, cont, cover, exp, x;
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite o número na base 8 a ser convertido:");
        
        /**
         * Loop para permitir multiplas entradas, encerra-se quando o utilizador introduzir um valor
         * que seja menor ou igual a zero
        */ 
        do{
            base8 = sc.nextInt();
            cont = 0;
            base10=0;
            
            while(base8 * 1 !=0 & base8>=0){

                dig = base8%10;
                exp = 8;
                x = 0;
                while (x <= cont){
                    switch (x){ 
                        case 0:
                            exp = 1;
                            break;
                        case 1:
                            exp = 8;
                            break;
                        default:
                            exp = exp * 8;
                        }
                    x++;
                    }
                    base10 = base10 + (dig * exp);
                    base8 = base8/10;
                    cont++;
            }
            if (base8>=0){
                System.out.println(base10);
            }
        } while(base8>=0);


    }
}
