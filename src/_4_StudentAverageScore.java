import java.util.Scanner;

public class _4_StudentAverageScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //What we have
        int numberOfStudents = 3;
        int numberOfCourses = 4;
        //What we need
        for(int i=0; i<numberOfStudents;i++){
            double total = 0;
            for(int j=0; j<numberOfCourses;j++){
                System.out.println("Please enter score for course "+(j+1)+"for student"+(i+1));
                double score = scanner.nextDouble();
                total+=score;
            }
            double avg = total/numberOfCourses;
            System.out.println("Average score of student "+(i+1)+" is "+avg);
        }
        //operations
    scanner.close();
    }
}
