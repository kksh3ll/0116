package top.jhana.views;

import javax.swing.*;
import java.awt.*;

public abstract class IMPanel extends JSplitPane {

    private JTabbedPane tabbedPane;
    private IMContactView imContactView;

    public IMPanel() {
        initUI();
    }

    private void initUI() {
        JPanel left = new JPanel();
        left.setLayout(new BorderLayout(0, 0));
        JToolBar toolBar = new JToolBar();
        toolBar.setFloatable(false);
        toolBar.setOrientation(SwingConstants.VERTICAL);
        // initialize toolbar
        initToolBar(toolBar);
        left.add(toolBar, BorderLayout.WEST);
        imContactView = createContactsUI();
        left.add(imContactView, BorderLayout.CENTER);
        setLeftComponent(left);

        JPanel right = new JPanel();
        right.setLayout(new BorderLayout(0, 0));
        tabbedPane = new JTabbedPane();
        right.add(tabbedPane, BorderLayout.CENTER);
        setRightComponent(right);
        setResizeWeight(0.3);
        setDividerLocation(250);
    }

    private void initToolBar(JToolBar toolBar) {
    }

    public abstract IMContactView createContactsUI();
}
