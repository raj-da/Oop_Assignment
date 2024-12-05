package JavaGameProject;

public class GameLoop {

    private final NarrativeManager narrator;
    private GamesList gameList;
    private Main.Character player;

    public GameLoop() {
        narrator = new NarrativeManager();
        gameList = new GamesList();
        player = new Main.Character("Player 1", 100);
    }


    public void run() {
        boolean gameLost = false;

        while (true) {
            narrator.startConversation();
            String s = GetInput.getInput();

            if (s.equalsIgnoreCase("n")) {
                return;
            }

            System.out.println("Get ready " + player.getName());

            narrator.printGameRules();

            while (!gameList.isLastGame() && !gameLost) {
                narrator.getNextNarration();

                while (!gameList.isLastGame()) {
                    if (gameList.playNextGame()) {
                        break;
                    } else {
                        player.takeDamage(10);
                        if (player.getHealth() <= 0) {
                            gameLost = true;
                            break;
                        }
                        System.out.print("Game Lost! Play Again?(Y/N): ");
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

            s = GetInput.getInput();
            if (s.equalsIgnoreCase("n")) {
                narrator.printExitMessage();
                break;
            }

            gameList.restartGame();
            narrator.restartConversation();
            gameLost = false; // Reset game state
        }
    }
}
