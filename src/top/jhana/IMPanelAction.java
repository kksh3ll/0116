package top.jhana;

import top.jhana.views.IMPanel;

import javax.swing.*;
import java.awt.event.ActionListener;

public abstract class IMPanelAction extends JButton implements ActionListener {

    public IMPanel imPanel;
    public IMPanelAction(IMPanel imPanel, Icon icon) {
        super(icon);
        this.imPanel = imPanel;
        addActionListener(this);
    }

}
