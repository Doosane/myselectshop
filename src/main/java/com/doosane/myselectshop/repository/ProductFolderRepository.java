package com.doosane.myselectshop.repository;

import com.doosane.myselectshop.entity.Folder;
import com.doosane.myselectshop.entity.Product;
import com.doosane.myselectshop.entity.ProductFolder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductFolderRepository extends JpaRepository<ProductFolder, Long> {
    Optional<ProductFolder> findByProductAndFolder(Product product, Folder folder);

}
