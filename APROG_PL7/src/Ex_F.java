/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Marcel
 */
public class Ex_F {
    public static void main(String[] arg){
        double raio, altura, volume;
        String solido, flag;
        Scanner sc = new Scanner (System.in);
        
        do{
            solido = sc.next();
            flag = solido.toLowerCase();
            switch (flag){
                case "cone":
                    raio = sc.nextDouble();
                    altura = sc.nextDouble();
                    volume = (Math.PI*Math.pow(raio,2)*altura)/3;
                    System.out.printf("%.2f",volume);
                    System.out.println("");
                    break;
                case "esfera":
                    raio = sc.nextDouble();
                    volume = (4*Math.PI*Math.pow(raio, 3))/3;
                    System.out.printf("%.2f",volume);
                    System.out.println("");
                    break;
                case "cilindro":
                    raio = sc.nextDouble();
                    altura = sc.nextDouble();
                    volume = (Math.PI*Math.pow(raio, 2)*altura);
                    System.out.printf("%.2f",volume);
                    System.out.println("");
                    break;
            }
        }while(flag.compareTo("fim")!=0);
    }
}

