/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roticahyo;

/**
 *
 * @author bagas
 */
public class KomposisiPizza extends HargaBahan implements Komposisi {

    @Override
    public int BeratTepungTerigu() {
        return 1000;
    }

    @Override
    public int BeratGulaPasir() {
        return 100;
    }

    @Override
    public int BeratButter() {
        return 100;
    }

    @Override
    public int BeratRagi() {
        return 20;
    }

    @Override
    public int BeratSusuBubuk() {
        return 200;
    }

    @Override
    public int BeratSusuCair() {
        return 180;
    }

    @Override
    public int BeratTelur() {
        return 50;
    }

    @Override
    public int BeratEsBatu() {
        return 300;
    }

    @Override
    public int BeratAdonan() {
        return this.BeratEsBatu()+this.BeratTelur()+this.BeratSusuCair()+this.BeratSusuBubuk()+this.BeratRagi()+this.BeratButter()+this.BeratGulaPasir()+this.BeratTepungTerigu();
    }
    
    @Override
    public int BeratPcs() {
        return 190;
    }
    
    @Override
    public int PcsAdonan() {
        return this.BeratAdonan()/this.BeratPcs();
    }
    
    int HitungPizza() {
        return this.TepungTerigu()+this.GulaPasir()+this.Butter()+(this.Ragi()*2)+this.SusuBubuk()+this.SusuCair()+this.Telur()+this.EsBatu();
    }
    
}
