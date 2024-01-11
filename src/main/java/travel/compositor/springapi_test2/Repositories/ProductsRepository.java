package travel.compositor.springapi_test2.Repositories;

import org.springframework.stereotype.Component;
import travel.compositor.springapi_test2.Models.Product;

import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

@Component
public class ProductsRepository {

    public Product GetProduct(int id) {
//        Connection conn = DriverManager.getConnection("DATABASE_URL");
//        Statement statement = conn.createStatement();
//        ResultSet rs= statement.executeQuery("SELECT * FROM PRODUCTS WHERE PRICE < 1");
//        List<String> products = new ArrayList<String>();
//        whie (rs.next()) {
//            products.add(rs.getString("Name"));
//        }

        return new Product(0, "", 0); //TODO: do the method
    }
}
