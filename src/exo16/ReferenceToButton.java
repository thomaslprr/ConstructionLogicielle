package exo16;

public class ReferenceToButton {
	
	
	private Button button ;
	
	private Action owner ;
	
	public ReferenceToButton(Action owner) {
		this.owner = owner; 
	}
	
	
	public Button getButton() {
		
		return this.button;
	}
	
	public void setButton(Button b) {
		button.getAction().unSet();
		this.button = b;
		b.getAction().basicSetAction(owner);
			
	}
	
	public boolean isSet() {
		
		return button != null;
		
	}
	
	
	public void basicSetButton(Button b) {
		this.button = b;
	}
	
	
	public void unSet() {
		button = null;
	}
	
	

}
