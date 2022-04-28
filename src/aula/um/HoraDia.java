package aula.um;

import java.util.Calendar;
import java.util.Date;

public class HoraDia {
    public static void main(String[] args) {
        checaHora();
    }

    //O metódo abaixo pega a hora atual e retorna uma mensagem condizente
    public static void checaHora(){
        Calendar cal = Calendar.getInstance();
        Date date = new Date();
        cal.setTime(date);
        int hora = cal.get(Calendar.HOUR_OF_DAY);

        if(hora < 6){
            System.out.println("Boa madrugada");
        }
        else if(hora < 12){
            System.out.println("Bom dia");
        }
        else if(hora < 18){
            System.out.println("Boa tarde");
        }
        else{
            System.out.println("Boa noite");
        }

    }
}
