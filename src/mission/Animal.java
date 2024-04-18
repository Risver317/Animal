package mission;

public abstract class Animal implements Runnable, Eatable, Speakerable, Greetable {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        sayHello();
    }

    public static Animal createAnimal(String type, String name, int age) {
        switch (type) {
            case "Dog":
                return new Dog(name, age);
            case "Cat":
                return new Cat(name, age);
            default:
                throw new RuntimeException("Такого животного не существует\n");
        }
    }

    public String getName() {
        return this.name;

    }

    public int getAge() {
        return this.age;
    }
}

