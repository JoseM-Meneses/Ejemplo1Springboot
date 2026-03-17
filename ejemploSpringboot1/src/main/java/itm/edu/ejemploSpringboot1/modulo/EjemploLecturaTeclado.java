package modulo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class EjemploLecturaTeclado {

    public void primeraLectura(){
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Por favor Digite algo");
            String digito = in.readLine();
            System.out.print("Usted digitó:  " + digito);
        } catch (
                IOException e) {
            System.out.print("ocurrio un error de lectura ");
        }
    }

    public void segundaLectura(){

        Scanner input = new Scanner(System.in);
        System.out.println("Digite un mensaje :   ");
        String variableString = input.nextLine();
        System.out.println("Usted digitó:  " + variableString);
        try{
            int numero = Integer.parseInt(variableString);
            System.out.println("numero mas 1 " + ++numero);
        }catch (NumberFormatException e){
            System.out.println("no digito un número");
        }

    }

}
