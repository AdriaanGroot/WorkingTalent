import java.util.Scanner;

public class javaopdracht7 {
    public static void main(String[] args) {
        String woord = "fiets";
        String beginstr = "";
        for (int i = 0; i < woord.length(); i++) {
            beginstr += "_";
        }
        int pogingen = 0;
        int maxpogingen = 5;

        Scanner scanner = new Scanner(System.in);
        System.out.println(beginstr);
        while (Lingo.guessed == 0) {
            if (pogingen > maxpogingen){
                System.out.println("Maximaal aantal pogingen bereikt");
                break;
            }
            String inputstr = scanner.nextLine();
            try {
                Lingo.compareLength(woord, inputstr);
            } catch (Exception e) {
                System.out.println("Woord niet even lang");
            }
            pogingen++;
        }
        scanner.close();
    }
}

class Lingo {
    static int guessed = 0;

    static void compareLength(String woord1, String woord2) {
        if (woord1.length() == woord2.length()) {
            compareWords(woord1, woord2);
        } else {
            throw new RuntimeException();
        }
    }

    static void compareWords(String woord1, String woord2) {
        String output = "";
        for (int i = 0; i < woord1.length(); i++) {
            if (woord1.charAt(i) == woord2.charAt(i)) {
                output += 2;
            } else if (woord1.indexOf(woord2.charAt(i)) > 0) {
                output += 1;
            } else {
                output += 0;
            }
        }
        System.out.println(output);

        String winstr = "";
        for (int i = 0; i < woord1.length(); i++) {
            winstr += "2";
        }

        if (output.equals(winstr)) {
            System.out.println("Je hebt het woord geraden");
            guessed = 1;
        }
    }
}
