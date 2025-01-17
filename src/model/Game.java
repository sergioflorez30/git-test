
package model; 

import model.Enemy;
import model.Treasure;
import model.Level;
import model.Player;

public class Game{

	public static final int TOTAL_PLAYERS = 20;
	public static final int ALL_LEVELS = 10;
	public static final int TOTAL_TREASURES = 100;
	public static final int TOTAL_ENEMYS = 50; 

	private Player[] totalPlayers;
	private Level[] levels;
	private Treasure[] treasures;
	private Enemy[] enemys;

	private Player player;
	private Treasure treasure;
	private Enemy enemy;
	private Level level;

	public Game(){

		levels = new Level[ALL_LEVELS];
		levels[0]= new Level(1, 100);
		levels[1]= new Level(2, 200);
		levels[2]= new Level(3, 300);
		levels[3]= new Level(4, 400);
		levels[4]= new Level(5, 500);
		levels[5]= new Level(6, 600);
		levels[6]= new Level(7, 700);
		levels[7]= new Level(8, 800);
		levels[8]= new Level(9, 900);
		levels[9]= new Level(10, 1000);

		totalPlayers = new Player[TOTAL_PLAYERS];
		treasures = new Treasure[TOTAL_TREASURES];

		treasures[0] = new Treasure("diamond", "xd", 20, 1,1); 
		treasures[1] = new Treasure("diamond", "xd", 20, 1,1); 
		treasures[2] = new Treasure("diamond", "xd", 20, 1,1); 
		treasures[3] = new Treasure("diamond", "xd", 20, 1,1); 
		treasures[4] = new Treasure("diamond", "xd", 20, 1,1); 
		treasures[5] = new Treasure("rock", "sss", 7, 2, 1); 
		treasures[6] = new Treasure("rock", "sss", 7, 2, 1); 
		treasures[7] = new Treasure("diamond", "xd", 20, 2,1); 
		treasures[8] = new Treasure("diamond", "xd", 20, 2,1); 
		treasures[9] = new Treasure("map", "aaa", 15, 2, 1); 
		treasures[10] = new Treasure("map", "aaa", 15, 3, 1); 
		treasures[11] = new Treasure("map", "aaa", 15, 3, 1); 
		treasures[12] = new Treasure("diamond", "xd", 20, 3,1); 
		treasures[13] = new Treasure("rock", "sss", 7, 3, 1); 
		treasures[14] = new Treasure("blade", "qqq", 18, 3,1); 
		treasures[15] = new Treasure("blade", "qqq", 18, 4,1); 
		treasures[16] = new Treasure("blade", "qqq", 18, 4,1); 
		treasures[17] = new Treasure("blade", "qqq", 18, 4,1); 
		treasures[18] = new Treasure("rock", "sss", 7, 4, 1); 
		treasures[19] = new Treasure("golden", "ggg", 22, 4,1); 
		treasures[20] = new Treasure("golden", "ggg", 22, 5,1); 
		treasures[21] = new Treasure("golden", "ggg", 22, 5,1); 
		treasures[22] = new Treasure("diamond", "xd", 20, 5,1); 
		treasures[23] = new Treasure("diamond", "xd", 20, 5,1); 
		treasures[24] = new Treasure("map", "aaa", 15, 5, 1); 
		treasures[25] = new Treasure("rock", "sss", 7, 6, 1); 
		treasures[26] = new Treasure("rock", "sss", 7, 6, 1); 
		treasures[27] = new Treasure("rock", "sss", 7, 6, 1); 
		treasures[28] = new Treasure("rock", "sss", 7, 6, 1); 
		treasures[29] = new Treasure("rock", "sss", 7, 6, 1); 
		treasures[30] = new Treasure("golden", "ggg", 22, 7,1); 
		treasures[31] = new Treasure("golden", "ggg", 22, 7,1); 
		treasures[32] = new Treasure("golden", "ggg", 22, 7,1); 
		treasures[33] = new Treasure("map", "aaa", 15, 7, 1); 
		treasures[34] = new Treasure("map", "aaa", 15, 7, 1); 
		treasures[35] = new Treasure("blade", "qqq", 18, 8,1); 
		treasures[36] = new Treasure("blade", "qqq", 18, 8,1); 
		treasures[37] = new Treasure("blade", "qqq", 18, 8,1); 
		treasures[38] = new Treasure("blade", "qqq", 18, 8,1); 
		treasures[39] = new Treasure("rock", "sss", 7, 8, 1); 
		treasures[40] = new Treasure("diamond", "xd", 20, 9,1); 
		treasures[41] = new Treasure("diamond", "xd", 20, 9,1); 
		treasures[42] = new Treasure("diamond", "xd", 20, 9,1); 
		treasures[43] = new Treasure("blade", "qqq", 18, 9,1); 
		treasures[44] = new Treasure("map", "aaa", 15, 9, 1); 
		treasures[45] = new Treasure("map", "aaa", 15, 10, 1); 
		treasures[46] = new Treasure("blade", "qqq", 18, 10,1); 
		treasures[47] = new Treasure("diamond", "xd", 20, 10,1); 
		treasures[48] = new Treasure("rock", "sss", 7, 10, 1); 
		treasures[49] = new Treasure("golden", "ggg", 22, 10,1); 


		enemys = new Enemy[TOTAL_ENEMYS];

		enemys[0] = new Enemy("dark","magico", 10, 7, 6);
		enemys[1] = new Enemy("will","jefe", 15, 20,10);
		enemys[2] = new Enemy("sys","ogro", 1, 10, 1);
		enemys[3] = new Enemy("sophi","abstracto", 10, 15, 3);
		enemys[4] = new Enemy("xoxo","jefe", 12, 25, 5);
		enemys[5] = new Enemy("xis","ogro", 3, 15, 2);
		enemys[6] = new Enemy("ques","magico", 0, 23, 1);
		enemys[7] = new Enemy("wes","abstracto", 30, 40, 10);
		enemys[8] = new Enemy("xd","magico", 3, 10, 4);
		enemys[9] = new Enemy("uwu","jefe", 7, 11, 5);
		enemys[10] = new Enemy("unu","ogro", 2, 6, 6);
		enemys[11] = new Enemy("white","abstracto", 10, 20, 7);
		enemys[12] = new Enemy("blue","ogro", 8, 10, 2);
		enemys[13] = new Enemy("key","magico", 4, 12, 3);
		enemys[14] = new Enemy("wak","jefe", 10, 20, 4);
		enemys[15] = new Enemy("oro","abstracto", 3, 10, 7);
		enemys[16] = new Enemy("plata","ogro", 10, 12, 8);
		enemys[17] = new Enemy("bronce","magico", 12, 15, 8);
		enemys[18] = new Enemy("derma","jefe",10, 30, 9);
		enemys[19] = new Enemy("cut","abstracto", 3, 40, 9);
		enemys[20] = new Enemy("hongo","ogro", 3, 10, 1);
		enemys[21] = new Enemy("flower","magico", 1, 15, 2);
		enemys[22] = new Enemy("zac","jefe", 15, 25, 3);
		enemys[23] = new Enemy("efron","abstracto", 13, 25, 4);
		enemys[24] = new Enemy("xxd","ogro", 14, 20, 5);


	}

