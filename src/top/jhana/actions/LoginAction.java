package top.jhana.actions;

import icons.SmartIcons;
import top.jhana.IMClient;
import top.jhana.IMPanelAction;
import top.jhana.callback.impl.DefaultLoginCallback;
import top.jhana.views.IMPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;


public class LoginAction extends IMPanelAction {
    public LoginAction(IMPanel imPanel) {
        super(imPanel, SmartIcons.signin);
        setToolTipText("登录");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        final IMClient client = imPanel.getClient();
        boolean ok = true;

        if (client.isLogin()) {
            ok = JOptionPane.showConfirmDialog(null, "您已处于登录状态，确定要重新登录吗")
                    == JOptionPane.YES_OPTION;
        }
        if (ok) {
            client.setLoginCallback(new DefaultLoginCallback() {

                @Override
                protected void onLoginFinish(boolean success, Exception e) {
                    if (success) {
                        imPanel.initContacts();
                    } else {
                        System.out.println("login fail");
                    }
                }
            });

            new Thread(() -> client.login()).start();
        }
        else {
            imPanel.initContacts();
        }
    }
}
