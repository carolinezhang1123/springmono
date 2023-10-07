package net.nvsoftware.ProductService.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductEntity {
    @Id //说明是id
    @GeneratedValue(strategy = GenerationType.AUTO) // 自动生成，按照一定的strategy
    private long id; // 因为连接了数据库，所以用数据库自动生成

    @Column(name="PRODUCT_NAME") //数据库里的名字和这里不一样
    private String name;
    private long price;
    private long quantity;
}
