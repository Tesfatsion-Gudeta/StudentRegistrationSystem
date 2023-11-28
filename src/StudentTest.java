import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @org.junit.jupiter.api.Test
    void getIdNumber() {
        int expectedId=1;
        Student student=new Student("tesfa","Software Engineering","male");
        int actualId=student.getIdNumber();

        // for checking the result
        assertEquals(expectedId,actualId);
    }


    @org.junit.jupiter.api.Test
    void getDepartmentName() {

        //assigning the expected department name we want to get
        String expectedDepartment="Computer Science";

        //adding department name
        Student student=new Student(" ","Computer Science"," ");

        //the actual name we will get from our getDepartmentName() method
        String actualDepartment=student.getDepartmentName();

        assertEquals(expectedDepartment,actualDepartment);
    }

    @org.junit.jupiter.api.Test
    void getStudentName() {
        String expectedName="abebe";
        Student student=new Student("abebe"," "," ");
        String actualName=student.getStudentName();
        assertEquals(expectedName,actualName);
    }


    @org.junit.jupiter.api.Test
    void getGender() {
        String expectedGender="female";
        Student student=new Student(" "," ","female");
        String actualGender=student.getGender();
        assertEquals(expectedGender,actualGender);
    }

    @org.junit.jupiter.api.Test
    void display() {
        ArrayList<Student> names=new ArrayList<>();

        Student student = new Student("tesfa", "Software Engineering", "male");
        names.add(student);

        // to redirect the standard output (System.out) to a ByteArrayOutputStream instead of the console.
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Student.display(names);
        String expectedOutput = "1.student name: tesfa, Gender: male , Id number: 1/14, Department name: Software Engineering"; // Add the expected output based on the students you added
        assertEquals(expectedOutput, outputStream.toString().trim());

        //used to reset the standard output stream (System.out) back to its original state
        System.setOut(System.out);
    }
}