package exam;

public class Animal {
    String name;
    int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public static void main(String[] args){
        Snake snake = new Snake(50, "Ana", 5);
        Lion lion = new Lion(300, "Leo", 5);
        Monkey monkey = new Monkey(120,"George", "Kiwi");
        System.out.println("1. " + lion);
        System.out.println("2. " + snake);
        System.out.println("3. " + monkey);
    }
}
