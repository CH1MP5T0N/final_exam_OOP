package exam;

public class Lion extends Animal{
    int meat;
    public Lion(int weight,String name, int meat){
        this.weight = 300;
        this.name = "Leo";
        this.meat = 5;
    }

    public String toString() {
        return name + " weighs " + weight + " pounds and consumes " + meat + " pounds of meat everyday";
    }
}
