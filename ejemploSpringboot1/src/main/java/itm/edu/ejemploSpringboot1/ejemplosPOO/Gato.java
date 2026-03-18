package itm.edu.ejemploSpringboot1.ejemplosPOO;

public class Gato extends Animal{
    public Gato(String nombre) {
        super(nombre);
    }

    public void hacerSonido(){
        System.out.println(" el gato con botas hace sonido");
    }
}
