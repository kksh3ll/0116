package top.jhana.callback.impl;

import top.jhana.callback.LoginCallback;

import javax.swing.*;

public abstract class DefaultLoginCallback implements LoginCallback {
    QRCodeFrame qrCodeFrame;

    protected abstract void onLoginFinish(final boolean success, final Exception e);

    class QRCodeFrame extends JFrame {
        public QRCodeFrame() {

        }
    }
}

