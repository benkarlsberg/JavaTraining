package day1;

import java.util.Scanner;

public class ProblemSet2 {

    public static void callArrayError() {
        arrayError();
    }

    public static void arrayError() {
        int[] array = new int[]{1, 2, 3};
        try {
            System.out.println(array[3]);
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Finally block for example");
        }
    }

    public static void getStudentGradeAverages() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many students?");
        int numStudents = scanner.nextInt();
        int grade;
        float sum = 0;

        for (int i=0; i<numStudents; i++) {
            System.out.println("Enter a grade: ");
            grade = scanner.nextInt();
            try {
                if (grade <= 100 && grade >= 0) {
                    sum += grade;
                } else {
                    throw new GradeException();
                }
            } catch(GradeException e) {
                e.printStackTrace();
                System.out.println("Not a valid grade");
            }
        }

        float average = sum/numStudents;

        System.out.println("Average student grade is " + average);

    }

}
