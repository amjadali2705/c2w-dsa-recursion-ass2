class CheckStrongNo {

    //loop
    // static boolean isStrongNo(int num) {
    //     int temp = num;
    //     int sum = 0;
    //     while(num != 0) {
    //         int rem = num%10;

    //         int fact = 1;
    //         for(int i=1; i<= rem; i++) {
    //             fact *= i;
    //         }
    //         sum += fact;
    //         num /= 10;
    //     }
    //     if(temp == sum)
    //         return true;
    //     else 
    //         return false;
    // }


    //recursion
    static boolean isStrongNo(int num, int temp, int sum) {
        if(num == 0)
            return temp==sum;

        int digit = num%10;
        int fact = getFactorial(digit);
        return isStrongNo(num/10, temp, sum+fact);
    }

    static int getFactorial(int num) {
        if(num==0 || num==1)
            return 1;

        return num * getFactorial(num-1);
    }

    public static void main(String[] args) {
        System.out.println(isStrongNo(145, 145, 0));
    }
}