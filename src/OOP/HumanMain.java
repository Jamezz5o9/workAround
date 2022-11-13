package OOP;

public class HumanMain {
    public static void main(String[] args) {
        Human human = new Human();
        human.sleep();
        Human human2 = new Man();
        human2.sleep();
        Human human3 = new Woman();
        human3.sleep();
        Woman woman2 = (Woman) human;
        woman2.sleep();




    }
}
