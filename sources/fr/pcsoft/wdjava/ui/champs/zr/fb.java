package fr.pcsoft.wdjava.ui.champs.zr;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.utils.C0800d;
import java.util.Comparator;

class fb implements Comparator {
    /* renamed from: a */
    private int f3868a = 0;
    /* renamed from: b */
    private int[] f3869b = null;
    /* renamed from: c */
    private boolean f3870c = true;
    /* renamed from: d */
    private boolean f3871d = false;
    /* renamed from: e */
    private int f3872e = 0;
    final C1311t this$0;

    public fb(C1311t c1311t, int[] iArr) {
        boolean z = false;
        this.this$0 = c1311t;
        this.f3869b = iArr;
        this.f3868a = 0;
        this.f3872e = this.f3869b[this.f3868a];
        if (this.f3872e >= 0) {
            z = true;
        }
        this.f3870c = z;
        this.f3872e = Math.abs(this.f3872e);
        if ((this.f3872e & 4096) > 0) {
            this.f3871d = true;
            this.f3872e &= -4097;
        }
    }

    public int compare(Object obj, Object obj2) {
        int i;
        boolean z = true;
        boolean z2 = true;
        ec ecVar = (ec) obj2;
        WDObjet b = ((ec) obj).m9107b(this.f3872e - 1);
        WDObjet b2 = ecVar.m9107b(this.f3872e - 1);
        if (b == null && b2 == null) {
            i = 0;
        } else if (b == null) {
            return this.f3870c ? -1 : 1;
        } else {
            if (b2 == null) {
                if (!this.f3870c) {
                    z2 = true;
                }
                return z2;
            } else if (this.f3871d) {
                double d = b.getDouble();
                double d2 = b2.getDouble();
                if (C0800d.m3856a(d, d2)) {
                    i = 0;
                } else if (d2 - d > 0.0d) {
                    if (!this.f3870c) {
                        z = true;
                    }
                    return z;
                } else {
                    if (!this.f3870c) {
                        z2 = true;
                    }
                    return z2;
                }
            } else {
                i = this.f3870c ? b.getString().compareToIgnoreCase(b2.getString()) : b2.getString().compareToIgnoreCase(b.getString());
            }
        }
        if (i != 0 || this.f3868a >= this.f3869b.length - 1) {
            return i;
        }
        boolean z3 = this.f3870c;
        z = this.f3871d;
        int i2 = this.f3868a;
        int i3 = this.f3872e;
        this.f3868a++;
        this.f3872e = this.f3869b[this.f3868a];
        this.f3870c = this.f3872e >= 0;
        this.f3872e = Math.abs(this.f3872e);
        if ((this.f3872e & 4096) > 0) {
            this.f3871d = true;
            this.f3872e &= -4097;
        } else {
            this.f3871d = false;
        }
        i = compare(obj, obj2);
        this.f3870c = z3;
        this.f3868a = i2;
        this.f3871d = z;
        this.f3872e = i3;
        return i;
    }
}
