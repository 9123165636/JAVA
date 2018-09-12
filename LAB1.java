class ifstatement {
    public static void main(String[] args) {

    	int number = 10;

    	if (number > 0) {
    		System.out.println("Number is positive.");
    	}
    	System.out.println("This statement is always executed.");
    }
}




class ifelse {
   public static void main(String[] args) {    	
      int number = 10;
	 
      if (number > 0) {
         System.out.println("Number is positive.");
      }
      else {
         System.out.println("Number is not positive.");
      }
 
      System.out.println("This statement is always executed.");
   }
}



class whilestatement {
   public static void main(String[] args) {
      
      int i = 1;
	   
      while (i <= 10) {
         System.out.println("Line " + i);
         ++i;
      }
   }
}


import java.util.Scanner;

class dowhilestatement {
   public static void main(String[] args) {
	   
      Double number, sum = 0.0;
      Scanner input = new Scanner(System.in);

      do {
    	 System.out.print("Enter a number: ");
    	 number = input.nextDouble();
    	 sum += number;
      } while (number != 0.0);
	   
      System.out.println("Sum = " + sum);
   }
}



class switchstatement {
   public static void main(String[] args) {

      int week = 4;
      String day;
	        
      switch (week) {
         case 1:
           day = "Sunday";
           break;
         case 2:
           day = "Monday";
	   break;
         case 3:
           day = "Tuesday";
           break;
         case 4:
           day = "Wednesday";
           break;
         case 5:
           day = "Thursday";
           break;
         case 6:
           day = "Friday";
           break;
         case 7:
           day = "Saturday";
           break;
         default: 
           day = "Invalid day";
           break;
      }
      System.out.println(day);
   }
}



class breakstatement {
   public static void main(String[] args) {
      
      for (int i = 1; i <= 10; ++i) {      
         if (i == 5) {
            break;
         }      
         System.out.println(i);
      }   
   }
}



class breakstatement {
   public static void main(String[] args) {
      
      for (int i = 1; i <= 10; ++i) {      
         if (i > 4 && i < 9) {
            continue;
         }      
         System.out.println(i);
      }   
   }
}
