package mission;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void run() {
        System.out.println("Я бегаю");
    }

    @Override
    public void eat() {
        System.out.println("Я кушаю");
    }

    @Override
    public void makeSound() {
        System.out.println("Мяу-Мяу");
    }

    @Override
    public void sayHello() {
        System.out.println("Привет, меня зовут " + getName() + " мне " + getAge() + " лет");
    }

}
