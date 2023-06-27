/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roticahyo;

/**
 *
 * @author LENOVO
 */
public class RotTawVar2 extends HargaBahan implements HitungModalHarga {

    @Override
    public int modalBahan() {
        return this.TepungTerigu()+this.GulaPasir()+this.Butter()+(this.Ragi()*2)+this.SusuBubuk()+this.SusuCair()+this.Telur()+this.EsBatu();
    }

    @Override
    public int modalToppFill() {
        return this.Keju()*4;
    }

    @Override
    public int modalPcs() {
        return (modalBahan()+modalToppFill())/10;
    }

    @Override
    public int hargaUntung() {
        return modalPcs()+(modalPcs()*40/100);
    }
    
    @Override
    public int pesananPcs() {
        return 15;
    }

    @Override
    public int hargaPesanan() {
        return hargaUntung()*pesananPcs();
    }
    
}