	public Player getPlayer(){
		return player; 
	}

	public Treasure getTreasure(){
		return treasure; 
	}

	public Level getLevel(){
		return level; 
	}

	public Enemy getEnemy(){
		return enemy; 
	}

	public Player[] getTotalPlayers(){
		return totalPlayers; 
	}

	public Level[] getLevels(){
		return levels; 
	}

	public Treasure[] getTreasures(){
		return treasures; 
	}

	public Enemy[] getEnemys(){
		return enemys; 
	}
	/**
	 * registerPlayer: this method register a player at the game.
	 * @param nickname: String: this is the id of the player.
	 * @param name: String: this is the real player name.
	 * @return msj: String: a confirm message.
	 */

	public String registerPlayer(String nickname, String name){
		String msj = ""; 
		
		int comparateNickname = searchSameNickname(nickname);
		if( comparateNickname != -1){
			msj = "oh no! ... this nickname already exists :(";

		} else{

			Player newPlayer = new Player(nickname, name, levels[0]);
			msj = "Maximum capacity reached of players."; 
			boolean isEmpty = false; 
			for(int i = 0; i <TOTAL_PLAYERS && !isEmpty; i++){
				if(totalPlayers[i] == null){
					// I add the player to the first available array space 
					totalPlayers[i] = newPlayer; 
					isEmpty = true; 
					msj = "New player created"; 
				}
			}
		}
			
		
		return msj; 
		

	}
	/**
	 * searchSameNickname: This method compares the nicknames of existing players to see if there is already one.
	 * @param nickname: String: the nickname player.
	 * @return pos: a position in the array. 
	 */

