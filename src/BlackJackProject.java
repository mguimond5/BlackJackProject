/**
	*
	* Name: Marsha Guimond
	* Teacher: Mr.Hardman
	* Final Project
	* Date Last Modified: January 23, 2017
	*
	*/

import java.util.Random;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author m.guimond3
 *
 */
public class BlackJackProject {

	/**
	 * @param argss
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//welcome messages displaying to the user
		String[] userWord = {"Welcome ", " to ", " BlackJack", "!"};
		
		String[] userWelcome = {" Good ", " luck", "!"};
		
		System.out.println(String.format("Hello user!"));
		
		//scanner
        Scanner userInput = new Scanner(System.in);

        Random random = new Random();
        
        //variables
        displayMessage();
		String anotherCard; 
		String playAgain = "y";
        int nextCard; 
        int userCard1; 
        int userCard2;
        int dealerCard1;
        int dealerCard2;
        int cardTotal = 0;
        int dealerTotal = 0;
	    
        //displays array with welcome messages to the player or user
        for(int i = 0; i < userWord.length; i++){
        	System.out.print(userWord[i]);
        
        }
        
        for(int i = 0; i < userWelcome.length; i++){
        	System.out.print(userWelcome[i]);
        
        }
        
        	//game begins by dealing the player or user the two first cards

        	while (playAgain == "y")
        	{
            
        		//the dealer gets two first random dealt cards
        		dealerCard1 = random.nextInt(9) + 1;
        		dealerCard2 = random.nextInt(9) + 1;

        		//the player or user gets two first random dealt cards and the card number
        		//total
        		userCard1 = random.nextInt(9) + 1;
        		userCard2 = random.nextInt(9) + 1;
        		cardTotal = userCard1 + userCard2;

        		//adds two lines of space between the welcome message & game
        		System.out.println();
        		System.out.println();
            	
        		//the dealer gets two card total and only displays one dealer card
        		//to the player or user
        		dealerTotal = dealerCard1 + dealerCard2;
            		System.out.println("Dealer shows: " + dealerCard1);
        
            	//the player or user displays first two cards & card number total
            	System.out.println("First Cards: " + userCard1 + ", " + userCard2);
            	System.out.println("Total: "+ cardTotal);
            
            	//asks player if they want another card
            	System.out.print("Another Card (y/n)?: ");
            	anotherCard = userInput.nextLine();
               
            		//while loop if player enters "y"
            		while (anotherCard.equals("y"))
            		{
            			//gives user random new card(s)
            			nextCard = random.nextInt(12) + 1;
            			cardTotal += nextCard;
            			System.out.println();
            				System.out.println("Card: " + nextCard);
            				System.out.println("Your total: " + cardTotal);
                
            			//if user has 21, message displays
            			{
            			if (cardTotal == 21)
            				System.out.println("BlackJack!" + " You have won!");
            			}
                
            			//if user has more than 21, game is over and message displays
            			{
            			if (cardTotal > 21)
            				System.out.println(String.format("You busted, dealer wins!"));
            			}   
                
            			//if user card total less than 21, user can get a new card or hold
            			{
            			if (cardTotal < 21)
            				System.out.print("Another Card (y/n)?: ");
            				anotherCard = userInput.nextLine();
            				System.out.println();
            			}
        
            			
            		}
            		
            		System.out.println();
            
            				//while loop for dealers turn when user types "n"
            				while(dealerTotal < 17){
            				
            					//code for when dealer needs more random cards to get to at least 17
            					nextCard = random.nextInt(12) + 1;
            					dealerTotal += nextCard;
                            
                            		System.out.println();
                            		
            				}	
                
            				//if user total is greater than dealer total, message below will display
            				//& new game will begin
            				if(cardTotal > dealerTotal){
            					System.out.print("Your total is higher! You win! ");
            					System.out.println();
            					System.out.println("Your total: " + cardTotal);
            					System.out.println("Dealer Total: " + dealerTotal);
            					System.out.println("New game...");
		   
            				}   
            				
            				//if dealer total is greater than user total, message below will display
            				//& new game will begin
            				if(dealerTotal > cardTotal){
            					System.out.println();
            					System.out.print("Dealer wins with a higher total value: " + dealerTotal + "." + " Overpowered, game over! ");
            					System.out.println();
            					System.out.println("New game...");
            				}
            					
            				//if dealer total equals greater than 21, dealer busted and 
            				//user wins	
            				if(dealerTotal > 21){
            						System.out.println("Dealer busted, you won!");
            					System.out.println("Dealer Total: " + dealerTotal + " ");
            					System.out.println("Your total: " + cardTotal);
            				
                			}
            				
            				//if dealer total is equal to 21, dealer automatically wins,
            				//new game begins
         					if(dealerTotal == 21){
         						System.out.println();
         						System.out.print("Dealer wins with 21, BlackJack overpowered!");
         						System.out.println();
            					System.out.println("New game...");
            					
         					}	
         					
         					//if dealer total is equal to user total, dealer wins with overpower
         					//game ends and a new game begins
         					if(dealerTotal == cardTotal){
         						System.out.println();
         						System.out.print("Dealer wins with same total and overpower!");
         						System.out.println();
            					System.out.println("New game...");
            					
         					}
          
         				
        					}
        	
        	                 userInput.close();
                	}  

	   			   /**
	   			    * displayMessage will display a welcome message to the user
	   			    * 
	   			    * @param there are no parameters
	   			    * 
	   			    * @return will return "Game will start below!" to the user
	   			    */
					public static void displayMessage(){
	
						System.out.println("Game will start below!");
				
					}
	
					
		    }
	