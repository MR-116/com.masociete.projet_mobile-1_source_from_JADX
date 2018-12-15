package p000a.p001a.p002a.p003a.p004a;

import fr.pcsoft.wdjava.p058k.C0931b;
import fr.pcsoft.wdjava.ui.p065b.p067a.qb;
import fr.pcsoft.wdjava.ui.p083l.C1449i;

/* renamed from: a.a.a.a.a.k */
class C0010k implements C0000a {
    /* renamed from: z */
    private static final String[] f50z = new String[]{C0010k.m99z(C0010k.m100z("u/+\u0014zE\":\tn\u0000\"/\u001fo\u000ea\u001e\u0000oA2+LxE1!\u001e~\u0001")), C0010k.m99z(C0010k.m100z("i-\"\tmA-n\u000fbA3/\u000f~E3tL")), C0010k.m99z(C0010k.m100z("!_"))};

    C0010k() {
    }

    /* renamed from: a */
    private int m96a(C0006g c0006g, StringBuilder stringBuilder, StringBuilder stringBuilder2, int i) {
        int length = stringBuilder.length();
        stringBuilder.delete(length - i, length);
        c0006g.f35a--;
        length = mo5a(c0006g.m62e(), stringBuilder2);
        c0006g.m52a();
        return length;
    }

    /* renamed from: a */
    private static String m97a(CharSequence charSequence, int i) {
        char charAt = (char) (((((charSequence.charAt(i) * 1600) + (charSequence.charAt(i + 1) * 40)) + charSequence.charAt(i + 2)) + 1) % 256);
        return new String(new char[]{(char) (r0 / 256), charAt});
    }

    /* renamed from: b */
    static void m98b(C0006g c0006g, StringBuilder stringBuilder) {
        c0006g.m57a(C0010k.m97a((CharSequence) stringBuilder, 0));
        stringBuilder.delete(0, 3);
    }

