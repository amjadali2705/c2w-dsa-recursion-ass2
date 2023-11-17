class CheckArmstrongNo {

    //loop
    // static int countDigit(int num) {
    //     int count = 0;
    //     while(num != 0) {
    //         num /= 10;
    //         count++;
    //     }
    //     return count;
    // }

    // static boolean isArmstrongNo(int num) {
    //     int sum = 0;
    //     int count = countDigit(num);
    //     int temp = num;

    //     while(num != 0) {
    //         int digit = num%10;

    //         int power = 1;
    //         for(int i=1; i<=count; i++) {
    //             power *= digit;
    //         }
    //         sum += power;
    //         num /= 10;
    //     }

    //     if(sum == temp)
    //         return true;
    //     else
    //         return false;
    // }


    //recursion
    static int getLen(int num) {
        if(num/10 == 0)
            return 1;

        return getLen(num/10) + 1;
    }

    static int getArmstrongNoSum(int num, int getLen) {
        if(num == 0)
            return 0;

        int digit = num%10;
        return (int) Math.pow(digit, getLen) + getArmstrongNoSum(num/10, getLen);
    }

    public static void main(String[] args) {
        int num = 1634;
        int len = getLen(num);

        if(num == getArmstrongNoSum(num, len))
            System.out.println("Armstrong no");
        else
            System.out.println("Not a Armstrong No");
    }
}