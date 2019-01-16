package top.jhana.views;

public class SmartQQPanel extends IMPanel {
    public SmartQQPanel() {
        super();
    }

    @Override
    public IMContactView createContactsUI() {
        return new QQContactView(this);
    }
}
