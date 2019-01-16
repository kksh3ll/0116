package top.jhana.views;

import javax.swing.*;

public class WXContactView extends IMContactView {

    private JTree recentTree;

    public WXContactView(WechatPanel imPanel) {
        super(imPanel);

        recentTree = new JTree();

        JScrollPane scrollPane1 = new JScrollPane(recentTree);
        tabHost.addTab("Recent", scrollPane1);
    }
}
