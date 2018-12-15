package fr.pcsoft.wdjava.contact.data;

import android.content.ContentProviderOperation.Builder;
import android.database.Cursor;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.poo.p038a.C0569c;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.database.p048a.C0830a;

/* renamed from: fr.pcsoft.wdjava.contact.data.k */
public abstract class C0571k extends C0570j {
    /* renamed from: z */
    private static final String[] f1315z = new String[]{C0571k.m1891z(C0571k.m1892z("8\u00196ZO")), C0571k.m1891z(C0571k.m1892z("8\u00196ZN"))};
    /* renamed from: d */
    protected String f1316d = "";
    /* renamed from: e */
    protected int f1317e = 0;

    public C0571k(Cursor cursor) {
        super(cursor);
        this.f1317e = mo2462a(C0830a.m4262d(cursor, f1315z[0]));
        this.f1316d = C0830a.m4260b(cursor, f1315z[1]);
    }

    /* renamed from: a */
    private final void m1889a(String str) {
        if (!this.f1316d.equals(str)) {
            this.f1316d = str;
            this.c = this.b >= 0;
        }
    }

    /* renamed from: g */
    private final String m1890g() {
        return this.f1316d;
    }

    /* renamed from: z */
    private static String m1891z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 92;
                    break;
                case 1:
                    i2 = C0607n.co;
                    break;
                case 2:
                    i2 = 66;
                    break;
                case 3:
                    i2 = 59;
                    break;
                default:
                    i2 = 125;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1892z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 125);
        }
        return toCharArray;
    }

    /* renamed from: a */
    protected abstract int mo2462a(int i);

    /* renamed from: a */
    public Builder mo2459a() {
        return super.mo2459a().withValue(f1315z[0], Integer.valueOf(this.f1317e)).withValue(f1315z[1], this.f1316d);
    }

    /* renamed from: a */
    public Builder mo2460a(long j) {
        return super.mo2460a(j).withValue(f1315z[0], Integer.valueOf(this.f1317e)).withValue(f1315z[1], this.f1316d);
    }

    /* renamed from: a */
    protected void m1896a(C0571k c0571k) {
        super.m1878a((C0569c) c0571k);
        this.f1317e = mo2462a(c0571k.f1317e);
        this.f1316d = c0571k.f1316d;
    }

    public WDObjet getProp(EWDPropriete eWDPropriete) {
        switch (C0576e.f1359a[eWDPropriete.ordinal()]) {
            case 1:
                return new WDChaine(m1890g());
            case 2:
                return new WDChaine(getType());
            default:
                return super.getProp(eWDPropriete);
        }
    }

    public WDObjet getType() {
        return new WDEntier4(this.f1317e);
    }

    public void razVariable() {
        super.razVariable();
        this.f1317e = 0;
        this.f1316d = "";
    }

    public void release() {
        this.f1316d = null;
    }

    public void setProp(EWDPropriete eWDPropriete, int i) {
        switch (C0576e.f1359a[eWDPropriete.ordinal()]) {
            case 2:
                setType(i);
                return;
            default:
                super.setProp(eWDPropriete, i);
                return;
        }
    }

    public void setProp(EWDPropriete eWDPropriete, WDObjet wDObjet) {
        switch (C0576e.f1359a[eWDPropriete.ordinal()]) {
            case 1:
                m1889a(wDObjet.getString());
                return;
            case 2:
                setType(wDObjet.getInt());
                return;
            default:
                super.setProp(eWDPropriete, wDObjet);
                return;
        }
    }

    public void setProp(EWDPropriete eWDPropriete, String str) {
        switch (C0576e.f1359a[eWDPropriete.ordinal()]) {
            case 1:
                m1889a(str);
                return;
            default:
                super.setProp(eWDPropriete, str);
                return;
        }
    }

    public void setType(int i) {
        if (this.f1317e != i) {
            this.f1317e = i;
            this.c = this.b >= 0;
        }
    }
}
