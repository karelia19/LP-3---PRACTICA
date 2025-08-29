package laboratorio2;

public class Persona {
    private String nombre;
    private int edad;
    private Cuenta cuenta; 

    public Persona(String nombre, int edad, String numeroCuenta, double saldoInicial) {
        this.nombre = nombre;
        this.edad = edad;
        this.cuenta = new Cuenta(numeroCuenta, saldoInicial); 
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public Cuenta getCuenta() { return cuenta; }

    @Override
    public String toString() {
        return "Persona (nombre=" + nombre + ", edad=" + edad + ", " + cuenta.toString() + ")";
    }
}

