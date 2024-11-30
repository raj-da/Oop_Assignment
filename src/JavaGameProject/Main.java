package JavaGameProject;

import JavaGameProject.Characters.Player;

import java.util.Scanner;

public class Main {


        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            NarrativeManager narrator = new NarrativeManager();

            narrator.startConversation();
            String s = GetInput.getInput();

            if (s.equalsIgnoreCase("n")) {
                return;
            }

            Player player = new Player("JavaGameProject.Characters.Player 1");
            System.out.println("Get ready " + player.getName());

            MiniGameList gameList = new MiniGameList();
            narrator.printGameRules();

            // Start the game loop
            GameLoop gameLoop = new GameLoop(narrator, gameList, player);
            gameLoop.run();

            GetInput.closeScanner();
        }

}