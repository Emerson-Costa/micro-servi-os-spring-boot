package one.digialinnovation.experts.productcatalog.controller;

import one.digialinnovation.experts.productcatalog.model.Product;
import one.digialinnovation.experts.productcatalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/product") // Rota
public class ProductController {

    @Autowired // Busca a instância para injetar a dependência
    private ProductRepository productRepository;


    @RequestMapping(method = RequestMethod.POST) // Tipo de requisição
    Product create(@RequestBody Product product){
        return productRepository.save(product);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Optional<Product> findByid(@PathVariable Integer id){
        return productRepository.findById(id);
    }

}
