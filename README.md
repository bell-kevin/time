# time
When asking a user for a time, you might get several different formats of input – just the hour, the hour and minutes, the hour and minutes and seconds, an indication of “am” vs “pm”. In this project, the Time class will have overloaded constructors, one for each of those possible types of input, and most of the constructors will call the primary constructor. If the input were perfect, there would be values for hour, minutes, and seconds, so that constructor with 3 parameters is the main or primary one. If the input has only hours and minutes, then the constructor with 2 parameters will assign a value of 0 to the seconds and call the primary constructor with all 3 values. If the input has only hours, then the constructor with 1 parameter will assign a value of 0 to the minutes and to the seconds, then call the primary constructor with all 3 values. Only the primary constructor with 3 parameters will assign values to the instance variables.  

If there is an additional parameter for “am” or “pm”, use a constructor with 4 parameters – hours, minutes, seconds, and indicator. If the indicator is “pm”, add 12 to the hours to convert to a 24-hour clock. If the input is 4 PM, switch it to 16 hours.  

Include a method to display the time with colons separating the units. If the time is 1 hour, 22 minutes, and 35 seconds, print it as 1:22:35. 

Run the project and take a screenshot. Change all of the input in the driver class, run it again, and take a screenshot.
