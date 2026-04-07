import java.util.Scanner;

class Student {
    private String name;
    private int rollnumber;
    private int[] marks;

    public Student(String name, int rollnumber, int nsubjects) {
        this.name = name;
        this.rollnumber = rollnumber;
        this.marks = new int[nsubjects];
    }

    public void setmarks(Scanner sc) {
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter marks of subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
    }

    public void calculatetotalandaverage() {
        int total = 0;

        for (int m : marks) {
            total += m;
        }

        double avg = (double) total / marks.length;

        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + avg);
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollnumber);
    }
}

public class mark_pro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name:");
        String name = sc.nextLine();

        System.out.println("Enter roll number:");
        int roll = sc.nextInt();

        System.out.println("Enter number of subjects:");
        int n = sc.nextInt();

        Student s = new Student(name, roll, n);

        s.setmarks(sc);
        s.display();
        s.calculatetotalandaverage();
    }
}