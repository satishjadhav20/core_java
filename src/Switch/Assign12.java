package Switch;

public class Assign12 {
    public static void main(String[] args) {
        int rows = 5;
        int startNumber = 5;

        for (int i = 1; i <= rows; i++) {
            StringBuilder pattern = new StringBuilder();
            int currentNumber = startNumber;

            for (int j = 1; j <= i; j++) {
                switch (j) {
                    case 1:
                        pattern.append(currentNumber);
                        break;
                    case 2:
                        pattern.insert(0, currentNumber - 1);
                        break;
                    case 3:
                        pattern.insert(0, currentNumber - 2);
                        break;
                    case 4:
                        pattern.insert(0, currentNumber - 3);
                        break;
                    case 5:
                        pattern.insert(0, currentNumber - 4);
                        break;
                    default:
                        break;
                }
                currentNumber--;
            }

            System.out.println(pattern.toString());
            startNumber--;
        }
    }
}




