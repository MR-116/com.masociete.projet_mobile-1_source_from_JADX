package fr.pcsoft.wdjava.contact.data;

import android.content.ContentProviderOperation.Builder;
import android.database.Cursor;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.poo.p038a.C0569c;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.database.p048a.C0830a;

public class WDContactNote extends C0570j {
    /* renamed from: d */
    public static final EWDPropriete[] f1349d = new EWDPropriete[0];
    /* renamed from: z */
    private static final String[] f1350z = new String[]{m1995z(m1996z("\u001f\u001f]\u0017[")), m1995z(m1996z("\r\u0010MX\u000b\u0015\u001a[\u0019\u0003\u001fPJ\u0003\u0018\b\u0011[X\u0003\u000f\u001bDY\u0004\u0014\nL"))};
    /* renamed from: e */
    private String f1351e = "";

    public WDContactNote(Cursor cursor) {
        super(cursor);
        this.f1351e = C0830a.m4260b(cursor, f1350z[0]);
    }

    /* renamed from: z */
    private static String m1995z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 123;
                    break;
                case 1:
                    i2 = 126;
                    break;
                case 2:
                    i2 = 41;
                    break;
                case 3:
                    i2 = 118;
                    break;
                default:
                    i2 = 106;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1996z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 106);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public Builder mo2459a() {
        return super.mo2459a().withValue(f1350z[0], this.f1351e);
    }

    /* renamed from: a */
    public Builder mo2460a(long j) {
        return super.mo2460a(j).withValue(f1350z[0], this.f1351e);
    }

    /* renamed from: a */
    protected final void m1999a(WDContactNote wDContactNote) {
        super.m1878a((C0569c) wDContactNote);
        this.f1351e = wDContactNote.f1351e;
    }

    /* renamed from: f */
    protected String mo2463f() {
        return f1350z[1];
    }

    public String getNomType() {
        return "";
    }

    public WDObjet getValeur() {
        return new WDChaine(this.f1351e);
    }

    public boolean isEvaluable() {
        return true;
    }

    /* renamed from: k */
    public EWDPropriete[] mo2439k() {
        return f1349d;
    }

    /* renamed from: l */
    protected int mo2440l() {
        return C0607n.Jj;
    }

    public void razVariable() {
        super.razVariable();
        this.f1351e = "";
    }

    public void release() {
        this.f1351e = null;
    }

    public void setValeur(WDObjet wDObjet) {
        this.f1351e = wDObjet.getString();
    }
}
