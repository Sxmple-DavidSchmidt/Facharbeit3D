package rendering.components;

import javax.swing.*;
import java.awt.*;

public class ControlPanel extends JPanel {

    public ControlPanel() {
        initializePanel();
    }

    private void initializePanel() {
        setLayout(new BorderLayout());
        add(new JLabel("Useless settings go here!", JLabel.CENTER), BorderLayout.NORTH);

        JPanel settingsPanel = new JPanel();
        settingsPanel.setLayout(new GridLayout(3, 1));
        settingsPanel.add(new JSlider());
        settingsPanel.add(new JSlider());
        settingsPanel.add(new JButton("Silly Button"));
        add(settingsPanel, BorderLayout.CENTER);
    }
}
