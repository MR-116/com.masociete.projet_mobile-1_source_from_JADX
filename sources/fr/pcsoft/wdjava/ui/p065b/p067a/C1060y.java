package fr.pcsoft.wdjava.ui.p065b.p067a;

import fr.pcsoft.wdjava.core.debug.C0691a;

/* renamed from: fr.pcsoft.wdjava.ui.b.a.y */
public abstract class C1060y implements yb {
    /* renamed from: z */
    private static final String f3065z = C1060y.m7573z(C1060y.m7574z("q\tja3XZ%byYÇoãyH@%s8OKkww"));
    /* renamed from: a */
    private C1062e f3066a;

    /* renamed from: z */
    private static String m7573z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 61;
                    break;
                case 1:
                    i2 = 46;
                    break;
                case 2:
                    i2 = 5;
                    break;
                case 3:
                    i2 = 3;
                    break;
                default:
                    i2 = 89;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7574z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 89);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public void mo3327a() {
        this.f3066a = null;
    }

    /* renamed from: a */
    public void mo3328a(C1062e c1062e) throws C1066d {
        try {
            C0691a.m2860a(this.f3066a == null, f3065z);
            this.f3066a = c1062e;
        } catch (C1066d e) {
            throw e;
        }
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ yb mo3329b() {
        return m7579f();
    }

    /* renamed from: c */
    public wb mo3330c() {
        return this.f3066a != null ? this.f3066a.mo3330c() : null;
    }

    /* renamed from: f */
    public final C1062e m7579f() {
        return this.f3066a;
    }
}
