package exo16;

public class Action {
	
	private ReferenceToButton button;
	
	public Action(Action a) {
		button = new ReferenceToButton(a);
	}

	public ReferenceToButton getButton() {
		return button;
	}


}
