package utils;

import com.adil.entities.*;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * Created by Adil on 3/19/2017.
 */
public class HibernateUtil {
    private static SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(Address.class);
        configuration.addAnnotatedClass(Customer.class);
        configuration.addAnnotatedClass(Employee.class);
        configuration.addAnnotatedClass(Invoice.class);
        configuration.addAnnotatedClass(InvoiceLine.class);
        configuration.addAnnotatedClass(Order.class);
        configuration.addAnnotatedClass(OrderLine.class);
        configuration.addAnnotatedClass(Payment.class);
        configuration.addAnnotatedClass(Product.class);
        configuration.addAnnotatedClass(Shipper.class);
        configuration.addAnnotatedClass(Supplier.class);
        return configuration.buildSessionFactory(new StandardServiceRegistryBuilder().build());
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
