//package abjava;
//java-cp output/ -cp output/.:mysql-connector-java-5.1.39-bin.jar  Main
public class Main{
	public static void main(String args[]){
		Main app = new Main();
		app.runApplication();
	}
	public void runApplication(){
	
		dataBaseControl run_db = new dataBaseControl();
		searchView view = new searchView();
	}
}

