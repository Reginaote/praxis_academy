package latihan.ke4;

public class Rectangle extends Shape
{
    public Rectangle()
    {
        type = "persegi panjang";
    }

    @Override
    public void gambar()
    {
        System.out.println("Di dalam Rectangel method gambar() ");
    }
}
