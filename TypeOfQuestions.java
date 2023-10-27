package TypeOfQuestions;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class TypeOfQuestions {
	
	
	  public static void main(String[] args)
	  {
	     Scanner scanner = new Scanner(System.in);
	     String input;
	     
	    
	    
	       
	     do {

	     System.out.println("1- Multiple choices . ");
	     System.out.println("2- Full the blank . ");
	     System.out.println("Enter number of choise : ");
	     int choiceS = scanner.nextInt();
	    
	     
	     switch (choiceS) {
	         case 1:
	         {
	             // The user can specify the number of choices. 
	           List<String> userOptions = new ArrayList<>();
	           
	           System.out.println(" Write the choices you want : ");
	           
	             

	    
	           while (true) {
	               System.out.print("Enter an option (or 'done' to finish): ");
	               String input1 = scanner.next();
	               if (input1.equalsIgnoreCase("done")) {
	                   break;
	               }
	               userOptions.add(input1);
	           }

	           if (userOptions.isEmpty()) {
	               System.out.println("No options entered. Exiting.");
	           } else {
	              

	                  

	                   for (int i = 0; i < userOptions.size(); i++) {
	                     
	                   }

	                   System.out.println("Your choices is :");
	                   for (String choice : userOptions) {
	                       System.out.println(choice);
	                   }
	               }
	          break;
	         }
	           
	           //The user can specify the number of characters to write the text.
	         case 2:
	         {
	           System.out.print("Enter the number of characters for the blanket that should student write : ");
	             int numCharacters = scanner.nextInt();

	             if (numCharacters <= 0) {
	                 System.out.println("Please enter a valid number of characters between  0 and "+numCharacters);
	                 return;
	             }

	             System.out.println("Generated text with " + numCharacters + " characters:");
	             String answer = scanner.next();
	             if (answer.length() <= 0  || answer.length() > numCharacters  ) {
	                 System.out.println("Please enter a valid number of characters between  0 and "+numCharacters);
	                 return;
	                 
	             }
	             System.out.println("Your answer is : "+answer);
	             break;
	         }
	         
	         default:
	             System.out.println("Invalid choice");
	     }
	     System.out.print("Enter done to finsh or next to countinue ");
	      input = scanner.next();
	  }while((!input.equalsIgnoreCase("done")));
	  }

	}

