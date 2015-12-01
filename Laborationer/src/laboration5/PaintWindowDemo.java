﻿package laboration5;
import java.awt.Color;
import javax.swing.ImageIcon;

/**
 * Programmet demonstrerar olika metoder i PaintWindow
 * @author TSROAX
 */
public class PaintWindowDemo {
    public void demo1() {
        PaintWindow window = new PaintWindow();
        ImageIcon image = new ImageIcon("/Users/Kristoffer/Downloads/DA339AL5HT15/gubbe.jpg");
        window.line(100, 170, 400, 300, Color.CYAN, 10);
        window.line(200, 380, 400, 100, Color.BLACK, 3);
        window.drawRect(10, 10, 580, 380, Color.RED, 4);
        window.fillRect(30, 280, 130, 60, Color.BLUE);
        window.drawOval(200, 40, 209, 100, Color.MAGENTA, 10);
        window.fillOval(270, 70, 40, 60, Color.GREEN);
        window.showImage(image, 200, 150);
    }
    
    public static void main(String[] args) {
        PaintWindowDemo prog = new PaintWindowDemo();
        prog.demo1();
    }
}
