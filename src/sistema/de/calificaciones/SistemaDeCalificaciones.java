/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.de.calificaciones;

import java.util.Scanner;
/**
 *
 * @author lucas
 */
public class SistemaDeCalificaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        System.out.println("Proporciona un valor entre 0 y 10:");
        int calificacion = Integer.parseInt(Teclado.nextLine());
        //Si esta entre 9 y 10 imprimir: A
        if (calificacion >= 9 && calificacion <= 10)
            System.out.println("Felicitaciones : Sacaste una A");
        else if (calificacion >=8 && calificacion >9)
            System.out.println("Felicitaciones : Sacaste una B");
        else if (calificacion >=7 && calificacion <8)
            System.out.println("Felicitaciones : Sacaste una C");
        else if(calificacion >= 6 && calificacion <7)
            System.out.println("Felicitaciones : Sacaste una D");
        else if(calificacion >= 0 && calificacion < 6)
            System.out.println("A Seguir Estudiando Sacaste F");
        else
            System.out.println("Valor Desconocido");
    }
    
}
