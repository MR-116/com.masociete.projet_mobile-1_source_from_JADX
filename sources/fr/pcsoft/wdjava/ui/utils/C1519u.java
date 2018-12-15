package fr.pcsoft.wdjava.ui.utils;

import android.graphics.Bitmap.Config;

/* renamed from: fr.pcsoft.wdjava.ui.utils.u */
/* synthetic */ class C1519u {
    /* renamed from: a */
    static final int[] f4657a = new int[Config.values().length];

    static {
        try {
            f4657a[Config.ARGB_8888.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            f4657a[Config.ALPHA_8.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
    }
}
