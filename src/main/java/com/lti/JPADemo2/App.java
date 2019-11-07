package com.lti.JPADemo2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
    	
    	//creating obj of entity manager factory and mapping it with xml//
       EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA-PU");
       //creating obj of entity manager//
       EntityManager em=emf.createEntityManager();
       
       Student s1=new Student();
       s1.setSid(101);
       s1.setName("Madhuri");
       
       em.getTransaction().begin();
       em.persist(s1);
       
       em.getTransaction().commit();
       
       em.close();
       
       
       
       
    }
}

