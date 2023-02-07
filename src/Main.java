import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //пятая домашка
        //задача первая
        int[] arr = generateRandomArray();
        int sumExpenses = 0;
        for (int i = 0; i < arr.length; i++) {
            sumExpenses = sumExpenses + arr[i];
            System.out.println(i + ": " + arr[i]);
        }
        System.out.println("Сумма трат за месяц составила " + sumExpenses + " рублей");

        //вторая
        int minExpense = arr[0];
        int maxExpense = minExpense;
        for (int element : arr) {
            if (element < minExpense) {
                minExpense = element;
            }
            if (element > maxExpense) {
                maxExpense = element;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minExpense + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + maxExpense + " рублей");

        //третья
        float averageExpense = (float) sumExpenses / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageExpense + " рублей");

        //четвёртая
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0 ; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();

        //пятая
        int[][] matrix = new int[3][3];
        int setValue = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][i] = setValue;
                if ((i < j) && (j - i == matrix.length - 1)) {
                    matrix[i][j] = setValue;
                } else if ((i > j) && (i - j == matrix.length - 1)) {
                    matrix[i][j] = setValue;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        //шестая
        int[] arrFirst = {5, 4, 3, 2, 1};
        int[] arrSecond = new int[5];
        System.out.println(Arrays.toString(arrFirst));
        for (int i = 0; i < arrFirst.length; i++) {
            arrSecond[arrFirst.length - i - 1] = arrFirst[i];
        }
        for (int i: arrFirst) {
            arrFirst = arrSecond;
        }
        System.out.println(Arrays.toString(arrFirst));

        //седьмая
        System.out.println(Arrays.toString(arrFirst));
        int firstElement;
        int pastElement;
        int tempIndex;
        for (int i = 0; i < arrFirst.length/2; i++) {
            tempIndex = arrFirst.length - 1 - i;
            firstElement = arrFirst[tempIndex];
            pastElement = arrFirst[i];
            arrFirst[i] = firstElement;
            arrFirst[tempIndex] = pastElement;
        }
        System.out.println(Arrays.toString(arrFirst));

        //восьмая
        int[] arrSum = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        System.out.println(Arrays.toString(arrSum));
        int firstNumber;
        int secondNumber;
        boolean ifFistNumbers = true;
        for (int i = 0; i < arrSum.length; i++) {
            firstNumber = arrSum[i];
            for (int j = i + 1; j < arrSum.length; j++) {
                secondNumber = arrSum[j];
                if ((firstNumber + secondNumber == -2) && ifFistNumbers) {
                    ifFistNumbers = false;
                    System.out.println("Два числа, сумма которых равна -2, являются: " + firstNumber + " и " + secondNumber);
                }
            }
        }

        //девятая с тем же циклом
        System.out.print("Парами чисел, сумма которых равна -2, являются: ");
        for (int i = 0; i < arrSum.length; i++) {
            firstNumber = arrSum[i];
            for (int j = i + 1; j < arrSum.length; j++) {
                secondNumber = arrSum[j];
                if (firstNumber + secondNumber == -2) System.out.print(firstNumber + " и " + secondNumber + ", ");
            }
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}