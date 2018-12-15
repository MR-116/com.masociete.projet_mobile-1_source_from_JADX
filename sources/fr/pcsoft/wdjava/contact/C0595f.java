package fr.pcsoft.wdjava.contact;

import android.content.Intent;
import android.net.Uri;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.utils.ic;
import fr.pcsoft.wdjava.ui.activite.C1056i;

/* renamed from: fr.pcsoft.wdjava.contact.f */
public class C0595f {
    /* renamed from: z */
    private static final String[] f1378z = new String[]{C0595f.m2152z(C0595f.m2153z("BLfl.4[ks$%@ra(.G`(5")), C0595f.m2152z(C0595f.m2153z("\u0000gPL\u0004\bm\u001aW\u0005\u0015lZJE\u0000j@W\u0004\u000f'bw.6"))};

    /* renamed from: a */
    protected static final long m2149a(Uri uri, boolean z) throws C0606q {
        ic c0605p = new C0605p(z, uri, C1056i.m7562a());
        try {
            c0605p.m1785a(0, "", 0);
            Long l = (Long) c0605p.m1792d();
            if (l == null) {
                return -1;
            }
            try {
                return l.longValue();
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw new C0606q(e2.getMessage());
        }
    }

    /* renamed from: a */
    protected static final boolean m2150a(Uri uri) throws C0606q {
        ic c0604o = new C0604o(uri, C1056i.m7562a());
        try {
            c0604o.m1785a(0, "", 0);
            return ((Boolean) c0604o.m1792d()).booleanValue();
        } catch (Exception e) {
            throw new C0606q(C0745b.m3222b(f1378z[0], new String[0]), e.getMessage());
        }
    }

    /* renamed from: b */
    protected static final void m2151b(Uri uri) throws C0606q {
        C1056i.m7562a().startActivity(new Intent(f1378z[1], uri));
    }

    /* renamed from: z */
    private static String m2152z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 97;
                    break;
                case 1:
                    i2 = 9;
                    break;
                case 2:
                    i2 = 52;
                    break;
                case 3:
                    i2 = 62;
                    break;
                default:
                    i2 = 107;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2153z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 107);
        }
        return toCharArray;
    }
}
