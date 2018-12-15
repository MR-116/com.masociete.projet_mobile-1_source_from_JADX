package fr.pcsoft.wdjava.database.hf;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.WDCallback;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDVoid;

/* renamed from: fr.pcsoft.wdjava.database.hf.y */
final class C0877y extends C0875w {
    /* renamed from: z */
    private static final String[] f2362z = new String[]{C0877y.m6169z(C0877y.m6170z("P2S\u000eA&%^\u001dW >R\bE=#^\u001dQ'8^\u0014B")), C0877y.m6169z(C0877y.m6170z("P'S\u0013G63T\u000eA,$@\u0012W,%D\bK&%")), C0877y.m6169z(C0877y.m6170z("P2S\u000e[%6M\u0019Q!(S\u0019P<\"S\u0003G2;M\u001eE0<^\u0014[ \"S\u0003A!%D\tV"))};
    /* renamed from: c */
    private WDCallback f2363c;

    public C0877y(int i, String str, WDCallback wDCallback) {
        super(i, str);
        this.f2363c = wDCallback;
    }

    /* renamed from: z */
    private static String m6169z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 115;
                    break;
                case 1:
                    i2 = 119;
                    break;
                case 2:
                    i2 = 1;
                    break;
                case 3:
                    i2 = 92;
                    break;
                default:
                    i2 = 4;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m6170z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 4);
        }
        return toCharArray;
    }

    /* renamed from: b */
    public void mo3182b() {
        super.mo3182b();
        if (this.f2363c != null) {
            this.f2363c.m2261c();
            this.f2363c = null;
        }
    }

    /* renamed from: d */
    public int mo3181d() {
        if (this.f2363c != null) {
            WDObjet execute = this.f2363c.execute(new WDObjet[0]);
            String[] strArr;
            if (execute != null && !(execute instanceof WDVoid)) {
                int i = execute.getInt();
                switch (i) {
                    case Integer.MIN_VALUE:
                    case -2147483647:
                    case 0:
                        return i;
                    case C0607n.Ts /*-2147483644*/:
                        WDProjet.getInstance().terminerApplication();
                        return i;
                    default:
                        strArr = new String[2];
                        strArr[0] = C0745b.m3222b(f2362z[0], new String[0]);
                        strArr[1] = C0745b.m3222b(f2362z[2], this.f2363c.m2259a());
                        WDErreurManager.m2886a(strArr);
                        break;
                }
            }
            strArr = new String[2];
            strArr[0] = C0745b.m3222b(f2362z[0], new String[0]);
            strArr[1] = C0745b.m3222b(f2362z[1], this.f2363c.m2259a());
            WDErreurManager.m2886a(strArr);
        }
        return 0;
    }
}
