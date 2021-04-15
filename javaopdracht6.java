import java.util.Scanner;

public class javaopdracht6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scanner.nextLine();
        System.out.println("The string in alphabetical order:");
        System.out.println(sortString(str));
        scanner.close();
    }

    public static char[] sortString(String str) {
        char[] chars = str.toCharArray();
        char[] charSorted = sortChars(chars);
        return charSorted;
    }

    public static char[] sortChars(char[] chararray) {
        boolean sorted = false;
        while (sorted == false) {
            sorted = true;
            int breakcount = 0;
            for (int n = 0; n < chararray.length - 1; n++) {
                if (chararray[n] > chararray[n + 1]) {
                    char elem1 = chararray[n];
                    chararray[n] = chararray[n + 1];
                    chararray[n + 1] = elem1;
                    sorted = false;
                }
            }
            breakcount++;
            if (breakcount > 1000) {
                break;
            }
            ;
        }
        ;
        return chararray;
    }
}
