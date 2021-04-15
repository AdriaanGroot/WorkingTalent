public class javaopdracht8 {
    public static void main(String[] args) {
        Kapitein kapitein1 = new Kapitein();
        Boot boot1 = new Boot();
        SpeedBoot speedboot1 = new SpeedBoot();

        kapitein1.varen(boot1);

        kapitein1.varen(speedboot1);
    }
}

class Boot {
    void starten() {
    }
}

class SpeedBoot extends Boot {
    void starten() {
        System.out.println("Ik zet even mijn pet af");
    }
}

class Kapitein {
    void varen(Boot boot) {
        System.out.println("Ik ga varen");
        boot.starten();
    }
}
