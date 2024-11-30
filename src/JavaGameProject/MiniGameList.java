package JavaGameProject;

import JavaGameProject.MiniGames.*;

import java.util.ArrayList;

public class MiniGameList {

    public int index = 0;

     ArrayList<IMiniGame> miniGames;

     public MiniGameList() {
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

     public void printCongratulations(){
         System.out.println("Congratulations! You Won");
     }
     public boolean isLastGame(){
         return index == miniGames.size();
     }
}
