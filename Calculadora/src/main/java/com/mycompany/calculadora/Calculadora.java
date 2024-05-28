/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import interfaz.Pantalla;

/**
 *Calculadora IP
 * Samano Resendiz Jesua Issac
 * Venegas Mariano Karla 
 */
public class Calculadora {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Pantalla panta = new Pantalla(calculadora);
        panta.setVisible(true);
        panta.setLocationRelativeTo(null); // Para ponerla en el medio
       
     
    }
    
    public static boolean validarDireccionIP(String direccion) {
        String patronIP = "\\b(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[0-9]{1,2})\\."
                        + "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[0-9]{1,2})\\."
                        + "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[0-9]{1,2})\\."
                        + "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[0-9]{1,2})\\b";
        Pattern patternIP = Pattern.compile(patronIP);
        Matcher matcherIP = patternIP.matcher(direccion);
        return matcherIP.matches();
    }
    
    public static boolean validarMascaraSubred(String mascara) {
        try {
            int submascara = Integer.parseInt(mascara);
            return submascara <= 32 && submascara > 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static String determinarClaseDireccionIP(String[] octetos) {
        int primerOcteto = Integer.parseInt(octetos[0]);
        if (primerOcteto >= 0 && primerOcteto <= 127) {
            return "Clase A";
        } else if (primerOcteto >= 128 && primerOcteto <= 191) {
            return "Clase B";
        } else if (primerOcteto >= 192 && primerOcteto <= 223) {
            return "Clase C";
        } else if (primerOcteto >= 224 && primerOcteto <= 239) {
            return "Clase D, Multicast";
        } else if (primerOcteto >= 240 && primerOcteto <= 255) {
            return "Clase E, Investigación";
        } else {
            return "Clase no reconocida";
        }
    }
    
    public static String restarOctetos(String maskCompl, String maskDecimal) {
        String[] octetosCompl = maskCompl.split("\\.");
        String[] octetosDecimal = maskDecimal.split("\\.");
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < 4; i++) {
            int valorCompl = Integer.parseInt(octetosCompl[i]);
            int valorDecimal = Integer.parseInt(octetosDecimal[i]);

            int resta = valorCompl - valorDecimal;

            if (resta < 0) {
                resultado.append(256 + resta); // Ajustar para el acarreo
            } else {
                resultado.append(resta);
            }

            if (i < 3) {
                resultado.append(".");
            }
        }

        return resultado.toString();
    }

    
    
    public static String decABinario(int octeto1Int){
        StringBuilder binary = new StringBuilder();
        if(octeto1Int==0){
            return "00000000";
        }

        while (octeto1Int>0){
            int remainder = octeto1Int%2;
            binary.insert(0,remainder);
            octeto1Int /= 2;
        }
        while (binary.length()<8){
            binary.insert(0,"0");
        }
        return binary.toString();
    }

    public static String crearMascara(int submascara){
        StringBuilder mascara = new StringBuilder();

        for (int i = 0; i < 32; i++) {
            if (i < submascara) {
                mascara.append("1"); // Agregar '1' si esta dentro de la máscara
            } else {
                mascara.append("0"); // Agregar '0' si esta fuera de la máscara
            }
            // Insertar un punto (.) después de cada byte, excepto al final
            if ((i + 1) % 8 == 0 && i != 31) {
                mascara.append(".");
            }
        }

        return mascara.toString();
    }

    public static String binADec(String ip){
        StringBuilder mascaraDecimal = new StringBuilder();
        String[] octetosBinarios = ip.split("\\."); //Divide la mask en octetos

        // Convierte cada octeto bin a dec y lo agrega a la cadena resultante
        for (int i = 0; i < octetosBinarios.length; i++) {
            int octetoDecimal = Integer.parseInt(octetosBinarios[i], 2); // Base de conversión ya que puede ser 0 o 1.
            mascaraDecimal.append(octetoDecimal);
            if (i < octetosBinarios.length - 1) {
                mascaraDecimal.append("."); // Agrega un punto entre los octetos
            }
        }

        return mascaraDecimal.toString();
    }
    
    
    public static String invertirMascara(String mascaraSubred) {
        StringBuilder mascaraInvertida = new StringBuilder();

        // Recorrer cada caracter de la máscara original
        for (char bit : mascaraSubred.toCharArray()) {
            if (bit == '1') {
                mascaraInvertida.append('0');
            } else if (bit == '0') {
                mascaraInvertida.append('1');
            } else {
                // Mantener los puntos (.)
                mascaraInvertida.append(bit);
            }
        }

        return mascaraInvertida.toString();
    }
    
    public static int contarBitsCero(String mascaraSubred) {
        int count = 0;
        for (char bit : mascaraSubred.replace(".", "").toCharArray()) {
            if (bit == '0') {
                count++;
            }
        }
        return count;
    }
   
}



