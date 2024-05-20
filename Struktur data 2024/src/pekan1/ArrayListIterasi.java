package pekan1;

import java.util.ArrayList;

public class ArrayListIterasi {
	public static void main (String []Args) {
		//creating an ArrayList of String type
		ArrayList<String> al = new ArrayList <>();
		
		//adding element to ArrayList 
		//using standart add()method
		al.add("saya");
		al.add("informatika");
		al.add(1, "mahasiswa");
		
		//using the Get method and the 
		//for loop
		for (int i=0; i< al.size(); i++) {
			System.out.println(al.get(i) + " ");
		}
		System.out.println();
		//using the for each loop
		for (String str : al)
			System.out.println(str + " ");
		System.out.println();
		
		//printing all element of ArrayList
		System.out.println("Initial ArrayList " + al);
		
		//removing element from above ArrayList 
		al.remove(1);
		
		//printing the updated ArrayList element
		System.out.println("After the index removal" + al);
		
		//removing this word element in ArrayList 
		al.remove("saya");
		
		//now printing updated ArrayList 
		System.out.println("After the index removal" + al);
		
	}

}