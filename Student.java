package project2;

import java.io.IOException;
import java.util.*;
import java.util.HashMap;
import java.util.Date;

public class Student {
    private String m_name;
    private int m_age;
    private long m_id;
    private String m_gender;
    private String m_date;


    public Student(String name, int age, long id, String gender, String date) {
        m_name = name;
        m_age = age;
        m_id = id;
        m_gender = gender;
        m_date = date;
    }

    public String getName() {
        return m_name;
    }

    public int getAge() {
        return m_age;
    }

    public long getid() {
        return m_id;

    }


    public String getgender() {
        return m_gender;
    }

    public String getdate() {
        return m_date;
    }

    public String toString() {
        return "name: " + m_name + ", age: " + m_age +
                ", ID1: " + m_id + ", gender: " + m_gender + ", date of birth: " + m_date;

    }


    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        Scanner input = new Scanner(System.in);


        int menuChoice = 4;
        do {
            System.out.println("\t\t\tStudent Record Menu");
            System.out.println("\t\t1. Add Student\t2. View Students\t3. Edit Student\t4. Delete Student");
            try {
                System.out.println("Enter a choice: ");
                menuChoice = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                continue;
            }

            if (menuChoice == 1) {
                System.out.println("Full name:");
                String name = input.nextLine();

                int age = -1;
                do {
                    try {
                        System.out.println("Age:");
                        age = Integer.parseInt(input.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Enter a number!");
                        continue;
                    }
                } while (age <= 0);

                System.out.println("ID:");
                long id = input.nextLong();


                System.out.println("Gender:");
                String gender = input.nextLine();

                System.out.println("Date of Birth:");
                String date = input.nextLine();

                Student student = new Student(name, age, id, gender, date);
                students.add(student);


            } else if (menuChoice == 2) {
                System.out.println("Students:");
                for (Student student : students) {
                    System.out.println(student);
                }
            } else if (menuChoice == 3) {
                update();



            } else if (menuChoice == 4) {
                delete();
            }

        } while (menuChoice < 4);
    }

    public static void update() {
        String newName, newgender, newdate;
        int newAge;
        int id;
        int date;
        Scanner strInput = new Scanner(System.in);

        System.out.println("\t\t Update Student Record\n\n");
        System.out.println("Enter the Student ID: ");

        id = strInput.nextInt();

        System.out.println("Enter the new Name: ");
        newName = strInput.nextLine();
        System.out.println("Enter new Age: ");
        newAge = strInput.nextInt();
        System.out.println("Enter the new gender: ");
        newgender = strInput.nextLine();
        System.out.println("Enter the new DOB: ");
        newdate = strInput.nextLine();
        

    }

    public static void delete() {
        String another;
        Scanner strInput = new Scanner(System.in);
        do {
            System.out.println("\nDelete Student\n*****\n");
            System.out.println("Enter Student ID to delete : ");
            try {
                long id = strInput.nextLong();
                ArrayList<Student> students = new ArrayList<Student>();
                students.remove(students);

            } catch (Exception e) {
                System.out.println("Error!! ");
            }
            System.out.println("\nDelete Another?");
            another = strInput.nextLine();
        } while (!"n".equals(another));
    }
}





