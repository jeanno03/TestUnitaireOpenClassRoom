package princip;

import java.util.Arrays;
import java.util.LinkedList;

import entities.PersonneAnonyme;
import entities.SoinFunctionalInterface;

public class Main {

	public static void main(String[] args) {

		//https://examples.javacodegeeks.com/core-java/lang/string/java-string-split-example/

		Boolean toContinue = true;
		
		if(toContinue) {
			
			String str = "abdc:psdv:sdvosdv:dfpbkdd";

			//split the array using ':' as a delimiter
			String[] parts = str.split(":");

			System.out.println("Using : as delimiter"+Arrays.toString(parts));

			//split the array using 'd' as a delimiter
			parts = str.split("d");
			System.out.println(Arrays.toString(parts));

			String str2 = "This is a string to tokenize";

			//tokenize the string into words simply by splitting with " "
			parts = str2.split(" ");
			System.out.println(Arrays.toString(parts));
		}

	

		if(toContinue) {
			
			String str = "abdc:psdv:sdvosdv:dfpbkdd";
			String[] parts = str.split(":",2);
	        System.out.println("Using : as a delimiter "+Arrays.toString(parts));
	        

			String[] parts2 = str.split(":",4);
	        System.out.println("Using : as a delimiter "+Arrays.toString(parts2));
			
		}

		if(toContinue) {
			String str = "abdc124psdv456sdvos456dv568dfpbk0dd";
			// split the array using a single digit, e.g 1,2,3...
			String[] parts = str.split("[0-9]");
			System.out.println(Arrays.toString(parts));

			// split the array using a whole number, e.g  12,346,756
			parts = str.split("[0-9]+");
			System.out.println(Arrays.toString(parts));
			
			
		}
		
		if(toContinue) {
			
//			https://beginnersbook.com/2013/12/linkedlist-in-java-with-example/
			
			/* Linked List Declaration */
			LinkedList<String> linkedlist = new LinkedList<String>();
			
		       /*add(String Element) is used for adding 
		        * the elements to the linked list*/
			linkedlist.add("Item1");
			linkedlist.add("Item7");
			linkedlist.add("Item3");
			linkedlist.add("Item6");
			linkedlist.add("Item5");
			linkedlist.add("Item2");
			linkedlist.add("Item4");
			
			/*Display Linked List Content*/
			System.out.println("LinkedList content : "+linkedlist);
			
			/*Add First and Last Element*/
			linkedlist.addFirst("First Item");
			linkedlist.addLast("Last Item");
			
			System.out.println("LinkedList Content after addition: " +linkedlist);
			
			/*This is how to get and set Values*/
			Object firstvar = linkedlist.get(0);
			System.out.println("First element: " +firstvar);
			
			linkedlist.set(0, "Change first item");
			
			Object firstvar2 = linkedlist.get(0);
			System.out.println("First element after update by set method: " +firstvar2);
			
			/*Remove first and last element*/
			linkedlist.removeFirst();
			linkedlist.removeLast();
			System.out.println("LinkedList after deletion of first and last element: " +linkedlist);
			
			/* Add to a Position and remove from a position*/
		       linkedlist.add(0, "Newly added item");
		       linkedlist.remove(2);
		       System.out.println("Final Content: " +linkedlist); 
		}
		
		
	if(toContinue) {
		System.out.println("class anonyme redéfinit la méthode");
		
		PersonneAnonyme personneAnonyme02 = new PersonneAnonyme () {
			public void seSoigner() {
				System.out.println("personneAnonyme02 se soigne");
			}
		};
		
		personneAnonyme02.seSoigner();
	}
	
	if(toContinue) {
	
		
		SoinFunctionalInterface soinFunctionalInterface = new SoinFunctionalInterface () {
			public String getDefaultMethod(int i) {
				return "getDefaultMethod Redéfinit avec anonyme";
			}

			@Override
			public void seSoigner() {
				System.out.println("seSoigner Redéfinit avec anonyme");
				
			}
		};
		System.out.println("class anonyme redéfinit la méthode");
		String str = soinFunctionalInterface.getDefaultMethod(0);
		System.out.println(str);
		soinFunctionalInterface.seSoigner();	
		
		SoinFunctionalInterface s = () -> {System.out.println("seSoigner Redéfinit avec lambdas ");};
		s.seSoigner();

		String str2 = s.getDefaultMethod(5);
		System.out.println(str2);
	}
	

	}

}
