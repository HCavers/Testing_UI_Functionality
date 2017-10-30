import java.awt.event.MouseEvent;

public class Board{
	private Tile[][] tiles;
	private float tileWidth;
	private float tileHeight;
	
	public Board(int amountRows, int amountColumns, float canvasWidth, float canvasHeight){
		tileWidth = canvasWidth / amountColumns;
		tileHeight = canvasHeight / amountRows;
		tiles = new Tile[amountColumns][amountRows];
		for(int i = 0; i < amountRows; i++){
			for(int j = 0; j < amountColumns; j++){
				Tile tile = new Tile();
				tiles[j][i] = tile;
			}
		}
	}
	
	public void beenClicked(MouseEvent mouse){
		float x = mouse.getX();
		float y = mouse.getY();
		float tempX = x / tileWidth;
		float tempY = y / tileHeight;
		int tileX = (int)tempX;
		int tileY = (int)tempY;
		tiles[tileX][tileY].hasBeenClicked();
	}
}