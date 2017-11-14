import DataBase.DataBaseMenager;
import DataBase.Project;
import org.joda.time.LocalDate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        //DataBaseMenager dataBaseMenager = DataBaseMenager.getInstance();
        Project project = (Project) applicationContext.getBean("project");
        project.setId(2);
        project.setDescritpion("New secound project");
        project.setName("New2");
        project.setEnd(LocalDate.now());
        project.setEnd(LocalDate.now());
        project.setBudget(23.1f);
        project.setCost(21.1f);
        System.out.println(project);
    }
}
