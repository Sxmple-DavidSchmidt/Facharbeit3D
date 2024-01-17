package rendering.components;

import rendering.UserInterface;

import javax.swing.*;
import java.awt.*;

public class ControlPanel extends JPanel {

    public ControlPanel() {
        initializePanel();
    }

    private void initializePanel() {
        setLayout(new BorderLayout());

        add(new JLabel("Coming soon!", JLabel.CENTER), BorderLayout.NORTH);
        add(new JButton("Coming soon!"), BorderLayout.SOUTH);
    }
}
