class CheckDeficientNo {

    //loop
    // static boolean isDeficientNo(int num) {
    //     if(num <= 1)
    //         return false;

    //     int sum = 1;
    //     for(int i=2; i<=Math.sqrt(num); i++) {
    //         if(num%i == 0) {
    //             sum += i;
    //             if(i != num/i)
    //                 sum += num/i;
    //         }
    //     }
    //     if(sum < num)
    //         return true;
    //     else
    //         return false;
    // }


    //recursion
    static boolean isDeficientNo(int num, int i, int sum) {
        if(num <= 1)
            return false;
            
        if(i > Math.sqrt(num))
            return sum<num;

        if(num%i == 0)
            sum += i;

        if(i != num/i)
            sum += num/i;

        return isDeficientNo(num, i+1, sum);
    }

    public static void main(String[] args) {
        System.out.println(isDeficientNo(8, 2, 1));
    }
}