package top.jhana.views;

import top.jhana.factory.IMClientFactory;

public class SmartQQPanel extends IMPanel {
    public SmartQQPanel() {
        super();
    }

    @Override
    public SmartQQClient getClient() {
        return IMClientFactory.getInstance().getQQClient();
    }

    @Override
    public IMContactView createContactsUI() {
        return new QQContactView(this);
    }
}
