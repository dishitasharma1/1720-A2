package WhatClass_mvc;

public class WhatClassGame {

	/**
     * The string representing rock.
     */
    public static final String ROCK = "ROCK";

    /**
     * The string representing paper.
     */
    public static final String PAPER = "PAPER";

    /**
     * The string representing scissors.
     */
    public static final String SCISSORS = "SCISSORS";
    
    /**
     * The string representing the player.
     */
    public static final String PLAYER = "PLAYER";
    
    /**
     * The string representing the computer.
     */
    public static final String COMPUTER = "COMPUTER";
    
    /**
     * The string representing a drawn (or tied) round.
     */
    public static final String DRAW = "DRAW";
    
    
    
	/**
     * This method creates an RPSModel, RPSController, and RPSView to create
     * the rock, paper, scissors game. You need to set the the model
     * and view on the controller, and you need to make the view visible.
     * 
     * @param args not used
     */
	public static void main(String[] args) {
		

		WhatClassController controller = new WhatClassController();
		WhatClassModel model = new WhatClassModel(System.currentTimeMillis());
		WhatClassView view = new WhatClassView(controller);
		
		
		controller.setModel(model);
		controller.setView(view);
		
		

	}

}
