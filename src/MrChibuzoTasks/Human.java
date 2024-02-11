package MrChibuzoTasks;

public class Human {

    private String name;
    private Double height;
    private int age;

    public Human(String name, Double height, int age ){
        this.name = name;
        this.height = height;
        this.age = age;

    }
    public Human() {

    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public int getAge(){
        return age;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getHeight(){
        return height;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
