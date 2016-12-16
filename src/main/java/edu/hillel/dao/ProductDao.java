package edu.hillel.dao;

import edu.hillel.entity.Product;

import javax.persistence.EntityManager;

/**
 * Created by HillelNew8 on 16.12.2016.
 */
public class ProductDao {

    private EntityManager manager;

    public ProductDao(EntityManager manager){
        this.manager = manager;
    }

    public void insert(Product product){
        manager.getTransaction().begin();
        manager.persist(product);
        manager.getTransaction().commit();
    }
    public void update(Product product){
        manager.getTransaction().begin();
        manager.merge(product);
        manager.getTransaction().commit();
    }

    public void delete(Product product){
        manager.getTransaction().begin();
        manager.remove(product);
        manager.getTransaction().commit();
    }

    public Product get(int id){
        return manager.find(Product.class, id);
    }
}
