package fr.pcsoft.wdjava.ui.p065b.p067a;

/* renamed from: fr.pcsoft.wdjava.ui.b.a.lb */
final class lb extends jb implements zb {
    /* renamed from: z */
    private static final String f3149z = lb.m7720z(lb.m7721z("8\u0014\u0019\b\u0002\u001e\u0005\u0002\fP\u0019\u0018K\r\u001f\u001e\u0018\u0006\f\u001e\tM\u0002\u0007\u0006\u001c\u0001\u0002\r\u0015S"));
    /* renamed from: j */
    private kb f3150j = null;

    lb() {
    }

    /* renamed from: z */
    private static String m7720z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 112;
                    break;
                case 1:
                    i2 = 125;
                    break;
                case 2:
                    i2 = 109;
                    break;
                case 3:
                    i2 = 107;
                    break;
                default:
                    i2 = 105;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7721z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 105);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public void mo3327a() {
        super.mo3327a();
        this.f3150j = null;
    }

    /* renamed from: a */
    public void mo3328a(C1062e c1062e) throws C1066d {
        try {
            super.mo3328a(c1062e);
            if (c1062e instanceof jb) {
                try {
                    if (c1062e instanceof kb) {
                        mo3341a((kb) c1062e);
                        return;
                    } else {
                        mo3341a(((zb) c1062e).mo3342e());
                        return;
                    }
                } catch (C1066d e) {
                    throw e;
                }
            }
            throw new C1066d(f3149z);
        } catch (C1066d e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    public void mo3341a(kb kbVar) {
        this.f3150j = kbVar;
    }

    /* renamed from: e */
    public kb mo3342e() {
        return this.f3150j;
    }
}
