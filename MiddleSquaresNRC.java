//Get a randomseed  
//Multiply the seed by itself
//Outputthe middle of this result
//Middle squares method
// Starter code by CWColeman (CWC)
//  Change the name of the class with 
//your initials and get ready 
// to push this back to the repo
//  

import java.util.Calendar;
import java.util.Date;
public class MiddleSquaresNRC{
   public static void main(String[] args) throws InterruptedException
   {
		long timeMilli1,  timeMilli2, timeSeed;  //long intergers
		int i,seed,  length, mid, maxmin; // integers
		String timestr;  // time String
		String seedstr;    //seed string
		String newseedstr;  //new seed string
		String newstr;
		
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
			//maxmin = ( mid / 2 );  // this is the value to adjust the time string to get the substring
			System.out.println("\t" +length);// debug
			seedstr = timestr.substring(mid - 4  , mid + 4 );  //get the substring
			System.out.println("\t" +seedstr);  //debug
			seed  = Integer.parseInt(seedstr);  //change the substring called seedstr to the seed
			
			//******************************************************************************
			//  Write code to keep creating random numbers from the seed integer
			System.out.println("Randoms :");
			for (i = 0; i < 10; i++){
				seed = seed * seed; // the new seed
				newstr =  Long.toString(seed);  // long to string
				length = String.valueOf(newstr).length(); // get length of string
				mid = length / 2; //get the middle of the string
				//System.out.println("\t" +length);// debug trace
				seedstr = newstr.substring(mid - 4, mid + 4 ); //get sub string
				//System.out.println("sub "+seedstr);//debug trace
				seed  = Integer.parseInt(seedstr); // string to int
				System.out.println("\t"+i+" "+seed+" ");
			}
	
		 //******************************************************************************
     	
   }
}
