import java.util.*;

class Die{
    private int faceValue;
    public Die(){}
    Random r = new Random();
    public int getFaceValue(){
	return faceValue;
    }
    public void roll(){
	faceValue=r.nextInt(6)+1;
    }
}


class Player{
    private String name;
    public Player(String name){
	this.name=name;
    }
    public String getName(){
	return name;
    }
    public void greeting(){
	System.out.println("What is your name?");
	System.out.println("> "+name);
	System.out.println("Hello, "+name+"!");
    }
}


class DiceGame{
    public DiceGame(){};
    public void play(){
	Player player = new Player("John");
	Die die1 = new Die();
	Die die2 = new Die();
	Die die3 = new Die();
	int total;
	player.greeting();
	System.out.println("Rolling the dice...");	
	die1.roll();
	die2.roll();
	die3.roll();
	System.out.println("Die1: "+die1.getFaceValue());
	System.out.println("Die2: "+die2.getFaceValue());
       	System.out.println("Die3: "+die3.getFaceValue());
	total=die1.getFaceValue()+die2.getFaceValue()+die3.getFaceValue();
	System.out.println("Total value: "+total);
	if(total>7)System.out.println(player.getName()+" won.");
	else System.out.println(player.getName()+" lost.");
    }
    
    public static void main(String[] args){
	DiceGame DG = new DiceGame();	
	DG.play();
    }
}

