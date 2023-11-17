class OddNoSum {

    //loop
    // static int getOddSum(int num) {
    //     int sum = 0;
    //     for(int i=1; i<=num; i++) {
    //         if(num%i == 1)
    //             sum += num;
    //     }
    //     return sum;
    // }


    //recursion
    static int getOddSum(int num) {
        if(num <= 0)
            return 0;
        else if(num%2 == 0)
            return getOddSum(num-1);
        else
            return num + getOddSum(num-1);
    }

    public static void main(String[] args) {
        System.out.println(getOddSum(6));
    }
}