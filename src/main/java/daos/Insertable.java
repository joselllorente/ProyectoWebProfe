package daos;

import java.util.List;
import java.util.Map;

public interface Insertable <T> {
	String dato="Datos";
	
	public List<T> get();

	public T getByPK(long id);
	
	public List<T> get(Map<String, Object> datos);
	
	public void insert(T objeto);
	
}

