package org.example;

public enum Weapon {
    SWORD(10, 1.2),
    AXE(12, 1.0),
    BOW(8, 1.5);

    private final int damage;
    private final double attackSpeed;

    Weapon(int damage, double attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    public int getDamage() {
        return damage;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }
}
