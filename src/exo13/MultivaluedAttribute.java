package exo13;

import java.util.List;

public class MultivaluedAttribute<T> {

	  private final List<T> values;
	  private final int maxSize; 

	    public MultivaluedAttribute(List<T> l, int maxSize) {
	    	if(maxSize<=0) {
	    		throw new IndexOutOfBoundsException("La taille maximum ne peut être inférieure ou égale à 0");
	    	}
	        this.values = l;
	        this.maxSize = maxSize;
	    }

	    public boolean add(T t) throws Exception {

	    	if(values.size()>=maxSize) {
				throw new IndexOutOfBoundsException("Limite de la liste atteinte ! Elle ne peut dépasser : "+maxSize);
	    	}
	    	
	        return this.values.add(t);

	    }

	    public boolean remove(T t) {
	        return this.values.remove(t);
	    }

	
}
