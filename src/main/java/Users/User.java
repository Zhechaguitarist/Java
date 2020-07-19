package Users;

import java.util.ArrayList;
import java.util.List;

public class User {

    private static int counter;

    List<User> arrayOfUsers = new ArrayList<>();

    private int id;
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    private int countId;

    private  String name = "unknown";
    public void setName(String name) {
        name = name;
    }
    public String getName() {
        return name;
    }

    private  String gender = "unknown";
    public void setGender(String gender) {
        gender = gender;
    }
    public String getGender() {
        return gender;
    }

    public User(){
        id = counter;
        this.name = name + counter;
        counter++;
    }

    public User(int id){
        this.id = id;
    }

    public User( String name){
        //this.id = id;
        this.name = name + counter;
        id = counter;
        counter++;
    }

    public User( String name, String gender){
        //this.id = id;
        this.name = name;
        this.gender = gender;
        id = counter;
        counter++;
    }

}
