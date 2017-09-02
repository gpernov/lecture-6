package paint;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Painter extends JFrame implements MouseListener, MouseMotionListener {
  public static void main( String[] args ) {
    Painter window = new Painter();
  }

  private Graphics buffer;
  private int startX;
  private int startY;

  public Painter() {
    setTitle( "Painter" );
    setSize( 400, 400 );
    setLocationByPlatform( true );
    setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE );
    setLayout( new BorderLayout() );

    Panel drawing = new Panel();
    add( drawing, BorderLayout.CENTER );

    drawing.addMouseListener( this );
    drawing.addMouseMotionListener( this );

    setVisible( true );

    buffer = drawing.getGraphics();
    buffer.setColor( Color.BLACK );
  }

  public void mousePressed( MouseEvent event ) {
    startX = event.getX();
    startY = event.getY();
  }

  public void mouseDragged( MouseEvent event ) {
    buffer.drawLine( startX, startY, event.getX(), event.getY() );

    startX = event.getX();
    startY = event.getY();
  }

  public void mouseClicked( MouseEvent event ) {}
  public void mouseMoved( MouseEvent event ) {}
  public void mouseEntered( MouseEvent event ) {}
  public void mouseExited( MouseEvent event ) {}
  public void mouseReleased( MouseEvent event ) {}
}
