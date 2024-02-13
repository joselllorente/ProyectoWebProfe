import java.util.ArrayList;
import java.util.List;

import entities.muebles.Mesa;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pojos.Alumno;
import utils.JpaUtils;

public class TestDB {

	public static void main(String[] args) {
		
		//EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernateOracle");
		EntityManager em = JpaUtils.getEntityManager();
		EntityManager em2 = JpaUtils.getEntityManager();
		
		List<Mesa> datos = new ArrayList();
		datos.add(new Mesa("",0.0,""));
		//datos.add(new Alumno("","","",null));
		
		for (Mesa mesa : datos) {
			mesa.getEstilo();
		}
		
//		for (Object object : datos) {
//			if(object instanceof Mesa) {
//				((Mesa)object).getEstilo();
//			}
//		}
	}

}
