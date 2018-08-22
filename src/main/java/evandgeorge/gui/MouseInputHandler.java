package evandgeorge.gui;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import evandgeorge.games.Game;

public class MouseInputHandler implements MouseListener, MouseMotionListener {

    //reference to game that mouse input handler is created for
    private Game game;

    public MouseInputHandler(Game game) {
        game.display.addMouseListener(this);
        game.display.addMouseMotionListener(this);
        this.game = game;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        game.handleMouseInput(e);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        game.handleMouseInput(e);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        game.handleMouseInput(e);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        game.handleMouseInput(e);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        game.handleMouseInput(e);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        game.handleMouseInput(e);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        game.handleMouseInput(e);
    }

}