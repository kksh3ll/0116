package top.jhana.views;

import top.jhana.IMClient;

import javax.swing.*;
import java.awt.*;

public abstract class IMContactView extends JPanel {

    private IMPanel imPanel;
    protected JTabbedPane tabHost;

    public IMContactView(IMPanel imPanel) {
        this.imPanel = imPanel;
        setLayout(new BorderLayout(0, 0));

        tabHost = new JTabbedPane(JTabbedPane.TOP);
        add(tabHost, BorderLayout.CENTER);
    }

    public void initContacts() {
        new Thread(() -> doLoadContacts()).start();
    }

    public IMPanel getImPanel() {
        return imPanel;
    }

    protected abstract void doLoadContacts();

    protected abstract void onLoadContacts(boolean success);

    protected abstract IMClient getClient();

    protected void notifyLoadContacts(final boolean success) {
        SwingUtilities.invokeLater(() -> onLoadContacts(success));
    }
}
