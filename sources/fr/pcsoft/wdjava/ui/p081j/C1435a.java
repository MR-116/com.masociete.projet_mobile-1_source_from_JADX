package fr.pcsoft.wdjava.ui.p081j;

import android.content.res.Resources;
import fr.pcsoft.wdjava.core.application.WDAppManager;

/* renamed from: fr.pcsoft.wdjava.ui.j.a */
public class C1435a {
    /* renamed from: a */
    public static int f4253a = 0;
    /* renamed from: b */
    public static final int f4254b = 16974373;
    /* renamed from: c */
    public static final int f4255c = 16974393;
    /* renamed from: d */
    public static final int f4256d = 16974382;
    /* renamed from: e */
    public static int f4257e = 0;
    /* renamed from: f */
    public static final int f4258f = 16974401;

    static {
        f4253a = 16974391;
        f4257e = 16974372;
        Resources b = WDAppManager.m2569b();
        String packageName = WDAppManager.m2544C().getPackageName();
        int identifier = b.getIdentifier(C1435a.m10093z(C1435a.m10094z("C^\u0014V3g^\fl\rgX\bG\u001eO\\\u0014Z.`}\u0001A\u001e:\u0007")), C1435a.m10093z(C1435a.m10094z("}K\u0019_$")), packageName);
        if (identifier > 0) {
            f4253a = identifier;
        }
        int identifier2 = b.getIdentifier(C1435a.m10093z(C1435a.m10094z("C^\u0014V3g^\fl\u0000mK\t\\/L^\u0012lu6")), C1435a.m10093z(C1435a.m10094z("}K\u0019_$")), packageName);
        if (identifier2 > 0) {
            f4257e = identifier2;
        }
    }

    /* renamed from: z */
    private static String m10093z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 14;
                    break;
                case 1:
                    i2 = 63;
                    break;
                case 2:
                    i2 = 96;
                    break;
                case 3:
                    i2 = 51;
                    break;
                default:
                    i2 = 65;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m10094z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 65);
        }
        return toCharArray;
    }
}
