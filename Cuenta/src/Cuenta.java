/**
 * Created by lotalorafox on 2/15/2017.
 */
public class Cuenta {
    java.util.Scanner read = new java.util.Scanner(System.in);
    private double number;
    private int code;
    private String own;
    private double balance;

    public Cuenta(double n,int c, String o, double b){
        number = n;
        code = c;
        own = o;
        balance = b;
    }

    public void consignar(){
        System.out.println("ingresa el numero de cuenta: ");
        double n1 = read.nextDouble();
        if(n1 == number){
            System.out.println("ingresa el monto a consignar: ");
            double c1 = read.nextDouble();
            balance = balance + c1;
        }else{
            System.out.println("El numero de cuenta no coincide.");
        }
    }
    public void retirar(){
        System.out.println("ingresa la contraseña: ");
        int c1 = read.nextInt();
        if(c1 == code){
            System.out.println("ingresa el monto a retirar: ");
            int r1 = read.nextInt();
            if(r1<=balance){
                balance = balance-r1;
                System.out.println("tu nuevo saldo es: "+ balance);
            }else{
                System.out.println("no tienes el saldo para esta operacion");
            }
        }else{
            System.out.println("Contraseña incorrecta");
        }
    }
    public void cambiarc(){
        System.out.println("ingresa la contraseña: ");
        int c1 = read.nextInt();
        if(c1 == code){
            System.out.println("ingresa la nueva contraseña: ");
            int c2 = read.nextInt();
            code = c2;
        }else{
            System.out.println("Contraseña incorrecta");
        }
    }
    public void consultar(){
        System.out.println("ingresa la contraseña: ");
        int c1 = read.nextInt();
        if(c1 == code){
            System.out.println("Tu saldo es:" + balance);
        }else{
            System.out.println("Contraseña incorrecta");
        }
    }

}
