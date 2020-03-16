package latihan.ke3;

public abstract class ColdDrink implements Item
{
    @Override
    public Packing bungkus()
    {
        return new Bottle();
    }

    @Override
    public abstract float harga();
}
