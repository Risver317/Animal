package mission;

public class Dog extends Animal {


    public Dog(String name, int age) {
        super(name, age);

    }


    @Override
    public void run() {
        System.out.println("Я хочу бегать");
    }

    @Override
    public void eat() {
        System.out.println("Я хочу кушать");
    }

    @Override
    public void makeSound() {
        System.out.println("Гав-Гав");
    }

    @Override
    public void sayHello() {
        System.out.println("Привет, меня зовут " + getName() + " мне " + getAge() + " лет");
    }

}
