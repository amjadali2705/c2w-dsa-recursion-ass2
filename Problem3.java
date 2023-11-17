class MaxDigit {

    //loop
    // static int getMax(int num) {
    //     int maxNo = Integer.MIN_VALUE;
    //     while(num != 0) {
    //         if(num%10 > maxNo)
    //             maxNo = num%10;

    //         num /= 10;
    //     }
    //     return maxNo;
    // }


    //recursion
    static int maxNo = Integer.MIN_VALUE;
    static int getMax(int num) {
        if(num != 0) {
            if(num%10 > maxNo)
                maxNo = num%10;

            getMax(num/10);
        }
        return maxNo;
    }

    public static void main(String[] args) {
        System.out.println(getMax(1234286));
    }
}