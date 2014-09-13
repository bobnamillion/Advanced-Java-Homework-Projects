package tempconverter;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class TempConversionFrame extends JFrame{
	
	private static final long serialVersionUID = 1L; // Default serial version id added by eclipse
	private JComboBox<String> inputTempFormatBox;
	private JComboBox<String> outputTempFormatBox;
	private JLabel instructLabel; // JLabel with just text
	private JLabel sourceLabel;
	private JLabel destinationLabel;
	private JLabel resultLabel;
	private JTextField textField1; // text field with set size
	private JTextField textField2;
	private JButton plainJButton;
	
	private static final String[] tempFormat = { "Fahrenheit", "Celsius", "Kelvin" };

	// TempConversionFrame constructor adds JComboBox to JFrame
	   public TempConversionFrame() {
		   
		   super( "Convert Temperature" );
		   setLayout( new FlowLayout() ); // set frame layout
		   
		   inputTempFormatBox = new JComboBox<>( tempFormat );
		   inputTempFormatBox.setMaximumRowCount( 3 ); // display three rows;
		   
		      // JLabel constructor with a string argument
		   instructLabel = new JLabel( "Enter the temperature and select the conversion" );
		   instructLabel.setHorizontalTextPosition( SwingConstants.CENTER );
		   instructLabel.setVerticalTextPosition( SwingConstants.TOP );
		   instructLabel.setToolTipText( "Enter the temperature and select the conversion" );
		      add( instructLabel );
		      
		      textField1 = new JTextField( 5 );
		      add( textField1 );
		      
		      sourceLabel = new JLabel( "FROM");
		      add(sourceLabel);
		      
		      inputTempFormatBox = new JComboBox<>( tempFormat );
			  inputTempFormatBox.setMaximumRowCount( 3 ); // display three rows;
			  add(inputTempFormatBox);
			  
			  destinationLabel = new JLabel( "TO");
		      add(destinationLabel);
			  
		      outputTempFormatBox = new JComboBox<>( tempFormat );
			  outputTempFormatBox.setMaximumRowCount( 3 ); // display three rows;
			  add(outputTempFormatBox);
			  
			  resultLabel = new JLabel( "The converted temperature is: ");
		      add(resultLabel);
		      
		      textField2 = new JTextField( 5 );
		      textField2.setEditable( false );
		      add( textField2 ); // add textField1 to JFrame
		      
		      plainJButton = new JButton( "Convert" ); // button with text
		      add( plainJButton ); // add plainJButton to JFrame
		      
		      
		      ButtonHandler handler = new ButtonHandler();
		      plainJButton.addActionListener( handler );
		   
	   }
	   
	   private class ButtonHandler implements ActionListener {
		   public void actionPerformed( ActionEvent event ){
			   DecimalFormat formatted = new DecimalFormat("###.##");
			   double output = Double.valueOf(formatted.format(ConvertTemp.convert(Double.parseDouble(textField1.getText()), inputTempFormatBox.getSelectedIndex(), outputTempFormatBox.getSelectedIndex())));
			   String result = Double.toString(output);
			   textField2.setText(result);
			   
		   }
	   } // end private inner class ButtonHandler

} // Class
