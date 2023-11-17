class Fact {

    //loop
    // static int getFact(int num) {
    //     int fact = 1;
    //     for(int i=1; i<=num; i++) {
    //         fact *= i;
    //     }
    //     return fact;
    // }


    //recursion
    static int getFact(int num) {
        if(num==0 || num==1)
            return num;

        return num * getFact(num-1);
    }

    public static void main(String[] args) {
        System.out.println(getFact(5));
    }
}