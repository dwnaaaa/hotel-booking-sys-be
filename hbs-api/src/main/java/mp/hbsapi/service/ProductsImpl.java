package mp.hbsapi.service;

import lombok.RequiredArgsConstructor;
import mp.hbsapi.entity.Product;
import mp.hbsapi.repository.ProductsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductsImpl implements ProductsService {

    private final ProductsRepository productsRepository;

    @Override
    public List<Product> getAllProducts(){
        return productsRepository.getAllProducts();
    }
}
