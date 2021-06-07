package pp;


public class Calculadora {

    final static int SUMA =0;
    final static int RESTA =1;
    final static int MULTIPLICACION =2;
    final static int DIVISION =3;


    public static void main(String ar[]){

        try {
            System.out.println("**RESULTADO: " + new Calculadora().operacion(SUMA, "1", "2"));
        }catch(Exception e){
            System.out.println("Hay un error");
        }
    }



    private int operacion(int tipo, String operando_1, String operando_2) throws Exception{
        int resultado = 0;

           switch(tipo){
                case SUMA:

                    resultado = Integer.parseInt(operando_1) + Integer.parseInt(operando_2);
                    break;
                case RESTA:
                    break;
                case MULTIPLICACION:
                    break;
                case DIVISION:
                    break;

            }


        return resultado;
    }



}
