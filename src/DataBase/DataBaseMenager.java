package DataBase;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;

/**
 * Created by Karol on 10.11.2017.
 */
public class DataBaseMenager {

    private Configuration configuration;
    private ApplicationContext applicationContext;
    private SessionFactory sessionFactory;
    private Session session;
    private Transaction transaction;
    private static DataBaseMenager instance = null;

    private DataBaseMenager(){
        configuration = new Configuration();
        configuration.configure("Hibernate.cfg.xml");
        sessionFactory = configuration.buildSessionFactory();
        session = sessionFactory.openSession();
        transaction = session.beginTransaction();
    }

    public DataBaseMenager getInstance(){
        if (instance == null) instance = new DataBaseMenager();
        return instance;
    }

    public boolean changeConfiguration(String resource){
        try{
            configuration.configure(resource);
            return true;
        }catch (Exception e){ return false;}
    }

    public void saveToDataBase(Object object){
        session.save(object);
        session.flush();
        transaction.commit();
        session.close();
    }

}
