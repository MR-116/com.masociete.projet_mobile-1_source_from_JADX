package fr.pcsoft.wdjava.core.context;

import fr.pcsoft.wdjava.core.application.WDProcedureInterne;
import fr.pcsoft.wdjava.core.erreur.C0673b;
import fr.pcsoft.wdjava.core.utils.hc;
import fr.pcsoft.wdjava.ui.C0489p;
import java.util.LinkedList;
import java.util.List;

/* renamed from: fr.pcsoft.wdjava.core.context.c */
public class C0671c {
    /* renamed from: z */
    private static final String f1683z = C0671c.m2761z(C0671c.m2762z("W\u0012G"));
    /* renamed from: a */
    C0673b f1684a = null;
    /* renamed from: b */
    private LinkedList<Runnable> f1685b = null;
    /* renamed from: c */
    C0489p f1686c = null;
    /* renamed from: d */
    int f1687d = 14;
    /* renamed from: e */
    private List<WDProcedureInterne> f1688e = null;
    /* renamed from: f */
    String f1689f = null;
    /* renamed from: g */
    private boolean f1690g = false;

    public C0671c(int i, C0489p c0489p) {
        this.f1687d = i;
        this.f1686c = c0489p;
        this.f1690g = hc.m3945c();
    }

    static LinkedList access$200(C0671c c0671c) {
        return c0671c.f1685b;
    }

    static boolean access$300(C0671c c0671c) {
        return c0671c.f1690g;
    }

    static List access$400(C0671c c0671c) {
        return c0671c.f1688e;
    }

    static List access$402(C0671c c0671c, List list) {
        c0671c.f1688e = list;
        return list;
    }

    /* renamed from: z */
    private static String m2761z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 119;
                    break;
                case 1:
                    i2 = 63;
                    break;
                case 2:
                    i2 = 103;
                    break;
                case 3:
                    i2 = 57;
                    break;
                default:
                    i2 = 16;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2762z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 16);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public C0489p m2763a() {
        return this.f1686c;
    }

    /* renamed from: a */
    public final void m2764a(int i) {
        this.f1687d = i;
    }

    /* renamed from: a */
    public final void m2765a(Runnable runnable) {
        if (this.f1685b == null) {
            this.f1685b = new LinkedList();
        }
        this.f1685b.add(runnable);
    }

    /* renamed from: b */
    public final int m2766b() {
        return this.f1687d;
    }

    /* renamed from: c */
    public void mo2568c() {
        this.f1686c = null;
        this.f1684a = null;
        if (this.f1685b != null) {
            this.f1685b.clear();
            this.f1685b = null;
        }
        if (this.f1688e != null) {
            this.f1688e.clear();
            this.f1688e = null;
        }
    }

    public String toString() {
        return this.f1687d + f1683z + (this.f1686c != null ? this.f1686c.getName() : "") + f1683z + this.f1689f;
    }
}
