package com.day5.cinemahouse;
import java.time.LocalTime;
import java.util.Arrays;
public class MovieTime 
{
		public static void main(String[] args)
		{
			LocalTime[] timings = { LocalTime.of(18,30),
									LocalTime.of(17,45),
									LocalTime.of(14,02),
									LocalTime.of(12,05),
									LocalTime.of(13,02),
									LocalTime.of(16,30),
									LocalTime.of(17,05),
									LocalTime.of(20,02),
									LocalTime.of(21,45)};
			
			int n = timings.length;
			
			for(int i = 0; i < n-1; i++)
			{
				for(int j = 0; j < n-1-i; j++)
				{
					if(timings[j].isAfter(timings[j+1]))
					{
						LocalTime temp = timings[j];
						timings[j] = timings[j+1];
						timings[j+1] = temp;
					}
				}
			}
			System.out.println(Arrays.toString(timings));
		}

}
