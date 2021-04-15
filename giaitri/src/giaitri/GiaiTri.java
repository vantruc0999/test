package giaitri;

import java.util.LinkedList;

// tao constructor
class ListNode{
	private ListNode next;
	private int info;
	
	ListNode(int info){
		this.info = info;
		this.next = null;
	}
}

public class GiaiTri {
//	public static int[] runningSum(int[] nums) {
//        int sum = nums[0];
//        for(int i=1; i<nums.length; i++) {
//        	sum += nums[i];
//        	nums[i] = sum;
//        }
//        return nums;
//    }
	
//	public static int[] shuffle(int[] nums, int n) {
//        int res[] = new int [2*n];     
//        int c = 0;
//        for(int i=0; i<n; i++) {
//        	res[c] = nums[i];
//        	res[c+1] = nums[i+n];
//        	c += 2;
//        }
//        nums = res;
//        for(int i=0; i<nums.length; i++)
//        	System.out.print(+nums[i]+" ");
//        return nums;
//    }
	 public static int[] smallerNumbersThanCurrent(int[] nums) {
		 	int []res = new int [nums.length];
		 	for(int i=0; i<nums.length; i++) {
		 		int c = 0;
		 		for(int j=0; j<nums.length; j++)
		 			if(nums[i]>nums[j]) c++;
		 		res[i] = c;
		 	}
		 	for(int i=0; i<res.length; i++)
		 		System.out.print(res[i]+" ");
	        return res;
	    }
	 
	 public static int getDecimalValue(ListNode head) {
		 	
	        return 0;
	 }
	 //dao mang
	 public static void reverseArray(int a[]) {
		 for(int i=0; i<a.length/2; i++) {
			 int temp = a[i];
			 a[i] = a[a.length-i-1];
			 a[a.length-i-1] = temp;
		 }
	 }
	 
	public static void main(String[] args) {
			
			int a[] = {6,5,4,8};
//			shuffle(a, 3);
//			smallerNumbersThanCurrent(a);
//			System.out.println();
			for(int i=0; i<a.length; i++)
				System.out.print(a[i]+" ");
			System.out.println();
			reverseArray(a);
			for(int i=0; i<a.length; i++)
				System.out.print(a[i]+" ");
	}

}
