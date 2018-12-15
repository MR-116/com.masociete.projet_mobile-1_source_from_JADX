package p000a.p001a.p002a.p019g.p029b;

import java.util.ArrayList;
import java.util.List;

/* renamed from: a.a.a.g.b.d */
public final class C0181d {
    /* renamed from: z */
    private static final String[] f698z = new String[]{C0181d.m1116z(C0181d.m1117z("<NC'.\u0006@C!6\u0006D\u0010c?\u0000N\u0015*+\u0017E")), C0181d.m1116z(C0181d.m1117z("<NC&=\u0000N\u0011c,\u001dS\u0011&,\u0006H\f-o\u0010X\u0017&<"))};
    /* renamed from: a */
    private final List<C0178a> f699a = new ArrayList();
    /* renamed from: b */
    private final C0180c f700b;

    public C0181d(C0180c c0180c) {
        this.f700b = c0180c;
        this.f699a.add(new C0178a(c0180c, new int[]{1}));
    }

    /* renamed from: a */
    private C0178a m1115a(int i) {
        if (i >= this.f699a.size()) {
            C0178a c0178a = (C0178a) this.f699a.get(this.f699a.size() - 1);
            C0178a c0178a2 = c0178a;
            for (int size = this.f699a.size(); size <= i; size++) {
                c0178a2 = c0178a2.m1101c(new C0178a(this.f700b, new int[]{1, this.f700b.m1106a((size - 1) + this.f700b.m1114d())}));
                this.f699a.add(c0178a2);
            }
        }
        return (C0178a) this.f699a.get(i);
    }

    /* renamed from: z */
    private static String m1116z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 114;
                    break;
                case 1:
                    i2 = 33;
                    break;
                case 2:
                    i2 = 99;
                    break;
                case 3:
                    i2 = 67;
                    break;
                default:
                    i2 = 79;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1117z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 79);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public void m1118a(int[] iArr, int i) {
        if (i == 0) {
            try {
                throw new IllegalArgumentException(f698z[1]);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        int length = iArr.length - i;
        if (length <= 0) {
            try {
                throw new IllegalArgumentException(f698z[0]);
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
        C0178a a = m1115a(i);
        Object obj = new int[length];
        System.arraycopy(iArr, 0, obj, 0, length);
        obj = new C0178a(this.f700b, obj).m1095a(i, 1).m1099b(a)[1].m1098b();
        int length2 = i - obj.length;
        int i2 = 0;
        while (i2 < length2) {
            try {
                iArr[length + i2] = 0;
                i2++;
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        }
        System.arraycopy(obj, 0, iArr, length + length2, obj.length);
    }
}
