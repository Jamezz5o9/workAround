package OOP;

public class Woman extends Human{
    private int muscles;
    private String nose;
    public Woman(){}

    public Woman(String name, String age, String height, String eyes, int muscles, String nose) {
        super(name, age, height, eyes);
        this.muscles = muscles;
        this.nose = nose;
    }

    @Override
    public void walk(){
        System.out.println("Woman can also walk");
    }

    @Override
    public void sleep(){
        System.out.println("Woman can sleep for a long period");
    }
}
