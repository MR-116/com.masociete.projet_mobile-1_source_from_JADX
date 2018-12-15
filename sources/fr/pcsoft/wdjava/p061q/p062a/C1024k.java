package fr.pcsoft.wdjava.p061q.p062a;

import android.app.Activity;

/* renamed from: fr.pcsoft.wdjava.q.a.k */
public class C1024k extends C1023j {
    /* renamed from: z */
    private static final String f2919z = C1024k.m7392z(C1024k.m7393z("\u0017TPx\u0012\u000bKm\b\u0017I}y(3H}s"));

    /* renamed from: z */
    private static String m7392z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 126;
                    break;
                case 1:
                    i2 = 39;
                    break;
                case 2:
                    i2 = 25;
                    break;
                case 3:
                    i2 = 22;
                    break;
                default:
                    i2 = 95;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7393z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 95);
        }
        return toCharArray;
    }

    /* renamed from: b */
    public boolean mo3306b(Activity activity) {
        try {
            return ((Boolean) activity.getClass().getMethod(f2919z, new Class[0]).invoke(activity, new Object[0])).booleanValue();
        } catch (Exception e) {
            return false;
        }
    }
}
