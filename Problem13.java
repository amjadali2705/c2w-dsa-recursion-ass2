class CheckAbundantNo {

    //loop
    // static boolean isAbundantNo(int num) {
    //     if(num <= 1)
    //         return false;

    //     int sum = 1;
    //     for(int i=2; i<=num/2; i++) {
    //         if(num%i == 0)
    //             sum += i;
    //     }
    //     if(sum > num)
    //         return true;
    //     else
    //         return false;
    // }


    //recursion
    static boolean isAbundantNo(int num, int i, int sum) {
        if(num <= 1)
            return false;

        if(i > num/2)
            return sum>num;

        if(num%i == 0)
            sum += i;

        return isAbundantNo(num, i+1, sum);
    }

    public static void main(String[] args) {
        System.out.println(isAbundantNo(18, 2, 1));
    }
}