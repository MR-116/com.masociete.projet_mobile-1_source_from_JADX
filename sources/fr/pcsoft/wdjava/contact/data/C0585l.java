package fr.pcsoft.wdjava.contact.data;

import android.database.Cursor;
import fr.pcsoft.wdjava.contact.WDContact;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.poo.p038a.C0584d;

/* renamed from: fr.pcsoft.wdjava.contact.data.l */
public class C0585l extends C0584d<WDContact, WDContactAdresseEmail> {
    /* renamed from: z */
    private static final String[] f1368z = new String[]{C0585l.m2065z(C0585l.m2066z("vV\u001a9")), C0585l.m2065z(C0585l.m2066z("MwF")), C0585l.m2065z(C0585l.m2066z("dpFUi|zP\u0014av0A\u000ezaqPUaf{OTmK\u0017Wd,")), C0585l.m2065z(C0585l.m2066z("vV\u001a:")), C0585l.m2065z(C0585l.m2066z("vV\u001a;"))};

    public C0585l(WDContact wDContact) {
        super(wDContact);
    }

    /* renamed from: z */
    private static String m2065z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 18;
                    break;
                case 1:
                    i2 = 30;
                    break;
                case 2:
                    i2 = 34;
                    break;
                case 3:
                    i2 = 123;
                    break;
                default:
                    i2 = 8;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2066z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 8);
        }
        return toCharArray;
    }

    /* renamed from: a */
    protected Cursor m2067a(WDContact wDContact) {
        return WDContact.m1807a(wDContact, f1368z[2], f1368z[1], f1368z[0], f1368z[4], f1368z[3]);
    }

    /* renamed from: a */
    public WDObjet mo2485a() {
        return new WDContactAdresseEmail();
    }

    /* renamed from: c */
    protected WDContactAdresseEmail m2071c(Cursor cursor) {
        return new WDContactAdresseEmail(cursor);
    }

    /* renamed from: d */
    public int mo2487d() {
        return C0607n.Jx;
    }

    /* renamed from: g */
    public Class<WDContactAdresseEmail> mo2482g() {
        return WDContactAdresseEmail.class;
    }
}
