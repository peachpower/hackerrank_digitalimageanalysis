/*Problem

	A 2D Grid of pixel values will be provided (in regular text format through STDIN), 
	which represent the pixel wise values from the images (which were originally in JPG 
	or PNG formats). 
	Each pixel will be represented by three comma separated values in the range 0 to 255 
	representing the Blue, Green and Red components respectively. There will be a space 
	between successive pixels in the same row.
	
	Input:  For each pixel the Blue, Green and Red values are provided, separated by commas. 
	The top left pixel has (Blue=0,Green=0,Red=200). The top-right pixel has (Blue=10,Green=0,Red=0).
	The bottom-right pixel has (Blue=15,Green=75,Red=255). The bottom-left pixel has (Blue=100,Green=100, Red=88).

	Task: Determine if the sample image was taken at day or night. Output one word: 'day' or 'night'. 	
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
		// Initializing scanner  
       Scanner scan = new Scanner(System.in);
		// Scanning the next line
        String pixel_wise_values = scan.nextLine();
        pixel_wise_values = pixel_wise_values.replaceAll("([0-9]|[0-9][0-9]) ", "");
		// Parsing the input, such that the set of three is split by a comma
        String[] arr = input.split(",");
		// Initializing total to 0
        int total = 0;
		// Looping through the string and adding the values for each pixel
        for (int i = 0; i < arr.length; i++) {
            total = total + Integer.parseInt(result[i]);
        }
		// Finding the average value for each pixel
        total = total/arr.length;
		// Check if the average value of color for each pixel is above 100
		// Found 100 through trial and error
        if(total < 100) {
            System.out.println("night");
        } 
		else {
            System.out.println("day");
        } 
    }
}