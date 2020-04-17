public class CompleteArray {
        public static void main(String[] args) {
            int[] numbers = {2, 29, 33, 4, 15, 62, 7, 81, 9, 10};
            int total = 0;
            int i;
            numbers = new int[10];
            // This is where the array holds the total number between 1-10 //
            numbers[0] = 2;
            numbers[1] = 29;
            numbers[2] = 33;
            numbers[3] = 4;
            numbers[4] = 15;
            numbers[5] = 62;
            numbers[6] = 7;
            numbers[7] = 81;
            numbers[8] = 9;
            numbers[9] = 10;
            // This is where the array adds the sum of the number together //
            for (i = 0; i < 10; i++)
                total = total + numbers[i];
            System.out.println("Sum of the number is: " + total);
            // This is where the array prints the total where the sum is added //
        }
}
