import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
public class FootballResultsGUI extends JFrame implements ActionListener{
	
	public static void main(String[] args) {
		JButton Iranbtn, Spainbtn, Englandbtn, Italybtn, Germanybtn, Brazilbtn;}
	
	private JButton Englandbtn;
	private JButton Spainbtn;
	private JButton Iranbtn;
	private JButton Italybtn;
	private JButton Germanybtn;
	private JButton Brazilbtn;
    private JLabel resultLabel;
         
		public FootballResultsGUI() {
			
		super ("نتايج فوتبال");
		setSize(450,570);
		
        setLayout(null);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.DARK_GRAY);
		setLocationRelativeTo(null);
		/* FootballResults FootballResults = new FootballResults();*/
		 addGuiComponents();
	}

	private void addGuiComponents() {
			// TODO Auto-generated method stub
		JLabel chooseLabel = new JLabel("choose a country*-*");
		chooseLabel.setForeground(Color.CYAN);
		
		chooseLabel.setBounds(150,5,2000,100);
		chooseLabel.setFont(new Font("Dialog",Font.ITALIC,20));
	
		add(chooseLabel);
		
		
	
		Iranbtn = new JButton("Iran");
		Iranbtn.setBounds(40, 300, 105, 80);
		Iranbtn.setFont(new Font("Dialog" , Font.PLAIN, 16));
		Iranbtn.addActionListener(this);
		Iranbtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		add(Iranbtn);
		
	    Spainbtn = new JButton("Spain");
		Spainbtn.setBounds(165, 300, 105, 80);
		Spainbtn.setFont(new Font("Dialog" , Font.PLAIN, 16));
		Spainbtn.addActionListener(this);
		Spainbtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		add(Spainbtn);
		
		Englandbtn = new JButton("England");
		Englandbtn.setBounds(290, 300, 105, 80);
		Englandbtn.setFont(new Font("Dialog" , Font.PLAIN, 16));
		Englandbtn.addActionListener(this);
		Englandbtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		add(Englandbtn);
		
		Italybtn = new JButton("Italy");
		Italybtn.setBounds(40, 95, 105, 80);
		Italybtn.setFont(new Font("Dialog" , Font.PLAIN, 16));
		Italybtn.addActionListener(this);
		Italybtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		add(Italybtn);
		
		Germanybtn= new JButton("Germany");
		Germanybtn.setBounds(165, 95, 105, 80);
		Germanybtn.setFont(new Font("Dialog" , Font.PLAIN, 16));
		Germanybtn.addActionListener(this);
	    Germanybtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		add(Germanybtn);
		
		Brazilbtn = new JButton("Brazil");
		Brazilbtn.setBounds(290, 95, 105, 80);
		Brazilbtn.setFont(new Font("Dialog" , Font.PLAIN, 16));
		Brazilbtn.addActionListener(this);
	    Brazilbtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		add(Brazilbtn);
		
		resultLabel=new JLabel();
		resultLabel.setForeground(Color.YELLOW);
		resultLabel.setBounds(40,400,400,100);
		resultLabel.setFont(new Font("Dialog",Font.ITALIC,18));
		add(resultLabel);
	  
		
		
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
		
		   String choice = e.getActionCommand().toString();}
}
	       