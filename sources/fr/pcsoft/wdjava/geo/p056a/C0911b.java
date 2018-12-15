package fr.pcsoft.wdjava.geo.p056a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationProvider;
import android.os.Bundle;
import fr.pcsoft.wdjava.core.C0486m;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.WDCallback;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.application.C0653m;
import fr.pcsoft.wdjava.core.application.WDAppManager;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.utils.C0806j;
import fr.pcsoft.wdjava.core.utils.ic;
import fr.pcsoft.wdjava.geo.C0918i;
import fr.pcsoft.wdjava.geo.WDGeoPosition;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: fr.pcsoft.wdjava.geo.a.b */
public class C0911b implements LocationListener {
    /* renamed from: c */
    private static C0911b f2484c = null;
    /* renamed from: h */
    private static int f2485h = 1;
    /* renamed from: z */
    private static final String[] f2486z = new String[]{C0911b.m6490z(C0911b.m6491z("l\u000b|\u000b)\u0010\u0010`\u00123\u0006\u0011c\u0007 \u0006\u001bp")), C0911b.m6490z(C0911b.m6491z("l\u001ag\u00143\u001b\u0016x\u0003#\u001a\u000bj\u0001<\u001c")), C0911b.m6490z(C0911b.m6491z("!:A1\u0003=4")), C0911b.m6490z(C0911b.m6491z("(/F")), C0911b.m6490z(C0911b.m6491z(".1Q4\u0003&;\u001b6\t=2\\5\u001f&0[h-\f\u001cp\u0015?\u0010\u0019|\b)\u0010\u0013z\u0005-\u001b\u0016z\b")), C0911b.m6490z(C0911b.m6491z(".1Q4\u0003&;\u001b6\t=2\\5\u001f&0[h-\f\u001cp\u0015?\u0010\u001cz\u0007>\u001c\u001aj\n#\f\u001ea\u000f#\u0001")), C0911b.m6490z(C0911b.m6491z("l\u000fg\t:\u0006\u001bp\u00143\b\u001az\n#\f\u001ey\u000f?\u000e\u000b|\t\"\u0010\u0011z\b3\u000b\u0016f\u0016#")), C0911b.m6490z(C0911b.m6491z("#0V'\u0018&0[")), C0911b.m6490z(C0911b.m6491z("\n-G#\u0019=Y)\u001e<Q#L#>\u00154,*E¯\u001e.+\\)\u0002o;@f\u0002 2\u0015\"\u0019o/G)\u001a&;P4L+:\u0015! 3V'\u0000&,T2\u0005 1\u001b")), C0911b.m6490z(C0911b.m6491z("l\u001ag\u00143\u001d\u001el\t\"\u0010\u0011p\u0001-\u001b\u0016s")), C0911b.m6490z(C0911b.m6491z("l\u001ag\u00143\b\u000ff\u0019(\n\r{\u000f)\u001d\u001aj\u0016#\u001c\u0016a\u000f#\u0001")), C0911b.m6490z(C0911b.m6491z("l\u001ag\u00143\u000b\u001ay\u0007%\u0010\u0011p\u0001-\u001b\u0016s")), C0911b.m6490z(C0911b.m6491z("l\u001ag\u00143\u000b\u0016f\u0012-\u0001\u001cp\u0019\"\n\u0018t\u0012%\u0019\u001a"))};
    /* renamed from: a */
    private LocationManager f2487a = null;
    /* renamed from: b */
    private String f2488b = "";
    /* renamed from: d */
    private WDCallback f2489d = null;
    /* renamed from: e */
    private WDCallback f2490e = null;
    /* renamed from: f */
    private LocationListener f2491f = null;
    /* renamed from: g */
    private LinkedList<C0912c> f2492g = null;

    static {
        WDProjet.getInstance().ajouterEcouteurProjet(new C0910a());
    }

    private C0911b() {
    }

