package aula.tres;

import aula.dois.Quadrilatero;

public class Retornos {
    public static void main(String[] args) {
        double quadrado = QuadrilateroAlternativo.calculaArea(2);
        double retangulo = QuadrilateroAlternativo.calculaArea(2d, 3d);
        double trapezio = QuadrilateroAlternativo.calculaArea(2, 3, 2);
        float losango = QuadrilateroAlternativo.calculaArea(2f, 3f);

        System.out.println("Área do quadrado: " + quadrado);
        System.out.println("Área do retângulo: " + retangulo);
        System.out.println("Área do trapézio: " + trapezio);
        System.out.println("Área do losango: " + losango);
    }
}
