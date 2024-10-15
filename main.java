import java.util.*;
import java.awt.*;


public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to TerminalGame!");
        System.out.println("1.Start, 2.Exit");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("Enter your name: ");
            String name = scanner.next();
            System.out.println("Hello " + name + "!");
            System.out.println("Choose your character: ");
            System.out.println("1.Normal Guy, 2.Homeless guy");
            int character = scanner.nextInt();
            if (character == 1) {
                System.out.println("You chose the Normal Guy!");
                System.out.println("Its 6am and you just woke up from deep sleep, you have to go to work, but you are late already.");
                System.out.println("What do you want to do? 1. Go to work, 2. Sleep more");
                int choice1 = scanner.nextInt();
                if (choice1 == 1) {
                    System.out.println("You chose to go to work!");
                    System.out.println("You made a quick snack for your train ride to work and left your house.");
                    System.out.println("You are at the train station, you see a homeless guy asking for money, what do you do?");
                    System.out.println("1. Give him money, 2. Ignore him");
                    int choice2 = scanner.nextInt();
                    if (choice2 == 1) {
                        System.out.println("You just gaved a homeless guy 5bucks, that was last money you had for your train ticket.");
                        System.out.println("You are now stuck at the train station, what do you do?");
                        System.out.println("1. Ask for money, 2. Walk to work");
                        int choice3 = scanner.nextInt();
                        if (choice3 == 1) {
                            System.out.println("You will go ask nearest person for 5bucks, and hope they will give it to you.");
                            System.out.println("You asked nice lady for 5bucks, she gave you 5bucks and you bought a ticket for the train.");
                            System.out.println("You are now at work, you are late, but you made it!");
                            System.out.println("You work as programmer for Microsoft in Slovakia.");
                            System.out.println("You are now at your desk, what do you do?");
                            System.out.println("1. Work, 2. Play games");
                            int choice4 = scanner.nextInt();
                            if (choice4 == 1) {
                                System.out.println("You are working on a new project, you are making a new game for Microsoft.");
                                System.out.println("The Game is called TerminalGame, you are making a game about a guy who is late for work.");
                                System.out.println("You are now at lunch break, what do you do?");
                                System.out.println("1. Eat, 2. Go for a walk");
                                int choice5 = scanner.nextInt();
                                if (choice5 == 1) {
                                    System.out.println("You opeded a doordash and ordered a pizza, you are now eating pizza.");
                                    System.out.println("You are now back at work, its already a 5pm, what do you do?");
                                    System.out.println("1. Work, 2. Go home");
                                    int choice6 = scanner.nextInt();
                                    if (choice6 == 1) {
                                        System.out.println("You worked till 8pm and headed home.");
                                        System.out.println("You are now at home, what do you do?");
                                        System.out.println("1. Sleep, 2. Play games");
                                        int choice7 = scanner.nextInt();
                                        if (choice7 == 1) {
                                            System.out.println("You went to bed and fell asleep.");
                                            System.out.println("You woke up at 8am, its Saturday and you dont have to go to work.");
                                            System.out.println("Today its your birthday and you are going to party with your friends at 5pm.");
                                            System.out.println("You spent whole day playing games and watching movies.");
                                            System.out.println("Its 5pm, you are now at the party, what do you do?");
                                            System.out.println("1. Drink, 2. Dance");
                                            int choice8 = scanner.nextInt();
                                            if (choice8 == 1) {
                                                System.out.println("You ordered couple shots of vodka and drank them all.");
                                                System.out.println("You are now drunk and you are dancing on the table.");
                                                System.out.println("You fell off the table and broke your leg.");
                                                System.out.println("You just woke up in the hospital, what do you do?");
                                                System.out.println("1. Call your mom, 2. Call your friend");
                                                int choice9 = scanner.nextInt();
                                                if (choice9 == 1) {
                                                    System.out.println("You called your mom and she came to pick you up.");
                                                    System.out.println("You are now at home, you have a broken leg and you cant walk.");
                                                    System.out.println("You are now in bed, what do you do?");
                                                    System.out.println("1. Sleep, 2. Watch TV");
                                                    int choice10 = scanner.nextInt();
                                                    if (choice10 == 1) {
                                                        System.out.println("You fell asleep and woke up at 8am.");
                                                        System.out.println("You cant go to work, so you are working from home");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            else if (character == 2) {
                System.out.println("You chose the Homeless Guy!");
            }
            else {
                System.out.println("Invalid choice!");
            }
        }
        else{
            System.out.println("Goodbye!");
        }

    }
}