	public int searchSameNickname(String nickname){
		int pos = -1; 
		boolean isFound = false; 
		for(int i = 0; i < TOTAL_PLAYERS && !isFound; i++ ){
			if(totalPlayers[i] != null && totalPlayers[i].getNickname().equalsIgnoreCase(nickname)){
				pos = i; 
				isFound = true; 
			} 
		}
		return pos; 
	}
	/**
	 * addEnemyLevel: this method add a enemy for a level. 
	 * @param nameEnemy: String: the enemy name.
	 * @param typeEnemy: String: the type enemy.
	 * @param scoreLostEnemy: int: the score the player loses if he loses to the enemy in specific. 
	 * @param scoreWinEnemy: int: the score the player win if he win to the enemy in specific. 
	 * @param levelEnemy: int: the level where the enemy is. 
	 * @return msj: a  confirmation message.
	 */

	public String addEnemyToLevel(String nameEnemy, String typeEnemy, int scoreLostEnemy, int scoreWinEnemy, int levelEnemy){
		String msj = "Could not add a enemy"; 
		Enemy newEnemy = new Enemy(nameEnemy, typeEnemy, scoreLostEnemy, scoreWinEnemy,levelEnemy); 
		int posLevel = searchLevelById(levelEnemy); 
		if(posLevel != -1 ){
			msj = levels[posLevel].addEnemyWithObject(newEnemy); 
		}
		return msj; 
	}
	/**
	 * searchLevelById: this method search a level by the id level.
	 * @param level: int: the level who going to be search.
	 * @return pos: the position in the array.
	 */

	public int searchLevelById(int level){
		int pos = -1; 
		boolean isFound = false; 
		for(int i = 0; i < ALL_LEVELS && !isFound; i++ ){
			if(levels[i].getId() == level){
				pos = i; 
				isFound = true; 
			}
		}
		return pos; 
	}
	/**
	 * addEnemyGame: this method add a enemy to game . 
	 * @param nameEnemy: String: the enemy name.
	 * @param typeEnemy: String: the type enemy.
	 * @param scoreLostEnemy: int: the score the player loses if he loses to the enemy in specific. 
	 * @param scoreWinEnemy: int: the score the player win if he win to the enemy in specific. 
	 * @param levelEnemy: int: the level where the enemy is. 
	 * @return msj: a  confirmation message.
	 */

	public String addEnemyGame(String nameEnemy, String typeEnemy, int scoreLostEnemy, int scoreWinEnemy, int levelEnemy){
		String msj = "Could not add a enemy"; 
		boolean isEmpty = false; 
		Enemy newEnemy = new Enemy(nameEnemy, typeEnemy, scoreLostEnemy, scoreWinEnemy,levelEnemy);
		for(int i = 0; i <TOTAL_ENEMYS && !isEmpty; i++){
			if(enemys[i] == null){
				// I add the enemy to the first available array space 
				enemys[i] = newEnemy; 
				isEmpty = true; 
				msj = "New enemy added"; 
			}
		}

		return msj; 
	}
	/**
	 * addTreasureToLevel: this method add a treasure for a level.
	 * @param nameTreasure: String: the treasure name.
	 * @param url: String the treasure url image.
	 * @param scoreWinTreasure: int:the score the player win if he found to the treasure in specific.
	 * @param levelTreasure: int: the level where the treasure is. 
	 * @param numberTreasureLevel: int: the number of the treasure than the user want added.
	 * @return msj: a  confirmation message.
	 */

	public String addTreasureToLevel(String  nameTreasure, String url,  int scoreWinTreasure, int levelTreasure,int numberTreasureLevel){
		String msj = "Could not add a treasure";  
		int posLevel = searchLevelById(levelTreasure);
		int amount = levels[posLevel].avaliableTreasureLevel();
		if(amount < numberTreasureLevel){
			msj = "you cannot add this amount of treasure to this level, for  this level you can  add this amount..." + amount;
	
		} else if(amount >= numberTreasureLevel){
			for(int i = 0; i <numberTreasureLevel; i++){

				Treasure newTreasure = new Treasure(nameTreasure, url, scoreWinTreasure, levelTreasure, 1); 
				if(posLevel != -1 ){
				msj = levels[posLevel].addTreasureWithObject(newTreasure, numberTreasureLevel);  
				}	
			}
			msj = "add treasure at level"; 
		
		}
		return msj; 
	}
	/**
	 * addTreasureToGame: this method add a treasure to game.
	 * @param nameTreasure: String: the treasure name.
	 * @param url: String the treasure url image.
	 * @param scoreWinTreasure: int:the score the player win if he found to the treasure in specific.
	 * @param levelTreasure: int: the level where the treasure is. 
	 * @param numberTreasureLevel: int: the number of the treasure than the user want added.
	 * @return msj: a  confirmation message.
	 */

