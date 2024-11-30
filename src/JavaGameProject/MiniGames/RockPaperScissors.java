package JavaGameProject.MiniGames;

import JavaGameProject.GetInput;

public class RockPaperScissors implements IMiniGame {

    @Override
    public boolean playGame(){
//        Scanner scanner = new Scanner(System.in);
        String computerChoice;
        String userChoice;

        int userScore = 0;
        int computerScore = 0;


        while (userScore != 3 && computerScore != 3) {
//            System.out.println("Enter your choice (rock, paper, scissors): ");
//            userChoice = scanner.nextLine().toLowerCase();

            // Generate a random computer choice
            int randomNum = (int) (Math.random() * 3);
            if (randomNum == 0) {
                computerChoice = "rock";
            } else if (randomNum == 1) {
                computerChoice = "paper";
            } else {
                computerChoice = "scissors";
            }

            System.out.println("Computer chose: " + computerChoice);


            System.out.println("Enter your choice (rock, paper, scissors): ");
            userChoice = GetInput.getInput().toLowerCase();

            if (userChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if (userChoice.equals("rock")) {
                if (computerChoice.equals("scissors")) {
                    System.out.println("You win!");
                    userScore++;
                } else {
                    System.out.println("Computer wins!");
                    computerScore++;
                }
            } else if (userChoice.equals("paper")) {
                if (computerChoice.equals("rock")) {
                    System.out.println("You win!");
                    userScore++;
                } else {
                    System.out.println("Computer wins!");
                    computerScore++;
                }
            } else if (userChoice.equals("scissors")) {
                if (computerChoice.equals("paper")) {
                    System.out.println("You win!");
                    userScore++;
                } else {
                    System.out.println("Computer wins!");
                    computerScore++;
                }
            } else {
                System.out.println("Invalid input. Please enter rock, paper, or scissors.");
            }

        }

//        scanner.close();

        return userScore == 3;
    }


}