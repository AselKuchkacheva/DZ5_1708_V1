package kg.asel.homework.DZ5;

public class Main {

    public static void main(String[] args) {

        Boss boss = new Boss();

        boss.setHelthBoss(700);
        boss.setDamageBoss(50);
        boss.setProtectTypeBoss("Physical");

        System.out.println("Здоровье Босса = " + boss.getHelthBoss() + "; " + "Урон Босса = "
                + boss.getDamageBoss() + "; " + "Тип защиты - " + boss.getProtectTypeBoss());
    }
}
