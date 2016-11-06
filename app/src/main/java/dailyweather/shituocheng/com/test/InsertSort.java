package dailyweather.shituocheng.com.test;

/**
 * Created by shituocheng on 2016/11/3.
 */

public class InsertSort {


    private void insertSort(){

        int[] a = {43,21,44,65};

        int tmp = 0;
        for (int i = 0; i < a.length; i++){
            int j = i - 1;
            tmp = a[i];
            for (; j >= 0 && tmp < a[j];j--){
                a[j+1] = a[j];
            }
            a[j+1] = tmp;
        }

        for (int i = 0; i < a.length; i++){

        }
    }
}
