package p000a.p001a.p002a.p019g.p029b;

import fr.pcsoft.wdjava.ui.p065b.p067a.qb;

/* renamed from: a.a.a.g.b.a */
final class C0178a {
    /* renamed from: z */
    private static final String[] f679z = new String[]{C0178a.m1091z(C0178a.m1092z("!\u0001")), C0178a.m1091z(C0178a.m1092z(">T")), C0178a.m1091z(C0178a.m1092z("'\u0001")), C0178a.m1091z(C0178a.m1092z("'T")), C0178a.m1091z(C0178a.m1092z("\u0018oO{\u001b6ifX90fXmI;e\u0001p\u0006+*I\u001f:*R\u0004:*f{\u0007:xH}.\u0019*Gw\f3n")), C0178a.m1091z(C0178a.m1092z("\u001bcWw\r:*CgIo"))};
    /* renamed from: a */
    private final int[] f680a;
    /* renamed from: b */
    private final C0180c f681b;

    C0178a(C0180c c0180c, int[] iArr) {
        int i = 1;
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f681b = c0180c;
        int length = iArr.length;
        if (length > 1) {
            try {
                if (iArr[0] == 0) {
                    while (i < length) {
                        try {
                            if (iArr[i] != 0) {
                                break;
                            }
                            i++;
                        } catch (IllegalArgumentException e) {
                            throw e;
                        }
                    }
                    if (i == length) {
                        try {
                            this.f680a = new int[]{0};
                            return;
                        } catch (IllegalArgumentException e2) {
                            throw e2;
                        }
                    }
                    this.f680a = new int[(length - i)];
                    System.arraycopy(iArr, i, this.f680a, 0, this.f680a.length);
                    return;
                }
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        }
        this.f680a = iArr;
    }

    /* renamed from: z */
    private static String m1091z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 95;
                    break;
                case 1:
                    i2 = 10;
                    break;
                case 2:
                    i2 = 33;
                    break;
                case 3:
                    i2 = 30;
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
    private static char[] m1092z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 105);
        }
        return toCharArray;
    }

    /* renamed from: a */
    int m1093a() {
        return this.f680a.length - 1;
    }

    /* renamed from: a */
    int m1094a(int i) {
        return this.f680a[(this.f680a.length - 1) - i];
    }

    /* renamed from: a */
    C0178a m1095a(int i, int i2) {
        if (i < 0) {
            try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } else if (i2 == 0) {
            try {
                return this.f681b.m1113c();
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } else {
            int length = this.f680a.length;
            int[] iArr = new int[(length + i)];
            int i3 = 0;
            while (i3 < length) {
                try {
                    iArr[i3] = this.f681b.m1112c(this.f680a[i3], i2);
                    i3++;
                } catch (IllegalArgumentException e22) {
                    throw e22;
                }
            }
            return new C0178a(this.f681b, iArr);
        }
    }

    /* renamed from: a */
    C0178a m1096a(C0178a c0178a) {
        try {
            if (this.f681b.equals(c0178a.f681b)) {
                try {
                    if (m1102c()) {
                        return c0178a;
                    }
                    try {
                        if (c0178a.m1102c()) {
                            return this;
                        }
                        Object obj = this.f680a;
                        Object obj2 = c0178a.f680a;
                        if (obj.length <= obj2.length) {
                            Object obj3 = obj2;
                            obj2 = obj;
                            obj = obj3;
                        }
                        Object obj4 = new int[obj.length];
                        int length = obj.length - r1.length;
                        System.arraycopy(obj, 0, obj4, 0, length);
                        int i = length;
                        while (i < obj.length) {
                            try {
                                obj4[i] = C0180c.m1103a(r1[i - length], obj[i]);
                                i++;
                            } catch (IllegalArgumentException e) {
                                throw e;
                            }
                        }
                        return new C0178a(this.f681b, obj4);
                    } catch (IllegalArgumentException e2) {
                        throw e2;
                    }
                } catch (IllegalArgumentException e22) {
                    throw e22;
                }
            }
            throw new IllegalArgumentException(f679z[4]);
        } catch (IllegalArgumentException e222) {
            throw e222;
        }
    }

    /* renamed from: b */
    int m1097b(int i) {
        int a;
        int i2 = 0;
        if (i == 0) {
            try {
                a = m1094a(0);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } else if (i == 1) {
            int[] iArr = this.f680a;
            int length = iArr.length;
            a = 0;
            while (i2 < length) {
                r2 = C0180c.m1103a(a, iArr[i2]);
                i2++;
                a = r2;
            }
        } else {
            i2 = this.f680a[0];
            int length2 = this.f680a.length;
            a = i2;
            i2 = 1;
            while (i2 < length2) {
                r2 = C0180c.m1103a(this.f681b.m1112c(i, a), this.f680a[i2]);
                i2++;
                a = r2;
            }
        }
        return a;
    }

    /* renamed from: b */
    int[] m1098b() {
        return this.f680a;
    }

    /* renamed from: b */
    C0178a[] m1099b(C0178a c0178a) {
        try {
            if (this.f681b.equals(c0178a.f681b)) {
                try {
                    if (c0178a.m1102c()) {
                        throw new IllegalArgumentException(f679z[5]);
                    }
                    C0178a c = this.f681b.m1113c();
                    int b = this.f681b.m1109b(c0178a.m1094a(c0178a.m1093a()));
                    C0178a c0178a2 = c;
                    c = this;
                    while (c.m1093a() >= c0178a.m1093a() && !c.m1102c()) {
                        try {
                            int a = c.m1093a() - c0178a.m1093a();
                            int c2 = this.f681b.m1112c(c.m1094a(c.m1093a()), b);
                            C0178a a2 = c0178a.m1095a(a, c2);
                            c0178a2 = c0178a2.m1096a(this.f681b.m1110b(a, c2));
                            c = c.m1096a(a2);
                        } catch (IllegalArgumentException e) {
                            throw e;
                        }
                    }
                    return new C0178a[]{c0178a2, c};
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            }
            throw new IllegalArgumentException(f679z[4]);
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    /* renamed from: c */
    C0178a m1100c(int i) {
        if (i == 0) {
            try {
                return this.f681b.m1113c();
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } else if (i == 1) {
            return this;
        } else {
            int length = this.f680a.length;
            int[] iArr = new int[length];
            int i2 = 0;
            while (i2 < length) {
                try {
                    iArr[i2] = this.f681b.m1112c(this.f680a[i2], i);
                    i2++;
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            }
            return new C0178a(this.f681b, iArr);
        }
    }

    /* renamed from: c */
    C0178a m1101c(C0178a c0178a) {
        try {
            if (this.f681b.equals(c0178a.f681b)) {
                try {
                    if (!m1102c()) {
                        if (!c0178a.m1102c()) {
                            int[] iArr = this.f680a;
                            int length = iArr.length;
                            int[] iArr2 = c0178a.f680a;
                            int length2 = iArr2.length;
                            int[] iArr3 = new int[((length + length2) - 1)];
                            for (int i = 0; i < length; i++) {
                                int i2 = iArr[i];
                                int i3 = 0;
                                while (i3 < length2) {
                                    try {
                                        iArr3[i + i3] = C0180c.m1103a(iArr3[i + i3], this.f681b.m1112c(i2, iArr2[i3]));
                                        i3++;
                                    } catch (IllegalArgumentException e) {
                                        throw e;
                                    }
                                }
                            }
                            return new C0178a(this.f681b, iArr3);
                        }
                    }
                    return this.f681b.m1113c();
                } catch (IllegalArgumentException e2) {
                    throw e2;
                } catch (IllegalArgumentException e22) {
                    throw e22;
                }
            }
            throw new IllegalArgumentException(f679z[4]);
        } catch (IllegalArgumentException e222) {
            throw e222;
        }
    }

    /* renamed from: c */
    boolean m1102c() {
        try {
            return this.f680a[0] == 0;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(m1093a() * 8);
        for (int a = m1093a(); a >= 0; a--) {
            int a2 = m1094a(a);
            if (a2 != 0) {
                if (a2 < 0) {
                    stringBuilder.append(f679z[2]);
                    a2 = -a2;
                } else {
                    try {
                        if (stringBuilder.length() > 0) {
                            stringBuilder.append(f679z[0]);
                        }
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
                if (a == 0 || a2 != 1) {
                    a2 = this.f681b.m1111c(a2);
                    if (a2 == 0) {
                        try {
                            stringBuilder.append('1');
                        } catch (IllegalArgumentException e2) {
                            throw e2;
                        }
                    } else if (a2 == 1) {
                        try {
                            stringBuilder.append(qb.f3206v);
                        } catch (IllegalArgumentException e22) {
                            throw e22;
                        }
                    } else {
                        stringBuilder.append(f679z[1]);
                        stringBuilder.append(a2);
                    }
                }
                if (a == 0) {
                    continue;
                } else if (a == 1) {
                    try {
                        stringBuilder.append('x');
                    } catch (IllegalArgumentException e222) {
                        throw e222;
                    }
                } else {
                    stringBuilder.append(f679z[3]);
                    stringBuilder.append(a);
                }
            }
        }
        return stringBuilder.toString();
    }
}
