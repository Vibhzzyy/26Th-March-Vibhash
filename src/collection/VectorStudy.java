package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorStudy {

	public static void main(String[] args) 
	{
		Vector V=new Vector();
		
		V.add("Vibhash");
		V.add(null);
		V.add('H');
		V.add(null);
		V.add("Virtus");
		V.add("Vibhash");
		V.add(007);
		V.add(0.15);
		V.add(true);
		V.add("TheBest");
		
		System.out.println(V);
		System.out.println(V.size());
		System.out.println(V.elementAt(2));
		System.out.println(V.get(5));
		System.out.println(V.capacity());
		
		System.out.println("======================");
		
		// While loop
		// For each
		// List iterator
		// Iterator
		
		ListIterator LT = V.listIterator();
		
		while (LT.hasNext())
		{
			System.out.println(LT.next());
		}
		
		System.out.println("======================");
		
		for (Object L:V)
		{
			System.out.println(L);
		}
		
		System.out.println("======================");
		
		Iterator I = V.iterator();
		
		while (I.hasNext())
		{
			System.out.println(I.next());
		}
		
		System.out.println("======================");
		
		Enumeration VE = V.elements();
		
		while (VE.hasMoreElements())
		{
			System.out.println(VE.nextElement());
		}
		
		
		

	}

}