    /* renamed from: z */
    private static String m99z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 32;
                    break;
                case 1:
                    i2 = 65;
                    break;
                case 2:
                    i2 = 78;
                    break;
                case 3:
                    i2 = 108;
                    break;
                default:
                    i2 = 10;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m100z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 10);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public int mo3a() {
        return 1;
    }

    /* renamed from: a */
    int mo5a(char c, StringBuilder stringBuilder) {
        if (c == ' ') {
            try {
                stringBuilder.append('\u0003');
                return 1;
            } catch (IllegalStateException e) {
                throw e;
            }
        } else if (c >= '0' && c <= '9') {
            try {
                stringBuilder.append((char) ((c - 48) + 4));
                return 1;
            } catch (IllegalStateException e2) {
                throw e2;
            }
        } else if (c >= qb.f3195j && c <= qb.f3192g) {
            try {
                stringBuilder.append((char) ((c - 65) + 14));
                return 1;
            } catch (IllegalStateException e22) {
                throw e22;
            }
        } else if (c >= '\u0000' && c <= '\u001f') {
            try {
                stringBuilder.append('\u0000');
                stringBuilder.append(c);
                return 2;
            } catch (IllegalStateException e222) {
                throw e222;
            }
        } else if (c >= '!' && c <= '/') {
            try {
                stringBuilder.append('\u0001');
                stringBuilder.append((char) (c - 33));
                return 2;
            } catch (IllegalStateException e2222) {
                throw e2222;
            }
        } else if (c >= ':' && c <= '@') {
            try {
                stringBuilder.append('\u0001');
                stringBuilder.append((char) ((c - 58) + 15));
                return 2;
            } catch (IllegalStateException e22222) {
                throw e22222;
            }
        } else if (c >= C0931b.f2543a && c <= C1449i.hb) {
            try {
                stringBuilder.append('\u0001');
                stringBuilder.append((char) ((c - 91) + 22));
                return 2;
            } catch (IllegalStateException e222222) {
                throw e222222;
            }
        } else if (c >= '`' && c <= '') {
            try {
                stringBuilder.append('\u0002');
                stringBuilder.append((char) (c - 96));
                return 2;
            } catch (IllegalStateException e2222222) {
                throw e2222222;
            }
        } else if (c >= '') {
            stringBuilder.append(f50z[2]);
            return mo5a((char) (c - 128), stringBuilder) + 2;
        } else {
            throw new IllegalArgumentException(f50z[1] + c);
        }
    }

    /* renamed from: a */
    public void mo4a(C0006g c0006g) {
        StringBuilder stringBuilder = new StringBuilder();
        while (c0006g.m66i()) {
            char e = c0006g.m62e();
            c0006g.f35a++;
            int a = mo5a(e, stringBuilder);
            int length = ((stringBuilder.length() / 3) * 2) + c0006g.m65h();
            c0006g.m54a(length);
            length = c0006g.m67j().m37h() - length;
            if (!c0006g.m66i()) {
                StringBuilder stringBuilder2 = new StringBuilder();
                try {
                    if (stringBuilder.length() % 3 == 2 && (length < 2 || length > 2)) {
                        a = m96a(c0006g, stringBuilder, stringBuilder2, a);
                    }
                    while (stringBuilder.length() % 3 == 1 && ((a <= 3 && length != 1) || a > 3)) {
                        try {
                            a = m96a(c0006g, stringBuilder, stringBuilder2, a);
                        } catch (IllegalStateException e2) {
                            throw e2;
                        } catch (IllegalStateException e22) {
                            try {
                                throw e22;
                            } catch (IllegalStateException e222) {
                                throw e222;
                            }
                        }
                    }
                } catch (IllegalStateException e2222) {
                    throw e2222;
                } catch (IllegalStateException e22222) {
                    throw e22222;
                }
            } else if (stringBuilder.length() % 3 == 0) {
                a = C0001b.m4a(c0006g.m68k(), c0006g.f35a, mo3a());
                try {
                    if (a != mo3a()) {
                        c0006g.m59b(a);
                        break;
                    }
                } catch (IllegalStateException e222222) {
                    throw e222222;
                }
            }
        }
        mo6a(c0006g, stringBuilder);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    void mo6a(p000a.p001a.p002a.p003a.p004a.C0006g r7, java.lang.StringBuilder r8) {
        /*
        r6 = this;
        r5 = 1;
        r4 = 3;
        r3 = 0;
        r0 = r8.length();
        r0 = r0 / 3;
        r0 = r0 * 2;
        r1 = r8.length();
        r1 = r1 % 3;
        r2 = r7.m65h();
        r0 = r0 + r2;
        r7.m54a(r0);
        r2 = r7.m67j();
        r2 = r2.m37h();
        r0 = r2 - r0;
        r2 = 2;
        if (r1 != r2) goto L_0x0049;
    L_0x0026:
        r0 = 0;
        r8.append(r0);	 Catch:{ IllegalStateException -> 0x0036 }
    L_0x002a:
        r0 = r8.length();	 Catch:{ IllegalStateException -> 0x0034 }
        if (r0 < r4) goto L_0x0038;
    L_0x0030:
        p000a.p001a.p002a.p003a.p004a.C0010k.m98b(r7, r8);	 Catch:{ IllegalStateException -> 0x0034 }
        goto L_0x002a;
    L_0x0034:
        r0 = move-exception;
        throw r0;
    L_0x0036:
        r0 = move-exception;
        throw r0;
    L_0x0038:
        r0 = r7.m66i();	 Catch:{ IllegalStateException -> 0x0047 }
        if (r0 == 0) goto L_0x0043;
    L_0x003e:
        r0 = 254; // 0xfe float:3.56E-43 double:1.255E-321;
        r7.m53a(r0);	 Catch:{ IllegalStateException -> 0x0047 }
    L_0x0043:
        r7.m59b(r3);
        return;
    L_0x0047:
        r0 = move-exception;
        throw r0;
    L_0x0049:
        if (r0 != r5) goto L_0x006f;
    L_0x004b:
        if (r1 != r5) goto L_0x006f;
    L_0x004d:
        r0 = r8.length();	 Catch:{ IllegalStateException -> 0x0059 }
        if (r0 < r4) goto L_0x005b;
    L_0x0053:
        p000a.p001a.p002a.p003a.p004a.C0010k.m98b(r7, r8);	 Catch:{ IllegalStateException -> 0x0057 }
        goto L_0x004d;
    L_0x0057:
        r0 = move-exception;
        throw r0;
    L_0x0059:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0057 }
    L_0x005b:
        r0 = r7.m66i();	 Catch:{ IllegalStateException -> 0x006d }
        if (r0 == 0) goto L_0x0066;
    L_0x0061:
        r0 = 254; // 0xfe float:3.56E-43 double:1.255E-321;
        r7.m53a(r0);	 Catch:{ IllegalStateException -> 0x006d }
    L_0x0066:
        r0 = r7.f35a;
        r0 = r0 + -1;
        r7.f35a = r0;
        goto L_0x0043;
    L_0x006d:
        r0 = move-exception;
        throw r0;
    L_0x006f:
        if (r1 != 0) goto L_0x008f;
    L_0x0071:
        r1 = r8.length();	 Catch:{ IllegalStateException -> 0x007d }
        if (r1 < r4) goto L_0x007f;
    L_0x0077:
        p000a.p001a.p002a.p003a.p004a.C0010k.m98b(r7, r8);	 Catch:{ IllegalStateException -> 0x007b }
        goto L_0x0071;
    L_0x007b:
        r0 = move-exception;
        throw r0;
    L_0x007d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x007b }
    L_0x007f:
        if (r0 > 0) goto L_0x0087;
    L_0x0081:
        r0 = r7.m66i();	 Catch:{ IllegalStateException -> 0x008d }
        if (r0 == 0) goto L_0x0043;
    L_0x0087:
        r0 = 254; // 0xfe float:3.56E-43 double:1.255E-321;
        r7.m53a(r0);	 Catch:{ IllegalStateException -> 0x008d }
        goto L_0x0043;
    L_0x008d:
        r0 = move-exception;
        throw r0;
    L_0x008f:
        r0 = new java.lang.IllegalStateException;
        r1 = f50z;
        r1 = r1[r3];
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.a.k.a(a.a.a.a.a.g, java.lang.StringBuilder):void");
    }
}
