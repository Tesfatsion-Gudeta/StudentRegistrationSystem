import java.util.ArrayList;

public class Student {
    private String departmentName;
    private String studentName;
    private String gender;
    private static int number = 0001;
    private int idNumber;


    public Student(String name, String department, String gender) {
        this.studentName = name;
        this.departmentName = department;

        //id number is assigned to the students according to the order of their registration
        this.idNumber = number;
        number = number + 1;
        this.gender = gender;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getDepartmentName() {
        return departmentName;
    }


    public String getStudentName() {
        return studentName;
    }

    public String getGender() {
        return gender;
    }


    // A method that displays the values retrieved from the user
    public static void display(ArrayList<Student> names) {
        int counter = 1;
        for (Student student : names) {
            System.out.println(counter + ".student name: " + student.getStudentName() + ", Gender: " + student.getGender() + " , Id number: " + student.getIdNumber() + "/14" + ", Department name: " + student.getDepartmentName());
            counter++;


        }


    }

}

