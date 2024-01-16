package rendering.components;

import javax.swing.*;
import java.awt.*;

public class ControlPanel extends JPanel {

    public ControlPanel() {
        initializePanel();
    }

    private void initializePanel() {
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        gbl.setConstraints(this, gbc);
        setLayout(gbl);

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("Settings go here!"), gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(new JTextArea(), gbc);
    }
}
