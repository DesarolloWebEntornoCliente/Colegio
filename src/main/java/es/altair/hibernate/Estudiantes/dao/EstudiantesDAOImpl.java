package es.altair.hibernate.Estudiantes.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import es.altair.hibernate.Estudiantes.bean.Estudiantes;

public class EstudiantesDAOImpl implements EstudianteDAO {

	public void save(Estudiantes e) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session sesion = sf.openSession();
		
		try {
			sesion.beginTransaction();
			sesion.save(e);
			sesion.getTransaction().commit();
		}catch (Exception err) {
			err.printStackTrace();
		} 
		finally {
			sesion.close();
			sf.close();
		}

	}

}
