public class Tile{
	private boolean beenClicked;
	
	public Tile(){beenClicked = false;}
	
	public void hasBeenClicked(){
		if(beenClicked == true){
			beenClicked = false;
		}else{
			beenClicked = true;
		}
	}
}