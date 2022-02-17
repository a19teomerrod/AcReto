/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aceptaelreto;

import java.util.Scanner;

/**
 *
 * @author Teo
 */
public class e627 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int dia;
        int mes;
        int year;
        int edadYear;
        int edadMes;
        int edadDia;
        int resuYear = 0;
        String dataInicial;
        dataInicial = s.nextLine();

        do {

            String[] dateParts = dataInicial.split("/");

            dia = Integer.parseInt(dateParts[0]);
            mes = Integer.parseInt(dateParts[1]);
            year = Integer.parseInt(dateParts[2]);

            edadYear = s.nextInt();
            edadMes = s.nextInt();
            edadDia = s.nextInt();

            year = edadYear + year;

        } while (!"hola".equals(dataInicial));

        System.out.print(dia + "/" + mes + "/" + year);
    }

}
