package fr.pcsoft.wdjava.ui.p083l;

import java.util.Arrays;

/* renamed from: fr.pcsoft.wdjava.ui.l.kb */
public class kb {
    /* renamed from: a */
    private String f4358a = "";
    /* renamed from: b */
    private String f4359b = "";
    /* renamed from: c */
    private final char[] f4360c = new char[]{'#', 'U'};
    /* renamed from: d */
    private final char f4361d = '\'';
    /* renamed from: e */
    private int f4362e = 0;

    /* renamed from: a */
    private char m10217a(char c, char c2) {
        switch (c2) {
            case '#':
                if (Character.isDigit(c)) {
                    return c;
                }
                break;
            case 'U':
                if (Character.isLetter(c)) {
                    return Character.toUpperCase(c);
                }
                break;
        }
        return '\u0004';
    }

    /* renamed from: a */
    public String m10218a() {
        return this.f4358a;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public void m10219a(int r10, int r11, java.lang.String r12) {
        /*
        r9 = this;
        r1 = 0;
        r0 = r9.f4359b;
        r3 = r0.length();
        r4 = new java.lang.StringBuffer;
        r0 = r9.f4358a;
        r4.<init>(r0);
        r0 = r1;
        r2 = r1;
    L_0x0010:
        if (r2 >= r3) goto L_0x0089;
    L_0x0012:
        r5 = r9.f4359b;
        r5 = r5.charAt(r2);
        r6 = r9.f4360c;
        r6 = java.util.Arrays.binarySearch(r6, r5);
        r7 = -1;
        if (r6 > r7) goto L_0x0058;
    L_0x0021:
        r6 = 39;
        if (r5 != r6) goto L_0x0032;
    L_0x0025:
        r1 = r1 + 1;
        r2 = r2 + 1;
        r8 = r1;
        r1 = r0;
        r0 = r8;
    L_0x002c:
        r2 = r2 + 1;
        r8 = r0;
        r0 = r1;
        r1 = r8;
        goto L_0x0010;
    L_0x0032:
        if (r2 < r10) goto L_0x009b;
    L_0x0034:
        r5 = r12.length();
        if (r0 >= r5) goto L_0x009b;
    L_0x003a:
        r5 = r12.charAt(r0);
        r6 = java.lang.Character.isDigit(r5);
        if (r6 != 0) goto L_0x0049;
    L_0x0044:
        switch(r5) {
            case 65: goto L_0x004d;
            case 77: goto L_0x004d;
            case 80: goto L_0x004d;
            default: goto L_0x0047;
        };
    L_0x0047:
        r0 = r0 + 1;
    L_0x0049:
        r8 = r1;
        r1 = r0;
        r0 = r8;
        goto L_0x002c;
    L_0x004d:
        r5 = r9.f4359b;
        r6 = 85;
        r5 = r5.indexOf(r6);
        if (r5 < r2) goto L_0x0047;
    L_0x0057:
        goto L_0x0049;
    L_0x0058:
        if (r2 < r10) goto L_0x009b;
    L_0x005a:
        r6 = r12.length();
        if (r0 >= r6) goto L_0x007a;
    L_0x0060:
        r6 = r12.charAt(r0);
        r5 = r9.m10217a(r6, r5);
        r6 = 4;
        if (r5 == r6) goto L_0x009a;
    L_0x006b:
        r5 = r2 - r1;
        r6 = r12.charAt(r0);
        r4.setCharAt(r5, r6);
        r0 = r0 + 1;
        r8 = r1;
        r1 = r0;
        r0 = r8;
        goto L_0x002c;
    L_0x007a:
        if (r0 >= r11) goto L_0x0089;
    L_0x007c:
        r5 = r2 - r1;
        r6 = 95;
        r4.setCharAt(r5, r6);
        r0 = r0 + 1;
        r8 = r1;
        r1 = r0;
        r0 = r8;
        goto L_0x002c;
    L_0x0089:
        r0 = r12.length();
        r0 = r0 + r10;
        r0 = java.lang.Math.min(r3, r0);
        r9.f4362e = r0;
        r0 = r4.toString();
        r9.f4358a = r0;
    L_0x009a:
        return;
    L_0x009b:
        r8 = r1;
        r1 = r0;
        r0 = r8;
        goto L_0x002c;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.ui.l.kb.a(int, int, java.lang.String):void");
    }

    /* renamed from: a */
    public void m10220a(String str) {
        m10219a(0, this.f4358a.length(), str);
    }

    /* renamed from: b */
    public void m10221b() {
        this.f4359b = null;
        this.f4358a = null;
    }

    /* renamed from: b */
    public void m10222b(String str) {
        this.f4359b = str;
        int i = 0;
        int length = str.length();
        StringBuffer stringBuffer = new StringBuffer(str.length());
        while (i < length) {
            char charAt = str.charAt(i);
            if (Arrays.binarySearch(this.f4360c, charAt) > -1) {
                stringBuffer.append(C1449i.hb);
            } else if (charAt == '\'') {
                i++;
                if (i < length) {
                    stringBuffer.append(str.charAt(i));
                }
            } else {
                stringBuffer.append(charAt);
            }
            i++;
        }
        this.f4358a = stringBuffer.toString();
    }

    /* renamed from: c */
    public int m10223c() {
        return this.f4362e;
    }
}
