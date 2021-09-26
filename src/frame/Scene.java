package frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Scene extends JPanel{
  private ImageIcon icoBackground;
  private ImageIcon imgBackground;

  private ImageIcon icoAstron;
  private ImageIcon imgAstron;

  private int xFond1;
  private int xdx;

  public Scene{
    super();
    this.xFond1 = -50;
    this.xdx = -30;
    //background
	  icoBackground=new ImageIcon(getClass().getResource("/image/mars2.jpeg"));
    //we first get the imageIcon then we get the real image via getImage method

    this.imgBackground = this.icoBackground.getImage();

    //main character
    icoAstron = new ImageIcon(getClass().getResource("/image/astroMars.jpeg"));
    this.imgAstron = this.icoAstron.getImage();

    this.setFocusable(true);
    this.requestFocusInWindow();
    this.addKeyListener(new Clavier());

    Thread chronoEcron = new Thread(new Chrono());
		chronoEcron.start();

    }
  public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		Graphics g2=(Graphics2D)g ;
		
		g2.drawImage(this.imgBackground, this.xFond1,0,null);
		g2.drawImage(imgAstron,200,160,null); 
	}
	
	public void deplacementFrond()
	{
		this.xFond1=this.xFond1-this.xdx;
	}

  
}