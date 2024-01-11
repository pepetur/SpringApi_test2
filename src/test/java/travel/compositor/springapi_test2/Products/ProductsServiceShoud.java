package travel.compositor.springapi_test2.Products;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import travel.compositor.springapi_test2.Exceptions.Products.BadRequest;
import travel.compositor.springapi_test2.Models.Product;
import travel.compositor.springapi_test2.Repositories.ProductsRepository;
import travel.compositor.springapi_test2.Services.ProductsService;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

public class ProductsServiceShoud {

    @Test
    public void GetNonValidShoudReturnError() {
        try {
            Product repositoryResponse = new Product(1, "Test", 1);

            ProductsRepository productRepositoryMocked = mock(ProductsRepository.class);
            when(productRepositoryMocked.GetProduct(anyInt()))
                    .thenReturn(repositoryResponse);

            ProductsService service = new ProductsService(productRepositoryMocked);

            Product actualResult = service.GetProduct(-1);
        } catch (Exception ex) {
            Assertions.assertTrue(ex instanceof BadRequest);
        }
    }

    @Test
    public void GetProductShoud() throws Exception{
        try {
            Product repositoryResponse = new Product(1, "Test", 1);

            ProductsRepository productRepositoryMocked = mock(ProductsRepository.class);
//            when(productRepositoryMocked.GetProduct(anyInt()))
//                    .doReturn (repositoryResponse);

            doReturn(repositoryResponse).when(productRepositoryMocked).GetProduct(anyInt());

            ProductsService service = new ProductsService(productRepositoryMocked);

            Product actualResult = service.GetProduct(1);
            Assertions.assertTrue(repositoryResponse == actualResult);
        } catch (Exception ex) {
            assert (false);
        }
    }
}
