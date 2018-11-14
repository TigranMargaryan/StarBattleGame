package myfirstgame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Score {
	
	
	public void render(Graphics g) {
		Font fn = new Font("arial", Font.BOLD, 30);
	 	g.setFont(fn);
	 	g.setColor(Color.CYAN);
	 	g.drawString("Top 5", 10,40);
		 
	 	LinkedHashMap<String, Integer> reverseSortedMap = new LinkedHashMap<>();
	 	GetSQL.scormap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));
	 	
	 	Set<Map.Entry<String, Integer>> mapSet = reverseSortedMap.entrySet();
	 	
        Map.Entry<String, Integer> elementAt5 = (new ArrayList<Map.Entry<String, Integer>>(mapSet)).get(0);
		 
	 	fn = new Font("arial", Font.BOLD, 20);
	 	g.setFont(fn);
	 	g.drawString("1)", 10, 80);
	       
	 
	 	g.drawString(elementAt5.getKey(), 30, 80);
	 	
	 	g.drawString(" "+elementAt5.getValue(), 150, 80);
	 	
	 	g.drawString("2)", 10,120);
	 	
	 	 elementAt5 = (new ArrayList<Map.Entry<String, Integer>>(mapSet)).get(1);
	 	 
	 	g.drawString(elementAt5.getKey(), 30, 120);
	 	
	 	g.drawString(" "+elementAt5.getValue(), 150, 120);
	 	
	 	g.drawString("3)", 10,160);
	 	
	 	elementAt5 = (new ArrayList<Map.Entry<String, Integer>>(mapSet)).get(2);
	 	 
	 	g.drawString(elementAt5.getKey(), 30, 160);
	 	
	 	g.drawString(" "+elementAt5.getValue(), 150, 160);
	 	
	 	
	 	g.drawString("4)", 10,200);
	 	
	 	elementAt5 = (new ArrayList<Map.Entry<String, Integer>>(mapSet)).get(3);
	 	 
	 	g.drawString(elementAt5.getKey(), 30, 200);
	 	
	 	g.drawString(" "+elementAt5.getValue(), 150, 200);
	 	
	 	g.drawString("5)", 10,240);
	 	
	 	elementAt5 = (new ArrayList<Map.Entry<String, Integer>>(mapSet)).get(4);
	 	 
	 	g.drawString(elementAt5.getKey(), 30, 240);
	 	
	 	g.drawString(" "+elementAt5.getValue(), 150, 240);
	 	
	 /*	g.drawString("6)", 10,280);
	 	
	 	g.drawString("7)", 10,320);
	 	
	 	g.drawString("8)", 10,360);
	 	
	 	g.drawString("9)", 10,400);
	 	
	 	g.drawString("10)",2 ,440);*/
	 	
	 	
	 	g.drawRect(10, 460, 100, 40);				//back to menu
	 	g.drawString("Back", 35,487);
	 	

	}
}
