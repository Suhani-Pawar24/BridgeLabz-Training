import java.util.Arrays;
public class NumberChecker
{
	public static int countDigits(int num)
	{
        return String.valueOf(Math.abs(num)).length();
    }

    public static int[] storeDigits(int num)
	{
        num = Math.abs(num);
        int n = countDigits(num);
        int[] digits = new int[n];
        for (int i = n - 1; i >= 0; i--) 
		{
            digits[i] = num % 10;
            num /= 10;
        }
        return digits;
    }

    public static boolean isDuckNumber(int num) 
	{
        int[] digits = storeDigits(num);
        for (int d : digits) if (d != 0) return true;
        return false;
    }

    public static boolean isArmstrong(int num) 
	{
        int[] digits = storeDigits(num);
        int n = digits.length;
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, n);
        return sum == num;
    }

    public static int[] largestAndSecondLargest(int[] digits) 
	{
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for (int d : digits) 
		{
            if (d > largest)
			{
                secondLargest = largest;
                largest = d;
            }
			else if (d > secondLargest && d != largest)
			{
                secondLargest = d;
            }
        }
        return new int[]{largest, secondLargest};
    }

    public static int[] smallestAndSecondSmallest(int[] digits) 
	{
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        for (int d : digits)
		{
            if (d < smallest)
			{
                secondSmallest = smallest;
                smallest = d;
            } 
			else if (d < secondSmallest && d != smallest)
			{
                secondSmallest = d;
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    public static int sumOfDigits(int[] digits)
	{
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    public static int sumOfSquares(int[] digits) 
	{
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, 2);
        return sum;
    }

    public static boolean isHarshad(int num, int[] digits) 
	{
        int sum = sumOfDigits(digits);
        return sum != 0 && num % sum == 0;
    }

    public static int[][] digitFrequency(int[] digits)
	{
        int[][] freq = new int[10][2]; 
        for (int i = 0; i < 10; i++) freq[i][0] = i;

        for (int d : digits) freq[d][1]++;
        return freq;
    }

    public static void main(String[] args) 
	{
        int number = 153;
        System.out.println("Number: " + number);

        int[] digits = storeDigits(number);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Count of digits: " + countDigits(number));
        System.out.println("Is Duck Number: " + isDuckNumber(number));
        System.out.println("Is Armstrong Number: " + isArmstrong(number));

        System.out.println("Largest & Second Largest: " + Arrays.toString(largestAndSecondLargest(digits)));
        System.out.println("Smallest & Second Smallest: " + Arrays.toString(smallestAndSecondSmallest(digits)));
        System.out.println("Sum of digits: " + sumOfDigits(digits));
        System.out.println("Sum of squares of digits: " + sumOfSquares(digits));
        System.out.println("Is Harshad Number: " + isHarshad(number, digits));

        int[][] freq = digitFrequency(digits);
        System.out.println("Digit Frequencies:");
        for (int i = 0; i < freq.length; i++)
		{
            if (freq[i][1] > 0)
                System.out.println("Digit " + freq[i][0] + ": " + freq[i][1]);
        }
    }
}
