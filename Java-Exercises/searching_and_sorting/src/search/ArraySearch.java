package search;

//--tarunj096

public class ArraySearch {
    private static int linear(int arr[],int ele){  //Time complexity - N
        for(int i =0;i<arr.length;i++){
            if(arr[i]==ele){
                return i;
            }
        }
        return -1;
    }
    private static int binary(int arr[],int ele){   //Time Complexity-logN
        int s=0,e=arr.length-1;
        int mid=0;
        while(s<=e){
            mid = (s+e)/2;
            if(arr[mid]==ele){
                return mid;
            }else if(ele<arr[mid]){
                e=mid-1;
            } else if(ele>arr[mid]){
                s=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int simplearr[] ={1,2,8,19,45,67,98};
        int ele = 98;
        //int eleL = linear(simplearr,ele);
        int eleL = binary(simplearr,ele);
        System.out.println(eleL);
    }
}
