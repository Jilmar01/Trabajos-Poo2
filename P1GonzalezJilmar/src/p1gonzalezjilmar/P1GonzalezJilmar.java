/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p1gonzalezjilmar;

import java.util.Scanner;

/**
 *
 * @author ESPE
 */
public class P1GonzalezJilmar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Division");
        int a, b, resp;
        Scanner numero = new Scanner(System.in);
        
        System.out.print("\nPrimer numero: ");
        while(!numero.hasNextInt()){
            System.out.println("Numero incorrecto");
            System.out.print("\nPrimer numero: ");
            numero.next();
        }
        a = numero.nextInt();
        
        do{
            System.out.print("\nSegundo numero: ");
            while(!numero.hasNextInt()){
                System.out.println("Numero incorrecto");
                numero.next();
                System.out.println("\nSegundo numero: ");
            }
            b = numero.nextInt();
            if(b == 0){
                System.out.println("No se puede dividir para cero");
            }else{
                resp = a / b;
                System.out.println("\nRespuesta: " + resp);
            }
        }while(b == 0);
                
    }
}
    

