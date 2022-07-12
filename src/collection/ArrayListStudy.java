package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;



public class ArrayListStudy {

	public static void main(String[] args) 
	{
		ArrayList<Object> Z= new ArrayList<>();
		
		Z.add("Vibhash");
		Z.add('V');
		Z.add("Strettaa");
		Z.add(7);
		Z.add("Greatest of all");
		Z.add(null);
		Z.add(99.00);
		Z.add("Problem");
		Z.add(null);
		Z.add('N');
		
		System.out.println(Z);
		System.out.println("========================");
		System.out.println(Z.size());
		System.out.println(Z.indexOf(7));
		System.out.println(Z.set(4, 'N'));
		System.out.println(Z.isEmpty());
		System.out.println(Z.contains("Strettaa"));
		System.out.println(Z.remove(6));
		System.out.println(Z.lastIndexOf('N'));
		System.out.println(Z);
		
		for(int I=0; I<Z.size()-1;I++)
		{
			System.out.println(Z.get(I));
		}
		
		System.out.println("=========================");
		
		// Now we are going to use Iterator by using while method
		
		 Iterator<Object> IT = Z.iterator();
		
		while (IT.hasNext())
		{
			System.out.println(IT.next());
		}
		
		System.out.println("=========================");
		
		// Using list iterator by using while method
		
		ListIterator<Object> LIT = Z.listIterator();
		
		while (LIT.hasNext())
		{
			System.out.println(LIT.next());
		}
		
		System.out.println("=========================");
		
		//By using For loop
		
		for(Object A:Z)
		{
	      System.out.println(A);
		}
		
		
		// Now we are using Arraylist (integer)
		
		ArrayList<Integer>AB=new ArrayList<>();
		
		AB.add(10);
		AB.add(15);
		AB.add(20);
		AB.add(25);
		AB.add(30);
		
		System.out.println(AB);
		
		for(Integer S:AB)
		{
			System.out.println(S);
		}
		
		ArrayList<Character> DC=new ArrayList<>();
		
		DC.add('A');
		DC.add('D');
		DC.add('H');
		DC.add('D');
		
		System.out.println(DC);
		
		for(Character C:DC)
		{
			System.out.println(C);
		}
		
		

	}

}
