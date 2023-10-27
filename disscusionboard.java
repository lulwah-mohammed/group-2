import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;


class User {
    private String username;
    private String role;

    public User(String username, String role) {
        this.username = username;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public String getRole() {
        return role;
    }
    
}



public class DiscussionBoard {


    public static List<User> students = new ArrayList<>();
    public static List<User> teachers = new ArrayList<>();
   
   
    
    static String input2 ;   
        
    public void addUser(User user) {
        if ("student".equals(user.getRole())) {
            students.add(user);
        }else if ("teacher".equals(user.getRole())) {
            teachers.add(user);
        }
    }
    
    
    
    public static void main(String[] args)
    {
      Scanner scanner = new Scanner(System.in);
      DiscussionBoard d = new DiscussionBoard();
       do {
              System.out.println("Ditermine discussion board :");
              System.out.println("1- Private (Student-Student)");
              System.out.println("2- Puplic (Student-Teacher)");
              int input = scanner.nextInt();
              String name;
              String role;
              List<String> audiende = new ArrayList<>();
              audiende.clear();
        switch(input) {
              
              case 1:
                 System.out.println("Ditermine the audiende number :");
                 int input3 = scanner.nextInt();
                 int i =0;
                 while(i < input3)
                 {
                   System.out.println("Enter username and user role :");
                   User user = new User(name = scanner.next(),role = scanner.next());
                 if("student".equals(user.getRole()))
                 {
                   audiende.add(user.getUsername());
                     System.out.println("Welcome "+user.getUsername());
                 }
                 else
                   System.out.println("You are not eligible to enter");
                 i++;
                 if ("student".equals(user.getRole())) {
                       d.addUser(user);
                    }else if("teacher".equals(user.getRole()))
                    {
                      d.addUser(user);
                    }
                    
                   }
                   if(d.students.isEmpty())
                   {
                      System.out.println("The discussion board can not created ");
                     break;
                     
                   }
                   else if(!d.teachers.isEmpty())
                   {
                      System.out.println("The discussion board can not created ");
                     break;
                     
                 }
                 System.out.println("The discussion board is created successfully , the audiendes list are :"+ audiende);
                                 
                break;
                
              case 2:
                System.out.println("Ditermine the audiende number :");
                int input4 = scanner.nextInt();
                int j =0;
                while(j < input4)
                {
                 System.out.println("Enter username and user role : :");
               User user = new User(name = scanner.next(),role = scanner.next());
                if(user.getRole().equalsIgnoreCase("teacher") || "student".equals(user.getRole()))
                {
                  audiende.add(user.getUsername());
                    System.out.println("Welcome "+user.getUsername());
                }
                j++;
                if ("student".equals(user.getRole())) {
                   d.addUser(user);
                }else if("teacher".equals(user.getRole()))
                {
                  d.addUser(user);
                }
                
               }
               if(d.students.isEmpty())
               {
                  System.out.println("The discussion board can not created ");
                 break;
                 
               }
               if(d.teachers.isEmpty())
               {
                  System.out.println("The discussion board can not created ");
                 break;
                 
               }
System.out.println("The discussion board is created successfully , the audiendes list are :"+ audiende);
            
                break;
              
                default:
                   System.out.println("Invalid choice");
              }
              
              System.out.print("Enter done to finsh or next to create a new discussion board ");
              input2 = scanner.next();
              
              
                }while((!input2.equalsIgnoreCase("done")));
      
          
             students.clear();
             teachers.clear();
         
    }
    
    

     
}
