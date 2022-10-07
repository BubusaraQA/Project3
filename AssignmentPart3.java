package module3;

public class AssignmentPart3 {
    public static void main(String[] args) {

        int max = 30;
        int med = max / 2 + 1;

        for (int i = 0; i < med; i++) {
            for (int j = 1; j < med; j++) {
                if (j > i) {
                    System.out.print("@");
                } else {
                    System.out.print(' ');
                }
            }
            for (int j = med + 1; j < max; j++) {
                if (j < max - i) {
                    System.out.print("@");
                } else {
                    System.out.print("+");
                }
            }
            System.out.println();
        }
    }
}

