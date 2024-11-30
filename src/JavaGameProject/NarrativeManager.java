package JavaGameProject;

import java.util.ArrayList;

public class NarrativeManager {
    private ArrayList<String> Narrations;
    private int index;

    public NarrativeManager() {
        index = 0;
        Narrations = new ArrayList<>();
        Narrations.add("ello tot asra safin");
    }

    public void getNextNarration() {
        System.out.println( Narrations.get(index++));
    }

    public void startConversation() {
        System.out.println("Welcome to Your Adventure!");
        System.out.println("""
                A grand, echoing voice, perhaps a wise old man or a divine entity, begins to narrate.
                
                “You are King Solomon, a ruler of great wisdom and power. Yet, even kings are not immune to sorrow.
                Your beloved daughter, Princess Shiba, lies gravely ill.
                A wise sage has revealed that a single bloom from the mystical Heart-flower, nestled within the lair
                of the ancient dragon, Zarathor, atop the perilous Mountain of Shadows, known as Mystical Dashen,
                holds the key to her recovery.
                
                But beware, for the mountain is not merely perilous; it is cursed, sealed by generations
                past to contain a monstrous evil. A daunting quest awaits you, noble king. Will you be brave
                to dare go into the unknown, confront the DRAGON, and claim the flower to save your daughter?”
                """);
        System.out.print("DO you accept this Challenge?(Y/N): ");

    }
    public void printGameRules(){
        System.out.println("""
                Game rules:
                1. ....
                """);
    }
    public void printExitMessage(){
        System.out.println("Farewell Hope to see you again.");
    }

}
