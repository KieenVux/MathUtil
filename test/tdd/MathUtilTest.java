/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import static kien.util.MathUtil.computeFactorial;
import static org.junit.Assert.assertEquals;
import org.junit.Test;



/**
 *
 * @author SE140616
 */
public class MathUtilTest {
    
    @Test// báo cho JVM biết rằng đây là hàm main()
    // trong hàm này chứa các lệnh để test code chính của mình
    //ở bên mathUtil
    // ta test cac tình huống thành công ở đây
    // thành công cF(5) => trả về 120 gọi là thành công
    public void testSuccessfullClasses(){
//        assertEquals(30, 50);
        // t kì vọng có 30 xem đưa vào thực tế là bao nhiêu
        //                              50
        // 2 thứ khớp nhau, xử lý theo dự kiến , đèn xanh, thông thường k như dự kiến
                        //đèn to, toang cmnr
//        assertEquals(120, computeFactorial(5));
//        assertEquals(720, computeFactorial(7));
//        assertEquals(1, computeFactorial(0));
//        assertEquals(1, computeFactorial(1));
//        assertEquals(2, computeFactorial(2));
        //muốn xanh, thì tất cả phải xanh, đúng hết cho mọi case
        // nếu tất cả xanh, có 1 thằng dỏ, coi như cả đám đỏ
        // vì hàm ý: code phải chạy đúng mọi tình huống
        // ta chỉ cần nhìn xanh đỏ, khỏi cần phải dò từng dòng bằng mắt

    }
    @Test(expected = IllegalArgumentException.class)
    // annotation là dấu @, dấu hiệu báo cho JVM và thư viên jar liên quan biết cần phải làm gì
    
    // hàm này chứa các tình huống cà chớn, vd: cF(-5), cF(16)
    public void testFailedClasses(){
        // t kì vọng ném ra expection thì coi như code mới ngon
        // vì -5 k tính ! đc, phải chửi
        // ngoại lệ k phải là 1 value có thể so sanh đc
        // nên minh k có xài hàm assertEqual() đc
        // vì hàm này cần 2 value expected va actual
        // trogn khi đó ném ra ngoại lệ là actual value để so sánh
        // ta phải xài chiều khác khi bắt gặp ngoại lệ
        //coi có đúng là ngoại lệ cần k?
        computeFactorial(-5);
    }
    
    // code có thể còn tiềm ẩn lỗi logic nhưng CLean & Built
    // luôn ra file .jar nếu code k sai cú pháp
    // vậy thì nguy hiểm lắm
    //mình phải DISABLE cái nút CLEAN & BUILT nếu code còn màu đỏ
    // túc là còn ERROR LOGIC
    // nhớ 2 con số: 1005 NetBean8, 1204 NetBeans 10 trở lên
    // khi chơi với ant project
    
}
