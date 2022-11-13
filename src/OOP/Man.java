package OOP;

public class Man extends  Human{
    private int muscles;
    private int height;
    public Man(){}

    public Man(String name, String age, String height, String eyes, int muscles, int height1) {
        super(name, age, height, eyes);
        this.muscles = muscles;
        this.height = height1;
    }

    @Override
    public void walk(){
        System.out.println("man love walking");
    }

    @Override
    public void sleep(){
        System.out.println("man love sleeping");
    }


}
