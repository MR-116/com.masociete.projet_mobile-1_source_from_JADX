package p000a.p001a.p002a.p011c;

import fr.pcsoft.wdjava.ui.p065b.p067a.qb;

/* renamed from: a.a.a.c.c */
public final class C0102c extends C0101b {
    /* renamed from: a */
    private static final char[] f314a = new char[]{qb.f3204t, 'N', '*', 'E'};
    /* renamed from: b */
    private static final char[] f315b = new char[]{'/', ':', '+', '.'};
    /* renamed from: c */
    private static final char f316c = f317d[0];
    /* renamed from: d */
    private static final char[] f317d = new char[]{qb.f3195j, 'B', qb.f3208x, 'D'};
    /* renamed from: z */
    private static final String[] f318z = new String[]{C0102c.m596z(C0102c.m597z("\u0000\b\f\\o \u0002ZNw(\u0014\u000e\u0012f'\u0002ZZv(\u0014\u001eN9i")), C0102c.m596z(C0102c.m597z("\n\u0007\u0014Sl=F\u001fS`&\u0002\u001f\u001d9iA"))};

    /* renamed from: z */
    private static String m596z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 73;
                    break;
                case 1:
                    i2 = 102;
                    break;
                case 2:
                    i2 = 122;
                    break;
                case 3:
                    i2 = 61;
                    break;
                default:
                    i2 = 3;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m597z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 3);
        }
        return toCharArray;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public boolean[] mo21a(java.lang.String r11) {
        /*
        r10 = this;
        r4 = 1;
        r1 = 0;
        r0 = r11.length();
        r2 = 2;
        if (r0 >= r2) goto L_0x004c;
    L_0x0009:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = f316c;
        r0 = r0.append(r2);
        r0 = r0.append(r11);
        r2 = f316c;
        r0 = r0.append(r2);
        r11 = r0.toString();
    L_0x0022:
        r0 = 20;
        r2 = r4;
    L_0x0025:
        r3 = r11.length();	 Catch:{ IllegalArgumentException -> 0x00fb }
        r3 = r3 + -1;
        if (r2 >= r3) goto L_0x013a;
    L_0x002d:
        r3 = r11.charAt(r2);	 Catch:{ IllegalArgumentException -> 0x00fd }
        r3 = java.lang.Character.isDigit(r3);	 Catch:{ IllegalArgumentException -> 0x00fd }
        if (r3 != 0) goto L_0x0047;
    L_0x0037:
        r3 = r11.charAt(r2);	 Catch:{ IllegalArgumentException -> 0x00ff }
        r5 = 45;
        if (r3 == r5) goto L_0x0047;
    L_0x003f:
        r3 = r11.charAt(r2);	 Catch:{ IllegalArgumentException -> 0x0101 }
        r5 = 36;
        if (r3 != r5) goto L_0x0103;
    L_0x0047:
        r0 = r0 + 9;
    L_0x0049:
        r2 = r2 + 1;
        goto L_0x0025;
    L_0x004c:
        r0 = r11.charAt(r1);
        r0 = java.lang.Character.toUpperCase(r0);
        r2 = r11.length();
        r2 = r2 + -1;
        r2 = r11.charAt(r2);
        r2 = java.lang.Character.toUpperCase(r2);
        r3 = f317d;
        r3 = p000a.p001a.p002a.p011c.C0111m.m641a(r3, r0);
        r5 = f317d;
        r5 = p000a.p001a.p002a.p011c.C0111m.m641a(r5, r2);
        r6 = f314a;
        r0 = p000a.p001a.p002a.p011c.C0111m.m641a(r6, r0);
        r6 = f314a;
        r2 = p000a.p001a.p002a.p011c.C0111m.m641a(r6, r2);
        if (r3 == 0) goto L_0x009c;
    L_0x007c:
        if (r5 != 0) goto L_0x0022;
    L_0x007e:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x009a }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x009a }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x009a }
        r2 = f318z;	 Catch:{ IllegalArgumentException -> 0x009a }
        r3 = 0;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x009a }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x009a }
        r1 = r1.append(r11);	 Catch:{ IllegalArgumentException -> 0x009a }
        r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x009a }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x009a }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x009a }
    L_0x009a:
        r0 = move-exception;
        throw r0;
    L_0x009c:
        if (r0 == 0) goto L_0x00be;
    L_0x009e:
        if (r2 != 0) goto L_0x0022;
    L_0x00a0:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x00bc }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00bc }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x00bc }
        r2 = f318z;	 Catch:{ IllegalArgumentException -> 0x00bc }
        r3 = 0;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x00bc }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x00bc }
        r1 = r1.append(r11);	 Catch:{ IllegalArgumentException -> 0x00bc }
        r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x00bc }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x00bc }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00bc }
    L_0x00bc:
        r0 = move-exception;
        throw r0;
    L_0x00be:
        if (r5 != 0) goto L_0x00c2;
    L_0x00c0:
        if (r2 == 0) goto L_0x00e0;
    L_0x00c2:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x00de }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00de }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x00de }
        r2 = f318z;	 Catch:{ IllegalArgumentException -> 0x00de }
        r3 = 0;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x00de }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x00de }
        r1 = r1.append(r11);	 Catch:{ IllegalArgumentException -> 0x00de }
        r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x00de }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x00de }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00de }
    L_0x00de:
        r0 = move-exception;
        throw r0;
    L_0x00e0:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = f316c;
        r0 = r0.append(r2);
        r0 = r0.append(r11);
        r2 = f316c;
        r0 = r0.append(r2);
        r11 = r0.toString();
        goto L_0x0022;
    L_0x00fb:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00fd }
    L_0x00fd:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00ff }
    L_0x00ff:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0101 }
    L_0x0101:
        r0 = move-exception;
        throw r0;
    L_0x0103:
        r3 = f315b;	 Catch:{ IllegalArgumentException -> 0x0113 }
        r5 = r11.charAt(r2);	 Catch:{ IllegalArgumentException -> 0x0113 }
        r3 = p000a.p001a.p002a.p011c.C0111m.m641a(r3, r5);	 Catch:{ IllegalArgumentException -> 0x0113 }
        if (r3 == 0) goto L_0x0115;
    L_0x010f:
        r0 = r0 + 10;
        goto L_0x0049;
    L_0x0113:
        r0 = move-exception;
        throw r0;
    L_0x0115:
        r0 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = f318z;
        r3 = r3[r4];
        r1 = r1.append(r3);
        r2 = r11.charAt(r2);
        r1 = r1.append(r2);
        r2 = 39;
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x013a:
        r2 = r11.length();
        r2 = r2 + -1;
        r0 = r0 + r2;
        r9 = new boolean[r0];
        r0 = r1;
        r2 = r1;
    L_0x0145:
        r3 = r11.length();
        if (r0 >= r3) goto L_0x01bf;
    L_0x014b:
        r3 = r11.charAt(r0);
        r3 = java.lang.Character.toUpperCase(r3);
        if (r0 == 0) goto L_0x015d;
    L_0x0155:
        r5 = r11.length();	 Catch:{ IllegalArgumentException -> 0x018d }
        r5 = r5 + -1;
        if (r0 != r5) goto L_0x0160;
    L_0x015d:
        switch(r3) {
            case 42: goto L_0x0195;
            case 69: goto L_0x0198;
            case 78: goto L_0x0192;
            case 84: goto L_0x018f;
            default: goto L_0x0160;
        };
    L_0x0160:
        r5 = r1;
    L_0x0161:
        r6 = p000a.p001a.p002a.p011c.C0111m.f347b;	 Catch:{ IllegalArgumentException -> 0x019b }
        r6 = r6.length;	 Catch:{ IllegalArgumentException -> 0x019b }
        if (r5 >= r6) goto L_0x01c0;
    L_0x0166:
        r6 = p000a.p001a.p002a.p011c.C0111m.f347b;	 Catch:{ IllegalArgumentException -> 0x019b }
        r6 = r6[r5];	 Catch:{ IllegalArgumentException -> 0x019b }
        if (r3 != r6) goto L_0x019d;
    L_0x016c:
        r3 = p000a.p001a.p002a.p011c.C0111m.f352h;
        r3 = r3[r5];
    L_0x0170:
        r5 = r1;
        r6 = r1;
        r7 = r4;
    L_0x0173:
        r8 = 7;
        if (r5 >= r8) goto L_0x01ad;
    L_0x0176:
        r9[r2] = r7;	 Catch:{ IllegalArgumentException -> 0x01a0 }
        r8 = r2 + 1;
        r2 = 6 - r5;
        r2 = r3 >> r2;
        r2 = r2 & 1;
        if (r2 == 0) goto L_0x0184;
    L_0x0182:
        if (r6 != r4) goto L_0x01a8;
    L_0x0184:
        if (r7 != 0) goto L_0x01a6;
    L_0x0186:
        r2 = r4;
    L_0x0187:
        r5 = r5 + 1;
        r6 = r1;
        r7 = r2;
        r2 = r8;
        goto L_0x0173;
    L_0x018d:
        r0 = move-exception;
        throw r0;
    L_0x018f:
        r3 = 65;
        goto L_0x0160;
    L_0x0192:
        r3 = 66;
        goto L_0x0160;
    L_0x0195:
        r3 = 67;
        goto L_0x0160;
    L_0x0198:
        r3 = 68;
        goto L_0x0160;
    L_0x019b:
        r0 = move-exception;
        throw r0;
    L_0x019d:
        r5 = r5 + 1;
        goto L_0x0161;
    L_0x01a0:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x01a2 }
    L_0x01a2:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x01a4 }
    L_0x01a4:
        r0 = move-exception;
        throw r0;
    L_0x01a6:
        r2 = r1;
        goto L_0x0187;
    L_0x01a8:
        r2 = r6 + 1;
        r6 = r2;
        r2 = r8;
        goto L_0x0173;
    L_0x01ad:
        r3 = r11.length();	 Catch:{ IllegalArgumentException -> 0x01bd }
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x01ba;
    L_0x01b5:
        r3 = 0;
        r9[r2] = r3;	 Catch:{ IllegalArgumentException -> 0x01bd }
        r2 = r2 + 1;
    L_0x01ba:
        r0 = r0 + 1;
        goto L_0x0145;
    L_0x01bd:
        r0 = move-exception;
        throw r0;
    L_0x01bf:
        return r9;
    L_0x01c0:
        r3 = r1;
        goto L_0x0170;
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.c.c.a(java.lang.String):boolean[]");
    }
}
