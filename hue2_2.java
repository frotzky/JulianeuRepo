import java.util.Scanner;


public class hue2_2 {
    public static double meanarray (int[] numbers){
        double sum=0;
        for (int number:numbers){
            sum=sum+number;
        }
        double mean=sum/numbers.length;
        return mean;}
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bitte Anzahl Noten eingeben");
        int gradesnumber=scanner.nextInt();                 //initialize variable to save number of grades;
        int [] grades= new int [gradesnumber];              //initialize array to save grades;
        for (int i = 0; i < grades.length; i++) {           //length of array as length of iteration
            System.out.println(i+1+". Note eingeben:");
            int gradeval = scanner.nextInt();
            grades[i]=gradeval;}                            //writes gradeval in position i in grades;

        System.out.println(meanarray(grades));

    }
}
