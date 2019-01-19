package _00_Sorting_Algorithms;

public class HeapSorter extends Sorter {

	public HeapSorter() {
		type = "Heap";
	}
	
	//1. Since this sorting algorithm uses recursion, 
	//   we'll make a helper method called heapSort.
	//   Complete the steps in the heapSort method.
	//   You can use display.updateDisplay() to show the current
	//   progress on the graph.
	@Override
	void sort(int[] array, SortingVisualizer display) {
	    System.out.println("started");
		//8. create an integer called n and set it equal 
		int n = array.length;		
		//9. make a for loop that starts half way between
		//   0 and n and counts down until it is less than 0.
		//   Inside this for loop, call the heapSort method with n and i
		for(int p=(n/2); p>0;p--) {
			heapSort(array,n,p,display);
		    System.out.println("1");
			   
		}
     
        //10. make a for loop that starts at n-1 
        //    and counts down until it is less than 0.
        for(int k=n-1; k>0;k--) {
       int yeet= array[0];
       array[0]=array[k];
       array[k]=yeet;
       heapSort(array, k, 0, display);
       System.out.println("2");
        }
        	//11. swap the array elements at 0 and i.
 
            //12. call the heapSort method with i and 0
        display.updateDisplay();
	}
	
	public void heapSort(int[] array, int n, int i, SortingVisualizer display) {
	    System.out.println("called");
		
		//2. create an integer called largest and set it equal to i
	int largest = i;
	
		//3. create an integer called l and set it equal to 2 * i + 1
        int l=2*i+1;
		//4. create an integer called r and set it equal to 2 * i + 2
        int r=2*i+2;
        //5. if l is less than n 
        //   and array element at l is greater than array element at largest
        //   then set largest equal to l
        if(l<n&&array[l]>array[largest]) {
        	largest=l;
            System.out.println("3");
        	 
        }
 
        //6. if r is less than n
        if(r<n&&array[r]>array[largest]) {
        	largest=r;
            System.out.println("4");
        	  
        }
        //   and array element at r is greater than array element at largest
        //   then set largest equal to r
 
        //7. if largest is not equal to i
        if(largest!=i) {
        int yote=	array[i];
        array[i]=array[largest];
        		array[largest]=yote;
        		heapSort(array, n,largest, display);
        	    System.out.println("5");
        		
        }
        //   then swap the array elements at i and largest.
        //   Also, call the heapSort method with n and largest
        display.updateDisplay();
	}

}
