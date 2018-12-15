package fr.pcsoft.wdjava.media;

import android.media.MediaRecorder;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.application.C0653m;
import fr.pcsoft.wdjava.core.application.WDAppManager;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.file.C0897o;
import java.io.File;

/* renamed from: fr.pcsoft.wdjava.media.x */
public class C0962x {
    /* renamed from: b */
    private static final int f2689b = 2;
    /* renamed from: c */
    private static C0962x f2690c = null;
    /* renamed from: d */
    private static final int f2691d = 4;
    /* renamed from: f */
    private static final int f2692f = 3;
    /* renamed from: g */
    private static final int f2693g = 1;
    /* renamed from: z */
    private static final String[] f2694z = new String[]{C0962x.m6939z(C0962x.m6940z("\u0011S%3Q\u0019Yo1[\u0002P(2M\u0019R/ol5~\u000e\u0013z/|\u0014\u0005w?")), C0962x.m6939z(C0962x.m6940z("&|\r\u0004k\"b\u0002\u000ep#i\u0000\u000fj5b\b\u000fh1q\b\u0005{")), C0962x.m6939z(C0962x.m6940z("Sx\u0013\u0013a5s\u0013\u0004y9n\u0015\u0013{=x\u000f\u0015a1h\u0005\bq"))};
    /* renamed from: a */
    private MediaRecorder f2695a = null;
    /* renamed from: e */
    private boolean f2696e = false;

    private C0962x() {
        WDProjet.getInstance().ajouterEcouteurProjet(new C0955q(this));
    }

    /* renamed from: a */
    private void m6934a() {
        try {
            if (this.f2695a != null && this.f2696e) {
                this.f2695a.stop();
                this.f2695a.reset();
            }
            m6937b();
        } finally {
            this.f2696e = false;
        }
    }

    /* renamed from: a */
    public static final void m6935a(int i, String str) throws ib {
        switch (i) {
            case 1:
                try {
                    C0960v.m6928c().m6932a(str, false, false);
                    return;
                } catch (C0653m e) {
                    throw e;
                }
            case 2:
                try {
                    WDAppManager.m2565a(f2694z[0]);
                    C0962x.m6938c().m6936a(str);
                    return;
                } catch (C0653m e2) {
                    throw new ib(e2.getMessage(), (int) C0607n.rc);
                }
            case 3:
            case 4:
                try {
                    if (C0960v.m6926a()) {
                        C0960v.m6928c().m6933d();
                    }
                    C0962x.m6938c().m6934a();
                    return;
                } catch (C0653m e22) {
                    throw e22;
                }
            default:
                throw new ib(C0745b.m3222b(f2694z[1], String.valueOf(i)));
        }
    }

    /* renamed from: a */
    private final void m6936a(String str) throws ib {
        m6934a();
        try {
            File a = C0897o.m6239a(str, true);
            this.f2695a = new MediaRecorder();
            this.f2695a.setAudioSource(0);
            this.f2695a.setOutputFormat(1);
            this.f2695a.setAudioEncoder(1);
            this.f2695a.setOutputFile(a.getPath());
            this.f2695a.setOnInfoListener(new C0950l(this));
            this.f2695a.setOnErrorListener(new C0952n(this));
            this.f2695a.prepare();
            this.f2695a.start();
            this.f2696e = true;
        } catch (Exception e) {
            m6934a();
            throw new ib(C0745b.m3222b(f2694z[2], new String[0]), e.getMessage());
        }
    }

    /* renamed from: b */
    private void m6937b() {
        if (this.f2695a != null) {
            this.f2695a.release();
            this.f2695a = null;
        }
    }

    /* renamed from: c */
    public static C0962x m6938c() {
        if (f2690c == null) {
            f2690c = new C0962x();
        }
        return f2690c;
    }

    /* renamed from: z */
    private static String m6939z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 112;
                    break;
                case 1:
                    i2 = 61;
                    break;
                case 2:
                    i2 = 65;
                    break;
                case 3:
                    i2 = 65;
                    break;
                default:
                    i2 = 62;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m6940z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 62);
        }
        return toCharArray;
    }
}
