import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            int num1 = 10;
            int num2 = 5;
            System.out.println("Adição: " + Calculadora.adicionar(num1, num2));

            System.out.println("Subtração: " + Calculadora.subtrair(num1, num2));

            System.out.println("Multiplicação: " + Calculadora.multiplicar(num1, num2));

            System.out.println("Divisão: " + Calculadora.dividir(num1, num2));
        }
    }