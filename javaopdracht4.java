import java.util.Arrays;
class sortArray {
    public static void main(String[] args) {
        int[] randomarray = {34,5,-4,12,1,100,16,17,-80,0};
        int[] randomarray2 = {3,2,3,3,5,6,8,9,5,43,32,2,35,6,7,5,4,3,2,23,32,2,111};
        sortAr(randomarray);
        sortAr(randomarray2);
    }
    public static void sortAr(int[] numarray){
        boolean sorted = false;
        while (sorted == false){
            sorted = true;
            int breakcount = 0;
            for (int n=0; n<numarray.length-1; n++){
                if (numarray[n] > numarray[n+1]){
                    int elem1 = numarray[n];
                    numarray[n] = numarray[n+1];
                    numarray[n+1] = elem1;
                    sorted = false;
                }
            }
            breakcount++;
            if (breakcount > 1000){
                break;
            };
        };
        System.out.println("Sorted array is " + Arrays.toString(numarray));
    }
}