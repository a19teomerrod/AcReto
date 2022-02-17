/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aceptaelreto;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class e598 {

    /**
             File arxiu = new File ("./598.txt");
        Scanner s = new Scanner (arxiu);
     */
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        while (s.hasNextInt()) {
            int numJugadors = s.nextInt();
            int numEquipacions = s.nextInt();

            int[] tallaJugadors = new int[numJugadors];
            int[] tallaEquipacions = new int[numEquipacions];

            for (int i = 0; i < numJugadors; i++) {
                int tallaJ = s.nextInt();
                tallaJugadors[i] = tallaJ;
            }

            for (int i = 0; i < numEquipacions; i++) {
                int tallaE = s.nextInt();
                tallaEquipacions[i] = tallaE;
            }
            Arrays.sort(tallaEquipacions);
            Arrays.sort(tallaJugadors);

            int i = 0;
            int j = 0;
            int comprarEquip = 0;

            while (i < tallaJugadors.length && j < tallaEquipacions.length) {
                if (tallaJugadors[i] + 1 < tallaEquipacions[j]) {
                    i++;
                }
                else if (tallaJugadors[i] + 1 == tallaEquipacions[j] || tallaJugadors[i] == tallaEquipacions[j]) {
                    i++;
                    j++;
                    comprarEquip++;
                } else {
                    j++;
                }
            }
            int resu = numJugadors - comprarEquip;
            System.out.println(resu);
        }
    }
}
