

class BinarySearch { 
 
    int binarySearch(int arr[], int m, int n, int x) 
    { 
        if (n>= m) { 
            int mid = m + (n- m) / 2; 
  
           
            if (arr[mid] == x) 
                return mid; 
  
 
            if (arr[mid] > x) 
                return binarySearch(arr, m, mid - 1, x); 

            return binarySearch(arr, mid + 1, n, x); 
        } 

        return -1; 
    } 
  
   
    public static void main(String args[]) 
    { 
        BinarySearch obj = new BinarySearch(); 
        int array[] = { 3,1,5,9,8}; 
        int n = array.length; 
        int elem = 9; 
        int result = obj.binarySearch(array, 0, n - 1, elem); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at index " + result); 
    } 
} 