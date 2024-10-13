/* class Solution
{
	int  select(int arr[], int i)
	{
        // code here such that selectionSort() sorts arr[]
        int mini = i, n = arr.length;
        for(int j=i; j<=n-1; j++) {
            //finding minimum index in an interation
            if(arr[j] < arr[mini]) {
                mini = j;
            }
        }
        return mini;
	}
	
	void selectionSort(int arr[], int n)
	{
	    //code here
	    for(int i=0; i<=n-2; i++) {
	        //finding minimum in each iteration and swapping
	        int mini = select(arr, i);
	        if(mini != i) {
	            int temp = arr[i];
	            arr[i] = arr[mini];
	            arr[mini] = temp;
	        }
	    }
	    
	}
} */