    /* renamed from: a */
    private LocationManager m6485a(boolean z) throws C0918i {
        try {
            if (this.f2487a == null) {
                this.f2487a = (LocationManager) WDAppManager.m2544C().getSystemService(f2486z[7]);
            }
            if (z) {
                try {
                    if (!this.f2487a.isProviderEnabled(m6503h())) {
                        throw new C0918i(C0745b.m3222b(f2486z[6], r0));
                    }
                } catch (C0918i e) {
                    throw e;
                }
            }
            return this.f2487a;
        } catch (C0918i e2) {
            throw e2;
        }
    }

    static /* synthetic */ int access$508() {
        int i = f2485h;
        f2485h = i + 1;
        return i;
    }

    /* renamed from: b */
    private void m6486b(int i) {
        if (this.f2489d != null) {
            int b = this.f2489d.m2260b();
            WDObjet[] wDObjetArr = new WDObjet[b];
            if (b >= 1) {
                wDObjetArr[0] = WDCallback.m2247a(i);
            }
            this.f2489d.execute(wDObjetArr);
        }
    }

    /* renamed from: e */
    private final void m6487e() throws C0918i {
        try {
            WDAppManager.m2565a(f2486z[4], f2486z[5]);
        } catch (C0653m e) {
            throw new C0918i((int) C0607n.wd, e.getMessage());
        }
    }

    /* renamed from: g */
    public static final boolean m6488g() {
        return f2484c != null;
    }

    /* renamed from: p */
    public static C0911b m6489p() {
        if (!C0911b.m6488g()) {
            f2484c = new C0911b();
        }
        return f2484c;
    }

