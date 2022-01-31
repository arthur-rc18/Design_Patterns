package strategy_pattern.concrete_observers;

import strategy_pattern.observers.Enemy;

public class Zombie extends Enemy {

    public Zombie(int x, int y, String nome) {
        super(x, y, nome);
    }
}
