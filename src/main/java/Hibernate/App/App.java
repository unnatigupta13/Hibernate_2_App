package Hibernate.App;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import Hibernate.entity.Doctor;

public class App {

	public static void main(String[] args) {
		Doctor saumya= new Doctor(101,"Dr.Saumya Gupta","Dentist");
		Configuration conf=new Configuration().configure();
		SessionFactory sf = conf.buildSessionFactory();
		Session session =sf.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(saumya);
		tx.commit();
		System.out.println("Object perist successfully");
		
		
		
	}

}
