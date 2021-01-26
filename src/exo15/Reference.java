package exo15;

import java.util.Collection;
import java.util.Iterator;

public class Reference<T> implements Collection<T>{
	
	private Collection<T> reference;
	
	private boolean estUnique;
	
	public Reference(Collection<T> liste, boolean estUnique) {
		this.reference = liste;
		this.estUnique = estUnique;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<T> iterator() {
		return this.reference.iterator();
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(T e) throws IllegalArgumentException{
		
		if(estUnique) {
			
			if(!this.reference.contains(e)) {
				return this.reference.add(e);
			}
			
			throw new IllegalArgumentException("La valeur est déjà présente et doit être unique.");
			
		}else {
			
			return this.reference.add(e);

		}
	}

	@Override
	public boolean remove(Object o) {
		return this.reference.remove(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends T> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
}
