package cz.pavelgloss.homeworks.msd;

public class App {

    public static final int MAX = 100;
    public static final int MIN = 1;

    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.countingFromMaxToMin());
    }

    public String countingFromMaxToMin() {
        StringBuffer sb = new StringBuffer();
        for (int i = MAX; i >= MIN; i--) {
            if (i % 3 == 0) {
                if (i % 5 == 0) {      // by 3 and 5
                    sb.append(i + " Testing\n");

                } else {               // by 3
                    sb.append(i + " Software\n");
                }

            } else if (i % 5 == 0) {   // by 5
                sb.append(i + " Agile\n");
            }
        }
        return sb.toString();
    }
}
