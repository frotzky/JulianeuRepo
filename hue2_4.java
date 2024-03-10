import java.util.Arrays;
import java.util.Scanner;

public class hue2_4 {

    public static double subjectmean (int[] numbers){
        double sum=0;
        for (int number:numbers){
            sum=sum+number;
        }
        double mean=sum/numbers.length;
        return mean;}

    public static double meanoverall (int [][] grades){
        double sum=0;
        for (int i = 0; i < grades.length; i++) {
            double result=subjectmean(grades[i]);
            sum=sum+result;
        }
        double mean=sum/grades.length;
        return mean;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Bitte Anzahl der Fächer eingeben");
        int n=scanner.nextInt();
        int [][] grades = new int [n][];

        for (int i = 0; i < n; i++) {
            System.out.println("Wieviele Noten im "+ (i+1) +". Fach?");
            int gradenumbers=scanner.nextInt();
            grades [i] =new int [gradenumbers];              //zuweisen, wieviele Noten
            for (int j = 0; j < gradenumbers; j++) {
                System.out.println("Welche Note im " + (j+1) +". Fach?");
                int gradeval=scanner.nextInt();
                grades [i][j] =gradeval;                        //zuweisen, welche Noten in welchem Fach
            }
            System.out.println("Notenschnitt für Fach " +(i+1));
            System.out.println(subjectmean(grades[i]));


        }

        System.out.println("Gesamtnotenschnitt ist ");
        System.out.println(meanoverall(grades));
        
    }
}
