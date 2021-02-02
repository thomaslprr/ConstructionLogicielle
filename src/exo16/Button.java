package exo16;

public class Button {
	
	private ReferenceToAction action;
	
	public Button(Button b) {
		action = new ReferenceToAction(b);
	}

	public ReferenceToAction getAction() {
		return action;
	}

}
