package evandgeorge.gui;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;

import evandgeorge.games.Game;

public class Display extends JPanel {
    
    public static final long serialVersionUID = 969290359298454345L;
    private Game game;  //create reference to game that draws on this display

    public Display(Game game) {
        this.game = game;
    }

    @Override
    public void paint(Graphics g) {
        //create Graphics2D context from Grapics context & enable antialiasing
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        //call drawGraphics function of game
        game.drawGraphics(g2d);
    }

}