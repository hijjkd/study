import java.awt.Canvas;
import java.awt.Graphics;//画图必须
import java.awt.Graphics2D;
class Mycanvas extends Canvas {
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2=(Graphics2D)g;//强制转化成Gra2D
        g2.drawLine(44,4,944,889);
    }
}