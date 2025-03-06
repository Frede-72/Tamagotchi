import Models.Cat;
import Models.Dog;
import Models.Tamagotchi;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Tamagotchi tamagotchi = newTamagotchi(scanner);
        tamagotchi.makeSound();
        while(true){
            if(!tamagotchi.checkLiveStatus()){
                break;
            }
            System.out.println("What would you like to do");
            System.out.println("1 - play");
            System.out.println("2 - sleep");
            System.out.println("3 - feed");
            int choice = scanner.nextInt();
            scanner.nextLine();
            if(choice==1){
                tamagotchi.play();
            }
            if(choice==2){
                tamagotchi.sleep();
            }
            if(choice==3){
                tamagotchi.feed();
            }
        }

    }

    public static Tamagotchi newTamagotchi(Scanner sc) {
        while (true) {
            System.out.println("Choose animal: Type 1 for cat and 2 for dog");
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1) {
                System.out.println("Name your pet");
                String catName = sc.nextLine();
                Cat cat = new Cat(catName);
                return cat;
            }
            if (choice == 2) {
                System.out.println("Name your pet");
                String dogName = sc.nextLine();
                Dog dog = new Dog(dogName);
                return dog;
            }
        }
    }
}

