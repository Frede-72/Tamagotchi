package Models;

public class Cat extends Tamagotchi {

    public Cat(String name) {
        super(name);
        System.out.println("  ^~^  ,\n" +
                " ('Y') )\n" +
                " /   \\/ \n" +
                "(\\|||/)");
    }

    @Override
    public void play() {
        super.play();
        System.out.println(getName() + " caught the string");
    }

    @Override
    public void makeSound() {
        System.out.println("Miav");
    }
}