	public String addTreasureGame(String  nameTreasure, String url,  int scoreWinTreasure, int levelTreasure,int numberTreasureLevel){
		String msj = "Could not add a treasure"; 
		int amount = avaliableTreasure();
		if(amount<numberTreasureLevel){
			msj = "you cannot add this amount of treasure to this game";
	
		}else if(amount>=numberTreasureLevel){

			for(int i =0; i <numberTreasureLevel; i++){
				boolean isEmpty = false; 
				Treasure newTreasure = new Treasure(nameTreasure, url, scoreWinTreasure, levelTreasure, numberTreasureLevel);
					for(int j = 0; j <TOTAL_TREASURES && !isEmpty; j++){
						if(treasures[j] == null){
							// I add the treasure to the first available array space 
							treasures[j] = newTreasure; 
							isEmpty = true; 
							
						}
			        }
			msj = "New treasure added"; 
			}	
		}
		

		return msj; 
	}
	/**
	 * avaliableTreasure: This method tells us the amount available to add new treasures to the game. 
	 * @return amount: int: returns an int that is the amount available 
	 */

	public int avaliableTreasure(){
        int amount= 0;
		for(int i=0;i<TOTAL_TREASURES;i++){
		    if(treasures[i]==null){
		        amount++;
		    }
		}
		  return amount; 
	}

	public void initialityTreasures(){

		for( int i = 0; i < 50; i++){
			int posLevel = treasures[i].getLevel()-1;  	
			levels[posLevel].addTreasureWithObject(treasures[i], treasures[i].getNumberTreasureLevel()); 
				
		}
		
	}

	public void initialityEnemys(){

		for( int i = 0; i < 25; i++){
			int posLevel = enemys[i].getLevel()-1;  	
			levels[posLevel].addEnemyWithObject(enemys[i]); 
				
		}
		
	}
	/**
	 * changeScorePlayer: this method change the player score in the game.
	 * @param nickname: String: the nickname player.
	 * @param newScorePlayer: int:  the new score than the player will give. 
	 * @return msj: a confirmation message. 
	 */

	public String changeScorePlayer(String nickname, int newScorePlayer){
		 String msj = ""; 

		int forchange = searchSameNickname(nickname);

		if(forchange != -1){
			totalPlayers[forchange].setScore(newScorePlayer);
			msj = "score changed with success... : D"; 

		}else{
			msj = "You cannot modify the score, because this player not exits ... :( ";
		}
		return msj; 
	}
	/**
	 * findPlayer: this method find the player with the nickname
	 * @param nickname: String; the nickname player.
	 * @return msj: String: a confirmation message.
	 */

	public Player findPlayer(String nickname){

		Player theFirst = null;

		for(int i=0; i<TOTAL_PLAYERS && theFirst==null; i++){

			if(totalPlayers[i]!=null && totalPlayers[i].getNickname().equalsIgnoreCase(nickname)){

				theFirst = totalPlayers[i];

			}

		}

		return theFirst;

	}
	/**
	 * changeLevelPlayer: This method changes the level of the player by entering their id or nickname by the user. 
	 * @param nickname: String: the nickname player.
	 * @return msj: a confirmation message.
	 */

