public class Hero {
    private int health;
    private int mana;

    public Hero(int health, int mana) {
        if (health < 0) {
            this.health = 0;
        } else if (health > 100) {
            this.health = 100;
        } else {
            this.health = health;
        }
        this.mana = mana;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        if (damage > 0) {
            this.health -= damage;
            if (this.health < 0) {
                this.health = 0;
            }
        }
    }

    public void heal(int heal) {
        if (heal > 0) {
            this.health += heal;
            if (this.health > 100) {
                this.health = 100;
            }
        }
    }

    public int getMana() {
        return mana;
    }

    public void rechargeMana(int mana) {
        if (mana > 0) {
            this.mana += mana;
            if (this.mana > 200) {
                this.mana = 200;
            }
        }
    }

    public void castSpell(int mana) {
        if (mana > 0) {
            this.mana -= mana;
            if (this.mana < 0) {
                this.mana = 0;
            }
        }
    }
}
