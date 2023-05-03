import ea.*;

public class Startbildschirm extends Bildschirm
{
    public Startbildschirm()
    {
        wurzel.add(buttons[0]);
        buttons[0].isActive = true;
        
        Bild background = new Bild(0,0,0,"");
        wurzel.add(background);
    }
}
