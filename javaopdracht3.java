import java.util.Arrays;
class sumArray {
    public static void main(String[] args) {
        int[] na1 = {1,2,3,4};
        int[] na2 = {103,21,32,-54,0,1};
        int[] na3 = {91,0,-91};
        sumAr(na1);
        sumAr(na2);
        sumAr(na3);
    }
    static void sumAr(int[] numarray){
        int numsum = 0;
        for (int n: numarray){
            numsum += n;
        }
        System.out.println("The sum of " + Arrays.toString(numarray) + " is " + numsum);
    };

}