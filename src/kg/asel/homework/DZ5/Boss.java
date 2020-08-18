package kg.asel.homework.DZ5;

public class Boss {
    private int helthBoss;
    private int damageBoss;
    private String protectTypeBoss;

    /*public Boss(int helthBoss, int damageBoss, String protectTypeBoss) {
        this.helthBoss = helthBoss;
        this.damageBoss = damageBoss;
        this.protectTypeBoss = protectTypeBoss;
    }*/

    public int getHelthBoss() {
        return helthBoss;
    }

    public int getDamageBoss() {
        return damageBoss;
    }

    public String getProtectTypeBoss() {
        return protectTypeBoss;
    }

    public void setHelthBoss(int helthBoss) {
        this.helthBoss = helthBoss;
    }

    public void setDamageBoss(int damageBoss) {
        this.damageBoss = damageBoss;
    }

    public void setProtectTypeBoss(String protectTypeBoss) {
        this.protectTypeBoss = protectTypeBoss;
    }
}
