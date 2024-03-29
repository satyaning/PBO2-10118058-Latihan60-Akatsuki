/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118058.latihan60.akatsuki;

/**
 *
 * @author user
 */
public class Members extends Akatsuki {
    private final String name;
    private final String fromCountry;
    private final String weapon;
    private final String character_type;
    private final String speciality;
    private final String death;
    private final boolean havePartner;

    public Members(String name, String fromCountry,String weapon, 
            String character_type, String speciality, String death, 
            boolean havePartner, String clothes, String goals) {
        super(clothes, goals);
        this.name = name;
        this.fromCountry = fromCountry;
        this.weapon = weapon;
        this.character_type = character_type;
        this.speciality = speciality;
        this.death = death;
        this.havePartner = havePartner;
    }
    
    public String getName() {
        return name;
    }
    
    public String getWeapon() {
        return weapon;
    }

    public String getCharacter_type() {
        return character_type;
    }

    public String getSpeciality() {
        return speciality;
    }

    public String getDeath() {
        return death;
    }

    public boolean isHavePartner() {
        return havePartner;
    }
    
    public void displayMember() {
        System.out.println("-------------------");
        System.out.println("Name : " + name);
        System.out.println("-------------------");
        System.out.println("From   : " + fromCountry);
        System.out.println("Weapon : " + weapon);
        System.out.println("Character Type : " + character_type);
        System.out.println("Speciality     : " + speciality);
        System.out.println("Death  : " + death);
        if(isHavePartner()) {
            System.out.println("Mission Type : Team");
        } else {
            System.out.println("Mission Type : Solo");
        }
        System.out.println();
    }
    
}
