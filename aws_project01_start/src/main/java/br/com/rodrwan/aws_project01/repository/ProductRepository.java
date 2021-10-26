package br.com.rodrwan.aws_project01.repository;
import org.springframework.data.repository.CrudRepository;
import br.com.rodrwan.aws_project01.model.Product;
import java.util.Optional;

public interface ProductRepository extends CrudRepository<Product, Long>{
    Optional<Product> findByCode(String code);
}
