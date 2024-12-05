package JavaGameProject;

import JavaGameProject.MiniGames.*;

import java.util.ArrayList;

public class GamesList {

    private int index = 0;

     ArrayList<IMiniGame> miniGames;

     public GamesList() {
         miniGames = new ArrayList<>();
         miniGames.add(new RockPaperScissors());
     }

     public boolean playNextGame(){
         boolean wonGame = false;
         wonGame = miniGames.get(index).playGame();

         if(wonGame){
             index++;
             printCongratulations();
         }

         return wonGame;
     }

     public void restartGame(){
         index = 0;
     }

     private void printCongratulations(){
         System.out.println("Congratulations! You Won");
     }
     public boolean isLastGame(){
         return index == miniGames.size();
     }
}
