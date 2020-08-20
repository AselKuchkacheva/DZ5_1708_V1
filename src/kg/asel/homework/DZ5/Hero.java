package kg.asel.homework.DZ5;

public class Hero  {
  private int healthHero;
  private int damageHero;
  private String superDefenseHero;


  public Hero (int healthHero, int damageHero, String superDefenseHero) {
    this.healthHero = healthHero;
    this.damageHero = damageHero;
    this.superDefenseHero = superDefenseHero;
  }

  public Hero(int healthHero, int damageHero) {
    this.healthHero = healthHero;
    this.damageHero = damageHero;
  }


  public void setHealthHero(int healthHero) {
    this.healthHero = healthHero;
  }

  public void setDamageHero(int damageHero) {
    this.damageHero = damageHero;
  }

  public void setSuperDefenseHero(String superDefenseHero) {
    this.superDefenseHero = superDefenseHero;
  }

  public int getHealthHero() {

    return healthHero;
  }

  public int getDamageHero() {

    return damageHero;
  }

  public String getSuperDefenseHero() {
    return superDefenseHero;
  }

}
