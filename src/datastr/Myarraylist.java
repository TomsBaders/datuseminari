package datastr;

public class Myarraylist {
	
	// Mainīgie.
	private char[] list;
	private int howManyElements = 0;
	private final int DEFAULT_SIZE = 8;
	private int size = DEFAULT_SIZE;
	
	// Konstruktori.
	public MyArrayList() {
		list = new char[size];
	}
	
	public MyArrayList(int inputSize) {
		if (inputSize > 0 && inputSize < 1000) {
			size = inputSize;
		}
		list = new char[size];
	}
	
	// Funkcijas.
	private boolean isEmpty() {
		// if piemērs 1: Garais pieraksts.
		if (howManyElements <= 0) {
			return true;
		} else {
			return false;
		}
		
		// if piemērs 2: Īsais if/else.
		/* 
		return (howManyElements <= 0) ? true : false; 
		*/
		
		// if piemērs 3: Ar atrgiezto vērtību.
		/*
		return (howManyElements <= 0);
		*/
	}
	
}
