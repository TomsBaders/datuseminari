package datastr;

public class MyNode<Ttype> {
	// Mainīgie.
	private Ttype element;
	private MyNode<Ttype> nextNode = null;
	private MyNode<Ttype> previousNode = null;
	
	// Konstruktors.
	public MyNode(Ttype inputElement) {
		setElement(inputElement);
	}
	
	// Get funkcijas.
	public Ttype getElement() {
		return element;
	}
	public MyNode<Ttype> getNextNode() {
		return nextNode;
	}
	public MyNode<Ttype> getPreviousNode() {
		return previousNode;
	}
	
	// Set funkcijas.
	public void setElement(Ttype inputElement) {
		this.element = inputElement;
	}
	public void setNextNode(MyNode<Ttype> inputNextNode) {
		this.nextNode = inputNextNode;
	}
	public void setPreviousNode(MyNode<Ttype> inputPreviousNode) {
		this.previousNode = inputPreviousNode;
	}
}
