package top.jhana.views;

import top.jhana.IMClient;

import javax.swing.*;

public class WXContactView extends IMContactView {

    private JTree recentTree;

    public WXContactView(WechatPanel imPanel) {
        super(imPanel);

        recentTree = new JTree();

        JScrollPane scrollPane1 = new JScrollPane(recentTree);
        tabHost.addTab("Recent", scrollPane1);
    }

    @Override
    protected void doLoadContacts() {
        WechatClient client = getClient();
        //微信已经登录的情况
        if (client.isLogin()) {
            notifyLoadContacts(true);
        }
        else {
            notifyLoadContacts(false);
        }
    }

    @Override
    protected void onLoadContacts(boolean success) {

    }

    @Override
    public WechatPanel getImPanel() {
        return (WechatPanel)super.getImPanel();
    }

    @Override
    protected WechatClient getClient() {
        return getImPanel().getClient();
    }
}
