package rendering;

import rendering.components.ControlPanel;
import rendering.components.WorldRenderer;
import world.World;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.io.File;
import java.net.URL;

public class Window {
    private JFrame frame;
    private WorldRenderer worldRenderer;
    private ControlPanel controlPanel;
    private Image icon;

    public Window() {
        frame = new JFrame("3D Renderer");
        initializeFrame();
        buildFrame();
    }

    private void initializeFrame() {
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Set Bounds -> Size / Location
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setBounds(
                screenSize.width/4,
                screenSize.height/4,
                screenSize.width/2,
                screenSize.height/2
        );

        // Set Icon
        URL iconUrl = this.getClass().getResource("/resources/icon.png");
        try {
            System.out.println(iconUrl.getFile() + " " + iconUrl.getPath());
            icon = ImageIO.read(new File(iconUrl.getFile()));
            frame.setIconImage(icon);
        } catch (Exception e) {
            icon = frame.getIconImage();
        }
    }

    private void buildFrame() {
        frame.setLayout(new BorderLayout());


        controlPanel = new ControlPanel();

        worldRenderer = new WorldRenderer();
        worldRenderer.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        frame.add(controlPanel, BorderLayout.WEST);
        frame.add(worldRenderer, BorderLayout.CENTER);
    }

    public void show() {
        frame.setVisible(true);
    }

    public void setWorld(World world) {
        this.worldRenderer.setWorld(world);
    }
}
