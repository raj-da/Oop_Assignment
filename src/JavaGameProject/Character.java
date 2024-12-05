package JavaGameProject;

public class Character {
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