class CheckHarshadNo {

    //loop
    // static boolean isHarshadNo(int num) {
    //     int sum = 0;
    //     int temp = num;
    //     while(num != 0) {
    //         int digit = num%10;
    //         sum += digit;
    //         num /= 10;
    //     }
    //     if(temp%sum == 0)
    //         return true;
    //     else
    //         return false;
    // }


    //recursion
    static int getSum(int num) {
        if(num/10 == 0) 
            return num;

        return getSum(num/10) + num%10;
    }

    static boolean isHarshadNo(int num, int sum) {
        return num%sum == 0;
    }
    
    public static void main(String[] args) {
        System.out.println(isHarshadNo(1729, getSum(1729)));
    }
}