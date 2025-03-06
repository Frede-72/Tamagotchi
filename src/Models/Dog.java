package Models;

public class Dog extends Tamagotchi {

    public Dog(String name) {
        super(name);
        System.out.println("  __      _\n" +
                "o'')}____//\n" +
                " `_/      )\n" +
                " (_(_/-(_/");
    }

    @Override
    public void play() {
        super.play();
        System.out.println(getName() + " fetches the stick");
    }

    @Override
    public void makeSound() {
        System.out.println("vov");
    }
}
