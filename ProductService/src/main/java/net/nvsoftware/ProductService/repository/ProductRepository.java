package net.nvsoftware.ProductService.repository;

import net.nvsoftware.ProductService.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
    // <Entity，KEY的数据类型>
}
