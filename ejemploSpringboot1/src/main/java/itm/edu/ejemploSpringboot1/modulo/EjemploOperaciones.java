package itm.edu.ejemploSpringboot1.modulo;

import java.util.StringTokenizer;

public class EjemploOperaciones {

    public int sumar(int a, int b){
        return a + b;
    }

    public void probarTokenizer(){
        StringTokenizer st = new StringTokenizer("1990-07-15", "-");
        System.out.println("qué hace count before " +st.countTokens());
        System.out.println("primer token año = " +st.nextToken());
        System.out.println("primer token mes = " +st.nextToken());
        System.out.println("primer token dia = " +st.nextToken());
        System.out.println("qué hace count = " +st.countTokens());

        String eo = "oe , oe, eso . que bien ; dale - no mas";
        String[] p = eo.split(",");
        for(String prueba : p){
            System.out.println(prueba);
        }

    }

}
