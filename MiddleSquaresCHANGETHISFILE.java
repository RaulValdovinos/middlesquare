//Get a randomseed  
//Multiply the seed by itself
//Outputthe middle of this result
//Middle squares method
// Starter code by CWColeman (MiddleSquaresCHANGETHISFILE.java)
//  Change the name of the class with 
//your initials and get ready MiddleSquaresCHANGETHISFILE.java 
//	MiddleSquaresAAA.java
// Make sure the name of the file is the same as the name of the class.
// to push this back to the repo
//  the name of the class needs to be the same name as the file

import java.util.Calendar;
import java.util.Date;
class MiddleSquaresCHANGETHISFILE.java{
   public static void main(String[] args) throws InterruptedException
   {
		long timeMilli1,  timeMilli2, timeSeed;  //long intergers
		int i,seed, newseed, length, mid, maxmin; // integers
		String timestr;  // time String
		String seedstr;    //seed string
		String newstr;  //new seed string
		
      //Date Object
      Date date = new Date();
      /*getTime():It returns the number of milliseconds since 
       * January 1, 1970, 00:00:00 GMT 
       * represented by this date.
       */
		timeMilli1 = date.getTime();  //get the time
			Thread.sleep(1000); //sleep for 1 second
		timeMilli2 = date.getTime(); //get the time
			//the following converts the time from a long integer to a String then concatinates them
			timestr =  Long.toString(timeMilli1) + Long.toString(timeMilli2);
			System.out.println("timeSeed  " +timestr);
			length = String.valueOf(timestr).length(); //get the length of the time string
			mid = length / 2 ;  // get the middle value
				System.out.println("\t" +length);// debug  change this
			seedstr = timestr.substring(5, 13 );  //get the substring
			System.out.println("\t" +seedstr);  //debug
			seed  = Integer.parseInt(seedstr);  //change the substring called seedstr to the seed
			
			//******************************************************************************
			//  Write code to keep creating random numbers from the seed integer
			// you will need to publish 10 random numbers
			//i = 0;
	
			//******************************************************************************
     	
   }
}
