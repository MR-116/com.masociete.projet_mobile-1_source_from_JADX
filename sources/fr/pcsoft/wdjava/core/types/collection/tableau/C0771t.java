package fr.pcsoft.wdjava.core.types.collection.tableau;

import fr.pcsoft.wdjava.core.WDCallback;
import java.util.Comparator;

/* renamed from: fr.pcsoft.wdjava.core.types.collection.tableau.t */
class C0771t implements Comparator {
    /* renamed from: z */
    private static final String f2012z = C0771t.m3552z(C0771t.m3553z("(P1P\u000b_E!U\u0011JQ<Z\u0015GH!X\u0017@[0X\u001aX[1\\\u0000DQ1"));
    /* renamed from: a */
    private final WDCallback f2013a;

    public C0771t(WDCallback wDCallback) {
        this.f2013a = wDCallback;
    }

    /* renamed from: z */
    private static String m3552z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 11;
                    break;
                case 1:
                    i2 = 4;
                    break;
                case 2:
                    i2 = 99;
                    break;
                case 3:
                    i2 = 25;
                    break;
                default:
                    i2 = 84;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m3553z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 84);
        }
        return toCharArray;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compare(java.lang.Object r6, java.lang.Object r7) {
        /*
        r5 = this;
        r0 = 0;
        r6 = (fr.pcsoft.wdjava.core.WDObjet) r6;
        r7 = (fr.pcsoft.wdjava.core.WDObjet) r7;
        r1 = r5.f2013a;	 Catch:{ Exception -> 0x002e }
        r2 = 1;
        r3 = 2;
        r3 = new fr.pcsoft.wdjava.core.WDObjet[r3];	 Catch:{ Exception -> 0x002e }
        r4 = 0;
        r3[r4] = r6;	 Catch:{ Exception -> 0x002e }
        r4 = 1;
        r3[r4] = r7;	 Catch:{ Exception -> 0x002e }
        r0 = r1.execute(r2, r3);	 Catch:{ Exception -> 0x002e }
        if (r0 == 0) goto L_0x001b;
    L_0x0017:
        r1 = r0 instanceof fr.pcsoft.wdjava.core.types.WDVoid;	 Catch:{ Exception -> 0x002c }
        if (r1 == 0) goto L_0x0027;
    L_0x001b:
        r1 = f2012z;	 Catch:{ Exception -> 0x002c }
        r2 = 0;
        r2 = new java.lang.String[r2];	 Catch:{ Exception -> 0x002c }
        r1 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r1, r2);	 Catch:{ Exception -> 0x002c }
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2883a(r1);	 Catch:{ Exception -> 0x002c }
    L_0x0027:
        r0 = r0.getInt();
    L_0x002b:
        return r0;
    L_0x002c:
        r0 = move-exception;
        throw r0;
    L_0x002e:
        r1 = move-exception;
        goto L_0x002b;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.core.types.collection.tableau.t.compare(java.lang.Object, java.lang.Object):int");
    }
}
