package Products;

public class Juice implements Food{
    @Override
    public void prepare()
    {
        System.out.println("Preparing juice");
    }
}
