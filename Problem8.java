class CheckPerfectNo {

    //loop
    // static boolean isPerfectNo(int num) {
    //     int sum = 0;
    //     for(int i=1; i<=num/2; i++) {
    //         if(num%i == 0)
    //             sum += i;
    //     }
    //     if(sum == num)
    //         return true;
    //     else    
    //         return false;
    // }


    //recursion
    static boolean isPerfectNo(int num, int i, int sum) {
        if(i > num/2)
            return sum==num;

        if(num%i == 0)
            sum += i;

        return isPerfectNo(num, i+1, sum);
    }

    public static void main(String[] args) {
        System.out.println(isPerfectNo(28, 1, 0));
    }
}