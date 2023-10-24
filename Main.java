package pkg24102023ejercicio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner form = new Scanner(System.in);
        int[][] insert = new int[2][2];
        
        for (int i = 0; i < insert.length; i++) {
            for (int j = 0; j < insert.length; j++) {
                System.out.println("Fila: " + i + " Columna: " + j);
                insert[i][j] = form.nextInt();
            }
        }
        
        for (int i = 0; i < insert.length; i++) {
            for (int j = 0; j < insert.length; j++) {
                System.out.println("Fila: [" + i + "] Columna: [" + j + "] = Num: " + insert[i][j]);
            }
        }

    }
    
}
