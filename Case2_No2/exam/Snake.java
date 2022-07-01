package exam;

public class Snake extends Animal{
    int length;
    public Snake(int weight,String name, int length){
        this.weight = 50;
        this.name = "Ana";
        this.length = 5;
    }

    public String toString() {
        return name + ", the snake, weighs " + weight + " pounds and is " + length + " feet long.";
    }
}
