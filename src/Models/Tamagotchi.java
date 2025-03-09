package Models;

import java.util.Random;

public class Tamagotchi {

    private String name;
    private int energy;
    private int mood;
    private int hunger;
    private Random random;
    private boolean alive;

    public Tamagotchi(String name) {
        random = new Random();
        this.name = name;
        this.energy = random.nextInt(2, 9);
        this.mood = random.nextInt(2, 9);
        this.hunger = random.nextInt(2, 9);
        alive = true;

    }

    public void play() {
        energy--;
        hunger--;
        mood += 5;
        if (mood > 10) {
            mood = 10;
        }
    }

    public void sleep() {
        int sleep = random.nextInt(1, 11);
        energy = energy + sleep;
        hunger--;
        mood--;
        if (energy > 10) {
            energy = 10;
        }
        System.out.println(name + " sleeps for " + sleep + " hours");
    }

    public void feed() {
        hunger += 3;
        energy--;
        mood--;
        if(hunger>10){
            hunger = 10;
        }
        System.out.println(name + " eats");
    }

    public void makeSound() {

    }

    public boolean checkLiveStatus() {
        if (hunger < 0) {
            die(name + " died due to a lack of food");
            return alive;
        }
        if (energy < 0) {
            die(name + " finally got to sleep"
                    + "\n" + "Forever");
            return alive;
        }
        if (mood < 0) {
            die(name + " lost the will to live");
            return alive;
        }
        if (hunger < 1) {
            System.out.println(name + " doesn't even remember the taste of food anymore");

        } else if (hunger < 3) {
            System.out.println(name + " is hungry");
        }
        if (mood < 1) {
            System.out.println(name + " wonders what the point of life really is" +
                    "\n" + "Is there nothing more to it than eating and sleeping?");

        } else if (mood < 3) {
            System.out.println(name + " would like to play");
        }
        if (energy < 1) {
            System.out.println(name + " has started hallucinating"
                    + "\n" + "Perhaps sleeping this month would be a good idea");

        } else if (energy < 3) {
            System.out.println(name + " is low on energy and needs to sleep");
        }
        return alive;
    }

    private void die(String deathMessage) {
        System.out.println(deathMessage);
        alive = false;
    }

    public String getName() {
        return name;
    }

}
