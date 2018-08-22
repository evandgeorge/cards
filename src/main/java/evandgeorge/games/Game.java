package evandgeorge.games;

import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import evandgeorge.gui.Display;
import evandgeorge.gui.MouseInputHandler;

public abstract class Game implements Serializable {
    
    static final long serialVersionUID = 1056839782048573769L;
    
    public transient Display display = new Display(this);
    public transient MouseInputHandler mouseInputHandler = new MouseInputHandler(this);

    public abstract void drawGraphics(Graphics2D g);

    public abstract void handleMouseInput(MouseEvent e);

    public final void saveGame(String path) {
        try {
            FileOutputStream fileOutStream = new FileOutputStream(new File(path));
            ObjectOutputStream objectOutStream = new ObjectOutputStream(fileOutStream);
            
            objectOutStream.writeObject(this);
            objectOutStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}