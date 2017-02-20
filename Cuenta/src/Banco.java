/**
 * Created by lotalorafox on 2/15/2017.
 */
public class Banco {
    public static void main(String arg[]){
        Cuenta Ms = new Cuenta(1012,1234,"Magdalena Sanchez",0);
        //Ms.consignar();
        Cuenta Jp = new Cuenta(1013,9876,"Joselito Perez",500000);
        //Jp.cambiarc();
        Jp.consultar();
    }
}
