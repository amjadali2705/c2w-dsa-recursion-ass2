import java.util.HashSet;
import java.util.Set;

class CheckSadNo {

    //loop
    // static boolean isSadNo(int num) {
    //     Set<Integer> hSet = new HashSet<>();

    //     while(num!=1 && hSet.add(num)) {
    //         int sum = 0;
    //         while(num != 0) {
    //             int digit = num%10;
    //             sum += (digit*digit);
    //             num /= 10;
    //         }
    //         num = sum;
    //     }
    //     if(num == 1)
    //         return false;
    //     else
    //         return true;
    // }


    //recursion
    static boolean isSadNo(int num, Set<Integer> hSet) {
        if(num == 1)
            return false;

        if(!hSet.add(num))
            return true;

        int sum = squareSum(num);
        return isSadNo(sum, hSet);
    }

    static int squareSum(int num) {
        if(num == 0)
            return 0;

        int digit = num%10;
        return digit*digit + squareSum(num/10);
    }

    public static void main(String[] args) {
        System.out.println(isSadNo(4, new HashSet<>()));
    }
}