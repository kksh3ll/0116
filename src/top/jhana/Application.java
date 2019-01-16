package top.jhana;

import top.jhana.views.SmartQQPanel;
import top.jhana.views.WechatPanel;

import javax.swing.*;
import java.awt.*;

public class Application {

    private JFrame window;

    private Application() {
        initialize();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Application window = new Application();
                window.window.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    private void initialize() {

        window = new JFrame();

        window.setTitle("SmartIM");
        window.setBounds(100, 100, 700,450);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        window.getContentPane().add(tabbedPane, BorderLayout.CENTER);

        SmartQQPanel qqPanel = new SmartQQPanel();
        tabbedPane.add("SmartQQ", qqPanel);

        WechatPanel wechatPanel = new WechatPanel();
        tabbedPane.add("Wechat", wechatPanel);
    }
}
