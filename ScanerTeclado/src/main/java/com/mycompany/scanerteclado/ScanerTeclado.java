/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.scanerteclado;

import java.util.Scanner;



/**
 *
 * @author datasus
 */
public class ScanerTeclado {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.print("Digite o nome:");
        String nome = teclado.nextLine();
        System.out.print("Digite sua idade:");
        int idade = teclado.nextInt();
        System.out.print("Digite a nota:");
        float nota = teclado.nextFloat();
        System.out.print(nome);
        System.out.println(" Sua nota é "+ nota);
    
    }
}
