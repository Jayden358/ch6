package txtAdventure;


import java.util.Scanner;

public class Textadventure {

	

	

	public static void main(String[] args) {
		
	
		Scanner input = new Scanner(System.in);
		start(input);
	}
		//title
		public static void start(Scanner input) {
			
		System.out.println(" _______ _______ _______  _____   ______ __   __\r\n" + 
				" |  |  | |______ |  |  | |     | |_____/   \\_/  \r\n" + 
				" |  |  | |______ |  |  | |_____| |    \\_    |   \r\n" + 
				"                                                \r\n" + 
				"         _____  _______ _______\r\n" + 
				" |      |     | |______ |______\r\n" + 
				" |_____ |_____| ______| ______|\r\n" + 
				"                               ");
		System.out.print(" \\                  ###########                  /\r\n" + 
				"      \\                  #########                  /\r\n" + 
				"       \\                                           /\r\n" + 
				"        \\                                         /\r\n" + 
				"         \\                                       /\r\n" + 
				"          \\                                     /\r\n" + 
				"           \\                                   /\r\n" + 
				"            \\_________________________________/\r\n" + 
				"            |                                 |\r\n" + 
				"            |                                 |\r\n" + 
				"            |                                 |\r\n" + 
				"            |            _________            |\r\n" + 
				"            |           |         |           |\r\n" + 
				"            |           |   ___   |           |\r\n" + 
				"            |           I  |___|  |           |\r\n" + 
				"            |           |         |           |\r\n" + 
				"            |           |         |           |\r\n" + 
				"            |           |        _|           |\r\n" + 
				"            |           |       |#|           |  ;,\r\n" + 
				"    -- ___  |           |         |           |   ;'\r\n" + 
				"    H*/   ` |           |         |      _____|    .,`\r\n" + 
				"    */     )|           I         |     \\_____\\     ;'\r\n" + 
				"    /___.,';|           |         |     \\\\     \\     .\"`\r\n" + 
				"    |     ; |___________|_________|______\\\\     \\      ;:\r\n" + 
				"    | ._,'  /                             \\\\     \\      .\r\n" + 
				"    |,'    /                               \\\\     \\\r\n" + 
				"    ||    /                                 \\\\_____\\\r\n" + 
				"    ||   /                                   \\_____|\r\n" + 
				"    ||  /              ___________                \\\r\n" + 
				"    || /              / =====o    |                \\\r\n" + 
				"    ||/              /  |   /-\\   |                 \\\r\n" + 
				"    //              /   |         |                  \\\r\n" + 
				"   //              /    |   ____  |______             \\\r\n" + 
				"  //              /    (O) |    | |      \\             \\\r\n" + 
				" //              /         |____| |  0    \\             \\\r\n" + 
				"//              /          o----  |________\\             \\\r\n" + 
				"/              /                  |     |  |              \\\r\n" + 
				"              /                   |        |               \\\r\n" + 
				"             /                    |        |             \r\n" + 
				"            ");
		//jail
		System.out.println("You awaken from a cramped room, \"Where am i?\"you don't know how you got here and you don't know anything about yourself. ");
		System.out.println("Your main actions are USE,LOOK,SEARCH");
		//String USE, LOOK, SEARCH;
		int a=1;
		
		int c=1;
		
		
		while(a==1) {
		String action1 = input.nextLine();
		if (action1.equalsIgnoreCase("use")) {
			System.out.println("What do you want to use?");
		}
		else if(action1.equalsIgnoreCase("search")) {
			System.out.println("Where do you want to search? ... There is a SINK,BED,DESK and a DOOR.");
		}
		
		
		else if(action1.equalsIgnoreCase("search sink")) {
			System.out.println("There is nothing to search here.");
		}
		else if(action1.equalsIgnoreCase("search desk")) {
			System.out.println("There is nothing of interest on top of the desk but there is a drawer.");
		}
		else if(action1.equalsIgnoreCase("search desk drawer")) {
			System.out.println("You open the drawer there is a knight's helm, you put it on");
		}
		else if(action1.equalsIgnoreCase("search drawer")) {
			System.out.println("You open the drawer there is a knight's helm, you put it on");
		}
		else if(action1.equalsIgnoreCase("open door")) {
			System.out.println("it's locked");
		}
		else if(action1.equalsIgnoreCase("search door")) {
			System.out.println("There is a key hole and it is locked");
		}
		else if(action1.equalsIgnoreCase("look")) {
			System.out.println("Where do you want to look? ... There is a SINK,BED,DESK and a DOOR.");
		}
		else if(action1.equalsIgnoreCase("look sink")) {
			System.out.println("The sink looks very old and dirty");
		}
		else if(action1.equalsIgnoreCase("look bed")) {
			System.out.println("The bed is old and worn");
		}
		else if(action1.equalsIgnoreCase("look desk")) {
			System.out.println("The desk is very hard probably"
					+ " made of metal, there is a drawer.");
		}
		else if(action1.equalsIgnoreCase("look door")) {
			System.out.println("The door is locked and in excellent "
					+ "condition and very sturdy.\\\"Maybe the key is in this"
					+ " room i should search everywhere.\\\"");
		}
		else if
			(action1.equalsIgnoreCase("search bed")) {
				a=0;
			
		//else System.out.println("i don't understand");{
		//}
		
				System.out.println("You remove the sheets...there's a hole in the mattress you reach "
						+ "inside and find a door KEY and under the bed is a sword,you keep it for protection");
				System.out.println("         />\r\n" + 
						"        //\r\n" + 
						"[//////<*>|||<==========================================--------------\r\n" + 
						"        \\\\\r\n" + 
						"         \\>");
		}
		else System.out.println("i don't understand xxxxxxx");{
			
		}
		}
		String action4;
		while(c==1) {
		String action3 = input.nextLine();
			 if(action3.equalsIgnoreCase("use key")) {
			System.out.println("use key on what?");
		}
		else if(action3.equalsIgnoreCase("use key door")) {
			System.out.println("The door is now unlocked now you need to open the door");
			action4 = input.nextLine();
			if(action4.equalsIgnoreCase("open door")) {
				outside(input);
			}
		}
		else if(action3.equalsIgnoreCase("use key on door")) {
			System.out.println("The door is now unlocked now you need to open the door");
			action4 = input.nextLine();
			if(action4.equalsIgnoreCase("open door")) {
				outside(input);
			}
		}

		else {
			System.out.println("i don't understand");
		}
				}
		
		}
	
		
			
		
		
		
			
			  
		
		
		 
		
		public static void outside(Scanner input) {
			//outside
			System.out.println("The door is now open and you leave the cell and"
					+ " it strangely leads straight to outside you are now outside");
			System.out.println(" _______  __   __  _______  _______  ___   ______   _______ \r\n" + 
					"|       ||  | |  ||       ||       ||   | |      | |       |\r\n" + 
					"|   _   ||  | |  ||_     _||  _____||   | |  _    ||    ___|\r\n" + 
					"|  | |  ||  |_|  |  |   |  | |_____ |   | | | |   ||   |___ \r\n" + 
					"|  |_|  ||       |  |   |  |_____  ||   | | |_|   ||    ___|\r\n" + 
					"|       ||       |  |   |   _____| ||   | |       ||   |___ \r\n" + 
					"|_______||_______|  |___|  |_______||___| |______| |_______|");
		System.out.println("You can only USE and TALK for now.. ");
	
		
		System.out.println("You approach a strange Knight.. you cannot see his"
				+ " face but you can't tell if he is dangerous or not");
		System.out.println("         _.--.    .--._\r\n" + 
				"                 .\"  .\"      \".  \".\r\n" + 
				"                ;  .\"    /\\    \".  ;\r\n" + 
				"                ;  '._,-/  \\-,_.`  ;\r\n" + 
				"                \\  ,`  / /\\ \\  `,  /\r\n" + 
				"                 \\/    \\/  \\/    \\/\r\n" + 
				"                 ,=_    \\/\\/    _=,\r\n" + 
				"                 |  \"_   \\/   _\"  |\r\n" + 
				"                 |_   '\"-..-\"'   _|\r\n" + 
				"                 | \"-.        .-\" |\r\n" + 
				"                 |    \"\\    /\"    |\r\n" + 
				"                 |      |  |      |\r\n" + 
				"         ___     |      |  |      |     ___\r\n" + 
				"     _,-\",  \",   '_     |  |     _'   ,\"  ,\"-,_\r\n" + 
				"   _(  \\  \\   \\\"=--\"-.  |  |  .-\"--=\"/   /  /  )_\r\n" + 
				" ,\"  \\  \\  \\   \\      \"-'--'-\"      /   /  /  /  \".\r\n" + 
				"!     \\  \\  \\   \\                  /   /  /  /     !");
		
		
		String action3 = input.nextLine();
				
				if (action3.equalsIgnoreCase("Talk")) {
					System.out.println("Talk to who?");
				}
				else if  (action3.equalsIgnoreCase("use")) {
					System.out.println("use what?");
				}
				else if  (action3.equalsIgnoreCase("use sword")) {
					System.out.println("use sword on what?");
				}
				else if  (action3.equalsIgnoreCase("loot")) {
					System.out.println("loot what?");
				}
				
				else if  (action3.equalsIgnoreCase("Talk Knight")) {
					System.out.println("\"Hello!\"....The Knight gives you something, the knight leaves...he is gone you check what he gave you it is a small key.(type Crossroad to progress)");
					Crossroad( input);
				}
				else if  (action3.equalsIgnoreCase("use sword knight")) {
					System.out.println("You swing your sword, you caught the knight by suprise and hit a weak spot in his armor he has been defeated "
							+ "(you can now LOOT dead people)");
				}
				else if  (action3.equalsIgnoreCase("loot Knight")) {
					System.out.println("You check his pockets you find and take a key and find and take 50 schilling's");
					 Crossroad( input);
				}
		}
				
				
				
			
			

		
		
