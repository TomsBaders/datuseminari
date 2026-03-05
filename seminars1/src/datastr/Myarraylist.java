package datastr;

public class Myarraylist {
	// Mainīgie.
	private char[] list;
	private int howManyElements = 0;
	private final int DEFAULT_SIZE = 8;
	private int size = DEFAULT_SIZE;
		
	// Konstruktori.
	public Myarraylist() {
		list = new char[size];
	}
		
	public Myarraylist(int inputSize) {
		if (inputSize > 0 && inputSize < 1000) {
			size = inputSize;
		}
		list = new char[size];
	}
		
	// Funkcijas.
	private boolean isEmpty() {
		// if piemērs 1: Garais pieraksts.
		if (howManyElements < 1) {
			return true;
		} else {
			return false;
		}
	}
		
	private boolean isFull() {
		if (howManyElements >= size) {
			return true;
		} else {
			return false;
		}
	}
		
	private void resize() {
		int newSize = (howManyElements < 200) ? (size * 2) : (int)(size*1.5); 
		// !! Ja nav '(int)', kur palielina par 1.5 reizēm, tad būs double to int convert kļūda. !!
		char[] newList = new char[newSize];
		for (int i = 0; i < howManyElements; i++) {
			newList[i] = list[i];
		}
		list = newList;
		size = newSize;
	}
	
	public int amount() {
		return howManyElements;
	}
	
	public void add(char element) {
		// Parbaudes.
		if (isFull()) {
			resize();
		}
		
		// Darbibas.
		list[howManyElements] = element;
		howManyElements++;
	}
	
	public void indexadd(int index, char element) throws Exception {
		// Parbaudes.
		if (isFull()) {
			resize();
		}
		if (index < 0) {
			throw new IllegalArgumentException("Nav iespejams pievienot elementu, jo indekss ir negativs.");
		}
		if (index > howManyElements) {
			throw new IllegalArgumentException("Nav iespejams pievienot elementu, jo indekss ir par lielu.");
		}
		if (index == howManyElements) {
			add(element);
			return; // Ja nelieto return, tad izmanto else.
		}
		if (isEmpty()) {
			throw new Exception("Masivs ir tukss.");
		}
		
		// Darbibas.
		for (int i = howManyElements; i > index; i--) {
			list[i] = list[i-1];
		}
		list[index] = element;
		howManyElements++;
	}
	
	public void indexdelete(int index) throws Exception {
		// Parbaudes.
		if (index < 0) {
			throw new IllegalArgumentException("Nav iespejams pievienot elementu, jo indekss ir negativs.");
		}
		if (index > howManyElements) {
			throw new IllegalArgumentException("Nav iespejams pievienot elementu, jo indekss ir par lielu.");
		}
		if (isEmpty()) {
			throw new Exception("Masivs ir tukss.");
		}
		
		// Darbibas.
		for (int i = index; i > howManyElements; i++) {
			list[i] = list[i+1];
		}
		howManyElements--;
		list[howManyElements] = ' ';
	}
	
	public char getbyindex(int index) throws Exception {
		// Parbaudes.
		if (index < 0) {
			throw new IllegalArgumentException("Nav iespejams pievienot elementu, jo indekss ir negativs.");
		}
		if (index > howManyElements-1) {
			throw new IllegalArgumentException("Nav iespejams pievienot elementu, jo indekss ir par lielu.");
		}
		if (isEmpty()) {
			throw new Exception("Masivs ir tukss.");
		}
		
		// Darbiba.
		return list[index];
	}
	
	public int[] getbyelement(char element) throws Exception {
		// Parbaude.
		if (element == ' ') {
			throw new IllegalArgumentException("Nevar izvadit rezultatu, jo nav elements ievadits.");
		}
		if (isEmpty()) {
			throw new Exception("Masivs ir tukss.");
		}
		
		// Mainigie.
		int[] seciba = {};
		int value = 0;

		// Darbiba.
		for (int i = 0; i < howManyElements; i++) {
			if (list[i] == element) {
				seciba[value] = i+1;
				value += 1;
			}
		}
		return seciba;
	}
	
	public char[] nextelement(char element) throws Exception {
		// Parbaude.
		if (element == ' ') {
			throw new IllegalArgumentException("Nevar izvadit rezultatu, jo nav elements ievadits.");
		}
		if (isEmpty()) {
			throw new Exception("Masivs ir tukss.");
		}
		
		// Darbiba.
		char[] values = {};
		int order = 0;
		
		for (int i = 0; i < howManyElements-2; i++) {
			if (list[i] == element) {
				values[order] = list[i+1];
				order += 1;
			}
		}
		return values;
	}
	
	public void sort() throws Exception {
		// Parbaude.
		if (isEmpty()) {
			throw new Exception("Masivs ir tukss.");
		}
		if (howManyElements <= 1) {
			throw new IllegalArgumentException("Nav iespejams kartot masivu, jo ir par maz elementu.");
		}
		
		// Darbiba.
		for (int i = 0; i < howManyElements; i++) {
			for (int j = 0; j < howManyElements; i++) {
				if (list[i] > list[j]) {
					char temp = list[i];
					list[i] = list[j];
					list[j] = temp;
				}
			}
		}
	}
	
	public void output() throws Exception {
		// Parbaude.
		if (isEmpty()) {
			throw new Exception("Masivs ir tukss.");
		}
		
		// Darbiba.
		for (int i = 0; i < howManyElements; i++) {
			System.out.print(list[i] + " ");
		}
		System.out.println();
	}
	
	public void empty() throws Exception {
		// Parbaude.
		if (isEmpty()) {
			throw new Exception("Masivs jau ir tukss.");
		}
		
		// Darbiba.
		list = null; // Atkabina referenci no datiem un zaude datus.
		System.gc();
		howManyElements = 0;
		size = DEFAULT_SIZE;
		list = new char[size];
	}
}
