package daos;

public interface Updatable<T> extends Insertable<T> {

	public void update(T objeto);
	
	public void delete(T objeto);
	
}
