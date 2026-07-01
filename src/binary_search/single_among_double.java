package src.binary_search;

public class single_among_double {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,4,5,6,6};

        if(arr.length == 1){
            System.out.println(arr[0]);
        }

        if(arr[0] != arr[1]){
            System.out.println(arr[0]);
        }

        if(arr[arr.length-1] != arr[arr.length-2]){
            System.out.println(arr[arr.length-1]);
        }

        int low = 0;
        int high = arr.length-1;

        while(low <=high){
            int mid = low + (high -low)/2;

            if(arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]){
                System.out.println(arr[mid]);
            }

            int fio = mid;
            int seo = mid;

            if(arr[mid] == arr[mid -1]){
                fio = mid +1;
            }
            if(arr[mid] == arr[mid +1]){
                seo = mid - 1;
            }

            int leftcount = fio - low;
            int rightcount = high - seo;

            if(leftcount % 2 ==0){
                low = seo + 1;
            }
            else 
                if(rightcount % 2 == 0){
                    high = fio -1;
                }
        }
        System.out.println();
    } 
}

