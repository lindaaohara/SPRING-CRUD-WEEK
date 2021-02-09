package ohara.linda.springbootcrudhibernateexample.repository;

import ohara.linda.springbootcrudhibernateexample.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
