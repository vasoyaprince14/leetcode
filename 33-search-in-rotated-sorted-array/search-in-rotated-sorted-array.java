class Solution {
    public int search(int[] arr, int target) {
        int s = 0;
        int e = arr.length -1;

        int peak = findPeak(arr);

        if(peak==-1){
            return bin (s,e,arr,target);
        }
        if (arr[peak]==target){
            return peak;
        }
        if (target >= arr[s]){
            return bin (s ,peak,arr,target);
        }
        else{
            return bin (peak+1,e, arr, target);
        }
        // return awns1;
    }

    public int findPeak(int arr[]){
        int s = 0;
        int e = arr.length -1;
        int mid = 0;

        while(s<=e){
            mid = s + (e-s)/2;
            if(mid + 1 <= e && arr[mid]> arr[mid+1]){
                return mid;
            }
            if(mid -1 >=s && arr[mid-1]> arr[mid]){
                return mid-1;
            }
            if(arr[s] >= arr[mid]){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return -1;
    }

    public int bin (int s, int e, int arr[], int num){
        int mid = 0;

        while(s<=e){
            mid = s + (e-s)/2;
            if(arr[mid]==num){
                return mid;
            }
            else if (arr[mid]> num){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return -1;
    }
}