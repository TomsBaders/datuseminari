package service;

import datastr.MyBST;
import model.Patient;

public class MainService {
	public static void main(String[] args) {
		System.out.println("-----------INT------------");
		MyBST<Integer> bstForIntegers = new MyBST<Integer>();

		try {
			bstForIntegers.add(10);//P: 10
			bstForIntegers.add(6);//P: 10 (LC:6)
			bstForIntegers.add(23);//P: 10 (LC:6, RC:23)
			bstForIntegers.add(8);//P: 10 (LC:6, RC:23); P:6 (RC:8)
			bstForIntegers.add(7);//P: 10 (LC:6, RC:23); P:6 (RC:8); P: (LC:7)
			bstForIntegers.print();
			System.out.println("Vai ir 7: "+ bstForIntegers.search(7));//true
			System.out.println("Vai ir 23: "+ bstForIntegers.search(23));//true
			System.out.println("Vai ir 17: "+ bstForIntegers.search(17));//false
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("-----------PATIENTS------------");
		
		MyBST<Patient> bstPatients = new MyBST<Patient>();
		
		
		try {
			bstPatients.add(new Patient("Jānis", "Bērziņs", 4));
			bstPatients.add(new Patient("Līga", "Jaukā", 2)); 
			bstPatients.add(new Patient("Baiba", "Kalniņa", 3));
			bstPatients.add(new Patient("Juris", "Nejaukais", 5));
			bstPatients.print();
			//TODO patestēt meklēšanu arī ar pacientiem
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}