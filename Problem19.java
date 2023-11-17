class CheckSquareNo {

    //loop
    // static boolean isSquareNo(int num) {
    //     int temp = 1;
    //     while(temp*temp <= num) {
    //         if(temp*temp == num)
    //             return true;

    //         temp++;
    //     }
    //     return false;
    // }


    //recursion
    static boolean isSquareNo(int num, int temp) {
        if(temp*temp == num)
            return true;
        else if(temp*temp > num)
            return false;

        return isSquareNo(num, temp+1);
    }

    public static void main(String[] args) {
        System.out.println(isSquareNo(25, 1));
    }
}