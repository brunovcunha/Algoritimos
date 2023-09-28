/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author brutj
 */
import java.util.Scanner;

public class Beecrowd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        for (int i = 0; i < n; i++) {

            int numero = s.nextInt();
            int contNumero[] = vetorNumeros(numero);
            int cont = 0;

            for (int j = 0; j < contNumero.length; j++) {
                if (contNumero[j] == 0) {
                    cont += 6;
                } else if (contNumero[j] == 1) {
                    cont += 2;
                } else if (contNumero[j] == 2 || contNumero[j] == 3 || contNumero[j] == 5) {
                    cont += 5;
                } else if (contNumero[j] == 4) {
                    cont += 4;
                } else if (contNumero[j] == 6 || contNumero[j] == 9) {
                    cont += 6;
                } else if (contNumero[j] == 7) {
                    cont += 3;
                } else if (contNumero[j] == 8) {
                    cont += 7;
                }

            }

            System.out.println(cont + " leds");
        }
    }

    public static int[] vetorNumeros(int numero) {

        String numeroString = String.valueOf(numero);

        int tamanhoVetor = numeroString.length();
        int vetor[] = new int[tamanhoVetor];

        for (int i = 0; i < tamanhoVetor; i++) {
            char digito = numeroString.charAt(i);
            int digitoInt = Character.getNumericValue(digito);

            vetor[i] = digitoInt;
        }
        return vetor;
    }
}
