package top.jhana.views;

import top.jhana.IMClient;
import top.jhana.factory.IMClientFactory;

public class WechatPanel extends IMPanel {
    public WechatPanel() {
        super();
    }

    @Override
    public WechatClient getClient() {
        return IMClientFactory.getInstance().getWXClient();
    }

    @Override
    public IMContactView createContactsUI() {
        return new WXContactView(this);
    }
}
