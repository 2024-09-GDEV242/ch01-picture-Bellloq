/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2016.02.29
 */
public class Picture
{
    private Square houseBase;
    private Triangle roof;
    private Circle sun;
    private Square trunk;
    private Circle foliage;
    private boolean drawn;
       
    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        houseBase = new Square();
        roof = new Triangle();
        sun = new Circle();
        trunk = new Square();
        foliage = new Circle();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            /*
            wall.moveHorizontal(-140);
            wall.moveVertical(20);
            wall.changeSize(120);
            wall.makeVisible();
            
            window.changeColor("black");
            window.moveHorizontal(-120);
            window.moveVertical(40);
            window.changeSize(40);
            window.makeVisible();
    
            roof.changeSize(60, 180);
            roof.moveHorizontal(20);
            roof.moveVertical(-60);
            roof.makeVisible();
    
            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
            */
           
            // Draw the house base
            houseBase.makeVisible();
            houseBase.moveHorizontal(100);
            houseBase.moveVertical(150);
            houseBase.changeSize(100);
            
            // Draw the roof
            roof.makeVisible();
            roof.moveHorizontal(150);
            roof.moveVertical(100);
            roof.changeSize(50, 100);
            
            // Draw the sun
            sun.makeVisible();
            sun.moveHorizontal(-50);
            sun.moveVertical(-50);
            sun.changeSize(60);
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        foliage.changeColor("black");
        trunk.changeColor("black");
        houseBase.changeColor("black");
        roof.changeColor("black");
        sun.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        roof.changeColor("green"); 
        houseBase.changeColor("red");
        sun.changeColor("orange");

    }
}
