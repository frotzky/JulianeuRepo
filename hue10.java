public class hue10 {


    public static void main(String[] args) {

        for (int i =1; i <=10000; i++) {  //Zahlen von 1 bis 10000 ausgeben lassen
            int sum=0;                      //Summe jeder i Schleife bei 0 starten
            for (int j =1; j <i ; j++) {    //
                if (i%j==0){
                    sum=sum+j;

                }
            }
        if(sum==i){
            System.out.println(i);
        }
        }
    }
}