package JavaGameProject;

public class Main {


        public static void main(String[] args) {

            GameLoop gameLoop = new GameLoop();
            gameLoop.run();

            GetInput.closeScanner();
        }


}