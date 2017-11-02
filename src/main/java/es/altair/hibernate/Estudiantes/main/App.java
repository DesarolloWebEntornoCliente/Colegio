package es.altair.hibernate.Estudiantes.main;

import es.altair.hibernate.Estudiantes.bean.Clases;
import es.altair.hibernate.Estudiantes.bean.Estudiantes;
import es.altair.hibernate.Estudiantes.dao.EstudianteDAO;
import es.altair.hibernate.Estudiantes.dao.EstudiantesDAOImpl;

public class App 
{
    public static void main( String[] args )
    {
        EstudianteDAO estudDAO = new EstudiantesDAOImpl();
        
        Estudiantes e = new Estudiantes(2000, "Ray", "ap1", 47);
        
        Clases cl1 = new Clases(2001, "Informatica", "Desarollo Web", 120);
        Clases cl2 = new Clases(2002, "Administracion", "Adm c Marketing", 150);
        
        e.getClases().add(cl1);
        e.getClases().add(cl2);
        
        cl1.getEstudiantes().add(e);
        cl2.getEstudiantes().add(e);
        
        estudDAO.save(e);
        
        
        
    }
}
