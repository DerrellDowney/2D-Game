package main;

import javax.swing.JPanel;

public class GamePanel extends JPanel{

	//SCREEN SETTINGS
	
	final int originalTileSize = 16; // 16x16 tiles
	final int scale = 3;
	
	final int tileSize = originalTileSize * scale; //48x48 px tiles
	final int maxScreenCol = 16;
	final int maxScreenRow = 12; //4:3 ratio
	final int screenWidth = tileSize * maxScreenCol; // 768px
	final int screenHeight = tileSize * maxScreenRow; // 576px
}