	public String changeLevelPlayer(String nickname){
		 String msj = "the level was changed successfully... UwU "; 
		Player playerChange = findPlayer(nickname);
		if(playerChange == null){
			msj = "no exists this players :("; 
		} else{
			int scorePlayer = playerChange.getScore(); 
			Level levelPlayer = playerChange.getLevel(); 

			if(scorePlayer < levelPlayer.getNextScore()){
				if(scorePlayer == 999){
					msj = "you’re at the maximum level  :o"; 
				}else{
					int amount = levelPlayer.getNextScore() - scorePlayer;
					msj = "you need this points for the next level..." + amount; 
				 }
			}else{ 
				for(int i = 0; i< ALL_LEVELS; i++){
					if(levelPlayer.getId() == levels[i].getId()){
						for(int j= i; j < ALL_LEVELS; j++){
							if(j == 9){
								if(scorePlayer >= 800 && scorePlayer <1000){
									playerChange.setLevel(levels[j]);
								}
							}
							if((scorePlayer==levels[j].getNextScore())|| (scorePlayer > levels[j].getNextScore() && scorePlayer < levels[j+1].getNextScore())){
								playerChange.setLevel(levels[j+1]);
							}

						}
					}
				}

			}

			
		  }


		return msj;
	}
	/**
	 * enemysForLevel: this method gives a list of enemies of a specific level. 
	 * @param level:  int: the level of the game.
	 * @return msj:  a message list. 
	 */

	public String enemysForLevel(int level){
		int posLevel = searchLevelById(level);
		String msj = "there was a problem...  :(";

		msj = levels[posLevel].enemysLevel();

		return msj;
	}
	/**
	 * TreasuresForLevel: this method gives a list of treasures of a specific level. 
	 * @param level: int: the level of the game. 
	 * @return msj : a message list. 
	 */

	public String treasuresForLevel(int level){
		int posLevel = searchLevelById(level);
		String msj = "there was a problem...  :(";

		msj= levels[posLevel].treasuresLevel();

		return msj;
	}
	/**
	 * topPlayer: this method shows us the best players in the game regarding their score obtained. 
	 *@return msj: a message with the top 5 players with their score. 
	 */

	public String topPlayer(){
		int top1 = 0;
		int top2 = 0;
		int top3 = 0;
		int top4 = 0;
		int top5 = 0;
		String name1 = " ";
		String name2 = " ";
		String name3 = " ";
		String name4 = " ";
		String name5 = " ";
		String msj = ""; 

		for(int i = 0; i<TOTAL_PLAYERS; i++){

			if(totalPlayers[i] != null && totalPlayers[i].getScore() > top1){
				
				top5 = top4;
				top4= top3;
				top3= top2;
				top2 = top1;
				top1 = totalPlayers[i].getScore();
				name5 = name4;
				name4 = name3;
				name3 = name2;
				name2= name1; 
				name1 = totalPlayers[i].getNickname(); 
				
			} else if(totalPlayers[i] != null && totalPlayers[i].getScore() > top2){
				
				top5 = top4;
				top4= top3;
				top3= top2;
				top2 = totalPlayers[i].getScore(); 
				name5 = name4;
				name4 = name3;
				name3 = name2;
				name2= totalPlayers[i].getNickname();

			}else if( totalPlayers[i] != null && totalPlayers[i].getScore() > top3){

				top5 = top4;
				top4= top3;
				top3= totalPlayers[i].getScore(); 
				name5 = name4;
				name4 = name3;
				name3 = totalPlayers[i].getNickname();

			} else if(totalPlayers[i] != null && totalPlayers[i].getScore() > top4){

				top5 = top4;
				top4= totalPlayers[i].getScore(); 
				name5 = name4;
				name4 = totalPlayers[i].getNickname();

			}else if(totalPlayers[i] != null && totalPlayers[i].getScore() > top5){

				top5 = totalPlayers[i].getScore();
				name5 = totalPlayers[i].getNickname(); 
		
			}

			msj = "top 5 player... \n" +
					"1."+ name1 + ": " + top1 + "\n"+
					"2."+ name2 + ": " + top2 + "\n"+
					"3."+ name3 + ": " + top3 + "\n"+
					"4."+ name4 + ": " + top4 + "\n"+
					"5."+ name5 + ": " + top5 + "\n"; 

		}

		return msj; 
	}
	/**
	 * enemyMoreScore: This method shows us the enemy that gives us the highest score by beating him.
	 * @return msj:  a message with the enemy, the score and the level where he is. 
	 */

