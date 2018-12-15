package fr.pcsoft.wdjava.database.hf;

import fr.pcsoft.wdjava.core.application.WDAppManager;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.C0743a;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.core.utils.bb;
import fr.pcsoft.wdjava.database.hf.p049c.C0832f;
import fr.pcsoft.wdjava.database.hf.p049c.C0841b;
import fr.pcsoft.wdjava.jni.WDJNIException;
import java.io.File;
import java.io.InputStream;

/* renamed from: fr.pcsoft.wdjava.database.hf.r */
public class C0865r {
    /* renamed from: z */
    private static final String[] f2286z = new String[]{C0865r.m6089z(C0865r.m6090z("1\u000fEn2\u0006]S~5\u0015\u0013C++\u0011]Tc&\u0006\u001aRf\"\u001a\t\u0017o\"T\u0011V+7\u0015\u000fCb5T\u0018On$T\u0019R++S\u001cYj+\r\u000eR%")), C0865r.m6089z(C0865r.m6090z("W8eY\u0018;(aN\u0015 (eN\u0018#9s"))};

    /* renamed from: a */
    public static final C0832f m6088a(String str, String str2) throws C0841b, WDJNIException {
        byte[] bArr = null;
        try {
            WDHF wdhf = new WDHF();
            if (!C0808l.m4053k(str)) {
                InputStream a = C0743a.m3198a(str, false);
                if (a != null) {
                    try {
                        bArr = bb.m3846b(a);
                    } catch (Exception e) {
                        C0691a.m2857a(f2286z[0], e);
                    }
                }
                if (bArr != null) {
                    if (!wdhf.m4704a(str, bArr)) {
                        String[] strArr = new String[2];
                        strArr[0] = C0745b.m3222b(f2286z[1], str) + "\n" + wdhf.mo2932e((int) C0542t.mb);
                        strArr[1] = wdhf.mo2932e((int) C0542t.Vc);
                        WDErreurManager.m2886a(strArr);
                    }
                    File h = WDAppManager.m2581h();
                    if (!h.exists()) {
                        h.mkdir();
                    }
                    wdhf.mo2953f(".", h.getPath());
                } else {
                    WDErreurManager.m2883a(C0745b.m3222b(f2286z[1], str));
                }
            }
            return wdhf;
        } catch (Throwable th) {
            WDErreurManager.m2888b(th);
            return bArr;
        }
    }

    /* renamed from: z */
    private static String m6089z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 116;
                    break;
                case 1:
                    i2 = 125;
                    break;
                case 2:
                    i2 = 55;
                    break;
                case 3:
                    i2 = 11;
                    break;
                default:
                    i2 = 71;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m6090z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 71);
        }
        return toCharArray;
    }
}
