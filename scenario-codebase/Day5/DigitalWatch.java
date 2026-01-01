/*16. Digital Watch Simulation ⏱️
Simulate a 24-hour watch:
● Print hours and minutes in a nested for-loop.
● Use a break to stop at 13:00 manually (simulate power cut).
Core Java Scenario Based Problem Statements*/

import java.util.*;
public class DigitalWatch
{
    public static void main(String[] args)
    {
        for(int i = 0; i < 24; i++)
        {
            for(int j = 0; j < 60; j++)
            {
                if(i == 13 && j == 0)
                {
                    break;
                }

                if(i < 10 && j < 10)
                {
                    System.out.println("0" + i + ":0" + j);
                }
                else if(i < 10)
                {
                    System.out.println("0" + i + ":" + j);
                }
                else if(j < 10)
                {
                    System.out.println(i + ":0" + j);
                }
                else
                {
                    System.out.println(i + ":" + j);
                }
            }

            if(i == 13)
                break;
        }
    }
}
				
				