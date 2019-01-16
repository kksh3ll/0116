package top.jhana.views;

import javax.swing.*;
import java.awt.*;

public abstract class IMContactView extends JPanel {

    private IMPanel imPanel;
    protected JTabbedPane tabHost;

    public IMContactView(IMPanel imPanel) {
        this.imPanel = imPanel;
        setLayout(new BorderLayout(0, 0));

        tabHost = new JTabbedPane(JTabbedPane.TOP);
        add(tabHost, BorderLayout.CENTER);
    }

}
