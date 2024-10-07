package Switch;

public class Assign11 {
    public static void main(String[] args) {
        int rows = 5; // Number of rows in the pattern

        for (int i = 1; i <= rows; i++) {
            StringBuilder pattern = new StringBuilder();

            for (int j = 1; j <= i; j++) {
                switch (j) {
                    case 1:
                        pattern.append("1");
                        break;
                    case 2:
                        pattern.append(" 2");
                        break;
                    case 3:
                        pattern.append(" 3");
                        break;
                    case 4:
                        pattern.append(" 4");
                        break;
                    case 5:
                        pattern.append(" 5");
                        break;
                    default:
                        break;
                }
            }

            System.out.println(pattern.toString());
        }
    }
}
