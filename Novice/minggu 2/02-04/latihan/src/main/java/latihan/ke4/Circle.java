package latihan.ke4;

public class Circle extends Shape
{
    public Circle()
    {
        type = "Lingkaran";
    }

    @Override
    public void gambar()
    {
        System.out.println("Di dalam Circle terdapat method gambar() ");
    }
}
