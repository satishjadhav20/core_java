package Switch;

public class Assign10 {
    public static void main(String[] args) {
        int rows = 4;
        int num = 1;

        for (int i = 1; i <= rows; i++) {
            int count = 1;

            StringBuilder pattern = new StringBuilder();

            for (int j = 1; j <= i; j++) {
                switch (count) {
                    case 1:
                        pattern.append(num++);
                        break;
                    case 2:
                        pattern.append(num++);
                        break;
                    case 3:
                        pattern.append(num++);
                        break;
                    case 4:
                        pattern.append(num++);
                        break;
                    default:
                        break;
                }
                count++;
            }

            System.out.println(pattern.toString());
        }
    }
}

