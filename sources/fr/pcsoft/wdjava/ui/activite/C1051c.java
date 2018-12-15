package fr.pcsoft.wdjava.ui.activite;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.application.WDAppManager;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.jni.WDJNIException;
import fr.pcsoft.wdjava.tlm.WDTelemetrie;
import fr.pcsoft.wdjava.ui.champs.fenetre.WDFenetre;

/* renamed from: fr.pcsoft.wdjava.ui.activite.c */
final class C1051c implements Runnable {
    /* renamed from: z */
    private static final String f3013z = C1051c.m7558z(C1051c.m7559z("\u0014\u0004SbW.\u0000AaA}\r\u0004hJ+\u0006ZhV}\u0005F~\u00049\u0006McÍ8\u001a\u0003iA}\u001dÊaÍ0WM8"));
    final C0502g val$activite;

    C1051c(C0502g c0502g) {
        this.val$activite = c0502g;
    }

    /* renamed from: z */
    private static String m7558z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 93;
                    break;
                case 1:
                    i2 = 105;
                    break;
                case 2:
                    i2 = 35;
                    break;
                case 3:
                    i2 = 13;
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
    private static char[] m7559z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 36);
        }
        return toCharArray;
    }

    public void run() {
        try {
            this.val$activite.mo1766b().activity_onStop(this.val$activite.mo1775i());
            if (C1050b.f3010e && !C1050b.f3008c) {
                C1050b.f3008c = true;
                WDAppManager.m2549H();
                WDFenetre b = this.val$activite.mo1766b();
                if (b != null) {
                    try {
                        b.appelPCode(C0607n.Qt);
                    } catch (WDJNIException e) {
                        throw e;
                    }
                }
                WDProjet.getInstance().appelPCode(C0607n.Qt);
                if (WDTelemetrie.m7399e().mo3313h()) {
                    try {
                        WDTelemetrie.m7399e().m7419d();
                    } catch (Exception e2) {
                        C0691a.m2857a(f3013z, e2);
                    }
                }
            }
        } catch (WDJNIException e3) {
            throw e3;
        }
    }
}
