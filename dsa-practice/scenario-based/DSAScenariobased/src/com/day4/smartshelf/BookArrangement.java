package com.day4.smartshelf;
import java.util.Arrays;

public class BookArrangement 
{

    public void bookArrangement(String title[]) 
    {
        int n = title.length;

     
        for (int i = 1; i < n; i++) {
            String key = title[i]; 
            int j = i - 1;

            while (j >= 0 && title[j].compareToIgnoreCase(key) > 0)
            {
                title[j + 1] = title[j];
                j = j - 1;
            }
            title[j + 1] = key;
        }
    }

    public static void main(String[] args) 
    {
        BookArrangement shelf = new BookArrangement();
        
        String title[] = {
            "The Midnight Library", "Atomic Habits",
            "Where the Crawdads Sing", "Project Hail Mary",
            "The Silent Patient", "Circe",
            "The Thursday Murder Club", "Brave New World",
            "The Alchemist", "Cloud Cuckoo Land"
        };

        System.out.println("Before Sorting: " + Arrays.toString(title));
        
        shelf.bookArrangement(title);
        
        System.out.println("\nAfter Alphabetical Arrangement:");
        for (String t : title)
        {
            System.out.println("- " + t);
        }
    }
}
