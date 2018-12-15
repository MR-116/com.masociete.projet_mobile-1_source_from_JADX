package fr.pcsoft.wdjava.geo.p056a;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.LocationManager;
import fr.pcsoft.wdjava.core.WDCallback;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.types.WDVoid;

/* renamed from: fr.pcsoft.wdjava.geo.a.c */
class C0912c extends BroadcastReceiver {
    /* renamed from: c */
    private static final String f2493c = C0912c.m6513z(C0912c.m6514z("TA\u001bq&[]\u000b}=PA\u001bg9ZQ\u0006l ZL\u0010"));
    /* renamed from: z */
    private static final String f2494z = C0912c.m6513z(C0912c.m6514z("pl;]\u001b|l("));
    /* renamed from: a */
    private int f2495a;
    /* renamed from: b */
    private WDCallback f2496b;
    /* renamed from: d */
    private PendingIntent f2497d;
    final C0911b this$0;

    public C0912c(C0911b c0911b, Context context, WDCallback wDCallback) {
        this.this$0 = c0911b;
        this.f2497d = null;
        this.f2496b = null;
        this.f2495a = 0;
        this.f2495a = C0911b.access$508();
        this.f2497d = PendingIntent.getBroadcast(context, 0, new Intent(m6511a()), 134217728);
        this.f2496b = wDCallback;
    }

    /* renamed from: a */
    private final String m6511a() {
        return f2493c + this.f2495a;
    }

    static PendingIntent access$300(C0912c c0912c) {
        return c0912c.f2497d;
    }

    static IntentFilter access$400(C0912c c0912c) {
        return c0912c.m6512b();
    }

    /* renamed from: b */
    private IntentFilter m6512b() {
        return new IntentFilter(m6511a());
    }

    /* renamed from: z */
    private static String m6513z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 21;
                    break;
                case 1:
                    i2 = 2;
                    break;
                case 2:
                    i2 = 79;
                    break;
                case 3:
                    i2 = 56;
                    break;
                default:
                    i2 = 105;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m6514z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 105);
        }
        return toCharArray;
    }

    /* renamed from: a */
    void m6515a(Context context, LocationManager locationManager) {
        if (!(this.f2497d == null || locationManager == null)) {
            locationManager.removeProximityAlert(this.f2497d);
        }
        context.unregisterReceiver(this);
        if (this.this$0.f2492g != null) {
            this.this$0.f2492g.remove(this);
        }
    }

    /* renamed from: c */
    public int m6516c() {
        return this.f2495a;
    }

    public void onReceive(Context context, Intent intent) {
        if (this.f2496b != null) {
            boolean z = intent.getExtras().getBoolean(f2494z);
            int b = this.f2496b.m2260b();
            WDObjet[] wDObjetArr = new WDObjet[b];
            if (b >= 1) {
                wDObjetArr[0] = WDCallback.m2254a(z);
            }
            if (b >= 2) {
                wDObjetArr[1] = WDCallback.m2247a(this.f2495a);
            }
            WDObjet execute = this.f2496b.execute(wDObjetArr);
            if (execute != null && !(execute instanceof WDVoid) && !execute.getBoolean()) {
                m6515a(context, this.this$0.f2487a);
            }
        }
    }
}
