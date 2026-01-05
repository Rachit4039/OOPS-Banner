package uc4;

public class uc4 {

    public static void printBanner() {

        String[] O1 = OPattern.getPattern();
        String[] O2 = OPattern.getPattern();
        String[] P  = PPattern.getPattern();
        String[] S  = SPattern.getPattern();

        for (int i = 0; i < 7; i++) {
            System.out.println(
                    O1[i] + "  " +
                            O2[i] + "  " +
                            P[i]  + "  " +
                            S[i]
            );
        }
    }
}
