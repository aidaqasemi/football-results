import javax.swing.SwingUtilities;

public class App {

	public static void main(String[] args) {
SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				FootballResultsGUI FootballResultsGUI = new FootballResultsGUI();
				
				
				// Display
				FootballResultsGUI.setVisible(true); 
			}
		});

	}

}
