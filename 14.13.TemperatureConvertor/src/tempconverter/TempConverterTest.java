package tempconverter;
import javax.swing.JFrame;

public class TempConverterTest {
   public static void main( String[] args )
   { 
	   TempConversionFrame tempConversionFrame = new TempConversionFrame(); 
	   tempConversionFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	   tempConversionFrame.setSize( 350, 150 ); // set frame size
	   tempConversionFrame.setVisible( true ); // display frame
	   
   } // end main
} // end class TempConverterTest