	public String enemyMoreScore(){

		int score= 0;
		int level =0; 
		String type = ""; 
		String msj = ""; 
		String name = ""; 

		for (int i =0; i< TOTAL_ENEMYS; i++){
			if(enemys[i] != null && enemys[i].getScoreWin() > score){
				
				score = enemys[i].getScoreWin();
				level = enemys[i].getLevel(); 
				type = enemys[i].getType();
				name= enemys[i].getName(); 
				
			}
			msj = "the enemy that the highest scoring give  is .. "+ name + ", the type:" + type + ", gives this score:  " + score + ", and he is on this level: " + level + ".";  
		}
		return msj; 
	}
	/**
	 * moreAmountTreasure: This method shows us what is the most repeated treasure in the game. 
	 * @return msj: a message with the most repeated treasure. 
	 */

	public String moreAmountTreasure(){

	String msj="";
	int allDiamond = 0;
	int allRock = 0;
	int allMap = 0;
	int allBlade = 0; 
	int allGolden = 0; 
	int amountMax= 0; 

	String diamond = "diamond"; 
	String rock = "rock"; 
	String map = "map"; 
	String blade = "blade"; 
	String golden = "golden";  
	String nameMax = "diamond";

	for(int i=0; i < TOTAL_TREASURES; i++){

		if(treasures[i] != null && treasures[i].getName().equalsIgnoreCase(diamond)){
			allDiamond++;
			

		} else if(treasures[i] != null && treasures[i].getName().equalsIgnoreCase(rock)){
			allRock++;
			

		} else if(treasures[i] != null && treasures[i].getName().equalsIgnoreCase(map)){
			allMap++;
			

		}else if(treasures[i] != null && treasures[i].getName().equalsIgnoreCase(blade)){
			allBlade++;
			

		}else if(treasures[i] != null && treasures[i].getName().equalsIgnoreCase(golden)){
			allGolden++; 
			
		}
	}

	
	if(allDiamond > amountMax){

		amountMax = allDiamond; 
		nameMax = diamond; 
				 
	}  
	if(allRock > amountMax){

		amountMax = allRock; 
		nameMax = rock;
				
	} 
	if( allMap > amountMax){

		amountMax = allMap; 
		nameMax = map;
				

	}  
	if(allBlade > amountMax){

		amountMax = allBlade; 
		nameMax = blade; 

	} 
	if(allGolden > amountMax){

		amountMax = allGolden; 
		nameMax = golden; 
		
	}

	msj = "The most repeated treasure in this game is... " + nameMax + " with this amount... " + amountMax + " "; 

    return msj;

	}
	/**
	 * AmountEnemy: This method shows us what is the most repeated of type  enemy  in the game. 
	 * @param typeEnemy: String: the type enemy. 
	 * @return msj: a message with the most repeated enemy. 
	 */

	public String amountEnemy(String typeEnemy){

		 int count = 0;
		 String msj ="";  
		 for( int i = 0; i <TOTAL_ENEMYS; i++){

		 	if(enemys[i] != null && enemys[i].getType().equalsIgnoreCase(typeEnemy)){
		 		count++; 
		 	}
		 	msj = " the amount of this type of enemy in the game is... " + count; 
		 } 

		 return msj; 
	}
	/**
	 * AmountTreasure: This method shows us what is the most repeated of type  treasure  in the game. 
	 * @param typeTreasure: String: the type treasure. 
	 * @return msj: a message with the most repeated treasure. 
	 */
	public String amountTreasure(String typeTreasure){

		int count = 0;
		String msj ="";  
		for( int i = 0; i <TOTAL_TREASURES; i++){

		 	if(treasures[i] != null && treasures[i].getName().equalsIgnoreCase(typeTreasure)){
		 		count++; 
		 	}
		 	msj = " the amount of this type of treasure in the game is... " + count; 
		 } 

		 return msj; 
	}
	/**
	 * consonantsEnemyGame: This method tells us the consonants in the names of the enemies of the game. 
	 * @return : a message with the amount consonants
	 */
	public String consonantsEnemyGame(){
		String msj = ""; 
		int amount=0;
		char [] consonants={'q','w','r','t','y','p','s','d','f','g','h','j','k','l','z','x',
		                       'c','v','b','n','m'};

		for(int i=0; i<TOTAL_ENEMYS;i++){
		    if(enemys[i]!=null){
		        for(int j=0; j<enemys[i].getName().length();j++){
		           for(int s=0;s<consonants.length;s++){
		              if(enemys[i].getName().charAt(j)==consonants[s]){
		               amount++; 
		               }
		            }
		         }
		    }

		      msj = "this is the number of consonants ...  "  + amount; 
		}
		   return msj;
    }

}