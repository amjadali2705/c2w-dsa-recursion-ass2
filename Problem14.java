class CheckAutomorphicNo {

    //loop
    // static boolean isAutomorphicNo(int num) {
    //     int temp = num;
    //     int count=0;  
    //     int square = num*num;  
    //     while(temp>0) {  
    //         count++;  
    //         temp=temp/10;  
    //     }   
    //     int lastDigit = (int) (square % (Math.pow(10, count)));   
  
    //     if(num == lastDigit)  
    //         return true;
    //     else  
    //         return false;
    // }
    
    
    //recursion
    static boolean isAutomorphicNo(int num, int square, int i) {
        if(i > num) 
            return square % (int) Math.pow(10, (int) Math.log10(num) + 1) == num;

        if(square % (i*10) == num)
            return true;

        return isAutomorphicNo(num, square, i*10);
    }

    public static void main(String[] args) {
        System.out.println(isAutomorphicNo(625, 625*625, 1));
    }
}
