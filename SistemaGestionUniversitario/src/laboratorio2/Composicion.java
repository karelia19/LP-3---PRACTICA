package laboratorio2;

public class Composicion {
    public static void main(String[] args) {
        Persona p1 = new Persona("Fernando", 20, "118-458", 1000);
        Persona p2 = new Persona("Luis", 30, "689-112", 500);

        System.out.println(p1);
        System.out.println(p2);

        p1.getCuenta().depositar(200);
        p1.getCuenta().retirar(300);

        System.out.println("Después de transacciones:");
        System.out.println(p1);
    }
}
