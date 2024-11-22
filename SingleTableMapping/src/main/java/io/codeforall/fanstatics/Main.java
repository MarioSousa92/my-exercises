package io.codeforall.fanstatics;

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
        car.setColour("red");
        car.setGears(6);

        Bicycle bicycle = new Bicycle();
        bicycle.setColour("blue");
        bicycle.setPedals(2);

        em.getTransaction().begin();
        em.persist(car);
        em.persist(bicycle);
        em.getTransaction().commit();

        em.close();

        emf.close();
    }
}
