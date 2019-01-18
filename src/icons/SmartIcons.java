package icons;

import javax.swing.*;

public class SmartIcons {
    public static abstract class IconLoader {
        public static Icon getIcon(String path) {
            return new ImageIcon(IconLoader.class.getResource(path));
        }
    }

    public static Icon qq = IconLoader.getIcon("/icon/QQ.png");
    public static Icon wx = IconLoader.getIcon("/icon/wx.png");

    public static Icon signin = IconLoader.getIcon("/icon/sign-in.png");
    public static Icon signout = IconLoader.getIcon("/icon/sign-out.png");
    public static Icon test = IconLoader.getIcon("/icon/gitlab.png");
    public static Icon close = IconLoader.getIcon("/icon/close.png");
    public static Icon show = IconLoader.getIcon("/icon/eye.png");
    public static Icon hide = IconLoader.getIcon("/icon/eye-slash.png");
    public static Icon broadcast = IconLoader.getIcon("/icon/broadcast.png");
    public static Icon settings = IconLoader.getIcon("/icon/settings.png");

    public static Icon group = IconLoader.getIcon("/icon/user-circle.png");
    public static Icon friend = IconLoader.getIcon("/icon/user.png");
    public static Icon discuss = IconLoader.getIcon("/icon/user-o.png");

    public static Icon file = IconLoader.getIcon("/icon/File.png");
    public static Icon image = IconLoader.getIcon("/icon/image.png");
    public static Icon face = IconLoader.getIcon("/icon/face.png");
    public static Icon lock = IconLoader.getIcon("/icon/lock_co.png");
    public static Icon clear = IconLoader.getIcon("/icon/clear_co.png");
}
