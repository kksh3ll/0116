package top.jhana;


import top.jhana.callback.LoginCallback;

public interface IMClient {

    boolean isLogin();

    void setLoginCallback(LoginCallback loginCallback);

    void login();


}
