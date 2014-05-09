/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tk.gratelteam.school_manager.weather;

import com.google.gson.Gson;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
/**
 *
 * @author 陈濯
 */
public class getWeather {
    public static Weather getweather() throws MalformedURLException, IOException{
        Gson gson=new Gson();
        URL url=new URL("http://www.weather.com.cn/data/cityinfo/101010100.html");
        
        return gson.fromJson("{\"weatherinfo\":{\"city\":\"北京\",\"cityid\":\"101010100\",\"temp1\":\"10℃\",\"temp2\":\"19℃\",\"weather\":\"阴\",\"img1\":\"n2.gif\",\"img2\":\"d2.gif\",\"ptime\":\"18:00\"}}",new Weather().getClass());
    }
    public static Icon getIcon() throws Throwable{
        ImageIcon icon=new ImageIcon();
        URL url=new URL("http://www.weather.com.cn/m/i/weatherpic/29x20/"+getweather().getWeatherinfo().getImg1());
        File file=new File(url.getFile());
        BufferedImage bi = ImageIO.read(file);
        icon.setImage(bi);
        return icon;
    }
}
