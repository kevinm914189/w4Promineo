package w4CodingAssignment;

public class CodingAssignment {

	public static void main(String[] args) {
	//Alternate method usage begins at line 196 associated with question 7.
		//Variables associated with for loops are labeled j along with an identifier for the question it began with.
		//Variables marked i denote an integer value, along with an identifier for the question it began with 
		//Int values begin lowercase a-z
		//Double values begin uppercase A-Z
		//String values are given simple descriptors along with an associated number for the question it began with
		//The variable "count" indicates a for loop
		
		
	//1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
				// i1 = Variable declaring length of array
				int i1 = 8;
		int[] ages = new int [i1];
		ages[0] = 3;
		ages[1] = 9;
		ages[2] = 23;
		ages[3] = 64;
		ages[4] = 2;
		ages[5] = 8;
		ages[6] = 28;
		ages[7] = 93;
		
		
		//1 a.	Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console. 
				// i1a = Variable assigned to question 1 A mathematics
				int i1a = (ages[0] - ages[i1 - 1]);
			//1 a Print
		System.out.println("1 A. " + i1a);
		
		
		//1 b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		i1 ++;
		ages[ages.length - 1] = 23;
				// i1b = Variable assigned to question 1 B mathematics
				int i1b = (ages[0] - ages[ages.length - 1]);
			//1 b Print
		System.out.println("1 B. " + i1b);

		
		//1 c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		int i1c = 0;
		for(int count1c = 0; count1c < (i1 - 1); count1c++) {
			i1c = i1c + ages[count1c];
		}
		int average = (i1c / i1);
			//1 c Print
		System.out.println("1 C. " + average);
		
		
	//2.	Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
			//i2 = Variable assigned to question 2 mathematics
			int i2 = 6;
		String[] names = new String [i2];
		names[0] = "Sam";
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Sally";
		names[4] = "Buck";
		names[5] = "Bob";
		
		
		//2 a.	Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		String check2 = "";
			for (int count2a = 0; count2a < names.length; count2a++) {
			check2 += names[count2a];
		}
		double i2A = check2.length();
			//2 a Print
		System.out.println("2 A. " + (i2A / names.length));
		
		
		//2 b.	Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		String conc2 = "";
		String spacer2 = " ";
			for(int count2b = 0; count2b <= (i2 - 1); count2b++) {
				conc2 += names[count2b];
				conc2 += spacer2;
				}
				System.out.println("2 B. " + conc2);
				
				
	//3.	How do you access the last element of any array?
				System.out.println("3.   The last element of an array is most reliably accessed by going to the negative one index. This allows you to go to the last element stored without needing to know the length of said array.");
	
				
	//4.	How do you access the first element of any array?
				System.out.println("4.   The first element of an array is stored at index 0. This is because Java starts all indexes at zero.");
	
								
	//5.	Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
		String total5 = "";
		String conc5 = "";
		int[] nameLengths = new int[i2];
		for(int count5 = 0; count5 < nameLengths.length; count5++) {
			conc5 = names[count5];
			nameLengths[count5] = conc5.length();
			conc5 = total5;
		}
			//5 Print
		for(int count5A = 0; count5A < nameLengths.length; count5A++) {
		System.out.println("5.   " + nameLengths[count5A]);
		}
		
		
	//6.   Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		int i6 = 0;
		for(int count6 = 0; count6 < nameLengths.length; count6++) {
			i6 += nameLengths[count6];
		}
			//6 Print
		System.out.println("6.   " + i6);
		
		
	//7.	Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
		String call7 = "rrrrrrrrribbit  ";
		int i7 = 7;
		String conc7 = method7(call7, i7);
		System.out.println("7.   " + conc7);
		
		
	//8.	Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
		String firstName = "Barnacle";
		String lastName = "Jackson";
		String call8 = method8( firstName, lastName);
		System.out.println("8.   " + call8);
		
	//9.	Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		int i9 = 5;
		int[] arr9 = new int[i9];
		arr9[0] = 9;
		arr9[1] = 78;
		arr9[2] = 1;
		arr9[3] = 11;
		arr9[4] = 40;
		boolean call9 = method9(arr9, i9);
		System.out.println("9.   " + call9);
		
		
	//10.	Write a method that takes an array of double and returns the average of all the elements in the array.
	 	int i10 = 7;
		double arr10[] = new double[i10];
	 	arr10[0] = 1.0;
	 	arr10[1] = 0.3;
	    arr10[2] = 5.3;
	 	arr10[3] = 30.7;			
	 	arr10[4] = 4.8;
		double call10 = method10(arr10, i10);
		System.out.println("10.  " + call10);
		
	//11.	Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
	 	double arr11A[] = new double[3];
	 	arr11A[0] = 12.90;
	 	arr11A[1] = 25.68;
	 	arr11A[2] = 30.17;
	 	double arr11B[] = new double[5];
	 	arr11B[0] = 2.1;
	 	arr11B[1] = 10.7;
	 	arr11B[2] = 14.1;
	 	arr11B[3] = 17.02;
	 	arr11B[4] = 20.56;
	 	
		boolean caLL11 = method11(arr11A, arr11B );
		System.out.println("11.  " + caLL11);
		
		
	//12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		boolean hotOutside = false;
		double pocketChange = 0.86;
		boolean caLL12 = willBuyDrink(hotOutside, pocketChange);
		System.out.println("12.  " + caLL12);
		
	
	//13. inventory list that checks your supplies before you leave. If you have enough, you will be good to go. If you do not have enough, you will be informed to get more.
		int junctionBoxes = 5;
		int filters = 10;
		int bxCableFt = 40;
		int machineScrews = 300;
		String caLL13 = inventory(junctionBoxes, filters, bxCableFt, machineScrews);
		System.out.println("13.  " + caLL13);
		
		
		
		
		
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	}//End of main method
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	
	//7. method
	public static String method7(String word, int n) {
		String total = "";
		for (int count7 = 0; count7 < n; count7++) {
			total += word;
		}
		return total;
	}
	
	
	//8. method
	public static String method8(String firstName,String lastName) {
		String fullName = (firstName + " " + lastName);
		return fullName;
			 }
	
	
	//9. method
	public static boolean method9(int[] arr9, int i9m) {
		int sum9m = 0;
		for(int count9m = 0; count9m < i9m; count9m++) {
		sum9m += arr9[count9m];
		}
		if(sum9m > 100) {
			return true;
		} else {
			return false;
		}
		
	}
	
	
	//10. method
	 public static double method10(double[] Ques10, int i10m) {
		 double i10A = 0;
		 for(int count10 = 0; count10 < i10m; count10++) {
		 	i10A = (i10A + Ques10[count10]);
		 }
		 return (i10A / 5);
	}
	 
	 
	//11. method
	 public static boolean method11 (double[] arr11mA, double[] arr11mB) {
		double sum11A = 0.0;
		double sum11B = 0.0; 
		double length11A = arr11mA.length;
		double length11B = arr11mB.length;
		//Array1 sum
				for (double i11mA : arr11mA) {
					sum11A += i11mA;
				}
		//Arrray1 average
				double average11A = (sum11A / length11A);
		//Array2 sum
				for (double i11mB : arr11mB) {
					sum11B += i11mB;
				}
		//Array2 average
				double average11B = (sum11B / length11B);
		//is Array1 greater than Array2 boolean
		    if(average11A > average11B) {
		    	return true;
		    } else {
		    	return false;
		    }
	}
	 
	 
	//12. method
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if((isHotOutside = true) && (moneyInPocket > 10.50)) {
			return true;
		} else {
			return false;
					
		}
	}
	
	
	//13. inventory list
	public static String inventory(int junctionBoxes, int filters, int bxCableFt, int machineScrews) {
		if((junctionBoxes <= 5) || (filters <= 10) || (bxCableFt <= 40) || (machineScrews <= 25)) {
			return "Grab more supplies before heading out";
		} else {
			return "Good to go";
					
		}
	}
	 
	 
	 
	
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
} // END
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
