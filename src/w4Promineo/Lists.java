package w4Promineo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//1
		int endNum = 10;
        ArrayList<Integer> listNums = new ArrayList<Integer>();
		for (int i = 1; i <= endNum; i++) {
		    listNums.add(i);
		}
			System.out.println("1. " + listNums);
		
			
		//2
		int indexVal = 1;
		ArrayList<String> productList = new ArrayList<>(); 
		
		productList.add("Macbook");
		productList.add("2. HP Notebook");
		productList.add("iPhone 14");
		productList.add("Acer Aspire");
		productList.add("Windows Surface");
		productList.add("Galaxy S23");
		if ((indexVal < 0) || (indexVal > 5)){
		    System.out.println("No product can be found with that product number.");
		    return;
		}
		System.out.println(productList.get(indexVal));
		
		
		//3
		int num13 = 5;
		int num23 = 1;
		int num33 = 7;
		

		ArrayList<String> tenWords = new ArrayList<String>();
		tenWords.add("Bumfuzzle");
		tenWords.add("Cattywampus");
		tenWords.add("Widdershins");
		tenWords.add("Gubbins");
		tenWords.add("Lollygag");
		tenWords.add("Malarkey");
		tenWords.add("Wabbit");
		tenWords.add("Impignorate");
		tenWords.add("Yarborough");
		tenWords.add("Bloviate");

        if ((num13 < 0) || (num13 > 9) || (num23 < 0) || (num23 > 9) || (num33 < 0) || (num33 > 9)){
            System.out.println("Sorry, there was an error getting a number you requested.");
            return;
        }
		ArrayList<String> ThreeWords = new ArrayList<>(3);
		ThreeWords.add(tenWords.get(num13));
		ThreeWords.add(tenWords.get(num23));
		ThreeWords.add(tenWords.get(num33));
		
		System.out.println("3. " + ThreeWords);
		
		
		//4
		int num14 = 5;
		int num24 = 5;
		int num34 = 5;
		int num44 = 5;
	    int num54 = (num14 + num24 + num34 + num44);
	    ArrayList<Integer> Four = new ArrayList<>();
	    Four.add(num14);
	    Four.add(num24);
	    Four.add(num34);
	    Four.add(num44);
	    Four.add(num54);
	    System.out.println("4. " + Four);
	    
	    
	    //5
	    int endNum5 = 64;
	    if(endNum5 <= 0){
	        System.out.println("Your List cannot be created with a number less than one.");
	        return;
	    }


	    List<Integer> newList = new ArrayList<>();
	        for (int i = 1; i <= endNum5; i++){
	            newList.add(i);
	        }
	       System.out.println("5. The first number in the List is " + newList.get(0));
	       System.out.println("5. The last number in the List is " + newList.size());
	       
	       
	       //6
			String word16 = "Java";
			String word26 = "JavaScript";
			String word36 = "MySQL";
			String word46 = "HTML";
			String word56 = "SpringBoot";
			List<String> words6 = new ArrayList<>();
			words6.add(word16);
			words6.add(word26);
			words6.add(word36);
			words6.add(word46);
			words6.add(word56);
			
	       List<String> newList6 = new ArrayList<>();
	       for(int i = 0; i <= 4; i++){
	           if (i % 2 == 0) {
	               newList6.add(words6.get(i));
	           }
	       }
			System.out.println("6. The old List is: " + words6);
			System.out.println("6. The new List is: " + newList6);
			
			
			//7

			int num17 = -22;
			int num27 = 148;
			int num37 = 49;
			int num47 = 15;
			int num57 = 0;
			System.out.println("7. " + squaredList(num17,num27,num37,num47,num57));
			
			
			//8
			List<Character> alphabet = new ArrayList<>();
			for (int i8 = 97; i8 < (97+26); i8++) {
			    alphabet.add((char) i8);
			}
			char userLetter = 'n';
			for(int j8 = 0; j8 < alphabet.size(); j8++){
			    if(alphabet.get(j8) == userLetter){
			        System.out.println("8. " + j8);
			    }
			 }
			
			
			//9
			int userNumber9 = 941;
		    List<Integer> factorNum = new ArrayList<>();
		    for(int i = 1; i <= userNumber9; i++){
		        if (userNumber9 % i == 0){
		            factorNum.add(i);
		        }
		    }
		    System.out.println("9. " + factorNum);
		    
		    
		    //10
	        LinkedList<String> line = new LinkedList<String>();
	        line.add("Amanda");
	        line.add("Brad");
	        line.add("Cori");
	      
	        System.out.println("10. People in line: " + line);
	        System.out.println("10. First person in line was: " + line.get(0));
	        System.out.println("10. The last person in line was: " + line.get(2));
	        line.remove("Amanda");
	        line.add("Danny");
		    
	        System.out.println("10. People in line now: " + line);
	        System.out.println("10. Now the first person in line is: " + line.get(0));
	        System.out.println("10. The last person in line is: " + line.get(2));
		    
					



		
			
		
	}
	
	
	//7 method
	public static List<Integer> squaredList(int num17, int num27, int num37, int num47, int num57) {
	 	
	    // WRITE YOUR CODE HERE
        
        List<Integer> squaredNums = new ArrayList<>();
        squaredNums.add(num17 * num17);
                squaredNums.add(num27 * num27);
                        squaredNums.add(num37 * num37);
                                squaredNums.add(num47 * num47);
                                        squaredNums.add(num57 * num57);
        return(squaredNums);

	}
	
	
	
}
