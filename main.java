import java.io.*;
import java.sql.Time;
import java.util.*;

public class main {
    private static String playerName;
    private static int characterChoice;
    private static int currentChoice;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Time time = new Time(1000);
        
        System.out.println("Welcome to TerminalGame!");
        System.out.println("1. Start, 2. Load Game, 3. Exit");
        int choice = scanner.nextInt();
        
        if (choice == 1) {
            startNewGame(scanner);
        } else if (choice == 2) {
            loadGame(scanner);
        } else {
            System.out.println("Goodbye!");
            return;
        }
        
        while (true) {
            if (characterChoice == 1) {
                normalGuyPath(scanner);
            } else if (characterChoice == 2) {
                homelessGuyPath(scanner);
            }
        }
    }

    private static void startNewGame(Scanner scanner) {
        System.out.println("Enter your name: ");
        playerName = scanner.next();
        System.out.println("Hello " + playerName + "!");
        System.out.println("Choose your character: ");
        System.out.println("1. Normal Guy, 2. Homeless Guy");
        characterChoice = scanner.nextInt();
    }

    private static void loadGame(Scanner scanner) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("savegame.dat"))) {
            playerName = (String) ois.readObject();
            characterChoice = ois.readInt();
            System.out.println("Game loaded! Welcome back, " + playerName + "!");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No saved game found.");
            startNewGame(scanner);
        }
    }

    private static void saveGame() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("savegame.dat"))) {
            oos.writeObject(playerName);
            oos.writeInt(characterChoice);
            System.out.println("Game saved successfully!");
        } catch (IOException e) {
            System.out.println("Error saving game.");
        }
    }

    private static void normalGuyPath(Scanner scanner) {
        System.out.println("You chose the Normal Guy!");
        System.out.println("It's 6am and you just woke up from deep sleep, you have to go to work, but you are late already.");
        System.out.println("What do you want to do? 1. Go to work, 2. Sleep more, 3. Save Game");
        currentChoice = scanner.nextInt();
        
        if (currentChoice == 1) {
            System.out.println("You made a quick snack for your train ride to work and left your house.");
            System.out.println("You are at the train station, you see a homeless guy asking for money, what do you do?");
            System.out.println("1. Give him money, 2. Ignore him, 3. Save Game");
            currentChoice = scanner.nextInt();
            
            if (currentChoice == 1) {
                System.out.println("You gave a homeless guy 5 bucks, that was the last money you had for your train ticket.");
                System.out.println("You are now stuck at the train station, what do you do?");
                System.out.println("1. Ask for money, 2. Walk to work, 3. Save Game");
                currentChoice = scanner.nextInt();
                
                if (currentChoice == 1) {
                    askForMoney(scanner);
                } else if (currentChoice == 2) {
                    walkToWork(scanner);
                } else {
                    saveGame();
                }
            } else if (currentChoice == 2) {
                System.out.println("You ignored him and caught the train.");
            } else {
                saveGame();
            }
        } else if (currentChoice == 2) {
            System.out.println("You went back to sleep and missed work. Game Over.");
            System.exit(0);
        } else {
            saveGame();
        }
    }

    private static void askForMoney(Scanner scanner) {
        System.out.println("You asked a nice lady for 5 bucks, she gave it to you.");
        System.out.println("You bought a ticket for the train and went to work.");
    }

    private static void walkToWork(Scanner scanner) {
        System.out.println("You walked to work, but you were late.");
    }

    private static void homelessGuyPath(Scanner scanner) {
        System.out.println("You chose the Homeless Guy!");
        System.out.println("It's 6am and you just woke up from the bench in the park, you have to go to work, but you are late already.");
        System.out.println("What do you want to do? 1. Go to work, 2. Sleep more, 3. Save Game");
        currentChoice = scanner.nextInt();
        
        if (currentChoice == 1) {
            System.out.println("You went to work, but you don't have money for the train ticket.");
            System.out.println("You are now at the train station, what do you do?");
            System.out.println("1. Ask for money, 2. Walk to work, 3. Save Game");
            currentChoice = scanner.nextInt();
            
            if (currentChoice == 1) {
                askForMoneyHomeless(scanner);
            } else if (currentChoice == 2) {
                walkToWorkHomeless(scanner);
            } else {
                saveGame();
            }
        } else if (currentChoice == 2) {
            System.out.println("You went back to sleep and missed work. Game Over.");
            System.exit(0);
        } else {
            saveGame();
        }
    }

    private static void askForMoneyHomeless(Scanner scanner) {
        System.out.println("You asked an old lady for money, she gave you 5 bucks.");
        System.out.println("You bought a ticket for the train and went to work.");
    }

    private static void walkToWorkHomeless(Scanner scanner) {
        System.out.println("You walked to work by foot, but you are late.");
    }
}
