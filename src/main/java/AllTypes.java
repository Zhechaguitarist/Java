import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class AllTypes {
    public static void main(String[] args) {
        List<Animal> list3 = new ArrayList<>();
        Animal animal = new Animal();
        list3.add(new Animal(1));
        list3.add(new Cat(1));
        list3.add(new Cat(2));
        list3.add(new Cat(3));
        list3.add(new Dog(1));
        list3.add(new Dog(2));
        animal.showAnimals(list3);
    }
}
class Animal{
    int id;
    Animal(){

    }
    Animal(int id){
        this.id=id;
        System.out.println("Животное №"+id);
    }
    public void eat(){
        System.out.println("Animal is eating...");
    }
    public void showAnimals(List<? extends Animal> list){
        for (Animal animal :list){
            animal.eat();
        }
    }
}
class Cat extends Animal{
    Cat(int id){
        this.id=id;
        System.out.println("Кошка №"+id);
    }
    public void eat(){
        System.out.println("Cat is eating");
    }
}
class Dog extends Animal{
    Dog(int id){
        this.id=id;
        System.out.println("Собака №"+id);
    }
    public void eat(){
        System.out.println("Dog is eating");
    }
}
