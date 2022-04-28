package aula.um;

import java.util.Scanner;

public class Emprestimo {
    public static void main(String[] args) {
        double valor, valorFinal;
        int parcelas;
        Scanner input = new Scanner(System.in);

        System.out.println("Qual o valor desejado: ");
        valor = input.nextDouble();
        System.out.println("Em quantas parcelas deseja pagar: ");
        parcelas = input.nextInt();

        valorFinal = fazerEmprestimo(valor, parcelas);
        if(valorFinal == -1){
            System.out.println("Operação Fracassou, inicie novamente");
        }
        else{
            System.out.println("O empréstimo de " + valor + " que será pago em " + parcelas + "x terá como valor final: " +
                    valorFinal);
        }

    }

    public static double fazerEmprestimo(double valor, int parcelas) {
        double juros = 0.0;
        juros = calculaJuros(parcelas);
        if(juros == -1){
            System.out.println("Número de parcelas invalido");
            return -1;
        }
        else{
            if(valor < 1000){
                return (juros * valor) + valor;
            }
            else if(valor < 10000){
                return (juros * valor) + valor + 50;//50 é a taxa adicional
            }
            else if(valor < 100000){
                return (juros * valor) + valor + 500;//500 é a taxa adicional
            }
            else{
                return (juros * valor) + valor + 5000;//5000 é a taxa adicional
            }
        }
    }

    private static double calculaJuros(int parcelas) {
        if(parcelas > 0 && parcelas < 12){
            return 0.0;
        }
        else if(parcelas < 18){
            return 0.1;
        }
        else if(parcelas < 24){
            return 0.2;
        }else{
            return -1;
        }
    }
}
