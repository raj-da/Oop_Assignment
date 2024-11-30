package JavaGameProject;

import JavaGameProject.Characters.Player;

public class GameLoop {

//    private final Scanner sc;
    private final NarrativeManager narrator;
    private final MiniGameList gameList;
    private final Player player;

    public GameLoop(NarrativeManager narrator, MiniGameList gameList, Player player) {
//        this.sc = sc;
        this.narrator = narrator;
        this.gameList = gameList;
        this.player = player;
    }


    public void run() {
        boolean gameLost = false;

        while (true) {
            while (!gameList.isLastGame() && !gameLost) {
                narrator.getNextNarration();

                while (!gameList.isLastGame() && !gameLost) {
                    if (gameList.playNextGame()) {
                        break;
                    } else {
                        System.out.print("Game Lost! Play Again?(Y/N): ");
                        player.takeDamage(10);
                        if (player.getHealth() <= 0) {
                            gameLost = true;
                        }
                        if (GetInput.getInput().equalsIgnoreCase("n")) {
                            narrator.printExitMessage();
                            return;
                        }
                    }
                }
            }

            if (gameLost) {
                System.out.print("Game Lost! Play Again?(Y/N): ");
            } else if (gameList.isLastGame()) {
                System.out.print("Game Won! Play Again?(Y/N): ");
            }

            String s = GetInput.getInput();
            if (s.equalsIgnoreCase("n")) {
                break;
            }

            gameList.restartGame();
            gameLost = false; // Reset game state
        }
    }
}
