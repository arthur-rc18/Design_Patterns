package strategy_pattern.strategy;

public abstract class Ataque {

    private double damage;

    public double getDamage() {
        return this.damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public abstract void atacar();
}