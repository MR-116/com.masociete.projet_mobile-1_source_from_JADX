package fr.pcsoft.wdjava.core.p035c;

import fr.pcsoft.wdjava.core.WDObjet;

/* renamed from: fr.pcsoft.wdjava.core.c.d */
public abstract class C0539d extends Exception {
    /* renamed from: a */
    private String f1096a;

    public C0539d(String str) {
        if (str == null) {
            str = "";
        }
        super(str);
        this.f1096a = null;
    }

    public C0539d(String str, String str2) {
        super(str);
        this.f1096a = null;
        this.f1096a = str2;
    }

    /* renamed from: a */
    public long mo3215a() {
        return 0;
    }

    /* renamed from: b */
    public WDObjet mo3216b() {
        return null;
    }

    /* renamed from: c */
    public String mo3217c() {
        return "";
    }

    /* renamed from: d */
    public double mo3218d() {
        return 0.0d;
    }

    /* renamed from: e */
    public int mo2326e() {
        return 0;
    }

    /* renamed from: f */
    public String m1561f() {
        return this.f1096a != null ? this.f1096a : "";
    }

    /* renamed from: g */
    public boolean mo3088g() {
        return false;
    }

    /* renamed from: h */
    public String mo3219h() {
        return "";
    }

    /* renamed from: i */
    public boolean mo3220i() {
        return false;
    }

    /* renamed from: j */
    public int mo3221j() {
        return 0;
    }
}
