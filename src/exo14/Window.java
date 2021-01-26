package exo14;

import java.util.Collection;
import java.util.HashSet;

public class Window {
	
	private Collection<Field> fields = new ReferenceToFields(new HashSet<Field>()); 
	
	
	public  Collection<Field> getFields(){
		
		return this.fields;
	}
	

}
