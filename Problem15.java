class CheckDuckNo {

    //loop
    // static boolean isDuckNo(int num) {
    //     if(num == 0)
    //         return false;

    //     while(num != 0) {
    //         int digit = num%10;
    //         if(digit == 0)
    //             return true;

    //         num /= 10;
    //     }
    //     return false;
    // }


    //recursion
    static boolean isDuckNo(int num) {
        if(num == 0)
            return false;

        int digit = num%10;
        if(digit == 0)
            return true;

        return isDuckNo(num/10);
    }

    public static void main(String[] args) {
        System.out.println(isDuckNo(620));
    }
}