package strategy_pattern;

import strategy_pattern.personagens.Personagem;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Game extends JPanel{

    private Personagem p1;

    public Game(){
        KeyListener listener = new MyKeyListener();
        addKeyListener(listener);
        setFocusable(true);
    }

    public class MyKeyListener implements KeyListener{

        @Override
        public void keyTyped(KeyEvent e){

        }

        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_LEFT)
                p1.setX(p1.getX() - 10);

            if (e.getKeyCode() == KeyEvent.VK_RIGHT)
                p1.setX(p1.getX()+10);

            if (e.getKeyCode() == KeyEvent.VK_UP)
                p1.setY(p1.getY()-10);

            if (e.getKeyCode() == KeyEvent.VK_DOWN)
                p1.setY(p1.getY()+10);
        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }
}
