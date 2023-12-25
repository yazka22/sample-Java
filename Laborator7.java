import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

class Swing extends JFrame implements ActionListener
{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
JLabel label=null;
JButton button = null;
String string1=" 1 ";
String string2=" 2 ";
String string3=" 3 "; 

	public Swing (){
		setTitle( "Tema 7" );
		setBackground( Color.gray );
		JPanel topPanel = new JPanel();
		topPanel.setLayout( new FlowLayout() );
		getContentPane().add( topPanel );
//crearea imaginii
		ImageIcon image = new ImageIcon( "1.jpg" );
		button = new JButton( "Press Me", image );
		button.setPreferredSize( new Dimension( 300, 300 ) );
		ImageIcon image1 = new ImageIcon( "2.jpg" );
		button.setPressedIcon(image1);
		button.setMnemonic( 'P' );
		topPanel.add( button ); 
//creearea etichetei
		label = new JLabel( "Eticheta" );
		label.setFont( new Font( "Helvetica", Font.BOLD, 18 ) ); 
		topPanel.add( label );
//creeaza un grup pentru butoanele radio
		ButtonGroup rgroup=new ButtonGroup();
		JRadioButton radio1 = new JRadioButton ( "1");
		radio1.setActionCommand(string1);
		rgroup.add( radio1 );
		JRadioButton radio2 = new JRadioButton ( "2" );
		radio2.setActionCommand(string2);
		rgroup.add( radio2 );
		JRadioButton radio3 = new JRadioButton ( "3" );
		radio3.setActionCommand(string3);
		rgroup.add( radio3 );
//inregistreaza un listener pentru butoanele radio
		radio1.addActionListener(this);
		radio2.addActionListener(this);
		radio3.addActionListener(this);
//plaseaza butoanele radio orizontal pe un JPanel
		JPanel radioPanel = new JPanel( );
		radioPanel.setLayout(new BoxLayout(radioPanel,BoxLayout.X_AXIS));
		radioPanel.setPreferredSize( new Dimension( 300, 50 ) );
		radioPanel.setBorder(new TitledBorder(new EtchedBorder(),"Radio buttons"));
		radioPanel.add(radio1);
		radioPanel.add(radio2);
		radioPanel.add(radio3);
		topPanel.add(radioPanel);
 }
	public void actionPerformed(ActionEvent e){
		label.setText(e.getActionCommand());
		pack();
 }
	public static void main( String args[] ){
		Swing mainFrame = new Swing ();
		mainFrame.pack();
		mainFrame.setVisible( true );
 }
} 
