import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner teclado =new Scanner(System.in);

        //Clase - Objecto - instancia
        Vehiculo v1 = new Vehiculo();
        v1.setModelo("Mazda");
        v1.setNumMotor("abc123");
        v1.setSerial("abc123456789");

        System.out.println(v1.toString());


        Vehiculo v2 = new Vehiculo("Ford","xyz987","xyz987654321");

        System.out.println(v2.toString());

        // Datos ingresados por el usuario

        Vehiculo v3 = new Vehiculo();
        System.out.println("Ingrese el modelo del vehiculo");
        v3.setModelo(teclado.next());
        System.out.println("Ingrese el numero del motor del vehiculo");
        v3.setNumMotor(teclado.next());
        System.out.println("Ingrese el serial del vehiculo");
        v3.setSerial(teclado.next());

        System.out.println(v3.toString());
    }
}