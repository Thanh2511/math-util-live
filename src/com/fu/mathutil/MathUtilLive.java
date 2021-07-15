package com.fu.mathutil;

public class MathUtilLive {

    public static void main(String[] args) {        
        long result = MathUtil.getFactorial(5);
        System.out.println("Expected: 5! = 120; actual: "+result);
        //kỹ thuật kiểm thử phần mềm: ước lượng xem giá trị trả về của hàm là gì
        //expected value: 5! = 120
        //hàm ai đó viết chạy thực tế là mấy - actual, giả sử 120
        //if expected == actual, hàm đó ngon trong tình huống này
        MathUtil.getFactorial(21);
        System.out.println("Expected: 6! = 720; actual: " + MathUtil.getFactorial(6));
        System.out.println("Expected: 1! = 1; actual: " + MathUtil.getFactorial(1));
        System.out.println("Expected: 0! = 1; actual: " + MathUtil.getFactorial(0));
        
    }
    
}
