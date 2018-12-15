package p000a.p001a.p002a.p011c;

import fr.pcsoft.wdjava.core.C0607n;
import p000a.p001a.p002a.C0213t;
import p000a.p001a.p002a.p019g.C0185f;

/* renamed from: a.a.a.c.n */
public final class C0112n extends C0091l {
    /* renamed from: a */
    private static final float f357a = 0.7f;
    /* renamed from: b */
    private static final int f358b = 104;
    /* renamed from: c */
    private static final int f359c = 101;
    /* renamed from: d */
    private static final int f360d = 97;
    /* renamed from: e */
    private static final int f361e = 106;
    /* renamed from: f */
    private static final float f362f = 0.25f;
    /* renamed from: g */
    private static final int f363g = 98;
    /* renamed from: h */
    static final int[][] f364h = new int[][]{new int[]{2, 1, 2, 2, 2, 2}, new int[]{2, 2, 2, 1, 2, 2}, new int[]{2, 2, 2, 2, 2, 1}, new int[]{1, 2, 1, 2, 2, 3}, new int[]{1, 2, 1, 3, 2, 2}, new int[]{1, 3, 1, 2, 2, 2}, new int[]{1, 2, 2, 2, 1, 3}, new int[]{1, 2, 2, 3, 1, 2}, new int[]{1, 3, 2, 2, 1, 2}, new int[]{2, 2, 1, 2, 1, 3}, new int[]{2, 2, 1, 3, 1, 2}, new int[]{2, 3, 1, 2, 1, 2}, new int[]{1, 1, 2, 2, 3, 2}, new int[]{1, 2, 2, 1, 3, 2}, new int[]{1, 2, 2, 2, 3, 1}, new int[]{1, 1, 3, 2, 2, 2}, new int[]{1, 2, 3, 1, 2, 2}, new int[]{1, 2, 3, 2, 2, 1}, new int[]{2, 2, 3, 2, 1, 1}, new int[]{2, 2, 1, 1, 3, 2}, new int[]{2, 2, 1, 2, 3, 1}, new int[]{2, 1, 3, 2, 1, 2}, new int[]{2, 2, 3, 1, 1, 2}, new int[]{3, 1, 2, 1, 3, 1}, new int[]{3, 1, 1, 2, 2, 2}, new int[]{3, 2, 1, 1, 2, 2}, new int[]{3, 2, 1, 2, 2, 1}, new int[]{3, 1, 2, 2, 1, 2}, new int[]{3, 2, 2, 1, 1, 2}, new int[]{3, 2, 2, 2, 1, 1}, new int[]{2, 1, 2, 1, 2, 3}, new int[]{2, 1, 2, 3, 2, 1}, new int[]{2, 3, 2, 1, 2, 1}, new int[]{1, 1, 1, 3, 2, 3}, new int[]{1, 3, 1, 1, 2, 3}, new int[]{1, 3, 1, 3, 2, 1}, new int[]{1, 1, 2, 3, 1, 3}, new int[]{1, 3, 2, 1, 1, 3}, new int[]{1, 3, 2, 3, 1, 1}, new int[]{2, 1, 1, 3, 1, 3}, new int[]{2, 3, 1, 1, 1, 3}, new int[]{2, 3, 1, 3, 1, 1}, new int[]{1, 1, 2, 1, 3, 3}, new int[]{1, 1, 2, 3, 3, 1}, new int[]{1, 3, 2, 1, 3, 1}, new int[]{1, 1, 3, 1, 2, 3}, new int[]{1, 1, 3, 3, 2, 1}, new int[]{1, 3, 3, 1, 2, 1}, new int[]{3, 1, 3, 1, 2, 1}, new int[]{2, 1, 1, 3, 3, 1}, new int[]{2, 3, 1, 1, 3, 1}, new int[]{2, 1, 3, 1, 1, 3}, new int[]{2, 1, 3, 3, 1, 1}, new int[]{2, 1, 3, 1, 3, 1}, new int[]{3, 1, 1, 1, 2, 3}, new int[]{3, 1, 1, 3, 2, 1}, new int[]{3, 3, 1, 1, 2, 1}, new int[]{3, 1, 2, 1, 1, 3}, new int[]{3, 1, 2, 3, 1, 1}, new int[]{3, 3, 2, 1, 1, 1}, new int[]{3, 1, 4, 1, 1, 1}, new int[]{2, 2, 1, 4, 1, 1}, new int[]{4, 3, 1, 1, 1, 1}, new int[]{1, 1, 1, 2, 2, 4}, new int[]{1, 1, 1, 4, 2, 2}, new int[]{1, 2, 1, 1, 2, 4}, new int[]{1, 2, 1, 4, 2, 1}, new int[]{1, 4, 1, 1, 2, 2}, new int[]{1, 4, 1, 2, 2, 1}, new int[]{1, 1, 2, 2, 1, 4}, new int[]{1, 1, 2, 4, 1, 2}, new int[]{1, 2, 2, 1, 1, 4}, new int[]{1, 2, 2, 4, 1, 1}, new int[]{1, 4, 2, 1, 1, 2}, new int[]{1, 4, 2, 2, 1, 1}, new int[]{2, 4, 1, 2, 1, 1}, new int[]{2, 2, 1, 1, 1, 4}, new int[]{4, 1, 3, 1, 1, 1}, new int[]{2, 4, 1, 1, 1, 2}, new int[]{1, 3, 4, 1, 1, 1}, new int[]{1, 1, 1, 2, 4, 2}, new int[]{1, 2, 1, 1, 4, 2}, new int[]{1, 2, 1, 2, 4, 1}, new int[]{1, 1, 4, 2, 1, 2}, new int[]{1, 2, 4, 1, 1, 2}, new int[]{1, 2, 4, 2, 1, 1}, new int[]{4, 1, 1, 2, 1, 2}, new int[]{4, 2, 1, 1, 1, 2}, new int[]{4, 2, 1, 2, 1, 1}, new int[]{2, 1, 2, 1, 4, 1}, new int[]{2, 1, 4, 1, 2, 1}, new int[]{4, 1, 2, 1, 2, 1}, new int[]{1, 1, 1, 1, 4, 3}, new int[]{1, 1, 1, 3, 4, 1}, new int[]{1, 3, 1, 1, 4, 1}, new int[]{1, 1, 4, 1, 1, 3}, new int[]{1, 1, 4, 3, 1, 1}, new int[]{4, 1, 1, 1, 1, 3}, new int[]{4, 1, 1, 3, 1, 1}, new int[]{1, 1, 3, 1, 4, 1}, new int[]{1, 1, 4, 1, 3, 1}, new int[]{3, 1, 1, 1, 4, 1}, new int[]{4, 1, 1, 1, 3, 1}, new int[]{2, 1, 1, 4, 1, 2}, new int[]{2, 1, 1, 2, 1, 4}, new int[]{2, 1, 1, 2, 3, 2}, new int[]{2, 3, 3, 1, 1, 1, 2}};
    /* renamed from: i */
    private static final int f365i = 99;
    /* renamed from: j */
    private static final int f366j = 100;
    /* renamed from: k */
    private static final int f367k = 103;
    /* renamed from: l */
    private static final int f368l = 105;
    /* renamed from: m */
    private static final int f369m = 96;
    /* renamed from: n */
    private static final int f370n = 102;
    /* renamed from: o */
    private static final int f371o = 100;
    /* renamed from: p */
    private static final int f372p = 101;
    /* renamed from: z */
    private static final String f373z = C0112n.m650z(C0112n.m651z("s %"));

