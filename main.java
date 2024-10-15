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
            if (character == 2) {
                System.out.println("You chose the Homeless Guy!");
                System.out.println("Its 6am and you just woke up from the bench in the park, you have to go to work, but you are late already.");
                System.out.println("What do you want to do? 1. Go to work, 2. Sleep more");
                int choice1 = scanner.nextInt();
                if (choice1 == 1) {
                    System.out.println("You went to work, but you dont have money for the train ticket.");
                    System.out.println("You are now at the train station, what do you do?");
                    System.out.println("1. Ask for money, 2. Walk to work");
                    int choice2 = scanner.nextInt();
                    if (choice2 == 1) {
                        System.out.println("You went ask some old lady for money, she gave you 5bucks.");
                        System.out.println("You bought a ticket for the train and went to work.");
                        System.out.println("You work as construction worker in Slovakia.");
                        System.out.println("You are now at work, what do you do?");
                        System.out.println("1. Work, 2. Fuck them and go to sleep");
                        int choice3 = scanner.nextInt();
                        if (choice3 == 1) {
                            System.out.println("You continued  working, but you are tired.");
                            System.out.println("You are now at the end of the day, what do you do? ");
                            System.out.println("1. Go for sleep, 2.  Go to the bar");
                            int choice4 = scanner.nextInt();
                            if (choice4 == 1) {
                                System.out.println("You went to the park for a  sleep, but you got caught by the police.");
                                System.out.println("You are now in jail, what do you do?");
                                System.out.println("1. Sleep, 2. Call your Boss");
                                int choice5 = scanner.nextInt();
                                if (choice5 == 1) {
                                    System.out.println("You went for sleep and woke up at 8am.");
                                    System.out.println("The police let you go, but you dont have a job anymore.");
                                    System.out.println("You are now without job, what do you do?");
                                    System.out.println("1.Try ti find a job, 2. Go to the bar");
                                    int choice6 = scanner.nextInt();
                                    if (choice6 == 1) {
                                        System.out.println("You went to Coop Jendota Prievidza to ask for a job.");
                                        System.out.println("They gave you a job as a cashier.");
                                        System.out.println("You are now working as a cashier, what do you do?");
                                        System.out.println("1. Work, 2. Steal money");
                                        int choice7 = scanner.nextInt();
                                        if (choice7 == 1) {
                                            System.out.println("You worked till 8pm and went to park for a sleep.");
                                            System.out.println("You woke up at 8am, what do you do?");
                                            System.out.println("1. Go to work, 2. Go to the bar");
                                            int choice8 = scanner.nextInt();
                                            if (choice8 == 1) {
                                                System.out.println("You went to work and worked till 8pm.");
                                                System.out.println();
                                                System.out.println();
                                                System.out.println();
                                                System.out.println("Couple months went by and you are now a manager of Coop Jendota Prievidza.");
                                                System.out.println("You are now at work, what do you do?");
                                                System.out.println("1. Work, 2. Steal money");
                                                int choice9 = scanner.nextInt();
                                                if (choice9 == 1) {
                                                    System.out.println("You worked till 8pm and went to park for a sleep.");
                                                    System.out.println("One day you had a heart attack and died.");
                                                    System.out.println("Game Over.... Ending 2.");
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
                                                        System.out.println("You are now working on your project, what do you do?");
                                                        System.out.println("1. Work, 2. Play games");
                                                        int choice11 = scanner.nextInt();
                                                        if (choice11 == 1) {
                                                            System.out.println("You will work on your project and finish it.");
                                                            System.out.println("You are now done with your project, what do you do?");
                                                            System.out.println("1. Sleep, 2. Play games");
                                                            int choice12 = scanner.nextInt();
                                                            if (choice12 == 1) {
                                                                System.out.println("You went to bed and fell asleep.");
                                                                System.out.println("Its 8am 30 days after you broke your leg, you woke up and you are going to work.");
                                                                System.out.println("You are now at work, what do you do?");
                                                                System.out.println("1. Work, 2. Play games");
                                                                int choice13 = scanner.nextInt();
                                                                if (choice13 == 1) {
                                                                    System.out.println("You went to your desk and started working on new project.");
                                                                    System.out.println("After 3 hours of working you must take a piss.");
                                                                    System.out.println("You went to the bathroom took a piss and went to home.");
                                                                    System.out.println("You are now at home, what do you do?");
                                                                    System.out.println("1. Sleep, 2. Play games");
                                                                    int choice14 = scanner.nextInt();
                                                                    if (choice14 == 1) {
                                                                        System.out.println("You went to bed and fell asleep, but at 3am you woke up, becouse you heard some weird noise.  What do you do?");
                                                                        System.out.println("1. Go check it out, 2. Ignore it");
                                                                        int choice15 = scanner.nextInt();
                                                                        if (choice15 == 1) {
                                                                            System.out.println("You went to check it out, and you saw a big  bear in your living room.");
                                                                            System.out.println("The bear killed you and you died.");
                                                                            System.out.println("Game Over.... Ending 1.");

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
