package pp;

import org.apache.commons.lang3.StringUtils;

import java.util.Collections;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Ejemplito {




    public static void main(String ar[]){

       // new Ejemplito().metodo("***********", true);
       // new Ejemplito().otroMetodo(1);

        new Ejemplito().trataStrings("  miCadena  ");
   }


   private void trataStrings (String s){

       //StringTokenizer st = new StringTokenizer();
        //System.out.println("***"+s.trim()+"***");
/*       System.out.println(s.toLowerCase());
       System.out.println(s.toUpperCase());
       System.out.println("###############");
       System.getProperties().list(System.out);
       System.out.println("###############");*/


/*       String[] pp = s.split("C");

       for (String t: pp){
           System.out.println("***" + t);
       }*/

       System.out.println(StringUtils.reverse(s));

       if(s.trim().compareTo("miCadena")== 0){
           System.out.println("********* Son IDENTICAS");
       }

       s ="una cadena, otra cadena";
       getTokens(s).forEach(System.out::println);

   }


    private void metodo(String p, Boolean b){

        if(b) {
            for (int i = 0; i < 10; i++)
                System.out.println(p + i);
        }else{
            System.out.println(" *********** Else fue false");
        }

    }

    private void otroMetodo(int i){

        switch (i){
            case 0: System.out.println("·····  case 0");
            break;
            case 1: System.out.println("·····  case 1");
            break;
            default:

        }
    }

    public List<String> getTokens(String str) {
        return Collections.list(new StringTokenizer(str, ",")).stream()
                .map(token -> (String) token)
                .collect(Collectors.toList());
    }


}
