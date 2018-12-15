package fr.pcsoft.wdjava.contact.data;

import android.database.Cursor;
import fr.pcsoft.wdjava.contact.WDContact;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.poo.p038a.C0584d;

/* renamed from: fr.pcsoft.wdjava.contact.data.p */
public class C0589p extends C0584d<WDContact, WDContactEmploi> {
    /* renamed from: z */
    private static final String[] f1372z = new String[]{C0589p.m2102z(C0589p.m2103z(">Ju)x")), C0589p.m2102z(C0589p.m2103z(">Ju)~")), C0589p.m2102z(C0589p.m2103z(">Ju)t")), C0589p.m2102z(C0589p.m2103z("\u0005Be")), C0589p.m2102z(C0589p.m2103z(">Ju){")), C0589p.m2102z(C0589p.m2103z(">Ju)|")), C0589p.m2102z(C0589p.m2103z(">Ju)y")), C0589p.m2102z(C0589p.m2103z(",Eef,4Os'$>\u0005b=?)Dsf$.Nlg\"(L`&$ Ju!\"4")), C0589p.m2102z(C0589p.m2103z(">Ju)"))};

    public C0589p(WDContact wDContact) {
        super(wDContact);
    }

    /* renamed from: z */
    private static String m2102z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 90;
                    break;
                case 1:
                    i2 = 43;
                    break;
                case 2:
                    i2 = 1;
                    break;
                case 3:
                    i2 = 72;
                    break;
                default:
                    i2 = 77;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2103z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 77);
        }
        return toCharArray;
    }

    /* renamed from: a */
    protected Cursor m2104a(WDContact wDContact) {
        return WDContact.m1807a(wDContact, f1372z[7], f1372z[3], f1372z[5], f1372z[2], f1372z[6], f1372z[0], f1372z[4], f1372z[1], f1372z[8]);
    }

    /* renamed from: a */
    public WDObjet mo2485a() {
        return new WDContactEmploi();
    }

    /* renamed from: c */
    protected WDContactEmploi m2108c(Cursor cursor) {
        return new WDContactEmploi(cursor);
    }

    /* renamed from: d */
    public int mo2487d() {
        return C0607n.Hx;
    }

    /* renamed from: g */
    public Class<WDContactEmploi> mo2482g() {
        return WDContactEmploi.class;
    }
}
