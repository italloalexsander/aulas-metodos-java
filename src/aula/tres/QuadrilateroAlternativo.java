package aula.tres;

public class QuadrilateroAlternativo{

    public static double calculaArea(double lado){
        return lado*lado;
    }
    public static double calculaArea(double base, double altura){
        return base*altura;
    }
    public static double calculaArea(double baseMenor, double baseMaior, double altura){
        return ((baseMenor+baseMaior)*altura)/2;
    }
    public static float calculaArea(float diagonal1, float diagonal2){
        return ((diagonal1*diagonal2)/2);
    }
}
