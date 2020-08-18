package kg.asel.homework.DZ5;

public class Hero {
  private int healthHero;
  private int damageHero;
  private String superpowerHero;

  public Hero(int healthHero, int damageHero, String superpowerHero) {
    this.healthHero = healthHero;
    this.damageHero = damageHero;
    this.superpowerHero = superpowerHero;
  }

  public Hero(int healthHero, int damageHero) {
    this.healthHero = healthHero;
    this.damageHero = damageHero;
  }

  public int getHealthHero() {
    return healthHero;
  }

  public int getDamageHero() {
    return damageHero;
  }

  public String getSuperpowerHero() {
    return superpowerHero;
  }

  public void setHealthHero(int healthHero) {
    this.healthHero = healthHero;
  }

  public void setDamageHero(int damageHero) {
    this.damageHero = damageHero;
  }

  public void setSuperpowerHero(String superpowerHero) {
    this.superpowerHero = superpowerHero;
  }
}
