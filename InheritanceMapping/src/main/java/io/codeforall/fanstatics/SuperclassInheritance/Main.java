package io.codeforall.fanstatics.SuperclassInheritance;

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

        Teacher teacher = new Teacher();
        teacher.setName("Gustavo");
        teacher.setAge(29);

        Student student = new Student();
        student.setName("Mario");
        student.setAge(32);

        em.getTransaction().begin();
        em.persist(teacher);
        em.persist(student);
        em.getTransaction().commit();

        // Close the database connection
        em.close();

        // Shutdown JPA
        emf.close();

    }
}
