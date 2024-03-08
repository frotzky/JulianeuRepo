import java.util.Scanner;

public class hue_9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bitte beliebige ganze Zahl eingeben");
        int x=scanner.nextInt();
        int i=1;
        while (i<=100){ //bis 100 durchlaufen lassen
            if (i%x==0){               //wenn teilbar durch x mit 0 Rest
                System.out.println(i); //ausgeben lassen
            }
            i++;                        //ausgeben lassen
        }
    }
}
