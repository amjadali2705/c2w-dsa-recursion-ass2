class TriangularNoSum {

    //loop
    // static int getTriangularSum(int num) {
    //     int sum = 0;
    //     for(int i=1; i<=num; i++) {
    //         int triNum = i*(i+1)/2;
    //         sum += triNum;
    //     }
    //     return sum;
    // }


    //recursion
    static int getTriangularSum(int num) {
        if(num == 0)
            return 0;

        int temp = num;
        int tri = temp*(temp+1)/2;
        return tri + getTriangularSum(num-1);
    }

    public static void main(String[] args) {
        System.out.println(getTriangularSum(4));
    }
}