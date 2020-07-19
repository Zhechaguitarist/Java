public class Human {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //Name, setters & getters

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //age, setters & getters

    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    //weight, setters & getters

    private void eat(){
        System.out.println("I am eating");
    }
    private void sleep(){
        System.out.println("I am sleeping");
    }
}
