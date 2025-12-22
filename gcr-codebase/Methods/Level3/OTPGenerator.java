import java.util.Arrays;
public class OTPGenerator 
{

    // Method to generate a 6-digit OTP
    public static int generateOTP() 
	{
        return (int)(Math.random() * 900000) + 100000; 
    }

    // Method to check if all OTPs in the array are unique
    public static boolean areOTPsUnique(int[] otps)
	{
        for (int i = 0; i < otps.length; i++) 
		{
            for (int j = i + 1; j < otps.length; j++) 
			{
                if (otps[i] == otps[j]) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) 
	{
        int[] otps = new int[10];

        // Generate 10 OTPs
        for (int i = 0; i < 10; i++) 
		{
            otps[i] = generateOTP();
        }

        System.out.println("Generated OTPs: " + Arrays.toString(otps));

        if (areOTPsUnique(otps)) 
		{
            System.out.println("All OTPs are unique.");
        }
		else
		{
            System.out.println("Some OTPs are not unique.");
        }
    }
}
