public class VirtualClassesAttend {
    private Student student;

    public VirtualClassesAttend(Student student) {
        this.student = student;
    }

    public void attendVirtualClass(String virtualClassID) {
        System.out.println(student.getName() + " is attending virtual class: " + virtualClassID);
        // Additional logic for attending virtual class
    }

    public static void main(String[] args) {
        String studentName = "Sara Hamad";
        String virtualClassID = "Math101";

        Student student = new Student(studentName);
        VirtualClassesAttend virtualClassesAttend = new VirtualClassesAttend(student);
        virtualClassesAttend.attendVirtualClass(virtualClassID);
    }
}

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
