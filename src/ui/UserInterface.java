package ui;

import java.util.Scanner;

public class UserInterface {

    protected Scanner in;
    int numberOfGames = 1;      // update this when more games are added

    //TODO: write constructor
    public UserInterface(){
        in = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Hello, and welcome!");
        System.out.println("What game would you like to play?");
        System.out.println("1. Battleship");
        // get user's choice
        switch(getMenuOption()) {
            case 1:
                startBattleship();
                break;
        }

        //get user input
    }

    /**
     * This method will start running the battleship game.
     */
    public void startBattleship() {

    }

    /**
     * Takes the user's menu selection, validates it, and returns the selection
     * @return the user's selection as an integer
     */
    protected int getMenuOption() {
        while(true){
            System.out.println("Please select the desired game from the menu above.");
            System.out.println("> ");
            String userSelection = in.next();
            int userInt = 10000;
            try{
                userInt = Integer.parseInt(userSelection);
            }
            catch(NumberFormatException e){
                System.out.println("Your menu selection must be an integer between 1 and " + numberOfGames + ".");
                continue;
            }
            if(userInt > numberOfGames){
                System.out.println("Your menu selection must be an integer between 1 and " + numberOfGames + ".");
                continue;
            }
            //otherwise the menu option is valid
            return userInt;

        }


    }
}
