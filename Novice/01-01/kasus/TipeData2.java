public class TipeData2{
  public static void main(String args[])
  {
    System.out.println("Masukkan Ordo Matrik");
    System.out.println("==========================");
    System.out.print("Masukkan Jumlah Baris :"); baris = in.nextInt();
    System.out.print("Masukkan Jumlah Kolom :"); kolom = in.nextInt();

    int A[][] = new int[baris][kolom];
    int B[][] = new int[baris][kolom];
    int sum[][] = new int[baris][kolom];

    System.out.println("\nMasukkan elemen untuk Matriks A");
    System.out.println("============================");
    for ( i = 0 ; i < baris ; i++ )
    {
      for ( j = 0 ; j < kolom ; j++ )
      {
        System.out.print("[" +(i+1)+ "][" +(j+1)+ "]:");
        A[i][j] = in.nextInt();
      }

    }
    
  }

  System.out.println("\nMasukkan elemen untuk Matriks B");
    System.out.println("============================");
    for ( i = 0 ; i < baris ; i++ )
    {
      for ( j = 0 ; j < kolom ; j++ )
      {
        System.out.print("[" +(i+1)+ "][" +(j+1)+ "]:");
        B[i][j] = in.nextInt();
      }


    }

    // Penjumlahan Matriks
    for ( i = 0 ; i < baris ; i++)
    {
      for ( i = 0 ; i < kolom ; i++)
      {

    }


    System.out.println("\nhasil Penjumlahan matriks");
    System.out.println("============================");
    for ( i = 0 ; i < baris ; i++ )
    {
      for ( j = 0 ; j < kolom ; j++ )
      {
        System.out.print(sum[i][j]+"\t");
      }

      System.out.print();

    }
}