package mp.hbsapi.controller;

import lombok.RequiredArgsConstructor;
import mp.hbsapi.entity.Product;
import mp.hbsapi.service.ProductsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductsController {

    private final ProductsService productsService;

    @GetMapping(path = "/all")
    public ResponseEntity<List<Product>> getAllProducts(){
        return new ResponseEntity<>(productsService.getAllProducts(), HttpStatus.OK);
    }
}
