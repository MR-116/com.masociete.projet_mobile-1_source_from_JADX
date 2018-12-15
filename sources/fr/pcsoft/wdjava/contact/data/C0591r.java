package fr.pcsoft.wdjava.contact.data;

import android.database.Cursor;
import fr.pcsoft.wdjava.contact.WDContact;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.poo.p038a.C0584d;

/* renamed from: fr.pcsoft.wdjava.contact.data.r */
public class C0591r extends C0584d<WDContact, WDContactMessagerieInstantanee> {
    /* renamed from: z */
    private static final String[] f1374z = new String[]{C0591r.m2120z(C0591r.m2121z("W\u0003`")), C0591r.m2120z(C0591r.m2121z("l\u000bpH\u0002")), C0591r.m2120z(C0591r.m2121z("l\u000bpH\u0001")), C0591r.m2120z(C0591r.m2121z("l\u000bpH\u0005")), C0591r.m2120z(C0591r.m2121z("~\u0004`\u0007Qf\u000evFYlDg\\B{\u0005v\u0007Y|\u000fi\u0006Ye")), C0591r.m2120z(C0591r.m2121z("l\u000bpH\u0003"))};

    public C0591r(WDContact wDContact) {
        super(wDContact);
    }

    /* renamed from: z */
    private static String m2120z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 8;
                    break;
                case 1:
                    i2 = 106;
                    break;
                case 2:
                    i2 = 4;
                    break;
                case 3:
                    i2 = 41;
                    break;
                default:
                    i2 = 48;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2121z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 48);
        }
        return toCharArray;
    }

    /* renamed from: a */
    protected Cursor m2122a(WDContact wDContact) {
        return WDContact.m1807a(wDContact, f1374z[4], f1374z[0], f1374z[2], f1374z[3], f1374z[5], f1374z[1]);
    }

    /* renamed from: a */
    public WDObjet mo2485a() {
        return new WDContactMessagerieInstantanee();
    }

    /* renamed from: c */
    protected WDContactMessagerieInstantanee m2126c(Cursor cursor) {
        return new WDContactMessagerieInstantanee(cursor);
    }

    /* renamed from: d */
    public int mo2487d() {
        return C0607n.bn;
    }

    /* renamed from: g */
    public Class<WDContactMessagerieInstantanee> mo2482g() {
        return WDContactMessagerieInstantanee.class;
    }
}
