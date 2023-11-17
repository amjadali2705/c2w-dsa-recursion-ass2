class CheckMagicNo {

    //loop
    // static boolean isMagicNo(int num) {
    //     while(num > 9) {
    //         int sum = 0;
    //         while(num != 0) {
    //             int digit = num%10;
    //             sum += digit;
    //             num /= 10;
    //         }
    //         num = sum;
    //     }
    //     if(num == 1)
    //         return true;
    //     else    
    //         return false;
    // }


    //recursion
    static boolean isMagicNo(int num) {
        if(num <= 9)
            return num==1;

        int sum = getSum(num);
        return isMagicNo(sum);
    }

    static int getSum(int num) {
        if(num/10 == 0) 
            return num;

        return getSum(num/10) + num%10;
    }


    public static void main(String[] args) {
        System.out.println(isMagicNo(1234));
    }
}