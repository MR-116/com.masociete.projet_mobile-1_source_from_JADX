package fr.pcsoft.wdjava.ui.p065b.p067a;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.debug.C0691a;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: fr.pcsoft.wdjava.ui.b.a.ab */
abstract class ab extends C1061z implements C1062e {
    /* renamed from: z */
    private static final String f3071z = ab.m7596z(ab.m7597z("7MA\u001c\u0002\u0015\\\u0004\u0011\b\u000eZA\u001eM\u001fÁ\u000bM\u001fM\u0012_\u0017Á\f\u001a\u0003\u000f[A\u0019\u0004\u0017[O"));
    /* renamed from: e */
    private LinkedList<C1060y> f3072e = null;

    ab() {
    }

    /* renamed from: z */
    private static String m7596z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 123;
                    break;
                case 1:
                    i2 = 40;
                    break;
                case 2:
                    i2 = 97;
                    break;
                case 3:
                    i2 = C0607n.bx;
                    break;
                default:
                    i2 = 109;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7597z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 109);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public void mo3327a() {
        super.mo3327a();
        if (this.f3072e != null) {
            Iterator it = this.f3072e.iterator();
            while (it.hasNext()) {
                ((C1060y) it.next()).mo3327a();
            }
            this.f3072e.clear();
            this.f3072e = null;
        }
    }

    /* renamed from: a */
    public void mo3331a(C1060y c1060y) throws C1066d {
        try {
            if (this.f3072e == null) {
                this.f3072e = new LinkedList();
            }
            this.f3072e.add(c1060y);
        } catch (C1066d e) {
            throw e;
        }
    }

    /* renamed from: a */
    public final void m7600a(List<C1060y> list) {
        LinkedList linkedList;
        boolean z = this.f3072e == null || this.f3072e.size() == 0;
        C0691a.m2860a(z, f3071z);
        if (list instanceof LinkedList) {
            List list2 = list;
        } else {
            linkedList = new LinkedList(list);
        }
        this.f3072e = linkedList;
    }

    /* renamed from: d */
    public List<C1060y> mo3332d() {
        return this.f3072e != null ? this.f3072e : Collections.EMPTY_LIST;
    }

    /* renamed from: k */
    public final C1060y m7602k() {
        return this.f3072e != null ? (C1060y) this.f3072e.getLast() : null;
    }

    /* renamed from: l */
    public final int m7603l() {
        return this.f3072e != null ? this.f3072e.size() : 0;
    }
}
