package ClassForPractice;

public class ControlHero {
    public static void main (String[ ] args){
        hero ro = new hero();
        ro.name = "琴瑟仙女";
        ro.hp = 500;
        ro.mp = 250;
        System.out.println("ro.name = " + ro.name);
        System.out.println("ro.hp = " + ro.hp);
        System.out.println("ro.mp = " + ro.mp);
        System.out.println("============================");
        ro.defendtower();
        ro.kill();
        ro.makemoney();
    }


}
