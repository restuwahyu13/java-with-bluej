import java.util.Scanner;

public class Ticket {

  private int maskapaiCount = 0;
  private int ticketCount = 0;
  private int harga = 0;
  private String pesawat = "";
  private int discount = 0;
  private int total = 0;

  public Ticket(int maskapai, int ticket) {
    maskapaiCount = maskapai;
    ticketCount = ticket;
  }

  public static void screen() {
    // clear screen console
    System.out.print('\u000C');
    
    System.out.println("===========================================");
    System.out.println("           BELI TICKET DOT COM");
    System.out.println("===========================================");
    System.out.println("");
    System.out.println("Silahkan nama pesawat yang di inginkan !!!");
    System.out.println("1). Garuda");
    System.out.println("2). Lion");
    System.out.println("3). Citylink");
    System.out.println("==============================================");
  }

  public void garuda(int ticket) {

    if (ticket >= 100) {
      this.pesawat = "Garuda-Diskon 50%";
      this.harga = 400000;
      this.discount = 200000;
      this.total = (this.harga - this.discount) * ticket;

      System.out.println("Nama Pesawat: " + this.pesawat);
      System.out.println("Harga Ticket: " + this.harga);
      System.out.println("Discount: " + this.discount);
      System.out.println("Total: " + this.total);
    } else {
      this.pesawat = "Garuda-Tidak ada Diskon";
      this.harga = 400000;
      this.total = this.harga * ticket;

      System.out.println("Nama Pesawat: " + this.pesawat);
      System.out.println("Harga Ticket: " + this.harga);
      System.out.println("Total: " + this.total);
    }
  }

  public void lion(int ticket) {

    if (ticket >= 100) {
      this.pesawat = "Lion-Diskon 50%";
      this.harga = 200000;
      this.discount = 100000;
      this.total = (this.harga - this.discount) * ticket;

      System.out.println("Nama Pesawat: " + this.pesawat);
      System.out.println("Harga Ticket: " + this.harga);
      System.out.println("Discount: " + this.discount);
      System.out.println("Total: " + this.total);
    } else {
      this.pesawat = "Lion-Tidak ada Diskon";
      this.harga = 200000;
      this.total = this.harga * ticket;

      System.out.println("Nama Pesawat: " + this.pesawat);
      System.out.println("Harga Ticket: " + this.harga);
      System.out.println("Total: " + this.total);
    }
  }

  public void citylink(int ticket) {

    if (ticket >= 100) {
      this.pesawat = "Citylink-Diskon 50%";
      this.harga = 300000;
      this.discount = 150000;
      this.total = (this.harga - this.discount) * ticket;

      System.out.println("Nama Pesawat: " + this.pesawat);
      System.out.println("Harga Ticket: " + this.harga);
      System.out.println("Discount: " + this.discount);
      System.out.println("Total: " + this.total);
    } else {
      this.pesawat = "Citylink-Tidak ada Diskon";
      this.harga = 300000;
      this.total = this.harga * ticket;

      System.out.println("Nama Pesawat: " + this.pesawat);
      System.out.println("Harga Ticket: " + this.harga);
      System.out.println("Total: " + this.total);
    }
  }

  public void result(int maskapaiChoice, int ticketCount) {
    if (maskapaiChoice == 1) {
      this.garuda(ticketCount);
    } else if (maskapaiChoice == 2) {
      this.lion(ticketCount);
    } else if (maskapaiChoice == 3) {
      this.citylink(ticketCount);
    } else {
      System.out.println("Maskapai tidak tersedia silahkan ulangi");
    }
  }

  public static void main(String[] args) {

    // Initialize Layer
    Ticket.screen();

    // Initialize Scanner
    Scanner input = new Scanner(System.in);

    // Get Maskapai
    System.out.println("Silahkan pilih ( [1] atau [2] atau [3] ):");
    int choiceMaskapai = input.nextInt();

    // Get Ticket
    System.out.println("Masukan Jumlah Ticket Yang Akan Di Beli:");
    System.out.println("==============================================");
    int choiceTicket = input.nextInt();
    System.out.println("");
    
    // Initialize Constructor
    Ticket data = new Ticket(choiceMaskapai, choiceTicket);

    // Print Result
    System.out.println("=============================");
    System.out.println("Pesanan Ticket Pesawat Anda:");
    System.out.println("=============================");
    
    data.result(choiceMaskapai, choiceTicket);
    
    System.out.println("=============================");
    System.out.println("=============================");
  }
}