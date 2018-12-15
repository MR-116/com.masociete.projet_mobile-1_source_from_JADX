package fr.pcsoft.wdjava.core.context;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.utils.C0816t;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: fr.pcsoft.wdjava.core.context.a */
public class C0669a implements C0668g {
    /* renamed from: z */
    private static final String f1676z = C0669a.m2740z(C0669a.m2741z("\u0005X3\t-hT$\u0015-hD?\u001e/gI)\u001e"));
    /* renamed from: a */
    private ArrayList f1677a = null;

    /* renamed from: a */
    private final int m2739a(int i) {
        if (this.f1677a != null) {
            Iterator it = this.f1677a.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                if (((C0816t) it.next()).m4134a() == i) {
                    return i2;
                }
                i2++;
            }
        }
        return -1;
    }

    /* renamed from: z */
    private static String m2740z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 38;
                    break;
                case 1:
                    i2 = 27;
                    break;
                case 2:
                    i2 = 123;
                    break;
                case 3:
                    i2 = 91;
                    break;
                default:
                    i2 = 98;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2741z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 98);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public void mo2567a() {
        if (this.f1677a != null) {
            this.f1677a.clear();
            this.f1677a = null;
        }
    }

    /* renamed from: b */
    public void m2743b(int i) {
        C0816t c0816t;
        int a = m2739a(i);
        if (a >= 0) {
            c0816t = (C0816t) this.f1677a.get(a);
        } else {
            c0816t = new C0816t(i);
            if (this.f1677a == null) {
                this.f1677a = new ArrayList();
            }
            this.f1677a.add(c0816t);
        }
        if (c0816t != null) {
            c0816t.m4137d();
        }
    }

    /* renamed from: c */
    public long m2744c(int i) {
        int a = m2739a(i);
        if (a < 0) {
            String[] strArr = new String[1];
            strArr[0] = C0745b.m3222b(f1676z, String.valueOf(i));
            WDErreurManager.m2874a((int) C0607n.ju, strArr);
        }
        C0816t c0816t = (C0816t) this.f1677a.get(a);
        c0816t.m4138e();
        return c0816t.m4139f();
    }

    /* renamed from: d */
    public void m2745d(int i) {
        int a = m2739a(i);
        if (a < 0) {
            String[] strArr = new String[1];
            strArr[0] = C0745b.m3222b(f1676z, String.valueOf(i));
            WDErreurManager.m2874a((int) C0607n.ju, strArr);
        }
        ((C0816t) this.f1677a.get(a)).m4135b();
    }

    /* renamed from: e */
    public long m2746e(int i) {
        int a = m2739a(i);
        if (a < 0) {
            String[] strArr = new String[1];
            strArr[0] = C0745b.m3222b(f1676z, String.valueOf(i));
            WDErreurManager.m2874a((int) C0607n.ju, strArr);
        }
        return ((C0816t) this.f1677a.get(a)).m4139f();
    }

    /* renamed from: f */
    public void m2747f(int i) {
        int a = m2739a(i);
        if (a < 0) {
            String[] strArr = new String[1];
            strArr[0] = C0745b.m3222b(f1676z, String.valueOf(i));
            WDErreurManager.m2874a((int) C0607n.ju, strArr);
        }
        ((C0816t) this.f1677a.get(a)).m4136c();
    }
}
