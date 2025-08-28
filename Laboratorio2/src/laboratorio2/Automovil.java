package laboratorio2;

public class Automovil {
    private String marca;
    private String modelo;
    private Motor motor; 

    public Automovil(String marca, String modelo, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public Motor getMotor() { return motor; }
    public void setMotor(Motor motor) { this.motor = motor; }

    @Override
    public String toString() {
        return "Automovil [Marca=" + marca + ", Modelo=" + modelo + ", " + motor.toString() + "]";
    }
}
