package fr.pcsoft.wdjava.jni;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.allocation.C0611a;

public class WDJNIExceptionErrWL extends WDJNIException {
    /* renamed from: b */
    private String f2520b;
    /* renamed from: c */
    private int f2521c = 0;
    /* renamed from: d */
    private WDObjet f2522d = null;
    /* renamed from: e */
    private int f2523e = 0;

    public WDJNIExceptionErrWL(int i, int i2, String str, String str2, String str3) {
        super(str, str2);
        this.f2523e = i;
        this.f2521c = i2;
        this.f2520b = str3;
    }

    /* renamed from: a */
    public long mo3215a() {
        return this.f2522d != null ? this.f2522d.getLong() : super.mo3215a();
    }

    /* renamed from: b */
    public WDObjet mo3216b() {
        return this.f2522d;
    }

    /* renamed from: c */
    public String mo3217c() {
        return this.f2522d != null ? this.f2522d.getString() : super.mo3217c();
    }

    /* renamed from: d */
    public double mo3218d() {
        return this.f2522d != null ? this.f2522d.getDouble() : super.mo3218d();
    }

    /* renamed from: e */
    public int mo2326e() {
        return this.f2523e;
    }

    /* renamed from: g */
    public boolean mo3088g() {
        return this.f2521c == 3;
    }

    /* renamed from: h */
    public String mo3219h() {
        return this.f2520b;
    }

    /* renamed from: i */
    public boolean mo3220i() {
        return this.f2522d != null ? this.f2522d.getBoolean() : super.mo3220i();
    }

    /* renamed from: j */
    public int mo3221j() {
        return this.f2522d != null ? this.f2522d.getInt() : super.mo3221j();
    }

    public final void setReturnValue(double d) {
        this.f2522d = C0611a.m2304a(d);
    }

    public final void setReturnValue(int i) {
        this.f2522d = C0611a.m2308b(i);
    }

    public final void setReturnValue(long j) {
        this.f2522d = C0611a.m2303a(j);
    }

    public final void setReturnValue(WDObjet wDObjet) {
        this.f2522d = wDObjet;
    }

    public final void setReturnValue(String str) {
        this.f2522d = C0611a.m2300a(str);
    }

    public final void setReturnValue(boolean z) {
        this.f2522d = C0611a.m2298a(z);
    }
}
