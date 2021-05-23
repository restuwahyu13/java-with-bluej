import java.util.Scanner;

public class Toko {
    
    private int firstweek = 0;
    private int lastweek = 0;
    private int totalPenjualan = 0;
    private int jual = 150000;
    private int modal = 80000;
    private int keuntungan = 70000;
    private int sumModal = 0;
    
    public Toko(int firstWeek, int lastWeek) {
      firstweek = firstWeek;
      lastweek = lastWeek;
    }
    
    public int total() {
        int total = this.firstweek + this.lastweek;
        return total;
    }
    
   
   public void hasil() {
       
       
       this.totalPenjualan = this.total();
       
       if(this.totalPenjualan == 100) {
           
          this.sumModal =  this.modal * this.totalPenjualan;
          this.keuntungan = (this.jual - this.modal) * this.totalPenjualan;
          
          System.out.println("");
           System.out.println("Total Penjualan adalah = " + this.totalPenjualan);
           System.out.println("=====================================================================");
           System.out.println("         Keuntungan Anda Mencapai Target Penjualan Sebulan");
           System.out.println("=====================================================================");
           System.out.println ("Modal = " + this.sumModal);
           System.out.println ("Keuntungan = " + this.keuntungan);
        
        } else if(this.totalPenjualan < 100) {
            
          this.sumModal =  this.modal * this.totalPenjualan;
          this.keuntungan = (this.jual - this.modal) * this.totalPenjualan;
           
           System.out.println("");
           System.out.println("Total Penjualan adalah = " + this.totalPenjualan);
           System.out.println("=====================================================================");
           System.out.println("      Keuntungan Anda Tidak Mencapai Target Penjualan Sebulan");
           System.out.println("=====================================================================");
           System.out.println ("Modal = " + this.sumModal);
           System.out.println ("Keuntungan = " + this.keuntungan);
            
        } else {
            
          this.sumModal =  this.modal * this.totalPenjualan;
          this.keuntungan = (this.jual - this.modal) * this.totalPenjualan;
           
           System.out.println("");
           System.out.println("Total Penjualan adalah = " + this.totalPenjualan);
           System.out.println("=====================================================================");
           System.out.println("           Anda Melebihi Mencapai Target Penjualan Sebulan");
           System.out.println("=====================================================================");
           System.out.println ("Modal = " + this.sumModal);
           System.out.println ("Keuntungan = " + this.keuntungan);
       }
   }
    
    public static void main(String[] args) {
       
        // clear screen console
        System.out.print('\u000C');

        System.out.println("=== PERHITUNGAN - Penjualan Baju Gamis (Selama Ramadhan 1442 H) - GAMIS FASHION ===");
        
        Scanner input = new Scanner(System.in);

        System.out.println("============================================================");
        System.out.println("   Silahkan input penjualan baju gamis minggu pertama: ");
        System.out.println("============================================================");
        int firstWeek = input.nextInt();
        
        System.out.println("============================================================");
        System.out.println("Silahkan input penjualan baju gamis sampai minggu terakhir: ");
        System.out.println("============================================================");
        int lastWeek = input.nextInt(); 
        
        Toko data = new Toko(firstWeek, lastWeek);
        data.hasil();
    }
}