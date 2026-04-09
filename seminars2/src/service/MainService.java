package service;

import datastr.MyLinkedList;

public class MainService {

	public static void main(String[] args) {
		MyLinkedList<Character> symbols = new MyLinkedList<Character>();
		
		try {
			System.out.println("-----PIEVIENOŠANA------");
			symbols.add('A'); // A
			symbols.add('B'); // A B
			symbols.add('C'); // A B C
			symbols.print(); // A B C
			symbols.add('Z'); // A B C Z
			symbols.print(); // A B C Z
			symbols.add('X', 0); // X A B C Z
			symbols.print(); // X A B C Z
			symbols.add('U', 5); // X A B C Z U
			symbols.print(); // X A B C Z U
			symbols.add('Q', 2); // X A Q B C Z U
			symbols.print(); // X A Q B C Z U
			System.out.println("-----DZĒŠANA------");
			symbols.remove(0); // A Q B C Z U
			symbols.print(); // A Q B C Z U
			symbols.remove(5); // A Q B C Z
			symbols.print(); // A Q B C Z
			symbols.remove(2); // A Q C Z
			symbols.print(); // A Q C Z
			System.out.println("-----IEGŪŠANA PĒC POZĪCIJAS------");
			System.out.println(symbols.get(1)); // Q
			System.out.println(symbols.get(3)); // Z
			System.out.println("-----MEKLĒŠANA------");
			System.out.println(symbols.search('A')); // 0
			symbols.add('Q'); // A Q C Z Q
			symbols.add('Q'); // A Q C Z Q Q
			System.out.println(symbols.search('Q')); // 1 4 5
			System.out.println("-----ATBRĪVOT SARAKSTU------");
			symbols.makeEmpty();
			symbols.add('E'); // E
			symbols.print(); // E
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
