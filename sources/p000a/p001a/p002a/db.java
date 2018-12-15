package p000a.p001a.p002a;

import p000a.p001a.p002a.p019g.C0185f;
import p000a.p001a.p002a.p019g.C0194n;

/* renamed from: a.a.a.db */
public final class db {
    /* renamed from: z */
    private static final String f483z = db.m827z(db.m828z("\u0018HV:\u001a3[])H7TK/H8D\u00185\u00074\fV.\u00046\u000f"));
    /* renamed from: a */
    private C0194n f484a;
    /* renamed from: b */
    private final C0188n f485b;

    public db(C0188n c0188n) {
        if (c0188n == null) {
            throw new IllegalArgumentException(f483z);
        }
        this.f485b = c0188n;
    }

    /* renamed from: z */
    private static String m827z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 90;
                    break;
                case 1:
                    i2 = 33;
                    break;
                case 2:
                    i2 = 56;
                    break;
                case 3:
                    i2 = 91;
                    break;
                default:
                    i2 = 104;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m828z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 104);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public db m829a(int i, int i2, int i3, int i4) {
        return new db(this.f485b.mo35a(this.f485b.m1174a().mo12a(i, i2, i3, i4)));
    }

    /* renamed from: a */
    public C0185f m830a(int i, C0185f c0185f) throws C0213t {
        return this.f485b.mo34a(i, c0185f);
    }

    /* renamed from: a */
    public boolean m831a() {
        return this.f485b.m1174a().mo38c();
    }

    /* renamed from: b */
    public int m832b() {
        return this.f485b.m1177d();
    }

    /* renamed from: c */
    public boolean m833c() {
        return this.f485b.m1174a().mo15h();
    }

    /* renamed from: d */
    public int m834d() {
        return this.f485b.m1175b();
    }

    /* renamed from: e */
    public db m835e() {
        return new db(this.f485b.mo35a(this.f485b.m1174a().mo40g()));
    }

    /* renamed from: f */
    public C0194n m836f() throws C0213t {
        try {
            if (this.f484a == null) {
                this.f484a = this.f485b.mo36c();
            }
            return this.f484a;
        } catch (C0213t e) {
            throw e;
        }
    }

    /* renamed from: g */
    public db m837g() {
        return new db(this.f485b.mo35a(this.f485b.m1174a().mo37a()));
    }

    public String toString() {
        try {
            return m836f().toString();
        } catch (C0213t e) {
            return "";
        }
    }
}
