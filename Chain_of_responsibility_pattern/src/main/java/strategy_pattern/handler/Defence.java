package strategy_pattern.handler;

public abstract class Defence {

    private Defence next;

    public Defence getNext() {
        return this.next;
    }

    public void setNext(Defence next) {
        this.next = next;
    }

    public abstract void shield(int damage);

}
