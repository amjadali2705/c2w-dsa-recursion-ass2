class ProdDigits {

    //loop
    // static int getProd(int num) {
    //     int prod = 1;
    //     while(num != 0) {
    //         prod *= num%10;
    //         num /= 10;
    //     }
    //     return prod;
    // }


    //recursion
    static int getProd(int num) {
        if(num/10 == 0) 
            return num;

        return getProd(num/10) * (num%10);
    }

    public static void main(String[] args) {
        System.out.println(getProd(1234));
    }
}