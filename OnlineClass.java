import java.util.*;

class OnlineClass {
    private String className;
    private String teacherName;
    private static List<String> students;
    private Date date;
    private int duration; // Duration of the class in minutes

    public OnlineClass(String className, String teacherName, Date date, int duration) {
        this.className = className;
        this.teacherName = teacherName;
        this.students = new ArrayList<>();
        this.date = date;
        this.duration = duration;
    }

    public String getClassName() {
        return className;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public List<String> getStudents() {
        return students;
    }

    public Date getDate() {
        return date;
    }

    public int getDuration() {
        return duration;
    }

    public void addStudent(String studentName) {
        students.add(studentName);
    }

    public static void removeStudent(String studentName) {
        students.remove(studentName);
        System.out.println(studentName+"is removed successfully");
    }


public static void main(String[] args) {
    System.out.println("Enter a student name to kick him from the class");
    Scanner s = new Scanner(System.in);
    String nameToKick = s.nextLine();
    removeStudent(nameToKick);

}

static class Schedule {
    private List<OnlineClass> classes = new ArrayList<>();

    public void addClass(OnlineClass onlineClass) {
        classes.add(onlineClass);
    }

    public List<OnlineClass> getClasses() {
        return classes;
    }
}
}
