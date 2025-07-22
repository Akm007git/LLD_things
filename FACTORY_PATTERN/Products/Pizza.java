package Products;

public class Pizza implements Food{
    @Override
    public void prepare()
    {
        System.out.println("preparing pizza");
    }
}

