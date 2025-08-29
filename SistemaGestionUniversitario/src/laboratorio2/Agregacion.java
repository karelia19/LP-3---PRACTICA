package laboratorio2;

public class Agregacion {
    public static void main(String[] args) {
        Motor motorDeportivo = new Motor("Gasolina", 500);
        Motor motorSUV = new Motor("Diésel", 250);

        Automovil auto1 = new Automovil("Ferrari", "488", motorDeportivo);
        Automovil auto2 = new Automovil("Kia", "Stonic", motorSUV);

        System.out.println(auto1);
        System.out.println(auto2);

        Motor motorElectrico = new Motor("Eléctrico", 300);
        auto2.setMotor(motorElectrico);

        System.out.println("Después de cambiar el motor del SUV:");
        System.out.println(auto2);
    }
}

