package fr.pcsoft.wdjava.media;

import android.hardware.Camera;
import android.hardware.Camera.AutoFocusCallback;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.p032m.C0938m;

/* renamed from: fr.pcsoft.wdjava.media.h */
final class C0946h implements AutoFocusCallback, Runnable {
    /* renamed from: a */
    private static final long f2599a = 2000;
    /* renamed from: z */
    private static final String[] f2600z = new String[]{C0946h.m6851z(C0946h.m6852z("c\\\u001d\u0018dYX\u000f\u001br\nU\bWsÃR\u0001\u0012yIY\b\u00057F\u0016\f\u0002cEW\u0002\u0014bY\u0011\t\u00127FPM\u0014vGØ\u001f\u00169")), C0946h.m6851z(C0946h.m6852z("c\\\u001d\u0018dYX\u000f\u001br\nU\bWd^^\u001d\u0007rX\u0011\u0001Pv_E\u0002\u0011xID\u001eWsO\u0011\u0001\u00167IP\u0000eK\u001f"))};
    /* renamed from: b */
    private final Camera f2601b;
    /* renamed from: c */
    private boolean f2602c = true;

    public C0946h(Camera camera) {
        this.f2601b = camera;
        m6850b();
    }

    static void access$000(C0946h c0946h) {
        c0946h.m6850b();
    }

    /* renamed from: b */
    private final void m6850b() {
        try {
            if (this.f2602c) {
                C0938m.m6816c().postDelayed(this, f2599a);
            }
        } catch (RuntimeException e) {
            throw e;
        }
    }

    /* renamed from: z */
    private static String m6851z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 42;
                    break;
                case 1:
                    i2 = 49;
                    break;
                case 2:
                    i2 = 109;
                    break;
                case 3:
                    i2 = 119;
                    break;
                default:
                    i2 = 23;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m6852z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 23);
        }
        return toCharArray;
    }

    /* renamed from: a */
    synchronized void m6853a() {
        try {
            this.f2601b.cancelAutoFocus();
        } catch (Exception e) {
            C0691a.m2857a(f2600z[1], e);
        }
        C0938m.m6816c().removeCallbacks(this);
        this.f2602c = false;
    }

    public synchronized void onAutoFocus(boolean z, Camera camera) {
        m6850b();
    }

    public void run() {
        if (this.f2602c) {
            try {
                this.f2601b.autoFocus(this);
            } catch (Exception e) {
                C0691a.m2857a(f2600z[0], e);
            }
        }
    }
}
