import java.util.Scanner;

public class Sekolah {

  private int pengembanganPrice = 3000000;
  private int sppPrice = 1200000;
  private int kegiatanPrice = 3500000;
  private int raportPrice = 500000;
  private int totalPrice = 0;

  public static void screen() {
    // clear screen console
    System.out.print('\u000C');

    System.out.println("=============================================");
    System.out.println("            RA.Al-Karomah Bogor");
    System.out.println("=============================================");
    System.out.println("");
    System.out.println("Silahkan pilih bayaran yang ingin dibayar !!!");
    System.out.println("1). Pengembangan");
    System.out.println("2). Spp");
    System.out.println("3). Kegiatan");
    System.out.println("4). Raport");
    System.out.println("---------------------------------------------");
  }

  public void result(int pengembanganChoice, int sppChoice, int kegiatanChoice, int raportChoice) {

    if (pengembanganChoice == 1 && sppChoice == 1 && kegiatanChoice == 1 && raportChoice == 1) {

      System.out.println("Terima Kasih Telah Melunasi Semua");

    } else if (pengembanganChoice == 1 && sppChoice == 1 && kegiatanChoice == 2 && raportChoice == 1) {

      this.totalPrice = this.pengembanganPrice + this.sppPrice + this.raportPrice;
      System.out.println("uang kegiatan belum Rp." + this.kegiatanPrice);
      System.out.println("Total Yang Sudah Dibayarkan Rp." + this.totalPrice);

    } else if (pengembanganChoice == 1 && sppChoice == 1 && kegiatanChoice == 1 && raportChoice == 2) {

      this.totalPrice = this.pengembanganPrice + this.sppPrice + this.kegiatanPrice;
      System.out.println("uang raport belum Rp." + this.raportPrice);
      System.out.println("Total Yang Sudah Dibayarkan Rp." + this.totalPrice);

    } else if (pengembanganChoice == 1 && sppChoice == 1 && kegiatanChoice == 2 && raportChoice == 2) {

      this.totalPrice = this.pengembanganPrice + this.sppPrice;
      System.out.println("uang kegiatan belum Rp." + this.kegiatanPrice);
      System.out.println("uang raport belum Rp." + this.raportPrice);
      System.out.println("Total Yang Sudah Dibayarkan Rp." + this.totalPrice);

    } else if (pengembanganChoice == 2 && sppChoice == 1 && kegiatanChoice == 1 && raportChoice == 1) {

      this.totalPrice = this.sppPrice + this.kegiatanPrice + this.raportPrice;
      System.out.println("uang pengembangan belum Rp." + this.pengembanganPrice);
      System.out.println("Total Yang Sudah Dibayarkan Rp." + this.totalPrice);

    } else if (pengembanganChoice == 2 && sppChoice == 1 && kegiatanChoice == 2 && raportChoice == 1) {

      this.totalPrice = this.sppPrice + this.raportPrice;
      System.out.println("uang pengembangan belum Rp." + this.pengembanganPrice);
      System.out.println("uang kegiatan belum Rp." + this.kegiatanPrice);
      System.out.println("Total Yang Sudah Dibayarkan Rp." + this.totalPrice);

    } else if (pengembanganChoice == 2 && sppChoice == 1 && kegiatanChoice == 1 && raportChoice == 2) {

      this.totalPrice = this.sppPrice + this.kegiatanPrice;
      System.out.println("uang pengembangan belum Rp." + this.pengembanganPrice);
      System.out.println("uang raport belum Rp." + this.raportPrice);
      System.out.println("Total Yang Sudah Dibayarkan Rp." + this.totalPrice);

    } else if (pengembanganChoice == 2 && sppChoice == 1 && kegiatanChoice == 2 && raportChoice == 2) {

      this.totalPrice = this.sppPrice;
      System.out.println("uang pengembangan belum Rp." + this.pengembanganPrice);
      System.out.println("uang kegiatan belum Rp." + this.raportPrice);
      System.out.println("uang raport belum Rp." + this.raportPrice);
      System.out.println("Total Yang Sudah Dibayarkan Rp." + this.totalPrice);

    } else if (pengembanganChoice == 1 && sppChoice == 2 && kegiatanChoice == 1 && raportChoice == 1) {

      this.totalPrice = this.pengembanganPrice + this.kegiatanPrice + this.raportPrice;
      System.out.println("uang spp belum Rp." + this.sppPrice);
      System.out.println("Total Yang Sudah Dibayarkan Rp." + this.totalPrice);

    } else if (pengembanganChoice == 1 && sppChoice == 2 && kegiatanChoice == 2 && raportChoice == 1) {

      this.totalPrice = this.pengembanganPrice + this.raportPrice;
      System.out.println("uang spp belum Rp." + this.sppPrice);
      System.out.println("uang kegiatan belum Rp." + this.kegiatanPrice);
      System.out.println("Total Yang Sudah Dibayarkan Rp." + this.totalPrice);

    } else if (pengembanganChoice == 1 && sppChoice == 2 && kegiatanChoice == 1 && raportChoice == 2) {

      this.totalPrice = this.pengembanganPrice + this.kegiatanPrice;
      System.out.println("uang spp belum Rp." + this.sppPrice);
      System.out.println("uang raport belum Rp." + this.raportPrice);
      System.out.println("Total Yang Sudah Dibayarkan Rp." + this.totalPrice);

    } else if (pengembanganChoice == 2 && sppChoice == 2 && kegiatanChoice == 1 && raportChoice == 2) {

      this.totalPrice = this.kegiatanPrice;
      System.out.println("uang pengembangan belum Rp." + this.pengembanganPrice);
      System.out.println("uang spp belum Rp." + this.sppPrice);
      System.out.println("uang raport belum Rp." + this.raportPrice);
      System.out.println("Total Yang Sudah Dibayarkan Rp." + this.totalPrice);

    } else if (pengembanganChoice == 2 && sppChoice == 2 && kegiatanChoice == 1 && raportChoice == 1) {

      this.totalPrice = this.kegiatanPrice + this.raportPrice;
      System.out.println("uang pengembangan belum Rp." + this.pengembanganPrice);
      System.out.println("uang spp belum Rp." + this.sppPrice);
      System.out.println("Total Yang Sudah Dibayarkan Rp." + this.totalPrice);

    } else if (pengembanganChoice == 2 && sppChoice == 2 && kegiatanChoice == 2 && raportChoice == 1) {

      this.totalPrice = this.raportPrice;
      System.out.println("uang pengembangan belum Rp." + this.pengembanganPrice);
      System.out.println("uang spp belum Rp." + this.sppPrice);
      System.out.println("uang kegiatan belum Rp." + this.kegiatanPrice);
      System.out.println("Total Yang Sudah Dibayarkan Rp." + this.totalPrice);

    } else if (pengembanganChoice == 2 && sppChoice == 2 && kegiatanChoice == 2 && raportChoice == 2) {

      System.out.println("HARAP LUNASI SEGERA !!!!");

    } else {

      System.out.println("PEMBAYARAN TIDAK TERSEDIA !!!!");
    }

  }

  public static void main(String[] args) {

    // Initialize Layer
    Sekolah.screen();

    // Initialize Scanner
    Scanner input = new Scanner(System.in);

    // Get Pengembangan
    System.out.println("[Pembayaran] pilih 1 jika ya, pilih 2 jika tidak: ");
    int choicePengembangan = input.nextInt();

    // Get Spp
    System.out.println("[Spp] pilih 1 jika ya, pilih 2 jika tidak: ");
    int choiceSpp = input.nextInt();

    // Get Kegiatan
    System.out.println("[Kegiatan] 1 jika ya, pilih 2 jika tidak: ");
    int choiceKegiatan = input.nextInt();

    // Get Raport
    System.out.println("[Raport] 1 jika ya, pilih 2 jika tidak: ");
    int choiceRaport = input.nextInt();

    System.out.println("------------------------------------------");

    // Initialize Constructor
    Sekolah data = new Sekolah();

    // Print Result
    System.out.println("=============================================");
    System.out.println("      Report Pembayaran Sekolah Anda:");
    System.out.println("=============================================");

    data.result(choicePengembangan, choiceSpp, choiceKegiatan, choiceRaport);

    System.out.println("=============================================");
    System.out.println("=============================================");
  }
}