package rendering;

import rendering.components.ControlPanel;
import rendering.components.WorldRenderer;
import world.World;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;


public class UserInterface {
    private final JFrame frame;
    private WorldRenderer worldRenderer;
    private ControlPanel controlPanel;

    public UserInterface() {
        frame = new JFrame("3D Renderer");
        initializeFrame();
        buildFrame();
    }

    private void initializeFrame() {
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        try {
            URL iconUrl = this.getClass().getResource("/resources/icon.png");
            if (iconUrl == null) {
                System.out.println("Konnte Icon nicht finden.");
            } else {
                frame.setIconImage(ImageIO.read(new File(iconUrl.getFile())));
            }
        } catch (IOException e) {
            System.out.println("Konnte Icon nicht laden.");
        }
    }

    private void buildFrame() {
        frame.setLayout(new BorderLayout());

        controlPanel = new ControlPanel();

        worldRenderer = new WorldRenderer();
        worldRenderer.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int worldRendererSize = Math.min(screenSize.width, screenSize.height) / 2;
        worldRenderer.setPreferredSize(new Dimension(worldRendererSize, worldRendererSize));

        frame.add(controlPanel, BorderLayout.WEST);
        frame.add(worldRenderer, BorderLayout.CENTER);
        frame.pack();
    }

    public void show() {
        frame.setVisible(true);
    }

    public void setWorld(World world) {
        this.worldRenderer.setWorld(world);
    }
}
