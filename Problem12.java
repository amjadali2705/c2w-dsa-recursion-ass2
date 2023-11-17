class CheckCompositeNo {

    //loop
    // static boolean isCompositeNo(int num) {
    //     if(num <= 1)
    //         return false;

    //     for(int i=2; i<=num/2; i++) {
    //         if(num%i == 0)
    //             return true;
    //     }
    //     return false;
    // }


    //recursion
    static boolean isComposite(int num, int i) {
        if(num <= 1) 
            return false;

        if(i > num/2)
            return false;

        if(num%i == 0)
            return true;

        return isComposite(num, i+1);
    }

    public static void main(String[] args) {
        System.out.println(isComposite(6, 2));
    }
}