package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {
  public static void main( String[] args ) {
    Calculator calculator = new Calculator();
  }

  private Panel panel = new Panel();
  private TextField textField = new TextField();

  private float f1;
  private float f2;

  private Button button1 = new Button( "1" );
  private Button button2 = new Button( "2" );
  private Button button3 = new Button( "3" );
  private Button button4 = new Button( "4" );
  private Button button5 = new Button( "5" );
  private Button button6 = new Button( "6" );
  private Button button7 = new Button( "7" );
  private Button button8 = new Button( "8" );
  private Button button9 = new Button( "9" );
  private Button button0 = new Button( "0" );

  private Button buttonAdd = new Button( "+" );
  private Button buttonSubtract = new Button( "-" );
  private Button buttonMultiply = new Button( "*" );
  private Button buttonDivide = new Button( "/" );

  private Button buttonEquals = new Button( "=" );
  private Button buttonDecimal = new Button( "." );

  public Calculator() {
    setTitle( "Calculator" );
    setSize( 400, 400 );
    setLocationByPlatform( true );
    setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE );
    setLayout( new BorderLayout() );

    add( textField, BorderLayout.PAGE_START );
    add( panel, BorderLayout.CENTER );

    panel.setLayout( new GridLayout( 4, 4 ));

    panel.add( button7 );
    panel.add( button8 );
    panel.add( button9 );
    panel.add( buttonAdd );

    panel.add( button4 );
    panel.add( button5 );
    panel.add( button6 );
    panel.add( buttonSubtract );

    panel.add( button1 );
    panel.add( button2 );
    panel.add( button3 );
    panel.add( buttonMultiply );

    panel.add( button0 );
    panel.add( buttonDecimal );
    panel.add( buttonEquals );
    panel.add( buttonDivide );

    button7.addActionListener( this );
    button8.addActionListener( this );
    button9.addActionListener( this );
    buttonAdd.addActionListener( this );

    button4.addActionListener( this );
    button5.addActionListener( this );
    button6.addActionListener( this );
    buttonSubtract.addActionListener( this );

    button1.addActionListener( this );
    button2.addActionListener( this );
    button3.addActionListener( this );
    buttonMultiply.addActionListener( this );

    button0.addActionListener( this );
    buttonDecimal.addActionListener( this );
    buttonEquals.addActionListener( this );
    buttonDivide.addActionListener( this );

    setVisible( true );
  }

  public void actionPerformed( ActionEvent event ) {
    if( event.getSource() == button0 ) {
      textField.setText( textField.getText() + "0" );
    } else if( event.getSource() == button1 ) {
      textField.setText( textField.getText() + "1" );
    } else if( event.getSource() == button2 ) {
      textField.setText( textField.getText() + "2" );
    } else if( event.getSource() == button3 ) {
      textField.setText( textField.getText() + "3" );
    } else if( event.getSource() == button4 ) {
      textField.setText( textField.getText() + "4" );
    } else if( event.getSource() == button5 ) {
      textField.setText( textField.getText() + "5" );
    } else if( event.getSource() == button6 ) {
      textField.setText( textField.getText() + "6" );
    } else if( event.getSource() == button7 ) {
      textField.setText( textField.getText() + "7" );
    } else if( event.getSource() == button8 ) {
      textField.setText( textField.getText() + "8" );
    } else if( event.getSource() == button9 ) {
      textField.setText( textField.getText() + "9" );
    } else if( event.getSource() == buttonAdd ) {
      f1 = Float.parseFloat( textField.getText() );
      textField.setText( "" );
    } else if( event.getSource() == buttonEquals ) {
      f2 = Float.parseFloat( textField.getText() );
      textField.setText( (f1 + f2) + "" );
    }
  }
}
