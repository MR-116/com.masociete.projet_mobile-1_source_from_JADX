package fr.pcsoft.wdjava.core.application;

import android.content.Context;
import android.content.Intent;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.service.WDServiceLocal;
import fr.pcsoft.wdjava.core.utils.ic;

/* renamed from: fr.pcsoft.wdjava.core.application.q */
class C0656q extends ic {
    /* renamed from: z */
    private static final String[] f1641z = new String[]{C0656q.m2657z(C0656q.m2658z("(.v^/\u0012*d]9A'c\u0011?\t\"tV9\u0013cjP|\u0002/gB/\u0004cQu\u000f\u00041pX?\u0004\u000fiR=\r\u001cQX8\u0006&r")), C0656q.m2657z(C0656q.m2658z("\u00071(A?\u0012,`Er\u0016'lP*\u0000mqX8\u0006&r\u001f\u000b%\u0010cC*\b c}3\u0002\"jn\u000b\b'aT("))};
    final WDProjet this$0;

    C0656q(WDProjet wDProjet) {
        this.this$0 = wDProjet;
    }

    /* renamed from: z */
    private static String m2657z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 97;
                    break;
                case 1:
                    i2 = 67;
                    break;
                case 2:
                    i2 = 6;
                    break;
                case 3:
                    i2 = 49;
                    break;
                default:
                    i2 = 92;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2658z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 92);
        }
        return toCharArray;
    }

    /* renamed from: c */
    protected void mo2434c() {
        Context C = WDAppManager.m2544C();
        Class cls = WDServiceLocal.class;
        if (WDAppManager.m2548G()) {
            try {
                cls = Class.forName(f1641z[1]);
            } catch (Exception e) {
                C0691a.m2857a(f1641z[0], e);
                m1784a();
                return;
            }
        }
        if (!C.bindService(new Intent(C, cls), new C0639b(this), 1)) {
            try {
                m1784a();
            } catch (ClassNotFoundException e2) {
                throw e2;
            }
        }
    }
}
