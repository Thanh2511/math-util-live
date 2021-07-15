
package com.fu.mathutil;

//Ta viết cái class để cung cấp tiện ích cho nơi khác xài
//khi ta cung cấp tiện ích cho nơi khác xài, đó là lúc ta 
//không cần nhớ gì cho riêng mình, Hàm static giúp ta làm diều này
public class MathUtil {
    // n! = 1.2.3.4.5.6...n
    //Quy ước: 0! = 1! = 1
    //không tính giai thừa cho số âm
    //20! là vừa khớp kiểu long tối da là 18 con số 0
    //21! lố kiểu long
    //Nếu đưa vào âm, 21 giai thừa---->chửi Exception vô mặt nó
    public static long getFactorial(int n){
        if(n < 0 || n > 20)
            throw new IllegalArgumentException
            ("Invalid argument. n must be between 0 and 20");
            //ném exception vào mặt nó, hàm dừng liền k cần return
        // n = 0...20
        if(n == 0 || n == 1) 
            return 1; //dừng ngay khi n đặc biệt
        //n = 2...20
        // chơi for hoặc đệ quy
        //kỹ thuật nhồi con heo đất, ốc bu nhồi thịt
        // i = 2, i = 3, i = 4, ...i = n nhồi liên tục i vào tích
        long product = 1; //tích khởi đầu = 1, nhồi 2, 3, 4, 5, 6, 7, 8,... n
        for (int i = 2; i <= n; i++) {
            product *= i;//Nhân từ 2 đến n
        }
        return product;
    }
}
