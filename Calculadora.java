public class Calculadora {
    
    public static int adicionar(double a, double b) {
        return a + b;
    }
    public static int subtrair(double a, double b) {
        return a - b;
    }
    public static int multiplicar(double a, double b) {
        return a * b;
    }
    public static int dividir(double a, double b) {
        if (b == 0) {
 System.out.println("Erro: Divisão por zero!");
return Double.NaN;
        }
return a / b;
    }
}