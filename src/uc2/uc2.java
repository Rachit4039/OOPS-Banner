package uc2;

public class uc2 {

    public static String[] getPattern(char ch) {
        ch = Character.toUpperCase(ch);

        switch (ch) {
            case 'O':
                return new String[]{
                        " ******** ",
                        "*        *",
                        "*        *",
                        "*        *",
                        "*        *",
                        "*        *",
                        " ******** "
                };
            case 'P':
                return new String[]{
                        "******** ",
                        "*       *",
                        "*       *",
                        "******** ",
                        "*        ",
                        "*        ",
                        "*        "
                };
            case 'S':
                return new String[]{
                        " ********",
                        "*        ",
                        "*        ",
                        " ********",
                        "        *",
                        "        *",
                        " ********"
                };
            default:
                return new String[]{
                        "*********",
                        "*       *",
                        "*       *",
                        "*   " + ch + "   *",
                        "*       *",
                        "*       *",
                        "*********"
                };
        }
    }

    // 👇 PUBLIC method to print banner
    public static void printOops() {

        char[] letters = {'O', 'O', 'P', 'S'};
        String[][] banner = new String[letters.length][];

        for (int i = 0; i < letters.length; i++) {
            banner[i] = getPattern(letters[i]);
        }

        for (int row = 0; row < 7; row++) {
            String[] lineParts = new String[letters.length];

            for (int i = 0; i < banner.length; i++) {
                lineParts[i] = banner[i][row];
            }

            System.out.println(String.join("  ", lineParts));
        }
    }
}
