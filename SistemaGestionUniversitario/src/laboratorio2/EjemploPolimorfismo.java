package laboratorio2;

class Animal {
 public void hacerSonido() {
     System.out.println("El animal hace un sonido");
 }
}

class Perro extends Animal {
 @Override
 public void hacerSonido() {
     System.out.println("El perro dice: ¡Guau guau!");
 }
}

class Gato extends Animal {
 @Override
 public void hacerSonido() {
     System.out.println("El gato dice: ¡Miau miau!");
 }
}

class Vaca extends Animal {
 @Override
 public void hacerSonido() {
     System.out.println("La vaca dice: ¡Muu muu!");
 }
}


public class EjemploPolimorfismo {
 public static void main(String[] args) {
     Animal miAnimal1 = new Perro();
     Animal miAnimal2 = new Gato();
     Animal miAnimal3 = new Vaca();
     
     System.out.println("=== SONIDOS DE ANIMALES ===");
     
     miAnimal1.hacerSonido();  
     miAnimal2.hacerSonido();  
     miAnimal3.hacerSonido();  
     
     System.out.println("\n=== TODOS LOS ANIMALES HACEN SONIDO ===");
     Animal[] animales = {
         new Perro(),
         new Gato(),
         new Vaca(),
         new Perro()  
     };
     
     for (Animal animal : animales) {
         animal.hacerSonido();  
     }
 }
}