package io.codeforall.fanstatics.ManyToOneMapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {

        // Use the test persistence unit to configure a new
        // entity manager factory and start up JPA
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");

        // Open a new database connection by getting a new
        // entity manager from the entity manager factory
        EntityManager em = emf.createEntityManager();

        Product product = new Product();
        product.setId(1);
        product.setName("Orange");

        Category category = new Category();
        category.setId(2);
        category.setName("Fruit");
        product.setCategory(category);

        em.getTransaction().begin();
        em.persist(product);
        em.persist(category);
        em.getTransaction().commit();

        em.close();

        emf.close();

    }
}
