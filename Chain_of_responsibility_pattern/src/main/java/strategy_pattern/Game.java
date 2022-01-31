package strategy_pattern;

import strategy_pattern.concrete_observers.Skeleton;
import strategy_pattern.concrete_observers.Undead;
import strategy_pattern.concrete_observers.Zombie;
import strategy_pattern.observers.Enemy;
import strategy_pattern.personagens.Personagem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Game extends JPanel{

    private Personagem p1;
    private Enemy e1;
    private int attack;
    private Zombie z1;
    private Skeleton s1;
    private Undead u1;

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

            if (e.getKeyCode() == KeyEvent.VK_SPACE)
                p1.attack(e1,attack);
        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }

    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.setColor(Color.BLACK);
        g2d.fillOval(p1.getX(), p1.getY(), 20, 20);

        g2d.setColor(Color.GREEN);
        g2d.fillOval(e1.getX(), e1.getY(), 20, 20);

        g2d.setColor(Color.RED);
        g2d.fillOval(z1.getX(), z1.getY(), 20, 20);

        g2d.setColor(Color.WHITE);
        g2d.fillOval(u1.getX(), u1.getY(), 20, 20);

        g2d.setColor(Color.BLUE);
        g2d.fillOval(s1.getX(), s1.getY(), 20, 20);
    }

    public void play(Game game) throws InterruptedException, ClassCastException{
        int x = 1024;
        int y = 768;
        JFrame frame = new JFrame("BattleGame");

        JLabel label = new JLabel();

        label.setBounds(0, 0, x, y);

        game.setLayout(null);
        game.add(label);

        frame.add(game);
        frame.setSize(x, y);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p1 = new Personagem(100,50,50,"Warrior");
        e1 = new Enemy(30,35,"Enemy");
        u1 = new Undead(25,20,"Undead");
        s1 = new Skeleton(25,20,"Skeleton");
        z1 = new Zombie(45,40,"Zombie");

        p1.addObserver(e1);
        p1.addObserver(u1);
        p1.addObserver(s1);
        p1.addObserver(z1);

        while(true){
            p1.show();
            game.repaint();
            Thread.sleep(50);
        }

    }
}
