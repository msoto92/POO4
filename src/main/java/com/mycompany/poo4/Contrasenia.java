/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo4;

import java.util.Random;

/**
 *
 * @author Miguel
 */
public class Contrasenia {

    private int longitud = 8;
    private String contrasenia;

    public Contrasenia(int longitud) {
        this.longitud = longitud;
        calcularString();
    }

    public Contrasenia() {
        calcularString();
    }

    private void calcularString() {
        Random randomObject = new Random();

        contrasenia = "";
        for (int i = 0; i < longitud; i++) {
            char random = (char) (randomObject.nextInt(26) + 'a');
            contrasenia = contrasenia + random;
        }
    }

    public boolean esFuerte() {
        boolean validaror = true;

        char[] arrayContrasenia = contrasenia.toCharArray();
        //[a,c,y,1,5,f,f,f]
        // acy153351235fff

        int contador = 0;
        
        for (int i = 0; i < arrayContrasenia.length; i++) {
            char v = arrayContrasenia[i];
            
            switch (v) {
                case '1':
                    contador++;
                    break;
                case '2':
                    contador = contador + 1;
                    break;
                case '3':
                    contador++;
                    break;
                case '4':
                    contador++;
                    break;
                case '5':
                    contador++;
                    break;
                case '6':
                    contador++;
                    break;
                case '7':
                    contador++;
                    break;
                case '8':
                    contador++;
                    break;
                case '9':
                    contador++;
                    break;
                 case '0':
                    contador++;
                    break;
                default:
                    contador = contador;
            }
        }
        
        if(contador < 5)
        {
            validaror = false;
        }

        return validaror;
    }

    @Override
    public String toString() {
        String x = "La contaseña es: " + contrasenia;
        return x;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public void cambiarContrase(String contrasenia) {
        this.contrasenia = contrasenia;
    }

}
