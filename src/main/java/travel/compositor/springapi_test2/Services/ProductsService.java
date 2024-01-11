package travel.compositor.springapi_test2.Services;

import org.springframework.beans.factory.annotation.Autowired;
import travel.compositor.springapi_test2.Exceptions.Products.BadRequest;
import travel.compositor.springapi_test2.Models.Product;
import org.springframework.stereotype.Service;
import travel.compositor.springapi_test2.Repositories.ProductsRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductsService {

    private ProductsRepository _productsRepository;

    @Autowired
    public ProductsService(ProductsRepository productsRepository) {
        this._productsRepository = productsRepository;
    }

    public Product GetProduct(int id) throws Exception{
        if (id < 0)
            throw new BadRequest();

        return _productsRepository.GetProduct(id);
    }

    public List<Product> GetAllProducts() {
        return new ArrayList<>(); //TODO: do the method
    }

    public void AddProduct(Product product) {
        //TODO: do the method
    }
}
