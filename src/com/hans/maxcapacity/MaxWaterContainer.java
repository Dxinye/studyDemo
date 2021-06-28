package com.hans.maxcapacity;

/**
 * 公司：Sunline
 * 作者：曾声强
 * 所属包 : com.hans.maxcapacity
 * 创建日期：2021/6/28 时间：14:26
 * 更新日期：2021/6/28 时间：14:26
 * 描述：盛水最多的水容器
 */
public class MaxWaterContainer {
    public int calculateMaxContainer(int[] arr){
        int result = 0;
        int left = 0;
        int right = arr.length-1;
        while (left < right){
            int area = Math.min(arr[left],arr[right])*(right-left);
            result = Math.max(result,area);
            if(arr[left] < arr[right]){
                left++;
            }else {
                right--;
            }
        }
        return result;
    }
}
