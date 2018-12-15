package fr.pcsoft.wdjava.p061q.p062a;

import android.annotation.TargetApi;
import android.provider.Settings.Secure;
import fr.pcsoft.wdjava.core.application.WDAppManager;
import fr.pcsoft.wdjava.core.debug.C0691a;

@TargetApi(21)
/* renamed from: fr.pcsoft.wdjava.q.a.i */
public class C1022i extends C1021h {
    /* renamed from: z */
    private static final String[] f2918z = new String[]{C1022i.m7386z(C1022i.m7387z("\n=\b:P\u000f=\u0005\u0004I\t6\u000e")), C1022i.m7386z(C1022i.m7387z("# \u0019>Q\u0014r\u00074V\u0015r\u000f>\u0004\n3K7A\u0005&\u001e)AF6\u001e{T\u0007 \n6Ì\u0012 \u000e{W\u001f!\u001f³I\u0003rW\bA\u0012&\u00025C\u0015|8>G\u0013 \u000euh)\u0011*\u000fm)\u001c4\u0016k\"\u0017U"))};

    /* renamed from: z */
    private static String m7386z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 102;
                    break;
                case 1:
                    i2 = 82;
                    break;
                case 2:
                    i2 = 107;
                    break;
                case 3:
                    i2 = 91;
                    break;
                default:
                    i2 = 36;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7387z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 36);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public boolean mo3302a() {
        int i;
        try {
            i = Secure.getInt(WDAppManager.m2553L(), f2918z[0]);
        } catch (Exception e) {
            C0691a.m2857a(f2918z[1], e);
            i = 0;
        }
        return i != 0;
    }
}
