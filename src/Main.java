public class Main {
    public static void main(String[] args) {
    Boss Tanos = new Boss();
    Tanos.setDmg(111);
        System.out.println( "damage: " + Tanos.getDmg());
        Tanos.setHp(700);
        System.out.println("health: " + Tanos.getHp());
        Tanos.setBossDefenceType("GoodGirl");
        System.out.println("defence: " + Tanos.getBossDefenceType());

    }
}