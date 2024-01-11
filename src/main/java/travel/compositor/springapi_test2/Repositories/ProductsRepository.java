package travel.compositor.springapi_test2.Repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.stereotype.Component;
import travel.compositor.springapi_test2.Models.Product;

import java.sql.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Properties;

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

    public List<Product> AllProducts() {
        try {
            String Url = "jdbc:sqlserver://;servername=DESKTOP-S2M6U20:3306;databaseName=SpringTest;integratedSecurity=true";
            Connection conn = DriverManager.getConnection(Url);
            Statement statement = conn.createStatement();

            ResultSet rs= statement.executeQuery("SELECT * FROM Product WHERE PRICE < 1");
            List<String> products = new ArrayList<String>();
            while (rs.next()) {
                products.add(rs.getString("Name"));
            }

        } catch (Exception ex) {
            String a = ex.getMessage();
        }
        return new ArrayList<>();
    }
}
