package _06_gridworld;



import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {
public static void main(String[] args) {
 World world = new World(); 
 world.show();
 Random ran = new Random(); 
 Bug bug = new Bug(); 
 int x = ran.nextInt(10); 
 int y = ran.nextInt(10);
Bug bug1 = new Bug();
world.add(new Location(x,y), bug); 
bug.setColor(Color.BLUE);
world.add(new Location(ran.nextInt(10),ran.nextInt(10)), bug1); 
bug.turn();
bug1.turn();
if (x!=9) {
	world.add(new Location(x+1,y),new Flower()); 
}
if (x!=0) {
	world.add(new Location(x-1,y),new Flower());
	
	
}
}
} 
