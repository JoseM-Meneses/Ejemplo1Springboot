package itm.edu.ejemploSpringboot1.ejemplosPOO;

public class Perro extends Animal{
    public Perro(String nombre) {
        super(nombre);
    }

    public void hacerSonido(){
        System.out.println(" el Perro hace sonido");
    }
}
