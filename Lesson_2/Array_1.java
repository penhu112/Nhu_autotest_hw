package Lesson_2;

import  org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Bài 1: Cho 1 dãy số nguyên bất kỳ, hãy đếm xem có bao nhiêu số xuất hiện nhiều hơn 1 lần trong mảng đó.
 * Bài 2: Cho 2 dãy số nguyên bất kỳ, hãy đưa ra dãy số có tổng các số lớn hơn trong 2 dãy đó.
 * Bài 3: Cho một số nguyên n bất kỳ, hãy đưa ra dãy số fibonaci có độ dài n phần tử.
 * Bài 4: Viết giải thuật tính tổng của hai mảng. Tổng của hai mảng đc định nghĩa C[i] = A[i] + B[i]
 */
public class Array_1 {
    // cho 1 dãy số , hay xem có bao nhiu số chẳn trong đo
    public int DemSoChan(int[] n)
    {
        int dem=0;
        for(int i=1;i<n.length;i++)
        {
            if(n[i]%2==0 && dem>=2)
            {
                dem++;
            }
        }
        return dem;
    }
    /**
     *  Bài 1: Cho 1 dãy số nguyên bất kỳ, hãy đếm xem có bao nhiêu số xuất hiện nhiều hơn 1 lần trong mảng đó.
     */
    public int DemSoLanXuatHienHon1(int[] n)
    {
        int dem=0;
                for (int i = 0; i < n.length; i++) {
                    for (int j = i+1; j < n.length ; j++) {
                        if (n[i] == n[j]) {
                            dem++;
                        }
                    }
                }
        return dem;

    }
    @Test
    public void TestB1_Pass()
    {
        int [] arrayNumbers={0,1,1,2,2,3,4,4,8};
        int expected=3;
        int actual=DemSoLanXuatHienHon1(arrayNumbers);
        assertEquals(expected,actual);
    }
    @Test
    public void TestB1_Fail()
    {
        int [] arrayNumbers={0,1,1,2,2,3,4,4,8};
        int expected=2;
        int actual=DemSoLanXuatHienHon1(arrayNumbers);
        assertEquals(expected,actual);
    }
    /**
     *  Bài 2: Cho 2 dãy số nguyên bất kỳ, hãy đưa ra dãy số có tổng các số lớn hơn trong 2 dãy đó.
     */
    public int[] Bai2_SoSanhDaySo(int[] n, int[] m)
    {
        int sum_dayN=0;
        int sum_dayM=0;
        int [] kq=n;
        for(int i=0;i<n.length;i++)
        {
            sum_dayN=+sum_dayN+n[i];
        }
        for(int i=0;i<m.length;i++)
        {
            sum_dayM=+sum_dayM+m[i];
        }
        if(sum_dayM==sum_dayN)
        {
            kq=n=m;
        }
        if(sum_dayM<sum_dayN)
        {
            kq=n;
        }
        else {kq=m;}
        return kq;

    }

    @Test
    public void Test_Bai2_Case1_pass()
    {
        int [] array1={0,0,8};
        int [] array2={0,8,0};
        int [] expected ={0,8,0};
        int [] actual = Bai2_SoSanhDaySo(array1,array2);
        assertArrayEquals(expected,actual);
    }
    @Test
    public void Test_Bai2_Case2_pass()
    {
        int [] array1={0,4,8};
        int [] array2={0,4,8};
        int [] expected = {0};
        int [] actual = Bai2_SoSanhDaySo(array1,array2);
        assertArrayEquals(expected,actual);
    }
    /**
     * Bài 4: Viết giải thuật tính tổng của hai mảng. Tổng của hai mảng đc định nghĩa C[i] = A[i] + B[i]
    **/
    public int sum2Mang(int [] m1, int [] m2)
    {
        int sum2M=0, sumM1=0, sumM2=0;
        for(int i=0;i<m1.length;i++)
        {
                sumM1=sumM1+m1[i];
        }
        for (int j = 0; j < m2.length; j++)
        {
            sumM2=sumM2+m2[j];
        }
        sum2M=sumM1+sumM2;
        return sum2M;
    }
    @Test
    public void Test_Bai4_Case1_pass()
    {
        int [] array1={0,4,5};
        int [] array2={0,4};
        int expected = 13;
        int actual = this.sum2Mang(array1,array2);
        assertEquals(expected,actual);
    }
    @Test
    public void Test_Bai4_Case1_fail()
    {
        int [] array1={0,4,5};
        int [] array2={0,4};
        int expected = 10;
        int actual = this.sum2Mang(array1,array2);
        assertEquals(expected,actual);
    }
/**
 * Bài 3: Cho một số nguyên n bất kỳ, hãy đưa ra dãy số fibonaci có độ dài n phần tử.
 */
    public int[] Finonaci(int n)
    {
        int [] kq=new int[n];
        if(n==1)
        {
            kq[0]=0;
        } else if (n==0) {
            kq[0]=0;
        }

        else
        {
            for(int i=2;i<n;i++)
            {
                kq[i]=kq[i-2]+kq[i-1];
            }
        }
        return kq;
    }

    @Test
    public void Test_Bai3_Finonaci() {
        int n = 1;
        int[] expected = {0};
        int[] actual = this.Finonaci(n);
        assertArrayEquals(expected, actual);
    }

}
