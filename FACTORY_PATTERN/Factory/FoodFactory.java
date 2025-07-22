package Factory;
import Products.Food;
import Products.Pizza;
import Products.Pasta;
import Products.Juice;

public class FoodFactory {
public Food getFood(String type)  // it's eturn type has to be Food, as it is returnng the objevt of fppd class itself
    {
        if(type.equals("pizza"))
        {
            return new Pizza();
        }
        else if(type.equals("pasta"))
        {
            return new Pasta();
        }
        else {
            return new Juice();
        }
    }
}
