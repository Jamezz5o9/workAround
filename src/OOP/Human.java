package OOP;

public class Human {
    private String name;
    private String age;
    private String height;
    private String eyes;

    public Human(){}

    public Human(String name, String age, String height, String eyes) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.eyes = eyes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getEyes() {
        return eyes;
    }

    public void setEyes(String eyes) {
        this.eyes = eyes;
    }

    public void walk(){
        System.out.println("Human class can walk anytime of the day");
    }

    public void sleep(){
        System.out.println("Human class loves sleeping");
    }

}
