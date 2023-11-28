import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


// class for the registration system containing the main method
public class Registration{

    public static void main(String[] args){

        ArrayList<Student>names=new ArrayList<>();
        
    int request = 0;    
    do{

        System.out.println("WELCOME TO STUDENT REGISTRATION SYSTEM!");
        System.out.println("choose your request: ");
        System.out.println("1. register a student.");
        System.out.println("2. display the students registered.");
        System.out.println("3. abort");


        try {
            Scanner input = new Scanner(System.in);
            request = input.nextInt();
            input.nextLine();


            switch (request) {

                //accepts values from the user and adds them to the arraylist
                case 1:

                    System.out.print("Insert your full name: ");
                    String name = input.nextLine();
                    String gender = null;

                    do {

                        try {
                            System.out.print("Insert your gender: ");
                            gender = input.next();

                            if (!(gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female"))) {
                                throw new IllegalArgumentException();

                            }
                        } catch (IllegalArgumentException ex) {
                            System.out.println("Inappropriate argument,type either male or female!");
                        }

                    } while (!(gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female")));

                    String department = null;
                    int choice = 0;

                    do {
                        try {

                            System.out.println("Insert department of your choice: ");
                            System.out.println("""
                                    1.Software Engineering
                                    2.Computer science
                                    3.Information System
                                    4.Information Technology
                                    """);

                            choice = input.nextInt();
                            if (choice != 1 && choice != 2 && choice != 3 && choice != 4) {
                                throw new IllegalChoiceException();
                            }

                            switch (choice) {

                                case 1:
                                    department = "Software Engineering";
                                    break;
                                case 2:
                                    department = "Computer science";
                                    break;
                                case 3:
                                    department = "Information System";
                                    break;
                                case 4:
                                    department = "Information Technology";
                                    break;

                            }
                        } catch (IllegalChoiceException e) {
                            System.out.println("Inappropriate choice!");
                        }
                    }while (department == null);


                    Student student = new Student(name, department, gender);
                    names.add(student);
                    System.out.println("\nStudent registered successfully!\n");

                    break;


                //display students that are registered
                case 2:
                    Student.display(names);

            }
        } catch (InputMismatchException ex) {
            System.out.println("Insert only numeric value!\n");

        }


    }while(request!=3);

        System.out.println("Registration complete!");
    
    }}