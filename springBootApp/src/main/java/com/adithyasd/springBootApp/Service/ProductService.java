package com.adithyasd.springBootApp.Service;

import com.adithyasd.springBootApp.Model.Product;
import com.adithyasd.springBootApp.Repository.ProductRepo;
import org.hibernate.engine.jdbc.Size;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;
//get
    public List<Product> getProducts() {
        return repo.findAll();
    }

    public Product getProductById(int prodId) {
        return repo.findById(prodId)
                .orElse(new Product(0,"No Item",0));
    }
//put
    public void addProduct(Product prod) {
        repo.save(prod);
    }
//post
    public void updateProduct(Product prod) {
        repo.save(prod);
    }
//delete
    public void deleteProduct(int prodId) {
        repo.deleteById(prodId);
    }
}


//@Service
//public class ProductService {
//
//    @Autowired
//    ProductRepo repo;
//
//   List<Product> products = new ArrayList<>(Arrays.asList(
//           new Product(101, "Iphone", 50000),
//           new Product(102, "Canon Camera", 70000),
//           new Product(103, "Shure Mic", 10000)));
//
////   get mapping return all the products
//    public List<Product> getProducts() {
//        return products;
////        return repo.findAll();
//    }
//
////    get mapping returns the single product matching the prod_id
//    public Product getProductById(int prodId) {
//        return products.stream()
//                .filter(p->p.getProdId()==prodId)
//                .findFirst().orElse(new Product(0,"No Item",0));
////        return repo.findById(prodId).orElse(new Product());
//    }
//
////    post mapping means add the products
//    public void addProduct(Product prod) {
//        products.add(prod);
////        repo.save(prod);
//    }
////put mapping to update the List or db
//    public void updateProduct(Product prod) {
//        int index=0;
//        for(int i=0;i< products.size();i++)
//        {
//            if(products.get(i).getProdId() == prod.getProdId()){
//                index=i;
//            }
//        }
//        products.set(index,prod);
////        repo.save(prod);
//    }
////Delete mapping for removing elements from db
//    public void deleteProduct(int prodId) {
//        int index=0;
//        for(int i=0;i< products.size();i++)
//        {
//            if(products.get(i).getProdId() == prodId){
//                index=i;
//            }
//        }
//        products.remove(index);
////        repo.deleteById(prodId);
//
//    }
//}
