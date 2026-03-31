package service;

import datastr.MyLinkedList;

public class MainService {
	public static void main(String[] args) {
		MyLinkedList<Character> symbols = new MyLinkedList<Character>();
		
		try {
			symbols.add('A');
			symbols.add('B');
			symbols.add('C');
			symbols.print();
			symbols.add('Z');
			symbols.print();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
