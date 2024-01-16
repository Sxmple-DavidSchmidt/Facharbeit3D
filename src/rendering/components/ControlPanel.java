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

        JSlider slider = new JSlider(-100, 100, 50);
        slider.setMinorTickSpacing(10);
        slider.setMajorTickSpacing(50);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        add(new JLabel("Pretty Label!", JLabel.CENTER), BorderLayout.NORTH);
        add(slider, BorderLayout.CENTER);
        add(new JButton("useless button"), BorderLayout.SOUTH);

    }
}