		public static void Crossroad(Scanner input) {
			
			String answer = "";
			
				
			
			
				System.out.println("                                                                 888 \r\n" + 
						"                                                                   888 \r\n" + 
						"                                                                   888 \r\n" + 
						" .d8888b888d888 .d88b. .d8888b .d8888b 888d888 .d88b.  8888b.  .d88888 \r\n" + 
						"d88P\"   888P\"  d88\"\"88b88K     88K     888P\"  d88\"\"88b    \"88bd88\" 888 \r\n" + 
						"888     888    888  888\"Y8888b.\"Y8888b.888    888  888.d888888888  888 \r\n" + 
						"Y88b.   888    Y88..88P     X88     X88888    Y88..88P888  888Y88b 888 \r\n" + 
						" \"Y8888P888     \"Y88P\"  88888P' 88888P'888     \"Y88P\" \"Y888888 \"Y88888 \r\n" + 
						"                        ");
				System.out.println("You look around and see 2 trails one goes left one goes right input lefttrail or righttrail");
				while (answer.equals("")) {
					answer=input.nextLine();
				if (answer.equals("lefttrail") || answer.equals("righttrail")) {
					break;
				}
				else {
					System.out.println("i don't understand");
					answer="";
				}
				
				}
				switch (answer) {
				case "lefttrail":
				LeftTrail(input);
				break;
				case "righttrail":
					RightTrail(input);
					break;
			}	 
		}
		public static void RightTrail(Scanner input) {
			System.out.println("______ _____ _____  _   _ _____   ___________  ___  _____ _     \r\n" + 
					"| ___ \\_   _|  __ \\| | | |_   _| |_   _| ___ \\/ _ \\|_   _| |    \r\n" + 
					"| |_/ / | | | |  \\/| |_| | | |     | | | |_/ / /_\\ \\ | | | |    \r\n" + 
					"|    /  | | | | __ |  _  | | |     | | |    /|  _  | | | | |    \r\n" + 
					"| |\\ \\ _| |_| |_\\ \\| | | | | |     | | | |\\ \\| | | |_| |_| |____\r\n" + 
					"\\_| \\_|\\___/ \\____/\\_| |_/ \\_/     \\_/ \\_| \\_\\_| |_/\\___/\\_____/\r\n" + 
					"                                                                ");
			System.out.println("you took a wrong turn and you have died");
					   break;
		}
		public static void LeftTrail(Scanner input) {
			
			
			String action1 = input.nextLine();
			
			System.out.println(" __   ______________  _________  ___   ______ \r\n" + 
					"  / /  / __/ __/_  __/ /_  __/ _ \\/ _ | /  _/ / \r\n" + 
					" / /__/ _// _/  / /     / / / , _/ __ |_/ // /__\r\n" + 
					"/____/___/_/   /_/     /_/ /_/|_/_/ |_/___/____/\r\n" + 
					"                                                ");
			System.out.println(" _\r\n" + 
					"     _|=|__________\r\n" + 
					"    /              \\\r\n" + 
					"   /                \\\r\n" + 
					"  /__________________\\\r\n" + 
					"   ||  || /--\\ ||  ||\r\n" + 
					"   ||[]|| | .| ||[]||\r\n" + 
					" ()||__||_|__|_||__||()\r\n" + 
					"( )|-|-|-|====|-|-|-|( ) \r\n" + 
					"^^^^^^^^^^====^^^^^^^^^^^");
			System.out.println("You find a medium sized house");
			System.out.println("You Might be able to sneek in by going through one of the windows(by typing WINDOW) and loot the house, it would be useful.(or to go back type CROSSROAD)");
			if (action1.equalsIgnoreCase("Crossroad")) {
				Crossroad(input);
			}
			else if (action1.equalsIgnoreCase("window")) {
				System.out.println("\"(IIIIIIIIIIIIIIIIIII)\r\n" + 
						")'.'.'.':;:;:'.'.'.'(\r\n" + 
						"('.'.'.;' | `:.'.'.')\r\n" + 
						")'.'.';'  |  `:'.'.'(\r\n" + 
						"('.'.;'   |   `:.'.')\r\n" + 
						")'.';'____|____`:'.'(\r\n" + 
						"(==@'     |     `@==)\r\n" + 
						")'.:     @()     :.'(\r\n" + 
						"('.'.   ()@()   .'.')\r\n" + 
						")'.'.  ()@()@)  .'.'(\r\n" + 
						"('.'.   _\\|/_   .'.')\r\n" + 
						")'.'.  |-----|  .'.'(\r\n" + 
						"('.'.___\\___/___.'.')\r\n" + 
						")'.'============='.'(\r\n" + 
						"('.'             '.')\r\n" + 
						" ~                 ~");
				System.out.println("You go to the window and its locked oddly there is a key hole but you could try to use the key you got");
			}
			else if (action1.equalsIgnoreCase("use key")) {
				System.out.println("use key on what?");
			}
			else if (action1.equalsIgnoreCase("use key window")) {
				System.out.println("IT WORKED the window is unlocked now you must open window");
			}
			else if (action1.equalsIgnoreCase("open")) {
				System.out.println("open what?");
			}
			else if (action1.equalsIgnoreCase("open Window")) {
				System.out.println("The window is now open(to go inside type GO IN WINDOW)");
			}
			else if (action1.equalsIgnoreCase("open Window")) {
				System.out.println("   _____  _____________  ____  __ ______  __  __________\r\n" + 
						"  /  _/ |/ / __/  _/ _ \\/ __/ / // / __ \\/ / / / __/ __/\r\n" + 
						" _/ //    /\\ \\_/ // // / _/  / _  / /_/ / /_/ /\\ \\/ _/  \r\n" + 
						"/___/_/|_/___/___/____/___/ /_//_/\\____/\\____/___/___/  \r\n" + 
						"                                                        ");
				System.out.println("All of the doors and other windows are blocked off "
						+ "with rubble, the house appears to be abandoned, but you discover\r\n" + 
						"there is one door that is not blocked off");
			}
			else if (action1.equalsIgnoreCase("open door")) {
				System.out.println("You open the door to find a small room, the center of attention"
						+ " is the small chest in the middle of the room.");
				
			}
			else if (action1.equalsIgnoreCase("open chest")) {
				System.out.println("you found 500 schillings inside and you put the money in your pocket(type crossroads to go to back)");
				
			}
			else if (action1.equals("crossroad")) {
				
			
			
			switch (action1) {
			case "crossroad":
			Crossroad(input);
			break;
			}
			}
		}
		
		
	}
