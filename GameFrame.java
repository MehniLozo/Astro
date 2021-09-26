import java.awt.*;

public class GameFrame extends Frame {

    public GameFrame(){
        super("Space");
        setResizable(false);
        setSize(200, 200);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public static void main(String args[]){
        new GameFrame();    
    }
}