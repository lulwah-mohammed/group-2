import java.util.Date;
import java.util.List;
public class OnlineClassScheduler extends OnlineClass {

    public OnlineClassScheduler(String className, String teacherName, Date date, int duration) {
        super(className, teacherName, date, duration);
        
    }

    public static void main(String[] args) {
        Schedule schedule = new Schedule();

        // Adding sample online classes
        OnlineClass class1 = new OnlineClass("Software Engineering 290", "Basma Alqadi", new Date(), 60);
        OnlineClass class2 = new OnlineClass("Math 114", "Sara Mostafa", new Date(), 45);

        schedule.addClass(class1);
        schedule.addClass(class2);

        // Teachers adding students to the classes
        class1.addStudent("Student 1");
        class1.addStudent("Student 2");
        class2.addStudent("Student 3");

        // Teacher removing a student from a class
        class1.removeStudent("Student 2");

        // Display the scheduled classes and their students
        List<OnlineClass> scheduledClasses = schedule.getClasses();
        for (OnlineClass onlineClass : scheduledClasses) {
            System.out.println("Class: " + onlineClass.getClassName());
            System.out.println("Teacher: " + onlineClass.getTeacherName());
            System.out.println("Date: " + onlineClass.getDate());
            System.out.println("Duration: " + onlineClass.getDuration() + " minutes");
            System.out.println("Students: " + onlineClass.getStudents() + "\n");
            
        }
    }
}
