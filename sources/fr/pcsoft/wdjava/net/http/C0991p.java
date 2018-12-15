package fr.pcsoft.wdjava.net.http;

/* renamed from: fr.pcsoft.wdjava.net.http.p */
class C0991p {
    /* renamed from: z */
    private static final String[] f2837z = new String[]{C0991p.m7223z(C0991p.m7224z("/l'G/\u0002wdg8\rm:U/\u001e.\f])\u0003g ]-")), C0991p.m7223z(C0991p.m7224z(".l-Jj\u0001b0\u0013$\u0003wiQ/Lm<_&")), C0991p.m7223z(C0991p.m7224z("\"b$Vj\u0001b0\u0013$\u0003wiQ/Lm<_&")), C0991p.m7223z(C0991p.m7224z("*j,_.Lm(^/Ln(Jj\u0002l=\u0013(\t#'F&\u0000")), C0991p.m7223z(C0991p.m7224z("/l'G/\u0002wdw#\u001fs&@#\u0018j&]")), C0991p.m7223z(C0991p.m7224z("\nl;^g\bb=RqLm(^/Q!")), C0991p.m7223z(C0991p.m7224z("W#/Z&\tm(^/Q!")), C0991p.m7223z(C0991p.m7224z("/l'G/\u0002wdg3\u001cf")), C0991p.m7223z(C0991p.m7224z("W#*[+\u001ep,Gw"))};
    /* renamed from: a */
    private final C0978b f2838a;
    /* renamed from: b */
    private final eb f2839b;
    /* renamed from: c */
    private final String f2840c;

    public C0991p(String str, C0978b c0978b) {
        if (str == null) {
            throw new IllegalArgumentException(f2837z[2]);
        } else if (c0978b == null) {
            try {
                throw new IllegalArgumentException(f2837z[1]);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } else {
            this.f2840c = str;
            this.f2838a = c0978b;
            this.f2839b = new eb();
            m7226a(c0978b);
            m7231c(c0978b);
            m7229b(c0978b);
        }
    }

    /* renamed from: z */
    private static String m7223z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 108;
                    break;
                case 1:
                    i2 = 3;
                    break;
                case 2:
                    i2 = 73;
                    break;
                case 3:
                    i2 = 51;
                    break;
                default:
                    i2 = 74;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7224z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 74);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public String m7225a() {
        return this.f2840c;
    }

    /* renamed from: a */
    protected void m7226a(C0978b c0978b) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            stringBuilder.append(f2837z[5]);
            stringBuilder.append(m7225a());
            stringBuilder.append("\"");
            if (c0978b.mo3265a() != null) {
                stringBuilder.append(f2837z[6]);
                stringBuilder.append(c0978b.mo3265a());
                stringBuilder.append("\"");
            }
            m7227a(f2837z[4], stringBuilder.toString());
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* renamed from: a */
    public void m7227a(String str, String str2) {
        if (str == null) {
            try {
                throw new IllegalArgumentException(f2837z[3]);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        this.f2839b.m7133a(new C1000y(str, str2));
    }

    /* renamed from: b */
    public C0978b m7228b() {
        return this.f2838a;
    }

    /* renamed from: b */
    protected void m7229b(C0978b c0978b) {
        m7227a(f2837z[0], c0978b.mo3269f());
    }

    /* renamed from: c */
    public eb m7230c() {
        return this.f2839b;
    }

    /* renamed from: c */
    protected void m7231c(C0978b c0978b) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            stringBuilder.append(c0978b.mo3262d());
            if (c0978b.mo3268c() != null) {
                stringBuilder.append(f2837z[8]);
                stringBuilder.append(c0978b.mo3268c());
            }
            m7227a(f2837z[7], stringBuilder.toString());
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }
}
