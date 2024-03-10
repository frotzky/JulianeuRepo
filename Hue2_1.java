public class Hue2_1 {
    public static double meanarray (int[] numbers){
        double sum=0;
        for (int number:numbers){
            sum=sum+number;
        }
        double mean=sum/numbers.length;
    return mean;}

    public static void main(String[] args) {

        int [] mean = {1,1,3,4,5};
        System.out.println(meanarray(mean));

    }
}
