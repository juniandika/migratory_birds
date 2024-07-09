package migratory_birds;

import java.util.Scanner;
import java.util.Vector;

public class Main {

	Scanner scan = new Scanner(System.in);
	public Main() {
		// TODO Auto-generated constructor stub
		int number = scan.nextInt();
		scan.nextLine();
		String input = scan.nextLine();
		String[] array_string = input.split(" ");
		
		Vector<String> distinct_bird = new Vector<String>();
		Vector<Bird> object_bird = new Vector<Bird>();
		// Define distinct of the array
		for (int i = 0; i < array_string.length; i++) {
			if (distinct_bird.indexOf(array_string[i]) < 0) {
				distinct_bird.add(array_string[i]);				
			}
		}
		// Add to List of Object
		for (int i = 0; i < distinct_bird.size(); i++) {
			Bird bird = new Bird(distinct_bird.get(i), 0);
			object_bird.add(bird);
			
		}
		
		// Define the count for each birds
		for (int i = 0; i < object_bird.size(); i++) {
			for (int j = 0; j < array_string.length; j++) {
				if (Integer.parseInt(object_bird.get(i).getBird()) == Integer.parseInt(array_string[j])) {
					object_bird.get(i).setCount(object_bird.get(i).getCount() + 1);
				}
			}
		}
		
		String highest = "";
		int count = 0;
		for (int i = 0; i < object_bird.size(); i++) {
			if (highest == "" && count == 0) {
				highest = object_bird.get(i).getBird();
				count = object_bird.get(i).getCount();
			} else {
				if ((count == object_bird.get(i).getCount() && 
					Integer.parseInt(highest) > Integer.parseInt(object_bird.get(i).getBird())) ||
					count < object_bird.get(i).getCount()) {
					highest = object_bird.get(i).getBird();
					count = object_bird.get(i).getCount();
				}
			}
		}
		
		System.out.println(highest);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
