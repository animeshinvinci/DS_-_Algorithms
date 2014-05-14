
public class BinarySearch {
	
	public static void main(String[] args) {
		int[] a = {0,0,0,1,1,1,2,2,2,2,2,2,3,4,4,4,5};
		//int[] a = {0,0,0}; //1,1,1,2,2,2,2,2,2,3,4,4,4,5};
		int x = 2;
		//binarySearchFirst(a,4);
		binarySearchLast(a,2);
	}

	private static void binarySearchLast(int[] a, int i) {
		// TODO Auto-generated method stub
		
int start = 0;
		
		int mid = 0 ;
		
		int end = a.length;
		
		while(start<end){
			mid = 	((start + end)/2);
			System.out.println(mid);
			if (a[mid] == i){
				start = mid;
			}
			else if(a[mid] < i){
				start = mid + 1;
			}
			else if(a[mid] > i)
				end = mid -1 ;
			if (start==end){
				mid = start;
			}
			System.out.println("Start  " + start);
			System.out.println("end  " +end);
		}
		if(a.length > mid && a[mid] == i){
			System.out.println("find  "  +  mid);
			return ;
		}
		else{
			System.out.println("Not Found");
		}
		
	}

	private static void binarySearchFirst(int[] a, int i) {
		// TODO Auto-generated method stub
		int start = 0;
		
		int mid = 0 ;
		
		int end = a.length;
		
		while(start<end){
			mid = 	((start + end)/2);
			System.out.println(mid);
			if (a[mid] == i){
				end = mid;
			}
			else if(a[mid] < i){
				start = mid + 1;
			}
				
			else if(a[mid] > i)
				end = mid -1 ;
			
			if (start==end){
				mid = start;
			}
			System.out.println("Start  " + start);
			System.out.println("end  " +end);
		}
		if(a.length > mid && a[mid] == i){
			System.out.println("find  "  +  mid);
			return ;
		}
		else{
			System.out.println("Not Found");
		}
	}

	
}
