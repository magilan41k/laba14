package com.company;
class DotaHero{
    private static DotaHero dotaHero=new DotaHero();
    private int force;
    private DotaHero(){
        this.force=12;
    }
    public static DotaHero getInstance() {
        return dotaHero;
    }
    public int getForce(){
        return force;
    }
    public void setForce(int force){
        this.force=force;
    }
}
public class Main {
    public static void main(String[] args) {
        DotaHero dtHero = DotaHero.getInstance();
        System.out.println(dtHero.getForce());
        dtHero.setForce(50);
        DotaHero dtHero1 = DotaHero.getInstance();
        System.out.println((dtHero1.getForce()));
        if (dtHero1.hashCode() == dtHero.hashCode()) {
            System.out.println("OK");
        } else {
            System.out.println("Error!");
        }
    }
}