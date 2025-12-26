import java.util.*;
public class TwoSum
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size of an array: ");
		int n = input.nextInt();
		
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++)
		{
				arr[i] = input.nextInt();
		}
		System.out.println("Enter target value: ");
		int target = input.nextInt();
		
		System.out.println(Arrays.toString(twoSum(arr,target)));
		
		input.close();
	}	
		
	public static int[] twoSum(int[] nums, int target) 
	{
        int[] arr = new int[2];

        for (int i = 0; i < nums.length - 1; i++)
		{
            for (int j = i + 1; j < nums.length; j++) 
			{
                if (nums[i] + nums[j] == target) 
				{
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
            }
        }
        return arr; 
    }
}	