package io;

import java.util.prefs.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class PreferencesDemo {
    public static void main(String[] args) throws Exception {
        Preferences prefs = Preferences.userNodeForPackage(PreferencesDemo.class);
        prefs.put("Location","OZ");
        prefs.put("FootWear", "Ruby Slipper");
        prefs.putInt("Companions", 4);
        prefs.putBoolean("Are there Witches ? ", true);
        int usageCount = prefs.getInt("UsageCount",0);
        usageCount++;
        prefs.putInt("UsageCount",usageCount);
        for (String key : prefs.keys()) {
            System.out.println(key + ": " + prefs.get(key,null));
        }
        System.out.println("How many companions does Dorothy have ?");
        System.out.println(prefs.getInt("Companions", 0));
    }
}
