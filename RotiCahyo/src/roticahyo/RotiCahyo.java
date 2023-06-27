/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package roticahyo;

/**
 *
 * @author ASUS
 */
public class RotiCahyo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RotManVar1 a = new RotManVar1();
        System.out.println("Roti Manis Variant 1");
        System.out.println("Harga Modal Bahan: " + a.modalBahan());
        System.out.println("Harga Modal Topping & Filling: " + a.modalToppFill());
        System.out.println("Harga Modal per Pcs: " + a.modalPcs());
        System.out.println("Harga Jual per Pcs: " + a.hargaUntung());
        System.out.println("Jumlah Pesanan: " + a.pesananPcs());
        System.out.println("Harga Total Pesanan: " + a.hargaPesanan());
        System.out.println("-----------------------------------");
        RotManVar2 b = new RotManVar2();
        System.out.println("Roti Manis Variant 2");
        System.out.println("Harga Modal Bahan: " + b.modalBahan());
        System.out.println("Harga Modal Topping & Filling: " + b.modalToppFill());
        System.out.println("Harga Modal per Pcs: " + b.modalPcs());
        System.out.println("Harga Jual per Pcs: " + b.hargaUntung());
        System.out.println("Jumlah Pesanan: " + b.pesananPcs());
        System.out.println("Harga Total Pesanan: " + b.hargaPesanan());
        System.out.println("-----------------------------------");
        RotManVar3 c = new RotManVar3();
        System.out.println("Roti Manis Variant 3");
        System.out.println("Harga Modal Bahan: " + c.modalBahan());
        System.out.println("Harga Modal Topping & Filling: " + c.modalToppFill());
        System.out.println("Harga Modal per Pcs: " + c.modalPcs());
        System.out.println("Harga Jual per Pcs: " + c.hargaUntung());
        System.out.println("Jumlah Pesanan: " + c.pesananPcs());
        System.out.println("Harga Total Pesanan: " + c.hargaPesanan());
        System.out.println("-----------------------------------");
        RotTawVar1 d = new RotTawVar1();
        System.out.println("Roti Tawar Variant 1");
        System.out.println("Harga Modal Bahan: " + d.modalBahan());
        System.out.println("Harga Modal Topping & Filling: " + d.modalToppFill());
        System.out.println("Harga Modal per Pcs: " + d.modalPcs());
        System.out.println("Harga Jual per Pcs: " + d.hargaUntung());
        System.out.println("Jumlah Pesanan: " + d.pesananPcs());
        System.out.println("Harga Total Pesanan: " + d.hargaPesanan());
        System.out.println("-----------------------------------");
        RotTawVar2 e = new RotTawVar2();
        System.out.println("Roti Tawar Variant 2");
        System.out.println("Harga Modal Bahan: " + e.modalBahan());
        System.out.println("Harga Modal Topping & Filling: " + e.modalToppFill());
        System.out.println("Harga Modal per Pcs: " + e.modalPcs());
        System.out.println("Harga Jual per Pcs: " + e.hargaUntung());
        System.out.println("Jumlah Pesanan: " + e.pesananPcs());
        System.out.println("Harga Total Pesanan: " + e.hargaPesanan());
        System.out.println("-----------------------------------");
        PizzaVar1 f = new PizzaVar1();
        System.out.println("Pizza Variant 1");
        System.out.println("Harga Modal Bahan: " + f.modalBahan());
        System.out.println("Harga Modal Topping & Filling: " + f.modalToppFill());
        System.out.println("Harga Modal per Pcs: " + f.modalPcs());
        System.out.println("Harga Jual per Pcs: " + f.hargaUntung());
        System.out.println("Jumlah Pesanan: " + f.pesananPcs());
        System.out.println("Harga Total Pesanan: " + f.hargaPesanan());
        System.out.println("-----------------------------------");
    }
    
}