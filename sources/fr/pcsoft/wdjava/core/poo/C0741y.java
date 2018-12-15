package fr.pcsoft.wdjava.core.poo;

import fr.pcsoft.wdjava.core.C0550t;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.jni.WDJNIException;
import fr.pcsoft.wdjava.jni.WDJNIHelper;

/* renamed from: fr.pcsoft.wdjava.core.poo.y */
class C0741y extends C0550t {
    /* renamed from: z */
    private static final String[] f1883z = new String[]{C0741y.m3194z(C0741y.m3195z("q&\u001bk0\r6\u000bu:")), C0741y.m3194z(C0741y.m3195z("q1\ru#\u0017 \u0011r:\u001c-\u000bv%\u001d!\u0011r7\u001e7"))};
    /* renamed from: a */
    private WDObjet f1884a;
    final C0738u this$1;
    final String val$strName;

    C0741y(C0738u c0738u, String str) {
        this.this$1 = c0738u;
        this.val$strName = str;
    }

    /* renamed from: z */
    private static String m3194z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 82;
                    break;
                case 1:
                    i2 = 114;
                    break;
                case 2:
                    i2 = 66;
                    break;
                case 3:
                    i2 = 59;
                    break;
                default:
                    i2 = 117;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m3195z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 117);
        }
        return toCharArray;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public fr.pcsoft.wdjava.core.WDObjet getRefProxy() {
        /*
        r5 = this;
        r0 = r5.this$1;	 Catch:{ WDJNIException -> 0x0036 }
        r0 = fr.pcsoft.wdjava.core.poo.C0738u.access$000(r0);	 Catch:{ WDJNIException -> 0x0036 }
        switch(r0) {
            case 2: goto L_0x003c;
            case 3: goto L_0x0067;
            case 4: goto L_0x0092;
            case 5: goto L_0x00be;
            case 6: goto L_0x00ea;
            case 7: goto L_0x0116;
            default: goto L_0x0009;
        };	 Catch:{ WDJNIException -> 0x0036 }
    L_0x0009:
        r0 = r5.this$1;	 Catch:{ WDJNIException -> 0x0036 }
        r0 = r0.this$0;	 Catch:{ WDJNIException -> 0x0036 }
        r0 = r0.f1871b;	 Catch:{ WDJNIException -> 0x0036 }
        r2 = r5.this$1;	 Catch:{ WDJNIException -> 0x0036 }
        r2 = r2.mo3261l();	 Catch:{ WDJNIException -> 0x0036 }
        r3 = r5.this$1;	 Catch:{ WDJNIException -> 0x0036 }
        r3 = r3.mo3260k();	 Catch:{ WDJNIException -> 0x0036 }
        r4 = r5.val$strName;	 Catch:{ WDJNIException -> 0x0036 }
        r0 = fr.pcsoft.wdjava.jni.WDJNIHelper.m6573a(r0, r2, r3, r4);	 Catch:{ WDJNIException -> 0x0036 }
        r1 = r5.f1884a;	 Catch:{ WDJNIException -> 0x0034 }
        if (r1 != 0) goto L_0x002c;
    L_0x0025:
        r1 = new fr.pcsoft.wdjava.core.types.WDChaine;	 Catch:{ WDJNIException -> 0x0034 }
        r1.<init>();	 Catch:{ WDJNIException -> 0x0034 }
        r5.f1884a = r1;	 Catch:{ WDJNIException -> 0x0034 }
    L_0x002c:
        r1 = r5.f1884a;	 Catch:{ WDJNIException -> 0x0036 }
        r1.setValeur(r0);	 Catch:{ WDJNIException -> 0x0036 }
    L_0x0031:
        r0 = r5.f1884a;
    L_0x0033:
        return r0;
    L_0x0034:
        r0 = move-exception;
        throw r0;	 Catch:{ WDJNIException -> 0x0036 }
    L_0x0036:
        r0 = move-exception;
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2888b(r0);
        r0 = 0;
        goto L_0x0033;
    L_0x003c:
        r0 = r5.this$1;	 Catch:{ WDJNIException -> 0x0036 }
        r0 = r0.this$0;	 Catch:{ WDJNIException -> 0x0036 }
        r0 = r0.f1871b;	 Catch:{ WDJNIException -> 0x0036 }
        r2 = r5.this$1;	 Catch:{ WDJNIException -> 0x0036 }
        r2 = r2.mo3261l();	 Catch:{ WDJNIException -> 0x0036 }
        r3 = r5.this$1;	 Catch:{ WDJNIException -> 0x0036 }
        r3 = r3.mo3260k();	 Catch:{ WDJNIException -> 0x0036 }
        r4 = r5.val$strName;	 Catch:{ WDJNIException -> 0x0036 }
        r0 = fr.pcsoft.wdjava.jni.WDJNIHelper.m6674c(r0, r2, r3, r4);	 Catch:{ WDJNIException -> 0x0036 }
        r1 = r5.f1884a;	 Catch:{ WDJNIException -> 0x0065 }
        if (r1 != 0) goto L_0x005f;
    L_0x0058:
        r1 = new fr.pcsoft.wdjava.core.types.WDEntier4;	 Catch:{ WDJNIException -> 0x0065 }
        r1.<init>();	 Catch:{ WDJNIException -> 0x0065 }
        r5.f1884a = r1;	 Catch:{ WDJNIException -> 0x0065 }
    L_0x005f:
        r1 = r5.f1884a;	 Catch:{ WDJNIException -> 0x0036 }
        r1.setValeur(r0);	 Catch:{ WDJNIException -> 0x0036 }
        goto L_0x0031;
    L_0x0065:
        r0 = move-exception;
        throw r0;	 Catch:{ WDJNIException -> 0x0036 }
    L_0x0067:
        r0 = r5.this$1;	 Catch:{ WDJNIException -> 0x0036 }
        r0 = r0.this$0;	 Catch:{ WDJNIException -> 0x0036 }
        r0 = r0.f1871b;	 Catch:{ WDJNIException -> 0x0036 }
        r2 = r5.this$1;	 Catch:{ WDJNIException -> 0x0036 }
        r2 = r2.mo3261l();	 Catch:{ WDJNIException -> 0x0036 }
        r3 = r5.this$1;	 Catch:{ WDJNIException -> 0x0036 }
        r3 = r3.mo3260k();	 Catch:{ WDJNIException -> 0x0036 }
        r4 = r5.val$strName;	 Catch:{ WDJNIException -> 0x0036 }
        r0 = fr.pcsoft.wdjava.jni.WDJNIHelper.m6715f(r0, r2, r3, r4);	 Catch:{ WDJNIException -> 0x0036 }
        r2 = r5.f1884a;	 Catch:{ WDJNIException -> 0x0090 }
        if (r2 != 0) goto L_0x008a;
    L_0x0083:
        r2 = new fr.pcsoft.wdjava.core.types.WDEntier8;	 Catch:{ WDJNIException -> 0x0090 }
        r2.<init>();	 Catch:{ WDJNIException -> 0x0090 }
        r5.f1884a = r2;	 Catch:{ WDJNIException -> 0x0090 }
    L_0x008a:
        r2 = r5.f1884a;	 Catch:{ WDJNIException -> 0x0036 }
        r2.setValeur(r0);	 Catch:{ WDJNIException -> 0x0036 }
        goto L_0x0031;
    L_0x0090:
        r0 = move-exception;
        throw r0;	 Catch:{ WDJNIException -> 0x0036 }
    L_0x0092:
        r0 = r5.this$1;	 Catch:{ WDJNIException -> 0x0036 }
        r0 = r0.this$0;	 Catch:{ WDJNIException -> 0x0036 }
        r0 = r0.f1871b;	 Catch:{ WDJNIException -> 0x0036 }
        r2 = r5.this$1;	 Catch:{ WDJNIException -> 0x0036 }
        r2 = r2.mo3261l();	 Catch:{ WDJNIException -> 0x0036 }
        r3 = r5.this$1;	 Catch:{ WDJNIException -> 0x0036 }
        r3 = r3.mo3260k();	 Catch:{ WDJNIException -> 0x0036 }
        r4 = r5.val$strName;	 Catch:{ WDJNIException -> 0x0036 }
        r0 = fr.pcsoft.wdjava.jni.WDJNIHelper.m6728i(r0, r2, r3, r4);	 Catch:{ WDJNIException -> 0x0036 }
        r1 = r5.f1884a;	 Catch:{ WDJNIException -> 0x00bc }
        if (r1 != 0) goto L_0x00b5;
    L_0x00ae:
        r1 = new fr.pcsoft.wdjava.core.types.WDBooleen;	 Catch:{ WDJNIException -> 0x00bc }
        r1.<init>();	 Catch:{ WDJNIException -> 0x00bc }
        r5.f1884a = r1;	 Catch:{ WDJNIException -> 0x00bc }
    L_0x00b5:
        r1 = r5.f1884a;	 Catch:{ WDJNIException -> 0x0036 }
        r1.setValeur(r0);	 Catch:{ WDJNIException -> 0x0036 }
        goto L_0x0031;
    L_0x00bc:
        r0 = move-exception;
        throw r0;	 Catch:{ WDJNIException -> 0x0036 }
    L_0x00be:
        r0 = r5.this$1;	 Catch:{ WDJNIException -> 0x0036 }
        r0 = r0.this$0;	 Catch:{ WDJNIException -> 0x0036 }
        r0 = r0.f1871b;	 Catch:{ WDJNIException -> 0x0036 }
        r2 = r5.this$1;	 Catch:{ WDJNIException -> 0x0036 }
        r2 = r2.mo3261l();	 Catch:{ WDJNIException -> 0x0036 }
        r3 = r5.this$1;	 Catch:{ WDJNIException -> 0x0036 }
        r3 = r3.mo3260k();	 Catch:{ WDJNIException -> 0x0036 }
        r4 = r5.val$strName;	 Catch:{ WDJNIException -> 0x0036 }
        r0 = fr.pcsoft.wdjava.jni.WDJNIHelper.m6723h(r0, r2, r3, r4);	 Catch:{ WDJNIException -> 0x0036 }
        r2 = r5.f1884a;	 Catch:{ WDJNIException -> 0x00e8 }
        if (r2 != 0) goto L_0x00e1;
    L_0x00da:
        r2 = new fr.pcsoft.wdjava.core.types.WDReel;	 Catch:{ WDJNIException -> 0x00e8 }
        r2.<init>();	 Catch:{ WDJNIException -> 0x00e8 }
        r5.f1884a = r2;	 Catch:{ WDJNIException -> 0x00e8 }
    L_0x00e1:
        r2 = r5.f1884a;	 Catch:{ WDJNIException -> 0x0036 }
        r2.setValeur(r0);	 Catch:{ WDJNIException -> 0x0036 }
        goto L_0x0031;
    L_0x00e8:
        r0 = move-exception;
        throw r0;	 Catch:{ WDJNIException -> 0x0036 }
    L_0x00ea:
        r0 = r5.this$1;	 Catch:{ WDJNIException -> 0x0036 }
        r0 = r0.this$0;	 Catch:{ WDJNIException -> 0x0036 }
        r0 = r0.f1871b;	 Catch:{ WDJNIException -> 0x0036 }
        r2 = r5.this$1;	 Catch:{ WDJNIException -> 0x0036 }
        r2 = r2.mo3261l();	 Catch:{ WDJNIException -> 0x0036 }
        r3 = r5.this$1;	 Catch:{ WDJNIException -> 0x0036 }
        r3 = r3.mo3260k();	 Catch:{ WDJNIException -> 0x0036 }
        r4 = r5.val$strName;	 Catch:{ WDJNIException -> 0x0036 }
        r0 = fr.pcsoft.wdjava.jni.WDJNIHelper.m6710e(r0, r2, r3, r4);	 Catch:{ WDJNIException -> 0x0036 }
        r1 = r5.f1884a;	 Catch:{ WDJNIException -> 0x0114 }
        if (r1 != 0) goto L_0x010d;
    L_0x0106:
        r1 = new fr.pcsoft.wdjava.core.types.WDBuffer;	 Catch:{ WDJNIException -> 0x0114 }
        r1.<init>();	 Catch:{ WDJNIException -> 0x0114 }
        r5.f1884a = r1;	 Catch:{ WDJNIException -> 0x0114 }
    L_0x010d:
        r1 = r5.f1884a;	 Catch:{ WDJNIException -> 0x0036 }
        r1.setValeur(r0);	 Catch:{ WDJNIException -> 0x0036 }
        goto L_0x0031;
    L_0x0114:
        r0 = move-exception;
        throw r0;	 Catch:{ WDJNIException -> 0x0036 }
    L_0x0116:
        r0 = r5.this$1;	 Catch:{ WDJNIException -> 0x0036 }
        r0 = r0.this$0;	 Catch:{ WDJNIException -> 0x0036 }
        r0 = r0.f1871b;	 Catch:{ WDJNIException -> 0x0036 }
        r2 = r5.this$1;	 Catch:{ WDJNIException -> 0x0036 }
        r2 = r2.mo3261l();	 Catch:{ WDJNIException -> 0x0036 }
        r3 = r5.this$1;	 Catch:{ WDJNIException -> 0x0036 }
        r3 = r3.mo3260k();	 Catch:{ WDJNIException -> 0x0036 }
        r4 = r5.val$strName;	 Catch:{ WDJNIException -> 0x0036 }
        r2 = fr.pcsoft.wdjava.jni.WDJNIHelper.m6693d(r0, r2, r3, r4);	 Catch:{ WDJNIException -> 0x0036 }
        r0 = r5.f1884a;	 Catch:{ WDJNIException -> 0x014a }
        if (r0 == 0) goto L_0x013e;
    L_0x0132:
        r0 = r5.f1884a;	 Catch:{ WDJNIException -> 0x0148 }
        r0 = (fr.pcsoft.wdjava.core.poo.C0736s) r0;	 Catch:{ WDJNIException -> 0x0148 }
        r0 = r0.getIdentifiantJNI();	 Catch:{ WDJNIException -> 0x0148 }
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 == 0) goto L_0x0031;
    L_0x013e:
        r0 = r5.this$1;	 Catch:{ WDJNIException -> 0x0148 }
        r0 = fr.pcsoft.wdjava.core.poo.C0738u.access$100(r0, r2);	 Catch:{ WDJNIException -> 0x0148 }
        r5.f1884a = r0;	 Catch:{ WDJNIException -> 0x0148 }
        goto L_0x0031;
    L_0x0148:
        r0 = move-exception;
        throw r0;	 Catch:{ WDJNIException -> 0x0036 }
    L_0x014a:
        r0 = move-exception;
        throw r0;	 Catch:{ WDJNIException -> 0x0148 }
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.core.poo.y.getRefProxy():fr.pcsoft.wdjava.core.WDObjet");
    }

    public void release() {
        if (this.f1884a != null) {
            this.f1884a.release();
            this.f1884a = null;
        }
    }

    public void setValeur(double d) {
        try {
            WDJNIHelper.m6606a(this.this$1.this$0.f1871b, this.this$1.mo3261l(), this.this$1.mo3260k(), this.val$strName, d);
        } catch (Throwable e) {
            WDErreurManager.m2888b(e);
        }
    }

    public void setValeur(int i) {
        try {
            WDJNIHelper.m6660b(this.this$1.this$0.f1871b, this.this$1.mo3261l(), this.this$1.mo3260k(), this.val$strName, i);
        } catch (Throwable e) {
            WDErreurManager.m2888b(e);
        }
    }

    public void setValeur(long j) {
        try {
            WDJNIHelper.m6700d(this.this$1.this$0.f1871b, this.this$1.mo3261l(), this.this$1.mo3260k(), this.val$strName, j);
        } catch (Throwable e) {
            WDErreurManager.m2888b(e);
        }
    }

    public void setValeur(WDObjet wDObjet) {
        try {
            switch (C0738u.access$000(this.this$1)) {
                case 2:
                    setValeur(wDObjet.getInt());
                    return;
                case 3:
                    setValeur(wDObjet.getLong());
                    return;
                case 4:
                    setValeur(wDObjet.getBoolean());
                    return;
                case 5:
                    setValeur(wDObjet.getDouble());
                    return;
                case 6:
                    setValeur(wDObjet.getDonneeBinaire());
                    return;
                case 7:
                    C0736s c0736s = (C0736s) wDObjet.checkType(C0736s.class);
                    if (c0736s != null) {
                        try {
                            WDJNIHelper.m6685c(this.this$1.this$0.f1871b, this.this$1.mo3261l(), this.this$1.mo3260k(), this.val$strName, c0736s.getIdentifiantJNI());
                            return;
                        } catch (Throwable e) {
                            WDErreurManager.m2888b(e);
                            return;
                        }
                    }
                    WDErreurManager.m2883a(C0745b.m3222b(f1883z[1], wDObjet.getNomType(), C0745b.m3220a(f1883z[0], new String[0])));
                    return;
                default:
                    setValeur(wDObjet.getString());
                    return;
            }
        } catch (WDJNIException e2) {
            throw e2;
        }
    }

    public void setValeur(String str) {
        try {
            WDJNIHelper.m6662b(this.this$1.this$0.f1871b, this.this$1.mo3261l(), this.this$1.mo3260k(), this.val$strName, str);
        } catch (Throwable e) {
            WDErreurManager.m2888b(e);
        }
    }

    public void setValeur(boolean z) {
        try {
            WDJNIHelper.m6663b(this.this$1.this$0.f1871b, this.this$1.mo3261l(), this.this$1.mo3260k(), this.val$strName, z);
        } catch (Throwable e) {
            WDErreurManager.m2888b(e);
        }
    }

    public void setValeur(byte[] bArr) {
        try {
            WDJNIHelper.m6664b(this.this$1.this$0.f1871b, this.this$1.mo3261l(), this.this$1.mo3260k(), this.val$strName, bArr);
        } catch (Throwable e) {
            WDErreurManager.m2888b(e);
        }
    }
}