    /* renamed from: z */
    private static String m6490z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 79;
                    break;
                case 1:
                    i2 = 95;
                    break;
                case 2:
                    i2 = 53;
                    break;
                case 3:
                    i2 = 70;
                    break;
                default:
                    i2 = 108;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m6491z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 108);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public synchronized int m6492a(C0486m c0486m, double d, double d2, double d3, int i) throws C0918i {
        BroadcastReceiver c0912c;
        if (d3 < 0.0d) {
            try {
                WDErreurManager.m2883a(C0745b.m3222b(f2486z[9], new String[0]));
            } catch (C0918i e) {
                throw e;
            } catch (C0918i e2) {
                throw e2;
            }
        }
        m6487e();
        WDCallback a = WDCallback.m2239a(c0486m, -1, true);
        Context C = WDAppManager.m2544C();
        c0912c = new C0912c(this, C, a);
        m6485a(false).addProximityAlert(d, d2, (float) d3, (long) Math.max(-1, i * 10), C0912c.access$300(c0912c));
        C.registerReceiver(c0912c, C0912c.access$400(c0912c));
        if (this.f2492g == null) {
            this.f2492g = new LinkedList();
        }
        this.f2492g.add(c0912c);
        return c0912c.m6516c();
    }

    /* renamed from: a */
    public synchronized Location m6493a(int i, String str) throws C0918i {
        Location location;
        if (i <= 0) {
            try {
                WDErreurManager.m2883a(C0745b.m3222b(f2486z[0], new String[0]));
            } catch (Exception e) {
                throw e;
            } catch (Exception e2) {
                throw e2;
            }
        }
        m6487e();
        LocationManager a = m6485a(true);
        C0806j.m3949a();
        ic c0914e = new C0914e(this, a);
        try {
            c0914e.m1785a(1, str, i * 10);
            a.removeUpdates(this.f2491f);
            this.f2491f = null;
            location = (Location) c0914e.m1792d();
            if (location == null) {
                location = a.getLastKnownLocation(m6503h());
                if (location == null) {
                    throw new C0918i(C0745b.m3222b(f2486z[1], new String[0]));
                }
            }
        } catch (Exception e22) {
            throw new C0918i(e22.getMessage());
        } catch (Throwable th) {
            a.removeUpdates(this.f2491f);
            this.f2491f = null;
        }
        return location;
    }

    /* renamed from: a */
    public synchronized void m6494a(int i) {
        C0912c c0912c = null;
        synchronized (this) {
            Iterator it = this.f2492g.iterator();
            while (it.hasNext()) {
                C0912c c0912c2 = (C0912c) it.next();
                if (c0912c2 != null) {
                    try {
                        if (c0912c2.m6516c() == i) {
                            c0912c = c0912c2;
                            break;
                        }
                    } catch (C0918i e) {
                        this.f2492g.remove(c0912c);
                    } catch (C0918i e2) {
                        throw e2;
                    } catch (Throwable th) {
                        this.f2492g.remove(c0912c);
                    }
                }
            }
            if (c0912c != null) {
                c0912c.m6515a(WDAppManager.m2544C(), m6485a(false));
                this.f2492g.remove(c0912c);
            }
        }
        return;
    }

    /* renamed from: a */
    public synchronized void m6495a(int r6, int r7) throws fr.pcsoft.wdjava.geo.C0918i {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Exception block dominator not found, method:fr.pcsoft.wdjava.geo.a.b.a(int, int):void. bs: [B:13:0x001d, B:18:0x0027, B:23:0x0031, B:28:0x003a, B:44:0x005d, B:55:0x006c, B:64:0x0079]
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:86)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/70807318.run(Unknown Source)
*/
        /*
        r5 = this;
        r4 = 2;
        r1 = 0;
        r0 = 1;
        monitor-enter(r5);
        r5.m6487e();	 Catch:{ all -> 0x0053 }
        switch(r6) {
            case 2: goto L_0x0089;
            case 3: goto L_0x000a;
            case 4: goto L_0x0013;
            default: goto L_0x000a;
        };	 Catch:{ all -> 0x0053 }
    L_0x000a:
        r0 = f2486z;	 Catch:{ all -> 0x0053 }
        r1 = 3;	 Catch:{ all -> 0x0053 }
        r0 = r0[r1];	 Catch:{ all -> 0x0053 }
        r5.f2488b = r0;	 Catch:{ all -> 0x0053 }
    L_0x0011:
        monitor-exit(r5);
        return;
    L_0x0013:
        r3 = new android.location.Criteria;	 Catch:{ all -> 0x0053 }
        r3.<init>();	 Catch:{ all -> 0x0053 }
        r2 = r7 & 2;
        if (r2 != r4) goto L_0x0058;
    L_0x001c:
        r2 = 1;
        r3.setAccuracy(r2);	 Catch:{ i -> 0x0056 }
    L_0x0020:
        r2 = r7 & 128;
        r4 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r2 != r4) goto L_0x0065;
    L_0x0026:
        r2 = 3;
        r3.setPowerRequirement(r2);	 Catch:{ i -> 0x0063 }
    L_0x002a:
        r2 = r7 & 8;
        r4 = 8;
        if (r2 != r4) goto L_0x007f;
    L_0x0030:
        r2 = r0;
    L_0x0031:
        r3.setAltitudeRequired(r2);	 Catch:{ i -> 0x0081 }
        r2 = r7 & 4;
        r4 = 4;
        if (r2 != r4) goto L_0x0083;
    L_0x0039:
        r2 = r0;
    L_0x003a:
        r3.setAltitudeRequired(r2);	 Catch:{ i -> 0x0085 }
        r2 = r7 & 16;
        r4 = 16;
        if (r2 != r4) goto L_0x0087;
    L_0x0043:
        r3.setAltitudeRequired(r0);	 Catch:{ all -> 0x0053 }
        r0 = 0;	 Catch:{ all -> 0x0053 }
        r0 = r5.m6485a(r0);	 Catch:{ all -> 0x0053 }
        r1 = 1;	 Catch:{ all -> 0x0053 }
        r0 = r0.getBestProvider(r3, r1);	 Catch:{ all -> 0x0053 }
        r5.f2488b = r0;	 Catch:{ all -> 0x0053 }
        goto L_0x0011;
    L_0x0053:
        r0 = move-exception;
        monitor-exit(r5);
        throw r0;
    L_0x0056:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0053 }
    L_0x0058:
        r2 = r7 & 1;
        if (r2 != r0) goto L_0x0020;
    L_0x005c:
        r2 = 2;
        r3.setAccuracy(r2);	 Catch:{ i -> 0x0061 }
        goto L_0x0020;
    L_0x0061:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0053 }
    L_0x0063:
        r0 = move-exception;	 Catch:{ all -> 0x0053 }
        throw r0;	 Catch:{ all -> 0x0053 }
    L_0x0065:
        r2 = r7 & 64;
        r4 = 64;
        if (r2 != r4) goto L_0x0072;
    L_0x006b:
        r2 = 2;
        r3.setPowerRequirement(r2);	 Catch:{ i -> 0x0070 }
        goto L_0x002a;
    L_0x0070:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0053 }
    L_0x0072:
        r2 = r7 & 32;
        r4 = 32;
        if (r2 != r4) goto L_0x002a;
    L_0x0078:
        r2 = 1;
        r3.setPowerRequirement(r2);	 Catch:{ i -> 0x007d }
        goto L_0x002a;
    L_0x007d:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0053 }
    L_0x007f:
        r2 = r1;	 Catch:{ all -> 0x0053 }
        goto L_0x0031;	 Catch:{ all -> 0x0053 }
    L_0x0081:
        r0 = move-exception;	 Catch:{ all -> 0x0053 }
        throw r0;	 Catch:{ all -> 0x0053 }
    L_0x0083:
        r2 = r1;	 Catch:{ all -> 0x0053 }
        goto L_0x003a;	 Catch:{ all -> 0x0053 }
    L_0x0085:
        r0 = move-exception;	 Catch:{ all -> 0x0053 }
        throw r0;	 Catch:{ all -> 0x0053 }
    L_0x0087:
        r0 = r1;	 Catch:{ all -> 0x0053 }
        goto L_0x0043;	 Catch:{ all -> 0x0053 }
    L_0x0089:
        r0 = f2486z;	 Catch:{ all -> 0x0053 }
        r1 = 2;	 Catch:{ all -> 0x0053 }
        r0 = r0[r1];	 Catch:{ all -> 0x0053 }
        r5.f2488b = r0;	 Catch:{ all -> 0x0053 }
        goto L_0x0011;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.geo.a.b.a(int, int):void");
    }

    /* renamed from: a */
    public synchronized void m6496a(C0486m c0486m) throws C0918i {
        this.f2489d = WDCallback.m2239a(c0486m, -1, true);
        C0806j.m3949a();
        m6487e();
        m6485a(false).requestLocationUpdates(m6503h(), 60000, 100.0f, this);
    }

    /* renamed from: a */
    public synchronized void m6497a(C0486m c0486m, int i, double d) throws C0918i {
        if (i <= 0) {
            try {
                WDErreurManager.m2883a(C0745b.m3222b(f2486z[11], new String[0]));
            } catch (C0918i e) {
                throw e;
            } catch (C0918i e2) {
                throw e2;
            }
        }
        if (d <= 0.0d) {
            WDErreurManager.m2883a(C0745b.m3222b(f2486z[12], new String[0]));
        }
        m6487e();
        this.f2490e = WDCallback.m2239a(c0486m, -1, true);
        C0806j.m3949a();
        m6485a(false).requestLocationUpdates(m6503h(), (long) (i * 10), (float) d, this);
        return;
    }

    /* renamed from: a */
    public boolean m6498a() throws C0918i {
        LocationProvider n = m6509n();
        return n == null ? false : n.supportsSpeed();
    }

    /* renamed from: b */
    public int m6499b() throws C0918i {
        LocationProvider n = m6509n();
        if (n == null) {
            return 0;
        }
        try {
            switch (n.getPowerRequirement()) {
                case 1:
                    return 32;
                case 3:
                    return 128;
                default:
                    return 64;
            }
        } catch (C0918i e) {
            throw e;
        }
    }

    /* renamed from: c */
    public synchronized void m6500c() throws C0918i {
        try {
            m6510o();
            m6508m();
            if (this.f2491f != null) {
                m6485a(false).removeUpdates(this.f2491f);
            }
            if (this.f2492g != null) {
                Context C = WDAppManager.m2544C();
                LocationManager a = m6485a(false);
                Iterator it = this.f2492g.iterator();
                while (it.hasNext()) {
                    C0912c c0912c = (C0912c) it.next();
                    it.remove();
                    c0912c.m6515a(C, a);
                }
            }
            this.f2488b = "";
            this.f2487a = null;
        } catch (C0918i e) {
            throw e;
        }
    }

    /* renamed from: d */
    public synchronized Location m6501d() throws C0918i {
        Location lastKnownLocation;
        m6487e();
        lastKnownLocation = m6485a(true).getLastKnownLocation(m6503h());
        if (lastKnownLocation == null) {
            try {
                throw new C0918i(C0745b.m3222b(f2486z[10], new String[0]));
            } catch (C0918i e) {
                throw e;
            }
        }
        return lastKnownLocation;
    }

    /* renamed from: f */
    public int m6502f() throws C0918i {
        LocationProvider n = m6509n();
        if (n == null) {
            return 0;
        }
        try {
            return n.getAccuracy() == 1 ? 2 : 1;
        } catch (C0918i e) {
            throw e;
        }
    }

    /* renamed from: h */
    public synchronized String m6503h() {
        String str;
        try {
            if (this.f2488b == null || this.f2488b.equals("")) {
                try {
                    if (m6485a(false).isProviderEnabled(f2486z[3])) {
                        this.f2488b = f2486z[3];
                    } else {
                        this.f2488b = f2486z[2];
                    }
                } catch (Exception e) {
                    C0691a.m2857a(f2486z[8], e);
                    str = f2486z[3];
                }
            }
            str = this.f2488b;
        } catch (C0918i e2) {
            throw e2;
        }
        return str;
    }

    /* renamed from: i */
    public int m6504i() {
        return m6503h().equals(f2486z[3]) ? 1 : 2;
    }

    /* renamed from: j */
    public boolean m6505j() throws C0918i {
        LocationProvider n = m6509n();
        return n == null ? false : n.supportsAltitude();
    }

    /* renamed from: k */
    public boolean m6506k() throws C0918i {
        LocationProvider n = m6509n();
        return n == null ? false : n.supportsBearing();
    }

    /* renamed from: l */
    public synchronized int m6507l() throws C0918i {
        try {
        } catch (C0918i e) {
            throw e;
        }
        return m6485a(false).isProviderEnabled(m6503h()) ? 1 : 2;
    }

    /* renamed from: m */
    public synchronized void m6508m() throws C0918i {
        try {
            this.f2490e = null;
            if (this.f2489d == null) {
                m6485a(false).removeUpdates(this);
            }
        } catch (C0918i e) {
            throw e;
        }
        return;
    }

    /* renamed from: n */
    public LocationProvider m6509n() throws C0918i {
        m6487e();
        return m6485a(true).getProvider(m6503h());
    }

    /* renamed from: o */
    public synchronized void m6510o() throws C0918i {
        try {
            this.f2489d = null;
            if (this.f2490e == null) {
                m6485a(false).removeUpdates(this);
            }
        } catch (C0918i e) {
            throw e;
        }
        return;
    }

    public synchronized void onLocationChanged(Location location) {
        if (this.f2490e != null) {
            int b = this.f2490e.m2260b();
            WDObjet[] wDObjetArr = new WDObjet[b];
            if (b >= 1) {
                WDGeoPosition wDGeoPosition = new WDGeoPosition(location);
                wDGeoPosition.mo2435a(true);
                wDObjetArr[0] = wDGeoPosition;
            }
            this.f2490e.execute(wDObjetArr);
        }
    }

    public synchronized void onProviderDisabled(String str) {
        m6486b(2);
    }

    public synchronized void onProviderEnabled(String str) {
        m6486b(1);
    }

    public synchronized void onStatusChanged(String str, int i, Bundle bundle) {
        int i2;
        switch (i) {
            case 0:
                i2 = 3;
                break;
            case 1:
                i2 = 4;
                break;
            default:
                i2 = 5;
                break;
        }
        m6486b(i2);
    }
}
