package collection;

import java.util.LinkedList;

public class LinkedListStudy {

	public static void main(String[] args) 
	{
		
		LinkedList LL= new LinkedList();
		
		
	    LL.add("Vibhash");
		LL.add(null);
		LL.add('H');
		LL.add(null);
		LL.add("Virtus");
		LL.add("Vibhash");
		LL.add(007);
		LL.add(0.15);
		LL.add(true);
		LL.add("TheBest");
		
		System.out.println(LL);
		System.out.println(LL.size());
		System.out.println(LL.contains('H'));
		System.out.println(LL.remove(3));
		System.out.println(LL.getFirst());
		System.out.println(LL.size());
		
		System.out.println("=====================");
		
		for (Object F:LL)
		{
			System.out.println(F);
		}
		
		
		
		
		
		
		
		

	}

}
