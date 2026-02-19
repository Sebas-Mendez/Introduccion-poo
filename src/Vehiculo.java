public class Vehiculo {
    //Atributos
    private String modelo;
    private String numMotor;
    private String serial;


    //Constructor vacio

    public Vehiculo() {

    }

    //constructor con todos los parametro


    public Vehiculo(String modelo, String numMotor, String serial) {
        this.modelo = modelo;
        this.numMotor = numMotor;
        this.serial = serial;    //this hace referencia a atributo de clase

    }

    // generar getter  - setter

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumMotor() {
        return numMotor;
    }

    public void setNumMotor(String numMotor) {
        this.numMotor = numMotor;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    // to string

    @Override
    public String toString() {
        return "Vehiculo{" +
                "modelo='" + modelo + '\'' +
                ", numMotor='" + numMotor + '\'' +
                ", serial='" + serial + '\'' +
                '}';
    }

     // metodos propios

    public void  arrancar(){ // void = vacio y sienpre debe tener system.out.println()
        System.out.println("SOY UN CARRO Y VOY A ARRANCAR");
    }
}
