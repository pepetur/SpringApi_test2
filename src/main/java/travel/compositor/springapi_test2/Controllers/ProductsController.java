package travel.compositor.springapi_test2.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import travel.compositor.springapi_test2.Exceptions.Products.BadRequest;
import travel.compositor.springapi_test2.Models.Product;
import travel.compositor.springapi_test2.Services.ProductsService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
public class ProductsController {
    private ProductsService _productsService;

    @Autowired
    public ProductsController(ProductsService productsService){
        this._productsService = productsService;
    }

    @GetMapping("/product")
    public ResponseEntity<Product> GetProduct(@RequestParam int id) {
        try {
            Product response = _productsService.GetProduct(id);
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (BadRequest ex) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        } catch (Exception ex) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("products")
    public ResponseEntity<List<Product>> GetAllProducts() {
        try {
            List<Product> response = _productsService.GetAllProducts();
            return new ResponseEntity<>(response, HttpStatus.OK);
        }  catch (Exception ex) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //@PostMapping("/addProduct", produces = MediaType.APPLICATION_JSON_VALUE)
    @PostMapping("/addProduct")
    public ResponseEntity<Boolean> AddProduct(@RequestBody Product product){
        try {
            _productsService.AddProduct(product);
            return new ResponseEntity<>(true, HttpStatus.OK);
        }  catch (Exception ex) {
            return new ResponseEntity<>(false, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
