package itm.edu.ejemploSpringboot1.ejemplosPOO;

public class Animal {
    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void hacerSonido(){
        System.out.println(" El animal  "+nombre+"  hace sonido");
    }
}
