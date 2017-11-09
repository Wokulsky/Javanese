import DataBase.Project;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        cfg.configure("Hibernate.cfg.xml");
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        Project project = (Project) applicationContext.getBean("project");
    }
}
