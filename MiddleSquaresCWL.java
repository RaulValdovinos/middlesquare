//Get a randomseed  
//Multiply the seed by itself
//Outputthe middle of this result
//Middle squares method
// Starter code by CWColeman (CWC)
//  Change the name of the class with 
//your initials and get ready 
// to push this back to the repo
//  the name of the class needs to be the same name as the file

import java.util.Calendar;
import java.util.Date;
class MiddleSquaresCWL{
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
			System.out.println("Randoms :");
			for (i = 0; i < 10; i++){
				seed = seed * seed; // The seed I'll be using
				newstr =  Long.toString(seed);  // Converting long to string
				length = String.valueOf(newstr).length(); // Getting length of string
				mid = length / 2; // Getting the middle of the string
				seedstr = newstr.substring(mid - 4, mid + 4 ); // Getting the substring
				seed  = Integer.parseInt(seedstr); // Converting the string to an int
				System.out.println("\t"+i+" "+seed+" ");
			//******************************************************************************
     	
   }
}
