package top.jhana.views;

import top.jhana.IMClient;

import javax.swing.*;

public class QQContactView extends IMContactView {

    private JTree recentTree;

    public QQContactView(SmartQQPanel imPanel) {
        super(imPanel);

        recentTree = new JTree();

        JScrollPane scrollPane1 = new JScrollPane(recentTree);
        tabHost.addTab("Recent", scrollPane1);
    }

    @Override
    protected void doLoadContacts() {

    }

    @Override
    public SmartQQPanel getImPanel() {
        return (SmartQQPanel)super.getImPanel();
    }

    @Override
    protected SmartQQClient getClient() {
        return getImPanel().getClient();
    }
}
