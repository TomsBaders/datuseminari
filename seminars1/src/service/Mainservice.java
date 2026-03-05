package service;

import datastr.Myarraylist;

public class Mainservice {
	public static void main(String[] args) {
		Myarraylist symbols = new Myarraylist(3);
		
		symbols.add('a');
		symbols.add('b');
		symbols.add('c');
		symbols.add('d');
		
		try {
			symbols.output();
			symbols.indexadd(1, 'Z');
			symbols.output();
			symbols.indexdelete(2);
			symbols.output();
			System.out.println(symbols.getbyindex(1));
			System.out.println(symbols.getbyelement('Z'));
			System.out.println(symbols.nextelement('c'));
			System.out.println(symbols.amount());
			symbols.sort();
			symbols.output();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
