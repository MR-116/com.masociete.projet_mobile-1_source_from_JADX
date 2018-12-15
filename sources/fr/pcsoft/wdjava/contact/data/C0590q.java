package fr.pcsoft.wdjava.contact.data;

import android.database.Cursor;
import fr.pcsoft.wdjava.contact.WDContact;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.poo.p038a.C0584d;

/* renamed from: fr.pcsoft.wdjava.contact.data.q */
public class C0590q extends C0584d<WDContact, WDContactEvenement> {
    /* renamed from: z */
    private static final String[] f1373z = new String[]{C0590q.m2111z(C0590q.m2112z("c\u0003b@\u0014")), C0590q.m2111z(C0590q.m2112z("X\u000br")), C0590q.m2111z(C0590q.m2112z("c\u0003b@\u0016")), C0590q.m2111z(C0590q.m2112z("q\fr\u000fFi\u0006dNNcLuTUt\rd\u000fNs\u0007{\u000eDh\fb@Ds=sWBi\u0016")), C0590q.m2111z(C0590q.m2112z("c\u0003b@\u0015"))};

    public C0590q(WDContact wDContact) {
        super(wDContact);
    }

    /* renamed from: z */
    private static String m2111z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 7;
                    break;
                case 1:
                    i2 = 98;
                    break;
                case 2:
                    i2 = 22;
                    break;
                case 3:
                    i2 = 33;
                    break;
                default:
                    i2 = 39;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2112z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 39);
        }
        return toCharArray;
    }

    /* renamed from: a */
    protected Cursor m2113a(WDContact wDContact) {
        return WDContact.m1807a(wDContact, f1373z[3], f1373z[1], f1373z[2], f1373z[0], f1373z[4]);
    }

    /* renamed from: a */
    public WDObjet mo2485a() {
        return new WDContactEvenement();
    }

    /* renamed from: c */
    protected WDContactEvenement m2117c(Cursor cursor) {
        return new WDContactEvenement(cursor);
    }

    /* renamed from: d */
    public int mo2487d() {
        return C0607n.So;
    }

    /* renamed from: g */
    public Class<WDContactEvenement> mo2482g() {
        return WDContactEvenement.class;
    }
}
