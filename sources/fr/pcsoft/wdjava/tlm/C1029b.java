package fr.pcsoft.wdjava.tlm;

import fr.pcsoft.wdjava.core.debug.C0691a;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: fr.pcsoft.wdjava.tlm.b */
public class C1029b extends C1028a {
    /* renamed from: z */
    private static final String[] f2949z = new String[]{C1029b.m7433z(C1029b.m7434z("|F\u0000z~^JTrdB\u0003A7øDÊ\u0000{xRÊRþ?")), C1029b.m7433z(C1029b.m7434z("|F\u0000z~^JTrdB\u0003AgaQQT~t^W\u0000søZÃ\u0000÷1EM\u0000pc_VPr?"))};
    /* renamed from: f */
    private LinkedList<C1028a> f2950f = new LinkedList();
    /* renamed from: g */
    private long f2951g;

    public C1029b(long j) {
        this.f2951g = j;
    }

    /* renamed from: z */
    private static String m7433z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 48;
                    break;
                case 1:
                    i2 = 35;
                    break;
                case 2:
                    i2 = 32;
                    break;
                case 3:
                    i2 = 23;
                    break;
                default:
                    i2 = 17;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7434z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 17);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public final void m7435a(C1028a c1028a) {
        try {
            if (this.f2950f != null) {
                this.f2950f.remove(c1028a);
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    /* renamed from: a */
    public void mo3307a(C1029b c1029b) {
        throw new IllegalStateException();
    }

    /* renamed from: b */
    public C1029b mo3308b() {
        return null;
    }

    /* renamed from: b */
    public final void m7438b(C1028a c1028a) {
        boolean z = true;
        try {
            try {
                C0691a.m2860a(c1028a.mo3308b() == null, f2949z[1]);
                if (this.f2950f != null) {
                    z = false;
                }
                try {
                    C0691a.m2860a(z, f2949z[0]);
                    if (this.f2950f != null) {
                        this.f2950f.add(c1028a);
                        c1028a.mo3307a(this);
                    }
                } catch (IllegalStateException e) {
                    throw e;
                }
            } catch (IllegalStateException e2) {
                throw e2;
            }
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    /* renamed from: f */
    public void mo3309f() {
        super.mo3309f();
        if (this.f2950f != null) {
            Iterator it = this.f2950f.iterator();
            while (it.hasNext()) {
                ((C1028a) it.next()).mo3309f();
            }
            this.f2950f.clear();
            this.f2950f = null;
        }
    }

    /* renamed from: h */
    public void m7440h() {
        super.m7428c();
        if (this.f2950f != null) {
            Iterator it = this.f2950f.iterator();
            while (it.hasNext()) {
                ((C1028a) it.next()).m7428c();
            }
        }
    }

    /* renamed from: i */
    public final long m7441i() {
        return this.f2951g;
    }

    /* renamed from: j */
    public void m7442j() {
        m7432g();
        if (this.f2950f != null) {
            Iterator it = this.f2950f.iterator();
            while (it.hasNext()) {
                ((C1028a) it.next()).m7432g();
            }
        }
    }
}
