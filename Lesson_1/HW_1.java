package Lesson_1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HW_1 {

    /**
     Bài tập:
     LINK: https://drive.google.com/drive/folders/1zydCoz7xAo6lL7J2ogBUYN-DSpaxs4RK?usp=sharing
     1. Hãy viết method nhận vào 2 số nguyên, hãy kiểm tra xem hai số này có ước chung hay không? Viết test method.
     2. Hãy viết một method nhận vào một số nguyên, sau đó kiểm tra số này có phải là số nguyên tố không? Viet Test method
     3. Hãy viết một method nhận vào một số nguyên, sau đó liệt kê ra màn hình các cặp số mà có tổng bằng số này.
     Gợi ý: dùng 2 vòng lặp lồng nhau để lần lượt xác định 2 số.
     4. Hãy viết một method nhận vào một số nguyên, hãy tính tổng các số nguyên to nhỏ hơn số này. Viết Test method
     */
    public class AppTest
    {

        /**
         * 1. Hãy viết method nhận vào 2 số nguyên, hãy kiểm tra xem hai số này có ước chung hay không? Viết test method.
         */
        public boolean TimUocChung(int a, int b)
        {
            for(int i=2; i<=a && i<=b; i++)
            {
                if ( a%i==0 && b%i==0) {
                    return true;
                }
            }
            return false;
        }
        @Test
        public void Check_CoUocChung()
        {
            int a=2;
            int b=6;
            boolean expected=true;
            boolean actual=TimUocChung(a,b);
            assertEquals(expected,actual);
        }
        @Test
        public void Check_KhongCoUocChung()
        {
            int a=5;
            int b=6;
            boolean expected=false;
            boolean actual=TimUocChung(a,b);
            assertEquals(expected,actual);
        }
        /**
         *  2. Hãy viết một method nhận vào một số nguyên, sau đó kiểm tra số này có phải là số nguyên tố không? Viet Test method
         */
        public boolean KT_SoNguyenTo(int a)
        {
            boolean kq=true;
            // bổ sung làm còn thíu
            if (a<2) kq=false;
            for (int i=2;i<=a/2;i++)
            {
                if(a%i==0)
                {
                    kq=false;
                    break;
                }
            }
            return kq;
        }
        // hạn chế return trong các hàm
        @Test
        public void Check_LaSoNT()
        {
            int a=7;
            boolean expected=true;
            boolean actual = KT_SoNguyenTo(a);
            assertEquals(expected,actual);
        }
        @Test
        public void Check_KhongPhaiSoNT()
        {
            int a=8;
            boolean expected=false;
            boolean actual = KT_SoNguyenTo(a);
            assertEquals(expected,actual);
        }

        /**
         *  3.Hãy viết một method nhận vào một số nguyên, sau đó liệt kê ra màn hình các cặp số mà có tổng bằng số này.
         */
        public void LietKeTongCacSoBangN(int n)
        {
            for(int i=1;i<n/2;i++)
            {
                for (int j=i;j<n;j++)
                {
                    if(i+j==n) {
                        System.out.println(i + "  " + j);
                    }
                }
            }
        }
        @Test
        public void LietKe_CacsoBangN()
        {
            LietKeTongCacSoBangN(10);
        }
        /**
         *  4. Hãy viết một method nhận vào một số nguyên, sau đó kiểm tra số này có phải là số nguyên tố không? Viet Test method
         */
        public int TinhTongSNT(int n)
        {
            int kq=0;
            for ( int i=0;i<=n;i++)
            {
                if(KT_SoNguyenTo(i)==true)
                {
                    kq+=i;
                }
            }
            return kq;
        }
        @Test
        public void Tong_SoNT()
        {
            int a=9;
            int expected=17;
            int actual = TinhTongSNT(a);
            assertEquals(expected,actual);
        }


    }

}
