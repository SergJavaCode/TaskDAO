package ru.sergjava.dao.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class ProductRepositoryImpl implements ProductRepository {
    private SessionFactory sessionFactory;
    private String sqlScript;

    public ProductRepositoryImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<String> getProductForName(String name) {

        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("select productName from Orders as orders\n" +
                            "\tjoin orders.customer as customer" +
                            "\twhere lower(customer.name)  = lower(:name)"
                    , String.class).setParameter("name", name).getResultList();
        }
    }

}
