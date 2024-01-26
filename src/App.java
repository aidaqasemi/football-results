import javax.swing.SwingUtilities;
import java.net.HttpURLConnection;
public class App {

	public static void main(String[] args) {
SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				
				FootballResultsGUI FootballResultsGUI = new FootballResultsGUI();
				
			
				
				 FootballResultsGUI.setVisible(true); 
			}
		});

	}

}
