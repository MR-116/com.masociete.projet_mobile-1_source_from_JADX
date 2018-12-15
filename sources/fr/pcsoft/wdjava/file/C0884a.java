package fr.pcsoft.wdjava.file;

import android.support.v4.content.ContextCompat;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.application.WDAppManager;
import fr.pcsoft.wdjava.core.debug.C0691a;
import java.io.File;
import java.io.IOException;

/* renamed from: fr.pcsoft.wdjava.file.a */
public class C0884a {
    /* renamed from: z */
    private static final String f2375z = C0884a.m6201z(C0884a.m6202z("\b2\u0007\u0018\u000b26\u0015\u001b\u001da;\u0012W\n¨<\u0002\u00073:\u0005W\u0014$\u0014\u001f\u001d,6\u0019W\u001b 1\u0018\u0019\u00110*\u0012W\u001c4\u0011\u001e\u001b)6\u0012\u0005X"));

    /* renamed from: a */
    public static final boolean m6199a(File file) {
        return false;
    }

    /* renamed from: b */
    public static final boolean m6200b(File file) {
        String str = "";
        try {
            String canonicalPath = file.getCanonicalPath();
            File[] externalFilesDirs = ContextCompat.getExternalFilesDirs(WDAppManager.m2544C(), null);
            for (File file2 : externalFilesDirs) {
                if (file2 != null) {
                    try {
                        if (canonicalPath.toLowerCase().startsWith(file2.getPath().toLowerCase())) {
                            return true;
                        }
                    } catch (IOException e) {
                        throw e;
                    }
                }
            }
            return false;
        } catch (Exception e2) {
            C0691a.m2857a(f2375z + file.getPath(), e2);
            return false;
        }
    }

    /* renamed from: z */
    private static String m6201z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 65;
                    break;
                case 1:
                    i2 = 95;
                    break;
                case 2:
                    i2 = 119;
                    break;
                case 3:
                    i2 = 119;
                    break;
                default:
                    i2 = C0607n.co;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m6202z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ C0607n.co);
        }
        return toCharArray;
    }
}
