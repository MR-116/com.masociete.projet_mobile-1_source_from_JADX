package fr.pcsoft.wdjava.core.poo.p038a;

import android.content.ContentProviderOperation.Builder;
import android.database.Cursor;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.poo.C0560r;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.database.p048a.C0830a;

/* renamed from: fr.pcsoft.wdjava.core.poo.a.c */
public abstract class C0569c<T extends C0561b> extends C0560r {
    /* renamed from: z */
    private static final String[] f1311z = new String[]{C0569c.m1874z(C0569c.m1875z("^\u0002\u00195\u001c<\u0000\u0013?\u0018")), C0569c.m1874z(C0569c.m1875z("\"%2"))};
    /* renamed from: b */
    protected long f1312b = -1;
    /* renamed from: c */
    protected boolean f1313c = false;

    public C0569c(Cursor cursor) {
        this.f1312b = C0830a.m4261c(cursor, f1311z[1]);
    }

    /* renamed from: z */
    private static String m1874z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 125;
                    break;
                case 1:
                    i2 = 76;
                    break;
                case 2:
                    i2 = 86;
                    break;
                case 3:
                    i2 = 106;
                    break;
                default:
                    i2 = 74;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1875z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 74);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public abstract Builder mo2459a();

    /* renamed from: a */
    public abstract Builder mo2460a(long j);

    /* renamed from: a */
    protected void m1878a(C0569c c0569c) {
        this.f1313c = this.f1312b >= 0;
    }

    /* renamed from: b */
    public final long m1879b() {
        return this.f1312b;
    }

    /* renamed from: c */
    public abstract Builder mo2461c();

    /* renamed from: d */
    public final boolean m1881d() {
        return this.f1313c;
    }

    /* renamed from: e */
    public final void m1882e() {
        this.f1312b = -1;
        this.f1313c = false;
    }

    public WDObjet getClone() {
        C0569c c0569c = (C0569c) super.getClone();
        c0569c.f1312b = -1;
        c0569c.f1313c = false;
        return c0569c;
    }

    public WDObjet getValeur() {
        WDErreurManager.m2883a(C0745b.m3222b(f1311z[0], getNomType()));
        return null;
    }

    public boolean isEvaluable() {
        return false;
    }

    public void razVariable() {
        m1882e();
    }
}
