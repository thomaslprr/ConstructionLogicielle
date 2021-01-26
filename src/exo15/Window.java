package exo15;

import java.util.Collection;
import java.util.HashSet;

public class Window {
	
	private Collection<Field> fields = new Reference<Field>(new HashSet<>(),true); 
	
	
	public  Collection<Field> getFields(){
		
		return this.fields;
	}
	

}
