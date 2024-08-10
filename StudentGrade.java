import java.util.Scanner;

public class StudentGrade {
    public static int sum(int arr[], int n){
        int sum=0;
for(int i=0;i<n;i++){
sum += arr[i];
}
return sum;
    }
    public static double avgPercent(int sum, int n){
double avg = sum / n;
return avg;
    }
    public static String gradeCalculation(double avg){
        if(avg>=90.00 && avg <= 100.00){
            return "Your overall grade is S" ;
          
        }
        else if(avg>=80.00 && avg <90.00){
            return "Your overall grade is A" ;
           
        }
        else if(avg>70.00 && avg<80.00){
            return "Your overall grade is B" ;
        }
        else if(avg>60.00 && avg<70.00){
            return "Your overall grade is C" ;
        }
        else if(avg>50.00 && avg<60.00){
            return "Your overall grade is D" ;
        }
        else if(avg>40.00 && avg<50.00){
            return "Your overall grade is E" ;
        }
        else if(avg>=0 && avg<40.00){
            return "Your overall grade is F" ;
        }
            return "Invalid Percentage! Re enter your marks again!" ;   
    }
    public static void display(int sum , double avg, String grade){
        System.out.printf("%-20s %-30s %-10s%n", "Total Marks", "Average Percentage", "Grade"); 
        System.out.println("-------------------------------------------------------------------------------");
        System.out.printf("%-20d %-30.2f %-10s%n", sum, avg, grade);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int subjectCount = sc.nextInt();
        
        int marks[] = new int[subjectCount];
        for(int i = 0; i < subjectCount; i++){
            while (true) {
                System.out.printf("Enter marks for subject %d: ", i+1);
                marks[i] = sc.nextInt();
                if (marks[i] < 0) {
                    System.out.println("Invalid Input, Re-enter the marks again!");
                    
                } else {
                    break;
                }
            }
        }
    
        int sum = sum(marks, subjectCount);
        double avg = avgPercent(sum, subjectCount);
        String grade = gradeCalculation(avg);
        display(sum, avg, grade);
    
        sc.close();
    }
    
}
