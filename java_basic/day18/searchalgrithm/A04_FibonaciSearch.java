package day18.searchalgrithm;

import java.util.Arrays;

public class A04_FibonaciSearch {
    public static final int N = 20;
    public static void main(String[] args) {
        int[] arr = {7, 23, 79, 81, 103, 127, 131, 147};
        int number = 82;

        System.out.println(fibonaciSearch(arr, number));
    }

    public static int[] getFibonaci() {
        int[] arr = new int[N];
        arr[0] = 1;
        arr[1] = 1;
        for(int i = 2; i < N; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }

        return arr;
    }

    public static int fibonaciSearch(int[] arr, int number) {
        int low_index = 0;
        int high_index = arr.length - 1;
        //表示斐波那契数分割数的下标值
        int index = 0;
        int middle_index = 0;
        int[] f = getFibonaci();
        //获取斐波那契分割数值的下标
        while(high_index > (f[index] - 1)) {
            index++;
        }
        //因为f[index]值可能大于a的长度，因此需要使用Arrays工具类，构造一个新数组，并指向temp[],不足的部分会使用0补齐
        int[] tmp = Arrays.copyOf(arr, f[index]);
        //实际需要使用arr数组的最后一个数来填充不足的部分
        for(int i = high_index + 1; i < tmp.length; i++) {
            tmp[i] = arr[high_index];
        }
        while(low_index <= high_index) {
            middle_index = low_index + f[index - 1] - 1;
            if(number < tmp[middle_index]) {
                high_index = middle_index - 1;
                /*
                  对index--进行理解
                  f[]记录的为tmp数组的分割数
                  1.全部元素=前面的元素+后面的元素, 即 tmp[:] = tmp[:middle_index - 1] + tmp[middle_index:]
                    此时number在tmp[:middle_index - 1]内，
                  2.f[index]=f[index-1]+f[index-2]
                  因为前面有k-1个元素没所以可以继续分为f[index-1]=f[index-2]+f[index-3]
                  即在f[index-1]的前面继续查找index--
                  即下次循环,mid=f[index-1-1]-1
                 */
                index--;
            }else if(number > tmp[middle_index]) {
                low_index = middle_index + 1;
                index -= 2;
            }else {
                if(middle_index <= high_index) {
                    return middle_index;
                }else {
                    return high_index;
                }
            }
        }

        return -1;
  
    }
}
