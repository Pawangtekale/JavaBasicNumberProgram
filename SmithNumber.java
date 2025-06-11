class SmithNumber {
    public static void main(String[] args) {
        int num = 666;
        int sum = sum(num);
        int sumOfFactor = sumOfPrimeFactor(num);

        if (sum == sumOfFactor) {
            System.out.println("It is a Smith Number");
        } else {
            System.out.println("It is not a Smith Number");
        }
    }

    public static int sum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static int sumOfPrimeFactor(int num) {
        int i = 2;
        int sum = 0;
        while (num > 1) {
            if (num % i == 0) {
                sum += sum(i);
                num /= i;  // <<< FIXED: Reduce the number
            } else {
                i++;
            }
        }
        return sum;
    }
}
