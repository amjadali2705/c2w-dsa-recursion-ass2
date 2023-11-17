class CheckPalindrome {

    //loop
    // static boolean isPalindrome(int num) {
    //     int temp = num;
    //     int rev = 0;
    //     while(temp != 0) {
    //         int rem = temp%10;
    //         rev = rev*10+rem;
    //         temp /= 10;
    //     }
    // }


    //recursion
    static int isPalindrome(int num, int rev) {
        if(num == 0)
            return rev;

        int rem = num%10;
        rev = (rev*10) + rem;
        return isPalindrome(num/10, rev);
    }

    public static void main(String[] args) {
        //System.out.println(isPalindrome(155, 0));
        int num = 121;
        int rev = isPalindrome(num, 0);

        if(num == rev)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}