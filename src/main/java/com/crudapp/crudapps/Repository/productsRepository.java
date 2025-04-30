package com.crudapp.crudapps.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudapp.crudapps.model.Products;

public interface productsRepository extends JpaRepository<Products,Integer>  {

}
