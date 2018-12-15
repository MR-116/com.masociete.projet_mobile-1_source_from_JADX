package fr.pcsoft.wdjava.contact.data;

import android.database.Cursor;
import fr.pcsoft.wdjava.contact.WDContact;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.p042b.C0657a;
import fr.pcsoft.wdjava.core.poo.p038a.C0584d;

/* renamed from: fr.pcsoft.wdjava.contact.data.n */
public class C0587n extends C0584d<WDContact, WDContactAdresseSIP> {
    /* renamed from: z */
    private static final String[] f1370z = new String[]{C0587n.m2084z(C0587n.m2085z("\u0005`-")), C0587n.m2084z(C0587n.m2085z(">h=yt")), C0587n.m2084z(C0587n.m2085z(">h=yv")), C0587n.m2084z(C0587n.m2085z(">h=yu")), C0587n.m2084z(C0587n.m2085z(",g-6&4m;w.>'*m5)f;6..l$743y\u0016y#>{,k4"))};

    public C0587n(WDContact wDContact) {
        super(wDContact);
    }

    /* renamed from: z */
    private static String m2084z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 90;
                    break;
                case 1:
                    i2 = 9;
                    break;
                case 2:
                    i2 = 73;
                    break;
                case 3:
                    i2 = 24;
                    break;
                default:
                    i2 = 71;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2085z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 71);
        }
        return toCharArray;
    }

    /* renamed from: a */
    protected Cursor m2086a(WDContact wDContact) {
        if (!WDProjet.getInstance().isVersionCompatible(C0657a.GINGERBREAD.getNumero())) {
            return null;
        }
        return WDContact.m1807a(wDContact, f1370z[4], f1370z[0], f1370z[2], f1370z[1], f1370z[3]);
    }

    /* renamed from: a */
    public WDObjet mo2485a() {
        return new WDContactAdresseSIP();
    }

    /* renamed from: c */
    protected WDContactAdresseSIP m2090c(Cursor cursor) {
        return new WDContactAdresseSIP(cursor);
    }

    /* renamed from: d */
    public int mo2487d() {
        return C0607n.yo;
    }

    /* renamed from: g */
    public Class<WDContactAdresseSIP> mo2482g() {
        return WDContactAdresseSIP.class;
    }
}
