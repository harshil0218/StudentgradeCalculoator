import java.util.*;

class Student{
    LinkedHashMap<String,Double> result ;
    double total,percentage;
    String grade;
    void addMarks(){
        System.out.println("Note : Marks must be out of 100.");
        total=0;
        result = new LinkedHashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Mathematics marks :");
        Double n = sc.nextDouble();
        this.result.put("Mathematics",n);
        total+=n;
        System.out.println("Enter Chemistry marks :");
        n = sc.nextDouble();
        this.result.put("Chemistry",n);
        total+=n;
        System.out.println("Enter Physics marks :");
        n = sc.nextDouble();
        this.result.put("Physics",n);
        total+=n;
        System.out.println("Enter English marks :");
        n = sc.nextDouble();
        this.result.put("English",n);
        total+=n;
        System.out.println("Enter Computer marks :");
        n = sc.nextDouble();
        this.result.put("Computer",n);
        total+=n;
        percentage = total/5;
        if(percentage>90){
            grade = "A+";
        } else if(percentage>80){
            grade = "A";
        } else if (percentage>70){
            grade = "B+";
        } else if(percentage>65){
            grade = "B";
        } else if(percentage>60){
            grade = "C+";
        } else if(percentage>35){
            grade = "C";
        } else {
            grade = "D";
        }
    }
    void showResult(){
        Set<String> key = result.keySet();
        for(String str : key){
            System.out.println(str + " : "+result.get(str));
        }
        System.out.println("Total Marks :" + total);
        System.out.println("Percentage : "+percentage);
        System.out.println("Grade : "+grade);
    }
}
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.addMarks();
        s1.showResult();
    }
}