package JavaGameProject.Characters;


import java.util.ArrayList;

public class Dragon extends Character {
    private int index = 0;

    private ArrayList<String> conversation;
    public Dragon() {
        name = "Dragon";
        health = 1000;
        conversation = new ArrayList<>();
        conversation.add("""
                How dare you come into my nest?
                I've been here for millennia and nobody ever dared to come here.
                You are disrespecting me and my place of peace
                and Now you shall face my rage.
                """);
        conversation.add("");
    }
    public void getConversation() {
        System.out.println(conversation.get(index++));
    }

}
