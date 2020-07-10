/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kien.util;

/**
 *
 * @author SE140616
 */
// đây là classs chứa các hàm toán học, tính toán, với mục tiêu xài chung
// cho các nơi khác, phàm cái gì mang tinh chất xài chung , ta sx dùng STATIC
public class MathUtil {
    // tính n! = 1.2.3....n vì n! tăng giá trị rất nhanh, sớm tràn miền int
    // int chỉ tối đá 2 tỷ 1, nên ta xài long mới an toàn
    // thực ra 15! to lắm rồi, nên ta chỉ tính giai thưa từ 15 trở lại
    public static long computeFactorial(int n){
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
