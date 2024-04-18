package mission;

public abstract class Animal implements Runnable, Eatable, Speakerable, Greetable {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        sayHello();
        run();
        eat();
        makeSound();
    }

    public static Animal createAnimals(String type, String name, int age) {
        switch (type) {
            case "Dog":
                return new Dog(name, age);
            case "Cat":
                return new Cat(name, age);
            default:
                System.out.println(" ");
                return null;
        }
    }

    public String getName() {
        return name;

    }

    public int getAge() {
        return age;
    }
}

