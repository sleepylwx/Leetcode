import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMedianSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {




        int[] temp;
        if(nums1.length > nums2.length){

            temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }
        if(nums1.length == 0){

            if(nums2.length % 2 ==0){

                int index = nums2.length/2;
                return (nums2[index] + nums2[index-1])/2.0;
            }
            else{

                return nums2[nums2.length/2];
            }
        }
        int m = nums1.length;
        int n = nums2.length;
        int i;
        int j;
        int left = 0;
        int right = nums1.length;


        int maxLeft = 0;
        int minRight = 0;

        while(left <= right){

            i = (left+right)/2;
            j = (m+n)/2 - i;

            if(i > 0 && nums1[i-1] > nums2[j]){


                right = i - 1;
            }
            else if(i < m && nums2[j-1] > nums1[i]){


                left = i + 1;
            }
            else{

                if(i == 0){

                    maxLeft = nums2[j-1];

                    if(j == n){

                        minRight = nums1[i];
                    }
                    else{

                        minRight = Math.min(nums1[i],nums2[j]);
                    }


                }
                else if(i == m){

                    minRight = nums2[j];

                    if(j == 0){

                        maxLeft = nums1[i-1];
                    }
                    else{

                        maxLeft = Math.max(nums1[i-1],nums2[j-1]);
                    }

                }
                else{

                    maxLeft = Math.max(nums1[i-1],nums2[j-1]);
                    minRight = Math.min(nums1[i],nums2[j]);
                }

                break;
            }



        }


        if((m+n)%2 == 0){

            return (maxLeft+minRight)/2.0;
        }
        else{

            return minRight;
        }

    }


}
