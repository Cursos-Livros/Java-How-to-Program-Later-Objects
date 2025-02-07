package example.example2PayrollSystemUsingPolymorphism;

public class SuperclassReferenceExample {
    class Animal {
        void fazerSom() {
            System.out.println("Som genérico de animal");
        }
    }

    class Cachorro extends Animal {
        @Override
        void fazerSom() {
            System.out.println("Au Au!");
        }

        void abanarRabo() {
            System.out.println("Cachorro abanando o rabo");
        }
    }

//    public class Main {
//        public static void main(String[] args) {
//            Animal meuAnimal = new Cachorro(); // Variável de superclasse referenciando subclasse
//            meuAnimal.fazerSom(); // Chama o método sobrescrito na subclasse
//            // meuAnimal.abanarRabo(); // Erro! Não é possível acessar métodos específicos da subclasse
//        }
//    }
}
