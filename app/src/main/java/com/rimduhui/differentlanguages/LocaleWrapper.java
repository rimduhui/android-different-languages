package com.rimduhui.differentlanguages;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;

import java.util.Locale;

public class LocaleWrapper {

    private static Locale sLocale;

    public static Context wrap(Context base) {
        if (sLocale == null) {
            return base;
        }

        final Resources res = base.getResources();
        final Configuration config = res.getConfiguration();
        config.setLocale(sLocale);
        return base.createConfigurationContext(config);
    }

    public static void setLocale(String lang) {
        sLocale = new Locale(lang);
    }
}
