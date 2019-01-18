package top.jhana.factory;

import top.jhana.IMClient;
import top.jhana.views.SmartQQClient;
import top.jhana.views.WechatClient;

public class IMClientFactory {

    private static IMClientFactory instance = new IMClientFactory();

    public static IMClientFactory getInstance() {
        return instance;
    }

    public WechatClient getWXClient() {
        return new WechatClient();
    }

    public SmartQQClient getQQClient() {
        return new SmartQQClient();
    }
}
