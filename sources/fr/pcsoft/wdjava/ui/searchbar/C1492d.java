package fr.pcsoft.wdjava.ui.searchbar;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import fr.pcsoft.wdjava.core.application.WDAppManager;
import fr.pcsoft.wdjava.core.debug.C0691a;

/* renamed from: fr.pcsoft.wdjava.ui.searchbar.d */
final class C1492d extends Thread {
    /* renamed from: z */
    private static final String[] f4502z = new String[]{C1492d.m10356z(C1492d.m10357z("9|~\u0017")), C1492d.m10356z(C1492d.m10357z("*td\u0016{*Bd\u0013y8")), C1492d.m10356z(C1492d.m10357z("\u0018~b\u0017w}yoRxz|`\u001da)=n\u001741:o\u001c`/ôoRpzuc\u0001`2oc\u0003a8=n\u00174/xi\u001aq/~b\u001749|d\u000141|*\u0010u.x$")), C1492d.m10356z(C1492d.m10357z(".xk\u0000w5Bb\u001bg)rx\u000b")), C1492d.m10356z(C1492d.m10357z(",ho\u0000m"))};
    final String val$strQuery;
    final String val$strWindowName;

    C1492d(String str, String str2) {
        this.val$strQuery = str;
        this.val$strWindowName = str2;
    }

    /* renamed from: z */
    private static String m10356z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 93;
                    break;
                case 1:
                    i2 = 29;
                    break;
                case 2:
                    i2 = 10;
                    break;
                case 3:
                    i2 = 114;
                    break;
                default:
                    i2 = 20;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m10357z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 20);
        }
        return toCharArray;
    }

    public void run() {
        ContentResolver contentResolver = WDAppManager.m2544C().getContentResolver();
        Uri a = WDAppManager.m2588o().m2641a(f4502z[3]);
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(f4502z[4], this.val$strQuery);
            contentValues.put(f4502z[1], this.val$strWindowName);
            contentValues.put(f4502z[0], Long.valueOf(System.currentTimeMillis()));
            contentResolver.insert(a, contentValues);
        } catch (Exception e) {
            C0691a.m2857a(f4502z[2], e);
        }
        WDSearchHistory.m10340a(contentResolver, a, 1000, null);
    }
}
