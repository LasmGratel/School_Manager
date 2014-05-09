/*
 * ©2014 Gratel Team.
 * Anybody can modify that things 
 * BUT NOT CHANGE GENERAL THINGS.
 * and this project is under the LGPL3.
 * (http://www.gnu.org/licenses/lgpl.html)
 */

package tk.gratelteam.school_manager.api;

/**
 *
 * @author 陈濯
 * 如果想创建插件的话，必须实现此类。
 */
public interface PluginAPI {
    /**
     * 插件主方法
     * 找到插件主类后，会加载此方法。
     * 此方法可以调用其他的方法。
     */
    public void LoadPlugin();
}