    /* renamed from: a */
    private static int m648a(C0185f c0185f, int[] iArr, int i) throws C0213t {
        C0091l.m519b(c0185f, i, iArr);
        float f = f362f;
        int i2 = -1;
        for (int i3 = 0; i3 < f364h.length; i3++) {
            float a = C0091l.m516a(iArr, f364h[i3], (float) f357a);
            if (a < f) {
                i2 = i3;
                f = a;
            }
        }
        if (i2 >= 0) {
            return i2;
        }
        throw C0213t.m1269a();
    }

    /* renamed from: a */
    private static int[] m649a(C0185f c0185f) throws C0213t {
        int a = c0185f.m1136a();
        int b = c0185f.m1143b(0);
        Object obj = new int[6];
        int length = obj.length;
        int i = b;
        int i2 = 0;
        int i3 = b;
        int i4 = 0;
        while (i < a) {
            try {
                int i5;
                int i6;
                if ((c0185f.m1149c(i) ^ i2) != 0) {
                    obj[i4] = obj[i4] + 1;
                    b = i2;
                    i5 = i3;
                    i6 = i4;
                } else {
                    if (i4 == length - 1) {
                        float f = f362f;
                        b = -1;
                        i5 = 103;
                        while (i5 <= 105) {
                            float a2 = C0091l.m516a((int[]) obj, f364h[i5], (float) f357a);
                            if (a2 < f) {
                                b = i5;
                            } else {
                                a2 = f;
                            }
                            i5++;
                            f = a2;
                        }
                        if (b >= 0) {
                            try {
                                if (c0185f.m1142a(Math.max(0, i3 - ((i - i3) / 2)), i3, false)) {
                                    return new int[]{i3, i, b};
                                }
                            } catch (C0213t e) {
                                throw e;
                            }
                        }
                        i5 = i3 + (obj[0] + obj[1]);
                        System.arraycopy(obj, 2, obj, 0, length - 2);
                        obj[length - 2] = null;
                        obj[length - 1] = null;
                        i6 = i4 - 1;
                    } else {
                        i6 = i4 + 1;
                        i5 = i3;
                    }
                    try {
                        obj[i6] = 1;
                        b = i2 == 0 ? 1 : 0;
                    } catch (C0213t e2) {
                        throw e2;
                    }
                }
                i++;
                i2 = b;
                i3 = i5;
                i4 = i6;
            } catch (C0213t e22) {
                throw e22;
            }
        }
        throw C0213t.m1269a();
    }

