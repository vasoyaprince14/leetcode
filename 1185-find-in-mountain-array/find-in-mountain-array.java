/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {

        int peak= findPeak(mountainArr);
        int awns1= bin(target, mountainArr,0 ,peak,true);
        if(awns1 != -1){
            return awns1;
        }
        else{
            return bin (target, mountainArr , peak+1, mountainArr.length() -1 , false);
        }
        
    }

    public int bin(int target, MountainArray arr, int s , int e , boolean isAsec){
        int mid =0;

        while(s <= e){
            mid = s + (e-s) /2;
            int num= arr.get(mid);
            if(num == target){
                return mid;
            }
            else if (num > target ){
                if(isAsec){
                    e= mid -1;
                }
                else{
                    s=mid+1;
                }
            }
            else{
                if(isAsec){
                    s= mid +1;
                }
                else{
                    e=mid-1;
                }

            }

        }
        return -1;

    }

    public int findPeak(MountainArray arr){
        int s = 0 ;
        int e = arr.length() -1;
        int mid =0;

        while(s < e){
            mid = s + (e-s) /2;
            int num= arr.get(mid);
            int nextNum = arr.get(mid +1);

            if (num>nextNum){
                e=mid;
            }
            else{
                s=mid+1;
            }

        }
        return s;
    }
}