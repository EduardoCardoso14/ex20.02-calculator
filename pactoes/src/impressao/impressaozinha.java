/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package impressao;

/**
 *
 * @author 962670
 */
public class impressaozinha {

    public static void imprimirResultado(int resultado) {
        System.out.println("O resultado da soma é: " + resultado);
    }

    public static String imprimirMedia(float j) {
        String msg;
        if (j >= 70) {
            msg = "Aprovado em!";
        } else {
            msg = "Reprovado...";
        }
        return msg;
    }
}
