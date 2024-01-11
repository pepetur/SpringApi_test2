package travel.compositor.springapi_test2.Models;

public class Product {
    private int Id;
    private String Name;
    private int Price;

    public Product(int id, String name, int price) {
        Id = id;
        Name = name;
        Price = price;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public int getPrice() {
        return Price;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setPrice(int price) {
        Price = price;
    }
}
