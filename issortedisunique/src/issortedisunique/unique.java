package issortedisunique;
import java.util.Scanner;



		public class unique {
			public static void main(String[] args) {
			boolean checkunique;
			Scanner console = new Scanner(System.in);
			System.out.println("This program checks the uniqueness of values in array");
			System.out.println();
			System.out.println("How many numbers are in the array?");
			int numbers=console.nextInt();
			int[] array = new int[numbers];
			System.out.println("Enter the numbers");
			for(int i=0; i<=numbers-1; i++) {
			array[i]=console.nextInt();
			}
			checkunique= isUnique(array);
			System.out.println(checkunique);
			}
			public static boolean isUnique(int[] array) {
			for (int i = 0; i < array.length; i++) {
			for (int j = i + 1 ; j < array.length; j++) {
			if (array[i] == array[j])
			return false;
			}
			}
			return true;
			}
			}
