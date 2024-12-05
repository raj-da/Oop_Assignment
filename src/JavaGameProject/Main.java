package JavaGameProject;

public class Main {


        public static void main(String[] args) {

            GameLoop gameLoop = new GameLoop();
            gameLoop.run();

            GetInput.closeScanner();
        }

    public static class Character {
        public String name;
        public int health;
        public Character(String name, int health){
            this.name = name;
            this.health = health;
        }

        public int getHealth(){
            return health;
        }
        public void takeDamage(int damage) {
            health -= damage;
        };
        public String getName(){
            return name;
        }
    }
}