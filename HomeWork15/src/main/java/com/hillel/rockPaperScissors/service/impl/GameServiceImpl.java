package com.hillel.rockPaperScissors.service.impl;

import com.hillel.rockPaperScissors.StartGame;
import com.hillel.rockPaperScissors.dto.Computer;
import com.hillel.rockPaperScissors.dto.Game;
import com.hillel.rockPaperScissors.dto.HandType;
import com.hillel.rockPaperScissors.dto.Player;

import java.util.Random;

public class GameServiceImpl implements GameService {
    @Override
    public Game startGame(Player player) {
        return new Game()
                .setPlayer(player)
                .setComputer(new Computer());
    }

    @Override
    public void playerHand(Game game) {
        game.getPlayer().setHand(StartGame.playerHand);
    }

    @Override
    public void computerHand(Game game) {
        game.getComputer().setHand(new Random().nextInt(3) + 1);
    }

    @Override
    public HandType showHand(int hand) {
        if (hand == 1) return HandType.ROCK;
        else if (hand == 2) return HandType.PAPER;
        else if (hand == 3) return HandType.SCISSORS;
        return HandType.WRONG_VALUE;
    }

    @Override
    public String showWinner(Game game) {
        int pIndex = game.getPlayer().getHand() - 1;
        int cIndex = game.getComputer().getHand() - 1;
        String[][] resultGame = {
                {"Draw", "Player", "Computer"},
                {"Computer", "Draw", "Player"},
                {"Player", "Computer", "Draw"}};
        String output = resultGame[cIndex][pIndex];
        System.out.println("Winner is : " + output);
        increaseScore(game, output);
        return output;
    }

    @Override
    public void increaseScore(Game game, String output) {
        if (output.equalsIgnoreCase("draw")) {
            game.getPlayer().setNumberOfGames(game.getPlayer().getNumberOfGames() + 1);
        }
        else if (output.equalsIgnoreCase("player")) {
            game.getPlayer().setNumberOfGames(game.getPlayer().getNumberOfGames() + 1);
            game.getPlayer().setNumberOfWinGames(game.getPlayer().getNumberOfWinGames() + 1);
        } else if (output.equalsIgnoreCase("Computer")) {
            game.getPlayer().setNumberOfGames(game.getPlayer().getNumberOfGames() + 1);
            game.getPlayer().setNumberOfLose(game.getPlayer().getNumberOfLose() + 1);
        }
    }

    @Override
    public String showResult(Game game) {
        return String.format("Player : %s win %s games and lose %s games from %s total games.",
                game.getPlayer().getName(),
                game.getPlayer().getNumberOfWinGames(),
                game.getPlayer().getNumberOfLose(),
                game.getPlayer().getNumberOfGames());
    }
}
