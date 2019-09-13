package figuras;
import java.awt.Graphics;
import java.applet.Applet;
public class AppFigura extends Applet {
    public void paint(Graphics g) {
        g.drawString("hola", 75, 95);
        g.drawOval(100, 85, 50, 50);
        g.drawOval(295, 85, 50, 50);
        g.drawOval(10, 10, 400, 400);
        g.drawLine(205, 165, 205, 235);
        g.drawLine(100, 250, 350, 300);
    }
}
