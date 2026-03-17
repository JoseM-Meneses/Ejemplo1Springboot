package itm.edu.ejemploSpringboot1.ejemplosPOO;

public class Pony extends Caballo{

    public Pony(String nombre) {
        super(nombre);
    }

    @Override
    public String traerEspecialidad() {
        return " ser bonito";
    }

    public void hacerSonido(){
        System.out.println(" el animal  "+getNombre()+"  relincha con gracia ");
    }

}
