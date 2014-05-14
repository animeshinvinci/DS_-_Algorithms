
public class BinarySearchAll {
	
	public BinarySearchAll() {
		super();
		// TODO Auto-generated constructor stub
	}

	private int firstOccurrenceBinarySearch1(int[] source, int needle) {
	    int low = 0;
	    int high = source.length - 1;
	    int firstOccurrence = Integer.MIN_VALUE;

	    while (low <= high) {
	        int middle = low + ((high - low) >>> 1);

	        if (source[middle] == needle) {
	            // key found and we want to search an earlier occurrence
	            firstOccurrence = middle;
	            high = middle - 1;
	        } else if (source[middle] < needle) {
	            low = middle + 1;
	        } else {
	            high = middle - 1;
	        }
	    }

	    if (firstOccurrence != Integer.MIN_VALUE) {
	        return firstOccurrence;
	    }

	    return -(low + 1);  // key not found
	}
	
	
	private int binarySearch(int[] source, int needle) {
	    int low = 0;
	    int high = source.length - 1;

	    while (low <= high) {
	        int middle = low + ((high - low) >>> 1);

	        if (source[middle] == needle) {
	            return middle;  // key found
	        } else if (source[middle] < needle) {
	            low = middle + 1;
	        } else {
	            high = middle - 1;
	        }
	    }

	    return -(low + 1);      // key not found
	}
	
	private int firstOccurrenceBinarySearch(int[] source, int needle) {
        int low = 0;
        int high = source.length - 1;
        int firstOccurrence = Integer.MIN_VALUE;

        while (low <= high) {
            int middle = low + ((high - low) >>> 1);

            if (source[middle] == needle) {
                // key found and we want to search an earlier occurrence
                firstOccurrence = middle;
                high = middle - 1;
            } else if (source[middle] < needle) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }

        if (firstOccurrence != Integer.MIN_VALUE) {
            return firstOccurrence;
        }

        return -(low + 1);  // key not found
    }
    int lowerBound(int[] array,int fromIndex, int toIndex, int key)
    {
        int low = fromIndex-1, high = toIndex;
        while (low+1 != high)
        {
            int mid = (low+high)>>>1;
            if (array[mid]< key) low=mid;
            else high=mid;
        }
        int p = high;
        if ( p >= toIndex || array[p] != key )
            p=-1;//no key found
        return p;
    }
    
    int upperBound(int[] array,int fromIndex, int toIndex, int key)
    {
        int low = fromIndex-1, high = toIndex;
        while (low+1 != high)
        {
            int mid = (low+high)>>>1;
            if (array[mid]> key) high=mid;
            else low=mid;
        }
        int p = low;
        if ( p >= toIndex || array[p] != key )
            p=-1;//no key found
        return p;
    }

}
