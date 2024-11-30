package JavaGameProject.Characters;

public abstract class Character {
    public String name;
    public int health;

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
