package kg.asel.homework.DZ5;

public class Main {


    private static int i;

    public static void main(String[] args) {

        Boss boss = new Boss();

        boss.setHelthBoss(700);
        boss.setDamageBoss(50);
        boss.setDefenseTypeBoss("Physical");

        System.out.println("Здоровье Босса = " + boss.getHelthBoss() + "; " + "Урон Босса = "
                + boss.getDamageBoss() + "; " + "Тип защиты - " + boss.getDefenseTypeBoss());

        System.out.println("_____________________________________________________________");
        createHeroes();


    }

    public static Hero[] createHeroes() {

        Hero chase = new Hero(500, 20, "Police");
        Hero zuma = new Hero(550, 15, "Builder");
        Hero marshal = new Hero(450, 25);

        Hero[] createHeroes = new Hero[]{chase, zuma, marshal};

        for (int j = 0; j < createHeroes.length; j++) {
            System.out.println(createHeroes[j].getSuperDefenseHero() + " " + " Здоровья: " + createHeroes[j].getHealthHero() +
                    " Сила удара героя " + createHeroes[j].getSuperDefenseHero() + " " + createHeroes[j].getDamageHero());


        }
        return createHeroes;
    }

}

