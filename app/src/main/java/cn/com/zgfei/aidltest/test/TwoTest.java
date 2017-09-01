package cn.com.zgfei.aidltest.test;

import android.content.Intent;
import android.util.Log;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by zgfei on 2017/8/15.
 */

public class TwoTest {

    /**
     * 倒序打印链表
     */
    public static void printRv(OneTest.OneNode<Integer> node) {
        if (node != null) {
            printRv(node.next);
            Log.e("=====", "====" + node.item);
        }
    }

    /**
     * 反转链表
     */
    public static void rvNode(OneTest.OneNode<Intent> node) {
        if (node == null) {
            return;
        }
        OneTest.OneNode<Intent> nodePre = null;
        OneTest.OneNode<Intent> nodeCurrent = node;
        while (nodeCurrent != null) {
            OneTest.OneNode<Intent> next = nodeCurrent.next;

            nodeCurrent.next = nodePre;
            nodePre = nodeCurrent;
            nodeCurrent = next;
        }
    }

    /**
     * 二分查找法
     */
    public static int binSearch(int[] array, int a) {
        int low = 0;
        int height = array.length - 1;
        while (low <= height) {
            int middle = (low + height) / 2;
            if (array[middle] < a) {
                low = middle + 1;
            } else if (array[middle] > a) {
                height = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

    /**
     * 单利模式的实现
     */
    //恶汉式
    /*private static final TwoTest TWO_TEST = new TwoTest();
    private TwoTest(){}
    public static TwoTest instance() {
        return TWO_TEST;
    }*/

    //懒汉式
    /*private static TwoTest TWO_TEST = null;
    private TwoTest() {}
    public static TwoTest instance() {
        if (TWO_TEST == null) {
            synchronized (TwoTest.class) {
                if (TWO_TEST == null) {
                    TWO_TEST = new TwoTest();
                }
            }
        }
        return TWO_TEST;
    }*/

    //静态内部类实现
    static class Instance{
        private static final TwoTest twoTest = new TwoTest();
    }
    private TwoTest() {}
    public static TwoTest instance() {
        return Instance.twoTest;
    }

    /**
     * 回环打印二维数组
     * 二维数组
     * 1  2  3  4
     * 5  6  7  8
     * 9  10 11 12
     * 13 14 15 16
     *
     */
    public static void printArray() {
        int[][] array = new int[][]{{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};

        int m = array.length;
        int n = array[0].length;


    }

    /**
     * 字符串反转
     *
     * hello world ==> world hello
     *
     * abcd ==> dcba
     */
    public static void rvSpaceString(String string) {
        if (!string.contains(" ")) {
            Log.e("=====", "====" + string);
            return;
        }

        String[] split = string.split(" ");
        List<String> stringList = Arrays.asList(split);
        Collections.reverse(stringList);

        for (String str : stringList) {
            Log.e("=====", "=====" + str);
        }
    }

    public static String rvStringJdk(String string) {
        return new StringBuilder(string).reverse().toString();
    }

    public static void rvString(String string) {
        char[] chars = string.toCharArray();
        for (int i = chars.length - 1; i >= 0; i++) {
            Log.e("====", "====" + chars[i]);
        }
    }

    /**
     * 给定一个int型 n，输出1~n的字符串例如 n = 4 输出“1 2 3 4”
     */
    public static void printIntString(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (i == n) {
                stringBuilder.append(i);
            } else {
                stringBuilder.append(i + " ");
            }
        }

        Log.e("====", "====" + stringBuilder.toString());
    }

    /**
     * 输出所有的笛卡尔积组合
     */
    public static void printDiKaErJi() {
        int[] array1 = new int[]{1,2,3,4};
        int[] array2 = new int[]{5,6,7,8};

        int m = array1.length;
        int n = array2.length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                Log.e("====", "===={" + array1[i] + "," + array2[j] + "}");
            }
        }
    }

    /**
     * 最长上升子序列
     */
    public static void maxTop() {

    }
}
