package calculadora;

import java.util.ArrayList;

public class Calculadora {

    final static int EMPTY = 0;
    final static int ONLY_ONE_NUMBER = 1;


    public int sumarIlimitados(String s){

        return 0;
    }

    public int sumar(String s) throws NumberFormatException{

        int resultado = 0;

        if (s.contains(",") || (s.contains(("n")))) {

            ArrayList<String> sumandos = new ArrayList<String>();

            String[] sumandosParcial = s.split(",");

            for (String sumando : sumandosParcial) {
                sumando.split("n");
            }

            if (sumandos.size() > 1)
                for (String sumando : sumandos)
                    resultado += Integer.parseInt(sumando);

            else
                resultado = 0;
        } else {
            resultado = (s.isBlank() || s.isEmpty()) ? 0 : Integer.parseInt(s);
        }
        return resultado;
    }




}
