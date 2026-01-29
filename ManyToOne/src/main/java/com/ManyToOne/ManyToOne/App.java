package com.ManyToOne.ManyToOne;



import org.hibernate.Session;
import org.hibernate.Transaction;



public class App {

    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setCustomerName("Mahesh");

        Order o1 = new Order();
        o1.setProductName("Laptop");
        o1.setPrice(65000);
        o1.setCustomer(customer);

        Order o2 = new Order();
        o2.setProductName("Mobile");
        o2.setPrice(25000);
        o2.setCustomer(customer);

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        session.persist(customer);
        session.persist(o1);
        session.persist(o2);

        tx.commit();
        session.close();

        System.out.println("Many-To-One Order–Customer data inserted!");
    }
}

