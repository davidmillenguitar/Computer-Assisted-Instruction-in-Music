import java.awt.*;

public class Images extends Canvas{
    String filename;

    public Images(String filename){
        this.filename = filename;
    }

    public void paint(Graphics g){
        Toolkit t = Toolkit.getDefaultToolkit();
        Image i = t.getImage(filename);
        g.drawImage(i,0,0, this);

    }

    public void setFilename(String filename){
        this.filename = filename;
        this.repaint();
    }
}

