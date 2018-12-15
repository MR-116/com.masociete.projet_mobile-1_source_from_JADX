package p000a.p001a.p002a.p003a.p004a;

/* renamed from: a.a.a.a.a.j */
final class C0009j implements C0000a {
    /* renamed from: z */
    private static final String[] f49z = new String[]{C0009j.m92z(C0009j.m93z("]\u0017vnji!qnhj\u0006v'i{\u0010p'ja\u0017$ea.\u0006iwpw")), C0009j.m92z(C0009j.m93z("M\fqip.\u000eqtp.\rks$k\u001bgbajC0"))};

    C0009j() {
    }

    /* renamed from: a */
    private static String m89a(CharSequence charSequence, int i) {
        int i2 = 0;
        int length = charSequence.length() - i;
        if (length == 0) {
            try {
                throw new IllegalStateException(f49z[0]);
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        int charAt;
        int charAt2;
        char charAt3 = charSequence.charAt(i);
        if (length >= 2) {
            try {
                charAt = charSequence.charAt(i + 1);
            } catch (IllegalStateException e2) {
                throw e2;
            }
        }
        charAt = 0;
        if (length >= 3) {
            try {
                charAt2 = charSequence.charAt(i + 2);
            } catch (IllegalStateException e22) {
                throw e22;
            }
        }
        charAt2 = 0;
        if (length >= 4) {
            try {
                i2 = charSequence.charAt(i + 3);
            } catch (IllegalStateException e222) {
                throw e222;
            }
        }
        charAt = (((charAt << 12) + (charAt3 << 18)) + (charAt2 << 6)) + i2;
        char c = (char) ((charAt >> 16) & 255);
        char c2 = (char) ((charAt >> 8) & 255);
        char c3 = (char) (charAt & 255);
        StringBuilder stringBuilder = new StringBuilder(3);
        try {
            stringBuilder.append(c);
            if (length >= 2) {
                stringBuilder.append(c2);
            }
            if (length >= 3) {
                try {
                    stringBuilder.append(c3);
                } catch (IllegalStateException e2222) {
                    throw e2222;
                }
            }
            return stringBuilder.toString();
        } catch (IllegalStateException e22222) {
            throw e22222;
        }
    }

    /* renamed from: a */
    private static void m90a(char c, StringBuilder stringBuilder) {
        if (c >= ' ' && c <= '?') {
            try {
                stringBuilder.append(c);
            } catch (IllegalStateException e) {
                throw e;
            }
        } else if (c < '@' || c > '^') {
            C0001b.m15g(c);
        } else {
            try {
                stringBuilder.append((char) (c - 64));
            } catch (IllegalStateException e2) {
                throw e2;
            }
        }
    }

    /* renamed from: a */
    private static void m91a(C0006g c0006g, CharSequence charSequence) {
        try {
            int length = charSequence.length();
            if (length == 0) {
                c0006g.m59b(0);
                return;
            }
            int h;
            if (length == 1) {
                c0006g.m63f();
                h = c0006g.m67j().m37h() - c0006g.m65h();
                if (c0006g.m58b() == 0 && h <= 2) {
                    c0006g.m59b(0);
                    return;
                }
            }
            if (length > 4) {
                throw new IllegalStateException(f49z[1]);
            }
            h = length - 1;
            String a = C0009j.m89a(charSequence, 0);
            length = ((!c0006g.m66i() ? 1 : 0) == 0 || h > 2) ? 0 : 1;
            if (h <= 2) {
                c0006g.m54a(c0006g.m65h() + h);
                if (c0006g.m67j().m37h() - c0006g.m65h() >= 3) {
                    c0006g.m54a(c0006g.m65h() + a.length());
                    length = 0;
                }
            }
            if (length != 0) {
                c0006g.m52a();
                c0006g.f35a -= h;
            } else {
                c0006g.m57a(a);
            }
            c0006g.m59b(0);
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        } catch (Throwable th) {
            c0006g.m59b(0);
        }
    }

    /* renamed from: z */
    private static String m92z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 14;
                    break;
                case 1:
                    i2 = 99;
                    break;
                case 2:
                    i2 = 4;
                    break;
                case 3:
                    i2 = 7;
                    break;
                default:
                    i2 = 4;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m93z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 4);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public int mo3a() {
        return 4;
    }

    /* renamed from: a */
    public void mo4a(C0006g c0006g) {
        CharSequence stringBuilder = new StringBuilder();
        while (c0006g.m66i()) {
            C0009j.m90a(c0006g.m62e(), (StringBuilder) stringBuilder);
            c0006g.f35a++;
            if (stringBuilder.length() >= 4) {
                c0006g.m57a(C0009j.m89a(stringBuilder, 0));
                stringBuilder.delete(0, 4);
                try {
                    if (C0001b.m4a(c0006g.m68k(), c0006g.f35a, mo3a()) != mo3a()) {
                        c0006g.m59b(0);
                        break;
                    }
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
        }
        stringBuilder.append('\u001f');
        C0009j.m91a(c0006g, stringBuilder);
    }
}