    /* renamed from: z */
    private static String m650z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 46;
                    break;
                case 1:
                    i2 = 99;
                    break;
                case 2:
                    i2 = 20;
                    break;
                case 3:
                    i2 = 77;
                    break;
                default:
                    i2 = C0607n.co;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m651z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ C0607n.co);
        }
        return toCharArray;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public p000a.p001a.p002a.C0208m mo20a(int r26, p000a.p001a.p002a.p019g.C0185f r27, java.util.Map<p000a.p001a.p002a.C0216w, ?> r28) throws p000a.p001a.p002a.C0213t, p000a.p001a.p002a.C0212s, p000a.p001a.p002a.C0211r {
        /*
        r25 = this;
        if (r28 == 0) goto L_0x0031;
    L_0x0002:
        r2 = p000a.p001a.p002a.C0216w.ASSUME_GS1;	 Catch:{ t -> 0x002f }
        r0 = r28;
        r2 = r0.containsKey(r2);	 Catch:{ t -> 0x002f }
        if (r2 == 0) goto L_0x0031;
    L_0x000c:
        r2 = 1;
    L_0x000d:
        r17 = p000a.p001a.p002a.p011c.C0112n.m649a(r27);
        r3 = 2;
        r7 = r17[r3];
        r18 = new java.util.ArrayList;
        r3 = 20;
        r0 = r18;
        r0.<init>(r3);
        r3 = (byte) r7;
        r3 = java.lang.Byte.valueOf(r3);
        r0 = r18;
        r0.add(r3);
        switch(r7) {
            case 103: goto L_0x0033;
            case 104: goto L_0x008f;
            case 105: goto L_0x0092;
            default: goto L_0x002a;
        };
    L_0x002a:
        r2 = p000a.p001a.p002a.C0212s.m1267a();
        throw r2;
    L_0x002f:
        r2 = move-exception;
        throw r2;
    L_0x0031:
        r2 = 0;
        goto L_0x000d;
    L_0x0033:
        r3 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
    L_0x0035:
        r12 = 0;
        r11 = 0;
        r19 = new java.lang.StringBuilder;
        r4 = 20;
        r0 = r19;
        r0.<init>(r4);
        r4 = 0;
        r9 = r17[r4];
        r4 = 1;
        r13 = r17[r4];
        r4 = 6;
        r0 = new int[r4];
        r20 = r0;
        r14 = 0;
        r8 = 0;
        r4 = 0;
        r10 = 1;
        r6 = 0;
        r5 = 0;
        r16 = r11;
        r11 = r9;
        r9 = r3;
        r3 = r4;
        r4 = r7;
        r7 = r14;
        r14 = r8;
        r8 = r12;
    L_0x005a:
        if (r8 != 0) goto L_0x026c;
    L_0x005c:
        r7 = 0;
        r0 = r27;
        r1 = r20;
        r15 = p000a.p001a.p002a.p011c.C0112n.m648a(r0, r1, r13);
        r11 = (byte) r15;
        r11 = java.lang.Byte.valueOf(r11);
        r0 = r18;
        r0.add(r11);
        r11 = 106; // 0x6a float:1.49E-43 double:5.24E-322;
        if (r15 == r11) goto L_0x0074;
    L_0x0073:
        r10 = 1;
    L_0x0074:
        r11 = 106; // 0x6a float:1.49E-43 double:5.24E-322;
        if (r15 == r11) goto L_0x007d;
    L_0x0078:
        r3 = r3 + 1;
        r11 = r3 * r15;
        r4 = r4 + r11;
    L_0x007d:
        r0 = r20;
        r0 = r0.length;
        r21 = r0;
        r11 = 0;
        r12 = r13;
    L_0x0084:
        r0 = r21;
        if (r11 >= r0) goto L_0x0095;
    L_0x0088:
        r22 = r20[r11];
        r12 = r12 + r22;
        r11 = r11 + 1;
        goto L_0x0084;
    L_0x008f:
        r3 = 100;
        goto L_0x0035;
    L_0x0092:
        r3 = 99;
        goto L_0x0035;
    L_0x0095:
        switch(r15) {
            case 103: goto L_0x00be;
            case 104: goto L_0x00be;
            case 105: goto L_0x00be;
            default: goto L_0x0098;
        };
    L_0x0098:
        switch(r9) {
            case 99: goto L_0x01d7;
            case 100: goto L_0x0161;
            case 101: goto L_0x00c5;
            default: goto L_0x009b;
        };
    L_0x009b:
        r23 = r5;
        r5 = r9;
        r9 = r7;
        r7 = r6;
        r6 = r23;
        r24 = r8;
        r8 = r10;
        r10 = r24;
    L_0x00a7:
        if (r16 == 0) goto L_0x00af;
    L_0x00a9:
        r11 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        if (r5 != r11) goto L_0x0268;
    L_0x00ad:
        r5 = 100;
    L_0x00af:
        r11 = r13;
        r16 = r9;
        r13 = r12;
        r9 = r5;
        r5 = r6;
        r6 = r7;
        r7 = r14;
        r14 = r15;
        r23 = r10;
        r10 = r8;
        r8 = r23;
        goto L_0x005a;
    L_0x00be:
        r2 = p000a.p001a.p002a.C0212s.m1267a();	 Catch:{ t -> 0x00c3 }
        throw r2;	 Catch:{ t -> 0x00c3 }
    L_0x00c3:
        r2 = move-exception;
        throw r2;
    L_0x00c5:
        r11 = 64;
        if (r15 >= r11) goto L_0x00ee;
    L_0x00c9:
        if (r5 != r6) goto L_0x00e3;
    L_0x00cb:
        r5 = r15 + 32;
        r5 = (char) r5;
        r0 = r19;
        r0.append(r5);	 Catch:{ t -> 0x00e1 }
    L_0x00d3:
        r5 = 0;
        r23 = r5;
        r5 = r9;
        r9 = r7;
        r7 = r6;
        r6 = r23;
        r24 = r8;
        r8 = r10;
        r10 = r24;
        goto L_0x00a7;
    L_0x00e1:
        r2 = move-exception;
        throw r2;
    L_0x00e3:
        r5 = r15 + 32;
        r5 = r5 + 128;
        r5 = (char) r5;
        r0 = r19;
        r0.append(r5);
        goto L_0x00d3;
    L_0x00ee:
        r11 = 96;
        if (r15 >= r11) goto L_0x0115;
    L_0x00f2:
        if (r5 != r6) goto L_0x010c;
    L_0x00f4:
        r5 = r15 + -64;
        r5 = (char) r5;
        r0 = r19;
        r0.append(r5);	 Catch:{ t -> 0x010a }
    L_0x00fc:
        r5 = 0;
        r23 = r5;
        r5 = r9;
        r9 = r7;
        r7 = r6;
        r6 = r23;
        r24 = r8;
        r8 = r10;
        r10 = r24;
        goto L_0x00a7;
    L_0x010a:
        r2 = move-exception;
        throw r2;
    L_0x010c:
        r5 = r15 + 64;
        r5 = (char) r5;
        r0 = r19;
        r0.append(r5);
        goto L_0x00fc;
    L_0x0115:
        r11 = 106; // 0x6a float:1.49E-43 double:5.24E-322;
        if (r15 == r11) goto L_0x011a;
    L_0x0119:
        r10 = 0;
    L_0x011a:
        switch(r15) {
            case 96: goto L_0x011d;
            case 97: goto L_0x011d;
            case 98: goto L_0x0155;
            case 99: goto L_0x015c;
            case 100: goto L_0x0159;
            case 101: goto L_0x0145;
            case 102: goto L_0x012b;
            case 103: goto L_0x011d;
            case 104: goto L_0x011d;
            case 105: goto L_0x011d;
            case 106: goto L_0x015f;
            default: goto L_0x011d;
        };
    L_0x011d:
        r23 = r5;
        r5 = r9;
        r9 = r7;
        r7 = r6;
        r6 = r23;
        r24 = r8;
        r8 = r10;
        r10 = r24;
        goto L_0x00a7;
    L_0x012b:
        if (r2 == 0) goto L_0x011d;
    L_0x012d:
        r11 = r19.length();	 Catch:{ t -> 0x013b }
        if (r11 != 0) goto L_0x013d;
    L_0x0133:
        r11 = f373z;	 Catch:{ t -> 0x013b }
        r0 = r19;
        r0.append(r11);	 Catch:{ t -> 0x013b }
        goto L_0x011d;
    L_0x013b:
        r2 = move-exception;
        throw r2;
    L_0x013d:
        r11 = 29;
        r0 = r19;
        r0.append(r11);
        goto L_0x011d;
    L_0x0145:
        if (r6 != 0) goto L_0x014c;
    L_0x0147:
        if (r5 == 0) goto L_0x014c;
    L_0x0149:
        r6 = 1;
        r5 = 0;
        goto L_0x011d;
    L_0x014c:
        if (r6 == 0) goto L_0x0153;
    L_0x014e:
        if (r5 == 0) goto L_0x0153;
    L_0x0150:
        r6 = 0;
        r5 = 0;
        goto L_0x011d;
    L_0x0153:
        r5 = 1;
        goto L_0x011d;
    L_0x0155:
        r7 = 1;
        r9 = 100;
        goto L_0x011d;
    L_0x0159:
        r9 = 100;
        goto L_0x011d;
    L_0x015c:
        r9 = 99;
        goto L_0x011d;
    L_0x015f:
        r8 = 1;
        goto L_0x011d;
    L_0x0161:
        r11 = 96;
        if (r15 >= r11) goto L_0x018b;
    L_0x0165:
        if (r5 != r6) goto L_0x0180;
    L_0x0167:
        r5 = r15 + 32;
        r5 = (char) r5;
        r0 = r19;
        r0.append(r5);	 Catch:{ t -> 0x017e }
    L_0x016f:
        r5 = 0;
        r23 = r5;
        r5 = r9;
        r9 = r7;
        r7 = r6;
        r6 = r23;
        r24 = r8;
        r8 = r10;
        r10 = r24;
        goto L_0x00a7;
    L_0x017e:
        r2 = move-exception;
        throw r2;
    L_0x0180:
        r5 = r15 + 32;
        r5 = r5 + 128;
        r5 = (char) r5;
        r0 = r19;
        r0.append(r5);
        goto L_0x016f;
    L_0x018b:
        r11 = 106; // 0x6a float:1.49E-43 double:5.24E-322;
        if (r15 == r11) goto L_0x0190;
    L_0x018f:
        r10 = 0;
    L_0x0190:
        switch(r15) {
            case 96: goto L_0x0193;
            case 97: goto L_0x0193;
            case 98: goto L_0x01cb;
            case 99: goto L_0x01d2;
            case 100: goto L_0x01bb;
            case 101: goto L_0x01cf;
            case 102: goto L_0x01a1;
            case 103: goto L_0x0193;
            case 104: goto L_0x0193;
            case 105: goto L_0x0193;
            case 106: goto L_0x01d5;
            default: goto L_0x0193;
        };
    L_0x0193:
        r23 = r5;
        r5 = r9;
        r9 = r7;
        r7 = r6;
        r6 = r23;
        r24 = r8;
        r8 = r10;
        r10 = r24;
        goto L_0x00a7;
    L_0x01a1:
        if (r2 == 0) goto L_0x0193;
    L_0x01a3:
        r11 = r19.length();	 Catch:{ t -> 0x01b1 }
        if (r11 != 0) goto L_0x01b3;
    L_0x01a9:
        r11 = f373z;	 Catch:{ t -> 0x01b1 }
        r0 = r19;
        r0.append(r11);	 Catch:{ t -> 0x01b1 }
        goto L_0x0193;
    L_0x01b1:
        r2 = move-exception;
        throw r2;
    L_0x01b3:
        r11 = 29;
        r0 = r19;
        r0.append(r11);
        goto L_0x0193;
    L_0x01bb:
        if (r6 != 0) goto L_0x01c2;
    L_0x01bd:
        if (r5 == 0) goto L_0x01c2;
    L_0x01bf:
        r6 = 1;
        r5 = 0;
        goto L_0x0193;
    L_0x01c2:
        if (r6 == 0) goto L_0x01c9;
    L_0x01c4:
        if (r5 == 0) goto L_0x01c9;
    L_0x01c6:
        r6 = 0;
        r5 = 0;
        goto L_0x0193;
    L_0x01c9:
        r5 = 1;
        goto L_0x0193;
    L_0x01cb:
        r7 = 1;
        r9 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        goto L_0x0193;
    L_0x01cf:
        r9 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        goto L_0x0193;
    L_0x01d2:
        r9 = 99;
        goto L_0x0193;
    L_0x01d5:
        r8 = 1;
        goto L_0x0193;
    L_0x01d7:
        r11 = 100;
        if (r15 >= r11) goto L_0x01fb;
    L_0x01db:
        r11 = 10;
        if (r15 >= r11) goto L_0x01e6;
    L_0x01df:
        r11 = 48;
        r0 = r19;
        r0.append(r11);	 Catch:{ t -> 0x01f9 }
    L_0x01e6:
        r0 = r19;
        r0.append(r15);
        r23 = r5;
        r5 = r9;
        r9 = r7;
        r7 = r6;
        r6 = r23;
        r24 = r8;
        r8 = r10;
        r10 = r24;
        goto L_0x00a7;
    L_0x01f9:
        r2 = move-exception;
        throw r2;
    L_0x01fb:
        r11 = 106; // 0x6a float:1.49E-43 double:5.24E-322;
        if (r15 == r11) goto L_0x0200;
    L_0x01ff:
        r10 = 0;
    L_0x0200:
        switch(r15) {
            case 100: goto L_0x0205;
            case 101: goto L_0x0249;
            case 102: goto L_0x0215;
            case 103: goto L_0x0203;
            case 104: goto L_0x0203;
            case 105: goto L_0x0203;
            case 106: goto L_0x0259;
            default: goto L_0x0203;
        };
    L_0x0203:
        goto L_0x009b;
    L_0x0205:
        r9 = 100;
        r23 = r5;
        r5 = r9;
        r9 = r7;
        r7 = r6;
        r6 = r23;
        r24 = r8;
        r8 = r10;
        r10 = r24;
        goto L_0x00a7;
    L_0x0215:
        if (r2 == 0) goto L_0x009b;
    L_0x0217:
        r11 = r19.length();	 Catch:{ t -> 0x0232 }
        if (r11 != 0) goto L_0x0234;
    L_0x021d:
        r11 = f373z;	 Catch:{ t -> 0x0232 }
        r0 = r19;
        r0.append(r11);	 Catch:{ t -> 0x0232 }
        r23 = r5;
        r5 = r9;
        r9 = r7;
        r7 = r6;
        r6 = r23;
        r24 = r8;
        r8 = r10;
        r10 = r24;
        goto L_0x00a7;
    L_0x0232:
        r2 = move-exception;
        throw r2;
    L_0x0234:
        r11 = 29;
        r0 = r19;
        r0.append(r11);
        r23 = r5;
        r5 = r9;
        r9 = r7;
        r7 = r6;
        r6 = r23;
        r24 = r8;
        r8 = r10;
        r10 = r24;
        goto L_0x00a7;
    L_0x0249:
        r9 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        r23 = r5;
        r5 = r9;
        r9 = r7;
        r7 = r6;
        r6 = r23;
        r24 = r8;
        r8 = r10;
        r10 = r24;
        goto L_0x00a7;
    L_0x0259:
        r8 = 1;
        r23 = r5;
        r5 = r9;
        r9 = r7;
        r7 = r6;
        r6 = r23;
        r24 = r8;
        r8 = r10;
        r10 = r24;
        goto L_0x00a7;
    L_0x0268:
        r5 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        goto L_0x00af;
    L_0x026c:
        r2 = r13 - r11;
        r0 = r27;
        r5 = r0.m1152f(r13);
        r6 = r27.m1136a();	 Catch:{ t -> 0x028f }
        r8 = r5 - r11;
        r8 = r8 / 2;
        r8 = r8 + r5;
        r6 = java.lang.Math.min(r6, r8);	 Catch:{ t -> 0x028f }
        r8 = 0;
        r0 = r27;
        r5 = r0.m1142a(r5, r6, r8);	 Catch:{ t -> 0x028f }
        if (r5 != 0) goto L_0x0291;
    L_0x028a:
        r2 = p000a.p001a.p002a.C0213t.m1269a();	 Catch:{ t -> 0x028f }
        throw r2;	 Catch:{ t -> 0x028f }
    L_0x028f:
        r2 = move-exception;
        throw r2;
    L_0x0291:
        r3 = r3 * r7;
        r3 = r4 - r3;
        r3 = r3 % 103;
        if (r3 == r7) goto L_0x029f;
    L_0x0298:
        r2 = p000a.p001a.p002a.C0211r.m1265a();	 Catch:{ t -> 0x029d }
        throw r2;	 Catch:{ t -> 0x029d }
    L_0x029d:
        r2 = move-exception;
        throw r2;
    L_0x029f:
        r3 = r19.length();
        if (r3 != 0) goto L_0x02ac;
    L_0x02a5:
        r2 = p000a.p001a.p002a.C0213t.m1269a();	 Catch:{ t -> 0x02aa }
        throw r2;	 Catch:{ t -> 0x02aa }
    L_0x02aa:
        r2 = move-exception;
        throw r2;
    L_0x02ac:
        if (r3 <= 0) goto L_0x02bb;
    L_0x02ae:
        if (r10 == 0) goto L_0x02bb;
    L_0x02b0:
        r4 = 99;
        if (r9 != r4) goto L_0x02ec;
    L_0x02b4:
        r4 = r3 + -2;
        r0 = r19;
        r0.delete(r4, r3);	 Catch:{ t -> 0x02ea }
    L_0x02bb:
        r3 = 1;
        r3 = r17[r3];
        r4 = 0;
        r4 = r17[r4];
        r3 = r3 + r4;
        r3 = (float) r3;
        r4 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r4 = r3 / r4;
        r3 = (float) r11;
        r2 = (float) r2;
        r5 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r2 = r2 / r5;
        r5 = r3 + r2;
        r6 = r18.size();
        r7 = new byte[r6];
        r2 = 0;
        r3 = r2;
    L_0x02d6:
        if (r3 >= r6) goto L_0x02f6;
    L_0x02d8:
        r0 = r18;
        r2 = r0.get(r3);	 Catch:{ t -> 0x02f4 }
        r2 = (java.lang.Byte) r2;	 Catch:{ t -> 0x02f4 }
        r2 = r2.byteValue();	 Catch:{ t -> 0x02f4 }
        r7[r3] = r2;	 Catch:{ t -> 0x02f4 }
        r2 = r3 + 1;
        r3 = r2;
        goto L_0x02d6;
    L_0x02ea:
        r2 = move-exception;
        throw r2;
    L_0x02ec:
        r4 = r3 + -1;
        r0 = r19;
        r0.delete(r4, r3);
        goto L_0x02bb;
    L_0x02f4:
        r2 = move-exception;
        throw r2;
    L_0x02f6:
        r2 = new a.a.a.m;
        r3 = r19.toString();
        r6 = 2;
        r6 = new p000a.p001a.p002a.eb[r6];
        r8 = 0;
        r9 = new a.a.a.eb;
        r0 = r26;
        r10 = (float) r0;
        r9.<init>(r4, r10);
        r6[r8] = r9;
        r4 = 1;
        r8 = new a.a.a.eb;
        r0 = r26;
        r9 = (float) r0;
        r8.<init>(r5, r9);
        r6[r4] = r8;
        r4 = p000a.p001a.p002a.C0217x.CODE_128;
        r2.<init>(r3, r7, r6, r4);
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.c.n.a(int, a.a.a.g.f, java.util.Map):a.a.a.m");
    }
}
