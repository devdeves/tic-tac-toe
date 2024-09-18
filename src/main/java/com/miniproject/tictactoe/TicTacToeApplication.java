package com.miniproject.tictactoe;

import com.miniproject.tictactoe.controller.GameController;
import com.miniproject.tictactoe.models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TicTacToeApplication {
    private static GameController gameController = new GameController();

    public static void main(String[] args) {
        // THIS set of code help in take I/P //
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many human players are going to play?");
        int numOfHumanPlayer = scanner.nextInt();
        List<Player> players = new ArrayList<>();
        for(int i=0 ; i< numOfHumanPlayer ; i++){
            // Take Name and Symbol //
            System.out.println("Give player "+(i+1) +"name");
            String name = scanner.next();
            System.out.println("Give player "+(i+1) +"Symbol");
            char symbol = scanner.next().charAt(0);

            players.add(new Player(name,symbol));
        }

        // Take Input of Bots if user opt for bots //
        System.out.println("Is a bot going to play ? y/n");
        char botReply = scanner.next().charAt(0);
        if(botReply == 'y'){
            System.out.println("Choose Bot level ? (h/m/l)");
            //To DO write whole logic of bot
            players.add(new Bot("BOT1",'b', BotsLevel.LOW));
        }
        //---------------------INPUT SECTION ENDED ------------------------//

        ///////////////////// ----- START LOGIC TO CREATE AND PLAY GAME ------- /////////////////
        Game game ;
        try {
            game =  gameController.createGame(players);

        }catch (Exception e){
            System.out.println("Error while creating game: " + e.getMessage());
            return;
        }

        while (gameController.getGameStatus(game).equals((GameStatus.IN_PROGRESS))){
            // Collect all the I/P for game intilization //
            gameController.displayBoard(game);

            // Get current player object and implement moves logic //
            Player player = gameController.getCurrentPlayer(game);
            System.out.println(player.getName() + "'s turn ,Give row and column");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            gameController.makeMove(game ,player ,row,col);

        }

    }


}
