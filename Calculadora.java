public class Calculadora {
    
    public static Int adicionar(double a, double b) {
        return a + b;
    }
    public static Int subtrair(double a, double b) {
        return a - b;
    }
    public static Int multiplicar(double a, double b) {
        return a * b;
    }
    public static Int dividir(double a, double b) {
        if (b == 0) {
 System.out.println("Erro: Divisão por zero!");
return Double.NaN;
        }
return a / b;
    }
}