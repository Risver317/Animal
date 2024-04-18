package mission;

public class Main {
    public static void main(String[] args) {
        Animal cat = Animal.createAnimal("Cat", "Муся", 5);
        System.out.println();
        Animal dog = Animal.createAnimal("Dog", "Вольт", 9);
        cat.run();
    }
}


