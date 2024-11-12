/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class KRS {
    
    
    public static void main(String[] args) {
        MasterMatkul m = new MasterMatkul();
        MasterDosen  d = new MasterDosen();
        MasterRuangan r = new MasterRuangan();
        ClassMahasiswa Mh = new ClassMahasiswa();
        hari H = new hari();
        KRS krs = new KRS();
        
         System.out.println("NAMA       :"+"\t" + Mh.NAMA+"\t"+ Mh.NIM);
         System.out.println("JURUSAN    :"+"\t" + Mh.Jurusan);
         System.out.println("SEMESTER   :"+"\t" + Mh.Semester);
         System.out.println("DOSEN WALI :"+"\t" + d.D8+"\n");
         
   
         System.out.println("HARI"+"\t\t"+"MATAKULIAH\t"+"\t\tDOSEN PENGAMPU"+"\t\t\tRUANGAN");
         System.out.println( H.H1+  "\t\t"+m.M1 +"\t\t"+d.D1 +"\t\t"+r.r1 ) ;
         System.out.println("\t\t"+m.M2 +"\t"+d.D2+"\t"+r.r2 ) ;
         System.out.println( H.H2+"\t\t"+m.M3 +"\t\t\t"+d.D3+"\t"+r.r3 ) ;
         System.out.println( H.H3+"\t\t"+m.M4 +"\t\t"+d.D4+"\t"+r.r4 ) ;
         System.out.println("\t\t"+m.M5 +"\t\t"+d.D5+"\t"+r.r5 ) ;
         System.out.println( H.H4+"\t\t"+m.M6 +"\t"+d.D6+"\t"+r.r6 ) ;
         System.out.println("\t\t"+m.M7 +"\t"+d.D7+"\t\t"+r.r7 ) ;
         

    
    }
}
