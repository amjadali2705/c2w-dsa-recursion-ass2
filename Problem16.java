class CheckCubeNo {

    //loop
    // static boolean isCubeNo(int num) {
    //     int temp = 1;
    //     while(temp*temp*temp <= num) {
    //         if(temp*temp*temp == num)
    //             return true;

    //         temp++;
    //     }
    //     return false;
    // }


    //recursion
    static boolean isCubeNo(int num, int temp) {
        if(temp*temp*temp == num)
            return true;
        else if(temp*temp*temp > num)
            return false;

        return isCubeNo(num, temp+1);
    }

    public static void main(String[] args) {
        System.out.println(isCubeNo(125, 1));
    }
}