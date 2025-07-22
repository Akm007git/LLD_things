import Products.*;
import Factory.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("main method is getting called");
        // creating an object of factory class
        FoodFactory obj1 = new FoodFactory();
        Food foodObj = obj1.getFood("juice"); // storing the this method in a interface type, as the return type id interface type
        foodObj.prepare();
    }
}
