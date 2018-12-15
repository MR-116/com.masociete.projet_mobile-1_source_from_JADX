package fr.pcsoft.wdjava.contact.data;

import android.database.Cursor;
import fr.pcsoft.wdjava.contact.WDContact;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.poo.p038a.C0584d;

/* renamed from: fr.pcsoft.wdjava.contact.data.o */
public class C0588o extends C0584d<WDContact, WDContactAdresseWeb> {
    /* renamed from: z */
    private static final String[] f1371z = new String[]{C0588o.m2093z(C0588o.m2094z("b8u\n\t")), C0588o.m2093z(C0588o.m2094z("b8u\n\n")), C0588o.m2093z(C0588o.m2094z("Y0e")), C0588o.m2093z(C0588o.m2094z("b8u\n\b")), C0588o.m2093z(C0588o.m2094z("p7eEZh=s\u0004Rbwb\u001eIu6sERr<lDLc;r\u0002Oc"))};

    public C0588o(WDContact wDContact) {
        super(wDContact);
    }

    /* renamed from: z */
    private static String m2093z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 6;
                    break;
                case 1:
                    i2 = 89;
                    break;
                case 2:
                    i2 = 1;
                    break;
                case 3:
                    i2 = 107;
                    break;
                default:
                    i2 = 59;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2094z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 59);
        }
        return toCharArray;
    }

    /* renamed from: a */
    protected Cursor m2095a(WDContact wDContact) {
        return WDContact.m1807a(wDContact, f1371z[4], f1371z[2], f1371z[1], f1371z[3], f1371z[0]);
    }

    /* renamed from: a */
    public WDObjet mo2485a() {
        return new WDContactAdresseWeb();
    }

    /* renamed from: c */
    protected WDContactAdresseWeb m2099c(Cursor cursor) {
        return new WDContactAdresseWeb(cursor);
    }

    /* renamed from: d */
    public int mo2487d() {
        return C0607n.Mw;
    }

    /* renamed from: g */
    public Class<WDContactAdresseWeb> mo2482g() {
        return WDContactAdresseWeb.class;
    }
}
