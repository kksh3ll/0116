package top.jhana;

import top.jhana.callback.LoginCallback;

public abstract class AbstractClient implements IMClient {

    protected LoginCallback loginCallback;
    protected boolean isLogin = false;

    @Override
    public boolean isLogin() {
        return isLogin;
    }

    public void setLoginCallback(LoginCallback loginCallback) {
        this.loginCallback = loginCallback;
    }
}
