package fr.pcsoft.wdjava.contact.data;

import android.database.Cursor;
import fr.pcsoft.wdjava.contact.WDContact;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.poo.p038a.C0584d;

/* renamed from: fr.pcsoft.wdjava.contact.data.t */
public class C0593t extends C0584d<WDContact, WDContactTelephone> {
    /* renamed from: z */
    private static final String[] f1376z = new String[]{C0593t.m2140z(C0593t.m2141z("\u0019\u0005\u0007")), C0593t.m2140z(C0593t.m2141z("\"\r\u0017/*")), C0593t.m2140z(C0593t.m2141z("0\u0002\u0007`z(\b\u0011!r\"B\u0000;i5\u0003\u0011`r2\t\u000eak.\u0003\r+D0^")), C0593t.m2140z(C0593t.m2141z("\"\r\u0017/)")), C0593t.m2140z(C0593t.m2141z("\"\r\u0017/("))};

    public C0593t(WDContact wDContact) {
        super(wDContact);
    }

    /* renamed from: z */
    private static String m2140z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 70;
                    break;
                case 1:
                    i2 = 108;
                    break;
                case 2:
                    i2 = 99;
                    break;
                case 3:
                    i2 = 78;
                    break;
                default:
                    i2 = 27;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2141z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 27);
        }
        return toCharArray;
    }

    /* renamed from: a */
    protected Cursor m2142a(WDContact wDContact) {
        return WDContact.m1807a(wDContact, f1376z[2], f1376z[0], f1376z[1], f1376z[4], f1376z[3]);
    }

    /* renamed from: a */
    public WDObjet mo2485a() {
        return new WDContactTelephone();
    }

    /* renamed from: c */
    protected WDContactTelephone m2146c(Cursor cursor) {
        return new WDContactTelephone(cursor);
    }

    /* renamed from: d */
    public int mo2487d() {
        return C0607n.Nc;
    }

    /* renamed from: g */
    public Class<WDContactTelephone> mo2482g() {
        return WDContactTelephone.class;
    }
}
