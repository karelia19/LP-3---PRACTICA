package laboratorio2;

public class Motor {
    private String tipo;       
    private int potencia;     

    public Motor(String tipo, int potencia) {
        this.tipo = tipo;
        this.potencia = potencia;
    }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public int getPotencia() { return potencia; }
    public void setPotencia(int potencia) { this.potencia = potencia; }

    @Override
    public String toString() {
        return "Motor [Tipo=" + tipo + ", Potencia=" + potencia + " HP]";
    }
}

