/**
 * Created by Sonny on 6/3/2017.
 */
public class Customer {
    public String name;
    public boolean happy = false;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isHappy() {
        return happy;
    }

    public void eatFood() {
        happy = true;
    }
}