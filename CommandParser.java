/*
   cscd350team2P1
   team member:
      Long Nguyen
      Nicholas Valentine
      Trevor Sherwood
*/

import java.lang.String;

import w15cs350.command.CommandManager;

public class CommandParser
{
   private String command;
   
   public CommandParser (String command, CommandManager manager)
   {
	  char firstChar = command.charAt(0);
	  if (firstChar == '@')
	  {
		  //method to handle commands beginning with @s
	  }
	  else
	  {
		  String firstWord = command.substring(0, command.indexOf(' '));
		  switch (firstWord)
		  {
		  		case "create": 
		  			//call method to handle create commands
		  			break;
		  		case "set":
		  			//call method to handle set commands
		  			break;
		  		default:
		  			//handle other commands that are different
		  			break;
		  }
		  	
	  }
   }
}