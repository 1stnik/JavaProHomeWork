package com.hillel.rockPaperScissors;

import com.hillel.rockPaperScissors.dto.Game;
import com.hillel.rockPaperScissors.dto.Player;
import com.hillel.rockPaperScissors.service.impl.GameService;
import com.hillel.rockPaperScissors.service.impl.GameServiceImpl;

import java.util.Scanner;

/**
 * @author Serhii Nikonenko
 * @version 1.0.0
 */

public class StartGame {

    public static Integer playerHand;

    public static void main(String[] args) {

        System.out.println("Let's start the game!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter number of games : ");
        Integer numberOfGames;
        do {
            while (!scanner.hasNextInt()) {
                System.out.println("Enter positive number ...");
                scanner.next();
            }
            numberOfGames = scanner.nextInt();
            if(numberOfGames < 1) System.out.println("Only positive number. Try again ...");
        } while (numberOfGames < 1);


        System.out.println("Let's start the game!");

        GameService gs = new GameServiceImpl();
        Game game = gs.startGame(new Player()
                .setName(name));

        String continueGame = "Y";
        String stopGame = "Y";

        do {
            System.out.println("""
                Choose a hand move:
                1 - Rock
                2 - Paper
                3 - Scissors
                """);

            Integer scannerInput;
            boolean b = false;
            do {
                while (!scanner.hasNextInt()) {
                    System.out.println("Incorrect value. Enter 1, 2 or 3");
                    scanner.next();
                }
                scannerInput = scanner.nextInt();

                switch (scannerInput) {
                    case 1, 2, 3 -> {
                        playerHand = scannerInput;
                        b = true;
                    }
                    default -> System.out.println("Incorrect value. Try again. Enter 1, 2 or 3");
                }
            } while (!b);

            gs.playerHand(game);
            gs.computerHand(game);

            System.out.println("Player choice is " + gs.showHand(game.getPlayer().getHand()));
            System.out.println("Computer choice is " + gs.showHand(game.getComputer().getHand()));
            gs.showWinner(game);

            do{
                continueGame = scanner.nextLine();
            } while (continueGame.equalsIgnoreCase("Y"));
            if (--numberOfGames == 0) break;
            System.out.println("One more round ... [Y/N]?");
            stopGame = scanner.nextLine();
        } while (stopGame.equalsIgnoreCase("Y"));
        System.out.println(gs.showResult(game));
    }
}
