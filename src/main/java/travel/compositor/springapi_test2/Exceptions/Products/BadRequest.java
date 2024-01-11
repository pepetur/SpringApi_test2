package travel.compositor.springapi_test2.Exceptions.Products;

public class BadRequest extends Exception {
    private static String Message = "The product request is bad formed.";

    public BadRequest() {
        super(Message);
    }
}
