package module3;

public class AssignmentPart2 {

    public static void main(String[] args) {
        numSum ("5", "9");
        numSum("1", "8");
        numSum ("1", "15");
        numSum("10", "1");
        numSum("5","5");
        numSum("7", "2");}

    public static void numSum(String a, String b) {
        int sum = 0;
        int f = Integer.parseInt(a);
        int d = Integer.parseInt(b);
        int k =0;
        int j =0;

        if (f<d) {
            k = f;
            j = d;}
        else {k = d; j = f;}

        for (int i = k; i <= j; i++) {
            sum = sum + i;
            if (i == j) {
                System.out.print(i + " = " + sum);
            } else {
                System.out.print(i + " + ");
            }
        }
        System.out.println();
    }

}



