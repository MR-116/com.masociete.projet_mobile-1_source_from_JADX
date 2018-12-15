package fr.pcsoft.wdjava.jni;

import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.p035c.C0665g;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.file.C0897o;
import fr.pcsoft.wdjava.p061q.p062a.C1014a;

/* renamed from: fr.pcsoft.wdjava.jni.e */
public class C0929e implements C0924a {
    /* renamed from: z */
    private static final String[] f2538z = new String[]{C0929e.m6744z(C0929e.m6745z("\u0004r#")), C0929e.m6744z(C0929e.m6745z("Fh.")), C0929e.m6744z(C0929e.m6745z("\tD\u001e\\ViI\r\\NoL\t@]uE\u0000B"))};
    /* renamed from: a */
    private String f2539a;
    /* renamed from: b */
    private String f2540b = "";

    public C0929e(String str) {
        this.f2539a = str;
    }

    /* renamed from: z */
    private static String m6744z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 42;
                    break;
                case 1:
                    i2 = 1;
                    break;
                case 2:
                    i2 = 76;
                    break;
                case 3:
                    i2 = 14;
                    break;
                default:
                    i2 = 9;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m6745z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 9);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public void mo3223a() throws WDJNIException {
        try {
            this.f2540b = C0897o.m6242a(C1014a.m7327b().mo3285c()) + f2538z[1] + this.f2539a + f2538z[0];
            try {
                System.loadLibrary(this.f2539a);
            } catch (UnsatisfiedLinkError e) {
                throw new WDJNIException(C0745b.m3222b(f2538z[2], this.f2539a), e.getMessage());
            }
        } catch (C0665g e2) {
            WDErreurManager.m2883a(e2.getMessage());
        }
    }

    /* renamed from: b */
    public String mo3224b() {
        return this.f2540b;
    }

    /* renamed from: c */
    public void mo3225c() {
    }
}
