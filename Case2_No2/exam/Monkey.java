package exam;

public class Monkey extends Animal{
    String food;
    public Monkey(int weight,String name, String food){
        this.weight = 120;
        this.name = "George";
        this.food = "kiwi";
    }
    public String toString() {
        return name + " is a monkey. He weighs " + weight + " pounds and loves " + food + ".";
    }
}
