/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurasdecontrol;
import java.util.Scanner;
/**
 *
 * @author marco
 */
public class DiaDeLaSemana {
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
    int dia=0;
    
        System.out.println("Ingrese un numero del 1 al 7.");
        dia = leer.nextInt();
        
        if(dia==1){
            System.out.println("Lunes");
        }
        if (dia==2){
            System.out.println("Martes");
        }
        if(dia==3){
            System.out.println("Miercoles");
        }
        if(dia==4){
            System.out.println("Jueves");
        }
        if(dia==5){
            System.out.println("Viernes");
        }
        
        if(dia==6){
            System.out.println("Sabado");
        }
        if(dia==7){
            System.out.println("Domingo");
        }
        
        if(dia!=1 && dia!=2 && dia!=3 && dia!=4 && dia!=5 && dia!=6 && dia!=7){
            System.out.println("Error, Ingrese un numero del 1 al 7.");
        }
    }
}
