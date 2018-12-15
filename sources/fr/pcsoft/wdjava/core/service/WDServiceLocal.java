package fr.pcsoft.wdjava.core.service;

import android.app.Service;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import fr.pcsoft.wdjava.core.application.WDAppManager;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.notification.C1012j;
import fr.pcsoft.wdjava.p032m.C0933a;
import fr.pcsoft.wdjava.p061q.p062a.C1014a;

public class WDServiceLocal extends Service implements C0747a {
    /* renamed from: a */
    public static final int f1931a = 525;
    /* renamed from: z */
    private static final String[] f1932z = new String[]{m3246z(m3247z("c\u001c;[v\u0006\r0Ju\u0001\r5Iy\t\u0011<Jz")), m3246z(m3247z("0=\u0003jM"))};
    /* renamed from: b */
    private boolean f1933b = false;
    /* renamed from: c */
    private final IBinder f1934c = new C0748b(this);
    /* renamed from: d */
    private ServiceConnection f1935d = null;
    /* renamed from: e */
    private WakeLock f1936e = null;

    /* renamed from: z */
    private static String m3246z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 64;
                    break;
                case 1:
                    i2 = 82;
                    break;
                case 2:
                    i2 = 116;
                    break;
                case 3:
                    i2 = 15;
                    break;
                default:
                    i2 = 63;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m3247z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 63);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public void mo2612a() {
        C1014a.m7327b().mo3280a((Service) this, (int) f1931a);
        if (this.f1936e != null) {
            this.f1936e.release();
            this.f1936e = null;
        }
        this.f1933b = false;
    }

    /* renamed from: a */
    public final void m3249a(ServiceConnection serviceConnection) {
        this.f1935d = serviceConnection;
    }

    /* renamed from: a */
    public final void mo2613a(C0933a c0933a) {
        c0933a.m6790a();
    }

    /* renamed from: a */
    public void mo2614a(C1012j c1012j) {
        int a = c1012j.m7325a();
        if (!(a == -1 || a == f1931a)) {
            WDErreurManager.m2883a(C0745b.m3222b(f1932z[0], new String[0]));
        }
        C1014a.m7327b().mo3281a((Service) this, c1012j.m7325a(), c1012j.m7326a(f1931a));
        if (this.f1936e == null) {
            this.f1936e = ((PowerManager) WDAppManager.m2544C().getSystemService(f1932z[1])).newWakeLock(1, getClass().getName());
            this.f1936e.setReferenceCounted(false);
        }
        this.f1936e.acquire();
        this.f1933b = true;
    }

    /* renamed from: b */
    public boolean mo2615b() {
        return this.f1933b;
    }

    /* renamed from: c */
    public void m3253c() {
        if (this.f1935d != null) {
            getApplicationContext().unbindService(this.f1935d);
            this.f1935d = null;
        }
    }

    public IBinder onBind(Intent intent) {
        return this.f1934c;
    }

    public void onDestroy() {
        super.onDestroy();
    }
}
