package fr.pcsoft.wdjava.core.erreur;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;

public class WDErreurNonFatale extends Error {
    /* renamed from: a */
    private WDObjet f1759a;
    /* renamed from: b */
    private String f1760b;
    /* renamed from: c */
    private boolean f1761c;
    /* renamed from: d */
    private int f1762d;
    /* renamed from: e */
    private String f1763e;
    /* renamed from: f */
    public int f1764f;
    /* renamed from: g */
    private String f1765g;

    public WDErreurNonFatale(String str, String str2) {
        super(str);
        this.f1760b = "";
        this.f1763e = null;
        this.f1765g = null;
        this.f1761c = false;
        this.f1759a = null;
        this.f1762d = 0;
        this.f1764f = 0;
        this.f1760b = str2;
    }

    public WDErreurNonFatale(String str, String str2, int i) {
        super(str);
        this.f1760b = "";
        this.f1763e = null;
        this.f1765g = null;
        this.f1761c = false;
        this.f1759a = null;
        this.f1762d = 0;
        this.f1764f = 0;
        this.f1760b = str2;
        this.f1762d = i;
    }

    public WDErreurNonFatale(String str, String str2, String str3) {
        this(str, str2);
        this.f1763e = str3;
    }

    public WDErreurNonFatale(String str, String str2, String str3, int i) {
        this(str, str2);
        this.f1763e = str3;
        this.f1762d = i;
    }

    public WDErreurNonFatale(String str, String str2, String str3, int i, String str4) {
        this(str, str2);
        this.f1763e = str3;
        this.f1762d = i;
        this.f1765g = str4;
    }

    public WDErreurNonFatale(String str, String str2, String str3, boolean z) {
        this(str, str2, str3);
        this.f1761c = z;
    }

    /* renamed from: a */
    public final String m2891a() {
        return this.f1765g;
    }

    /* renamed from: a */
    public final void m2892a(int i) {
        this.f1764f = i;
    }

    /* renamed from: a */
    public void m2893a(WDObjet wDObjet) {
        this.f1759a = wDObjet;
    }

    /* renamed from: b */
    public final String m2894b() {
        return !this.f1760b.equals("") ? C0745b.m3221b(this.f1760b) : "";
    }

    /* renamed from: c */
    public final String m2895c() {
        return this.f1763e != null ? this.f1763e : "";
    }

    /* renamed from: d */
    public final boolean m2896d() {
        return this.f1761c;
    }

    /* renamed from: e */
    public final int m2897e() {
        return this.f1762d;
    }

    /* renamed from: f */
    public final int m2898f() {
        return this.f1764f;
    }

    public WDObjet getValeurRetour() {
        if (this.f1764f <= 0) {
            return this.f1759a;
        }
        this.f1764f--;
        throw this;
    }
}
