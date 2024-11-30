//import JavaGameProject.Characters.Player;
//
//import java.util.Scanner;
//
//public class tmp {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        JavaGameProject.NarrativeManager narrator = new JavaGameProject.NarrativeManager();
//        narrator.startConversation();
////        String s= GetInput.getInput();
//        String s= sc.next();
//
//        if (s.equalsIgnoreCase("n")){
//            return;
//        }
//
//        Player player = new Player("JavaGameProject.Characters.Player 1");
//        System.out.println("Get ready " + player.getName());
//        JavaGameProject.MiniGameList gameList = new JavaGameProject.MiniGameList();
//
//        narrator.printGameRules();
//        boolean gameLost = false;
//
//        while (true) {
//            while (!gameList.isLastGame()  && !gameLost){
//                narrator.getNextNarration();
//                while (!gameList.isLastGame() && !gameLost){
//                    if (gameList.playNextGame()){
//                        break;
//                    }
//                    else {
//                        player.dealDamage(10);
//                        if(player.getHealth() <= 0){
//                            gameLost = true;
//                        }else {
//                            System.out.print("Game Lost! Play Again?(Y/N): ");
//                            if (sc.next().equalsIgnoreCase("n")) {
//                                narrator.printExitMessage();
//                                return;
//                            }
//                        }
//                    }
//                }
//            }
//            if (gameLost){
//                System.out.print("Game Lost! Play Again?(Y/N): ");
//            }else if(gameList.isLastGame()){
//                System.out.print("Game Won! Play Again?(Y/N): ");
//            }
//            s = sc.next();
//            if (s.equalsIgnoreCase("n")){
//                break;
//            }
//            gameList.restartGame();
//        }
//
//
//    }
//}
