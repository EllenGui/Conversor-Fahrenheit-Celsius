package com.lista7;
import java.util.Scanner;

public class Exercicio4
{
    public static void main( String[] args ) {

                Scanner leia = new Scanner(System.in);
                Conversor converter = new Conversor();
                
                System.out.println("Digite a temperatura em Fahrenheit: ");
                double grausF = leia.nextDouble();
                
                double grausC = converter.fahrenheitToCelsius(grausF);
                System.out.printf("A temperadtura em Celsius e: %.2f", grausC);
                
                leia.close();
            }
        
        }
    