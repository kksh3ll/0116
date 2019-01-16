package top.jhana.views;

public class WechatPanel extends IMPanel {
    public WechatPanel() {
        super();
    }

    @Override
    public IMContactView createContactsUI() {
        return new WXContactView(this);
    }
}
