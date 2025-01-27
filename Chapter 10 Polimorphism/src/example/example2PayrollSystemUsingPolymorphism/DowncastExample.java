package example.example2PayrollSystemUsingPolymorphism;

/*
Downcasting é a conversão de uma referência de uma superclasse para uma subclasse.

É necessário quando você precisa acessar métodos ou atributos específicos da subclasse.

Sempre verifique com instanceof antes de fazer o downcast para evitar erros.
 */
public class DowncastExample {
    class Animal {
        void fazerSom() {
            System.out.println("Som genérico de animal");
        }
    }

    class Cachorro extends Animal {
        void fazerSom() {
            System.out.println("Au Au!");
        }

        void abanarRabo() {
            System.out.println("Cachorro abanando o rabo");
        }
    }

    Animal meuAnimal = new Cachorro(); // Upcasting (implícito)

//    if (meuAnimal instanceof Cachorro) {
//        Cachorro meuCachorro = (Cachorro) meuAnimal; // Downcasting
//        meuCachorro.abanarRabo(); // Agora você pode chamar métodos específicos de Cachorro
//    }
}
