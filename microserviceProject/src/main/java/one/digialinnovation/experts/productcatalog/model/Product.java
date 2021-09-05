package one.digialinnovation.experts.productcatalog.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.Id;

@Getter
@Setter
@Document(indexName = "product", type = "catalog") // Representação da persinstênsia de dados através da classe Produto
public class Product {

    public Long getId() {
        return id;
    }

    @Id
    private Long id;
    private String name;
    private Integer amount;

}
