package aula.dois;

public class Quadrilatero {

    public static void calculaArea(double lado){
        System.out.println("Área do quadrado é: " + lado*lado);
    }
    public static void calculaArea(double base, double altura){
        System.out.println("Área do quadrado é: " + base*altura);
    }
    public static void calculaArea(double baseMenor, double baseMaior, double altura){
        System.out.println("Área do trapézio é: " + ((baseMenor+baseMaior)*altura)/2);
    }
}
