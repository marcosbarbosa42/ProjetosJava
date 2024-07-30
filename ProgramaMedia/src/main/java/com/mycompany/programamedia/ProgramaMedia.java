/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programamedia;

import java.util.Scanner;

/**
 *
 * @author datasus
 */
public class ProgramaMedia {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a primeira nota:");
        float n1 = teclado.nextFloat();
        System.out.print("Digite a segunda nota:");
        float n2 = teclado.nextFloat();
        float m = (n1 + n2) / 2;
        System.out.print("A media foi "+ m);
        if (m>8.5){
            System.out.println(" Parabens");
        }
    }
}
