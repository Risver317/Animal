package mission;

public abstract class Animal implements Runnable, Eatable, Speakerable, Greetable {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        sayHello();
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return this.name;

    }

    public int getAge() {
        return this.age;
    }
}

