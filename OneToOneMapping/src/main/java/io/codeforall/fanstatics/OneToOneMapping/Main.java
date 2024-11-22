package io.codeforall.fanstatics.OneToOneMapping;

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

        Car car = new Car();
        car.setId(1);
        car.setBrand("Volkswagen");
        car.setModel("ID4");

        Owner owner = new Owner();
        owner.setId(2);
        owner.setName("Mario");

        em.getTransaction().begin();
        em.persist(car);
        em.persist(owner);
        em.getTransaction().commit();

        em.close();

        emf.close();
    }
}
