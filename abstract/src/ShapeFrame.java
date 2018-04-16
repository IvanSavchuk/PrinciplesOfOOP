//import edu.javacourse.ui.component.OvalComponent;
//import edu.javacourse.ui.component.RectangleComponent;
//import edu.javacourse.ui.component.TriangleComponent;
import java.awt.GridLayout;
import javax.swing.JFrame;

public class ShapeFrame extends JFrame
{
    public ShapeFrame() {
        setLayout(new GridLayout(2, 3));

        add(new OvalComponent());
        add(new RectangleComponent());
        add(new TriangleComponent());
        add(new OvalComponent());
        add(new RectangleComponent());
        add(new TriangleComponent());

        setBounds(200, 200, 450, 350);
    }
}