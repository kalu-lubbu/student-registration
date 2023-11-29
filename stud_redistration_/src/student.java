

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class student {
    }


    class Student {
        private String name;
        private int year;
        private int age;
        private int ID;
        private String course=" courses_u_registered_for_this_semister";
        private static double cgpa ;

        public Student(String name, int age ,int ID,double cgpa ,int year) {
            this.name = name;
            this.age = age;
            this.year=year;
            this.cgpa =cgpa;
            this.ID=ID;
        }

        public String getName() {return name;}
        public int getAge() {return age;}
        public int getYear(){return year;}
        public int getID(){return ID;}
        public static double  getcgpa() {

            if (cgpa <1 || cgpa >4) {

                System.out.println("incorrect cgpa set to zero");

            } else{
                return cgpa;
            }


            return 0;
        }


    }

    class StudentRegistration {
        private List<Student> students;

        public StudentRegistration() {
            students = new ArrayList<>();
        }

        public void registerStudent(Student student) {
            students.add(student);
            System.out.println("Student registered successfully!");
        }

        public void displayRegisteredStudents() {
            System.out.println("Registered Students:");
            for (Student student : students) {
                System.out.println("Name: " + student.getName());
                System.out.println("Age: " + student.getAge());
                System.out.print("courses for this semister ");
                System.out.println("              cradite hours");
                System.out.print("--------------------");
                System.out.println("                   --------------");

                System.out.print("object oriented programming ");
                System.out.println("                    4");
                System.out.print("computer organization and archtecture");
                System.out.println("           7");
                System.out.print("oprationg system");
                System.out.println("                                5");


                System.out.println("cpga: " + Student.getcgpa());

                System.out.println("ID: " + student.getID());
                System.out.println("year:" + student.getYear());
                System.out.println("-----------------------");
            }
        }
    }

    class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            StudentRegistration registration = new StudentRegistration();

            while (true) {
                System.out.println("haramaya university student portal");
                System.out.println("1. Register Student");
                System.out.println("2. Display Registered Students");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter student name: ");
                        String name1 = scanner.nextLine();
                        String name = scanner.nextLine();

                        System.out.print("Enter student age: ");
                        int age = scanner.nextInt();
                        // System.out.print("Enter student course: ");
                        //  String course = scanner.next();
                        System.out.print("Enter student cgpa: ");
                        double cgpa = scanner.nextDouble();
                        System.out.print("enter your id: ");
                        int ID = scanner.nextInt();
                        System.out.print("Enter year : ");
                        int year = scanner.nextInt();

                        Student student = new Student(name,  age , ID ,cgpa,  year);
                        registration.registerStudent(student);
                        break;
                    case 2:
                        registration.displayRegisteredStudents();
                        break;
                    case 3:
                        System.out.println("Exiting...");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice! Please try again.");
                }
            }
        }
    }



