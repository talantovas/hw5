
public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setDamage(500);
        boss.setProtection("physical");

        System.out.println("Info:");
        System.out.println("Health: " + boss.getHealth() + "  Damage: " + boss.getDamage() + "  Protection: " + boss.getProtection());
        
    }
}