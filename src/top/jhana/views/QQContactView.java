package top.jhana.views;

import javax.swing.*;

public class QQContactView extends IMContactView {

    private JTree recentTree;

    public QQContactView(SmartQQPanel imPanel) {
        super(imPanel);

        recentTree = new JTree();

        JScrollPane scrollPane1 = new JScrollPane(recentTree);
        tabHost.addTab("Recent", scrollPane1);
    }
}
