package fr.pcsoft.wdjava.ui.p072i;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: fr.pcsoft.wdjava.ui.i.a */
public class C1431a {
    /* renamed from: a */
    private int f4242a = -1;
    /* renamed from: b */
    private int f4243b = -1;
    /* renamed from: c */
    private C1434f f4244c = null;
    /* renamed from: d */
    private ArrayList<C1434f> f4245d = new ArrayList(8);
    /* renamed from: e */
    private LinkedList<SoftReference<C1434f>> f4246e = new LinkedList();

    /* renamed from: a */
    private final C1434f m10054a() {
        if (!(this.f4246e == null || this.f4246e.isEmpty())) {
            SoftReference softReference = (SoftReference) this.f4246e.poll();
            while (softReference != null) {
                C1434f c1434f = (C1434f) softReference.get();
                if (c1434f != null) {
                    return c1434f;
                }
                softReference = (SoftReference) this.f4246e.poll();
            }
        }
        return new C1434f(this);
    }

    /* renamed from: b */
    private final void m10055b(C1434f c1434f) {
        if (this.f4246e != null) {
            c1434f.m10092e();
            this.f4246e.add(new SoftReference(c1434f));
            return;
        }
        c1434f.m10091d();
    }

    /* renamed from: a */
    public final int m10056a(C1434f c1434f) {
        int indexOf = this.f4245d.indexOf(c1434f);
        return indexOf >= 0 ? indexOf + this.f4242a : -1;
    }

    /* renamed from: a */
    public final void m10057a(int i) {
        if (i <= this.f4243b) {
            if (i < this.f4242a) {
                this.f4242a--;
                this.f4243b--;
            } else if (this.f4245d != null) {
                int i2 = i - this.f4242a;
                if (i2 >= 0 && i2 < this.f4245d.size()) {
                    C1434f c1434f = (C1434f) this.f4245d.remove(i2);
                    if (c1434f != null) {
                        m10055b(c1434f);
                    }
                    this.f4243b--;
                }
            }
        }
    }

    /* renamed from: a */
    public final void m10058a(int i, int i2) {
        if (this.f4245d != null && !this.f4245d.isEmpty()) {
            int max = Math.max(0, i - this.f4242a);
            int min = Math.min(this.f4245d.size() - 1, i2 - this.f4242a);
            for (int i3 = max; i3 <= min; i3++) {
                C1434f c1434f = (C1434f) this.f4245d.get(i3);
                if (c1434f != null) {
                    c1434f.m10092e();
                }
            }
        }
    }

    /* renamed from: b */
    public final C1434f m10059b(int i) {
        int i2 = i - this.f4242a;
        return (i2 < 0 || i2 >= this.f4245d.size()) ? null : (C1434f) this.f4245d.get(i2);
    }

    /* renamed from: b */
    public final void m10060b() {
        if (this.f4246e != null) {
            Iterator it = this.f4246e.iterator();
            while (it.hasNext()) {
                SoftReference softReference = (SoftReference) it.next();
                C1434f c1434f = softReference != null ? (C1434f) softReference.get() : null;
                if (c1434f != null) {
                    c1434f.m10091d();
                }
            }
            this.f4246e.clear();
        }
    }

    /* renamed from: b */
    public final void m10061b(int i, int i2) {
        int i3 = 0;
        int max;
        C1434f c1434f;
        if (i2 < this.f4242a || i > this.f4243b) {
            max = Math.max(0, i2 - i) + 1;
            while (this.f4245d.size() > max) {
                c1434f = (C1434f) this.f4245d.remove(0);
                if (c1434f != null) {
                    c1434f.m10091d();
                }
            }
            Iterator it = this.f4245d.iterator();
            while (it.hasNext()) {
                c1434f = (C1434f) it.next();
                if (c1434f != null) {
                    c1434f.m10092e();
                }
            }
            while (this.f4245d.size() < max) {
                this.f4245d.add(m10054a());
            }
            if (this.f4246e != null) {
                it = this.f4246e.iterator();
                while (it.hasNext()) {
                    SoftReference softReference = (SoftReference) it.next();
                    c1434f = softReference != null ? (C1434f) softReference.get() : null;
                    if (c1434f != null) {
                        c1434f.m10091d();
                    }
                }
                this.f4246e.clear();
            }
        } else {
            int min;
            int i4;
            if (this.f4242a < i) {
                min = Math.min(i - this.f4242a, this.f4245d.size());
                for (max = 0; max < min; max++) {
                    c1434f = (C1434f) this.f4245d.remove(0);
                    if (c1434f != null) {
                        m10055b(c1434f);
                    }
                }
            } else if (this.f4242a > i) {
                for (i4 = i; i4 < this.f4242a; i4++) {
                    this.f4245d.add(0, m10054a());
                }
            }
            if (this.f4243b > i2) {
                i4 = this.f4245d.size();
                min = Math.min(this.f4243b - i2, i4);
                max = i4;
                while (i3 < min) {
                    c1434f = (C1434f) this.f4245d.remove(max - 1);
                    if (c1434f != null) {
                        m10055b(c1434f);
                    }
                    max--;
                    i3++;
                }
            } else if (this.f4243b < i2) {
                for (i4 = this.f4243b; i4 < i2; i4++) {
                    this.f4245d.add(m10054a());
                }
            }
        }
        this.f4242a = i;
        this.f4243b = i2;
    }

    /* renamed from: c */
    public final void m10062c() {
        this.f4243b = -1;
        this.f4242a = -1;
        if (this.f4245d != null) {
            Iterator it = this.f4245d.iterator();
            while (it.hasNext()) {
                C1434f c1434f = (C1434f) it.next();
                if (c1434f != null) {
                    c1434f.m10091d();
                }
            }
            this.f4245d.clear();
        }
        m10060b();
    }

    /* renamed from: c */
    public final void m10063c(int i) {
        if (i >= this.f4242a && i <= this.f4243b) {
            C1434f b = m10059b(i);
            if (b != null) {
                b.m10092e();
            }
        }
    }

    /* renamed from: d */
    public final void m10064d() {
        m10062c();
        this.f4245d = null;
        this.f4246e = null;
    }

    /* renamed from: d */
    public final void m10065d(int i) {
        if (i <= this.f4243b) {
            if (i <= this.f4242a) {
                this.f4242a++;
                this.f4243b++;
            } else if (this.f4245d != null) {
                int i2 = i - this.f4242a;
                int size = this.f4245d.size();
                if (i2 >= 0 && i2 < size) {
                    C1434f c1434f = (C1434f) this.f4245d.remove(size - 1);
                    if (c1434f != null) {
                        c1434f.m10092e();
                        this.f4245d.add(i2, c1434f);
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public final boolean m10066e() {
        return this.f4244c != null;
    }

    /* renamed from: f */
    public final boolean m10067f() {
        return this.f4246e != null;
    }

    /* renamed from: g */
    public final void m10068g() {
        m10060b();
        this.f4246e = null;
    }

    /* renamed from: h */
    public final void m10069h() {
        if (this.f4245d != null && !this.f4245d.isEmpty()) {
            Iterator it = this.f4245d.iterator();
            while (it.hasNext()) {
                C1434f c1434f = (C1434f) it.next();
                if (c1434f != null) {
                    c1434f.m10092e();
                }
            }
        }
    }

    /* renamed from: i */
    public final C1434f m10070i() {
        return this.f4244c;
    }
}
