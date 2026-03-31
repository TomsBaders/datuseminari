package datastr;

public class MyLinkedList<Ttype> {
	// Mainīgie.
	private MyNode<Ttype> firstNode = null;
	private MyNode<Ttype> lastNode = null;
	private int howManyElements = 0;
	
	// Konstruktors. (Tikai bezargumenta.)
	public MyLinkedList() {}
	
	// Get funkcija. (Tikai howManyElements vērtībai un set funkcijas nav nevienam mainīgajam.)
	public int getHowManyElements() {
		return howManyElements;
	}
	
	// Citas funkcijas.
	public boolean isEmpty() {
		return (howManyElements == 0);
	}
	
	public boolean isFull() {
		try
		{
			new MyNode<Character>('A');
			return false;
		} catch (OutOfMemoryError e) {
			return true;
		}
	}
	
	public void add(Ttype element) throws Exception {
		// Pārbaudes.
		if(isFull()) {
			throw new Exception("Saraksts ir pilns un nevar pievienot elementu.");
		}
		if (element == null) {
			throw new Exception("Dotais elements nav norādīts.");
		}
		
		// Ja saraksts ir tukšs tad incializē pirmo un pēdējo elementu, citādāk tikai pēdējo.
		if (isEmpty()) {
			MyNode<Ttype> newNode = new MyNode<Ttype>(element);
			
			lastNode = newNode;
			firstNode = newNode;
			howManyElements++;
		} else {
			MyNode<Ttype> newNode = new MyNode<Ttype>(element);
			
			lastNode.setNextNode(newNode);
			newNode.setPreviousNode(lastNode);
			
			lastNode = newNode;
			howManyElements++;
		}
	}
	
	public void print() throws Exception {
		if (isEmpty()) {
			throw new Exception("Saraksts ir tukšs un nevar neko izvadīt.");
		}
		
		MyNode<Ttype> currentNode = firstNode;
		
		while (currentNode != null) {
			System.out.print(currentNode.getElement() + " ");
			currentNode = currentNode.getNextNode();
		}
		
		System.out.println();
	}
	
	public void add2(Ttype element, int position) throws Exception {
		// Pārbaudes.
		if(isFull()) {
			throw new Exception("Saraksts ir pilns un nevar pievienot elementu.");
		}
		if (isEmpty()) {
			throw new Exception("Saraksts ir tukšs un nevar neko izvadīt.");
		}
		if (element == null) {
			throw new Exception("Dotais elements nav norādīts.");
		}
		
		
	}
}
