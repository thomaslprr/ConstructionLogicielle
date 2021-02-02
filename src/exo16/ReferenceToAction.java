package exo16;

public class ReferenceToAction {
	
	private Action action ;
	
	private Button owner;
	
	public ReferenceToAction(Button owner) {
		this.owner = owner; 
	}
	
	public Action getAction() {
		
		return this.action;
	}
	
	public void setAction(Action a) {
			action.getButton().unSet();
			this.action = a;
			a.getButton().basicSetButton(owner);
		
	}
	
	public void basicSetAction(Action a) {
		this.action = a;
	}
	
	public boolean isSet() {
		return action != null;
	}
	
	public void unSet() {
		this.action = null;
	}

}
