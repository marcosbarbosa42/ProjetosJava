/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operadoresaritimeticos;

import java.util.Scanner;


public class OperadoresAritimeticos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.print("Digite a primeira nota: ");
       int n1 = teclado.nextInt();
        System.out.print("Digite a segunda nota:");
       int n2 = teclado.nextInt();
       float m = (n1 + n2)/ 2;
        System.out.println("A media é igual "+ m);
    }
}
