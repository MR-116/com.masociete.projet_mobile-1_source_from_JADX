package p000a.p001a.p002a.p022f.p025c.p026a;

import fr.pcsoft.wdjava.core.C0607n;

/* renamed from: a.a.a.f.c.a.b */
final class C0156b {
    /* renamed from: z */
    private static final String[] f582z = new String[]{C0156b.m925z(C0156b.m926z("85:\r\r\u0000)\u000e\u0017\r\f)~\u001c\u000eU41\fA\u001d;(\u001dA\u0006;3\u001dA85:\r\r\u0000)\u0019>A\u00133;\u0014\u0005")), C0156b.m925z(C0156b.m926z("Uq~")), C0156b.m925z(C0156b.m926z("\r\u0004")), C0156b.m925z(C0156b.m926z("Uw~"))};
    /* renamed from: a */
    private final C0155a f583a;
    /* renamed from: b */
    private final int[] f584b;

    C0156b(C0155a c0155a, int[] iArr) {
        int i = 1;
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f583a = c0155a;
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
                            this.f584b = new int[]{0};
                            return;
                        } catch (IllegalArgumentException e2) {
                            throw e2;
                        }
                    }
                    this.f584b = new int[(length - i)];
                    System.arraycopy(iArr, i, this.f584b, 0, this.f584b.length);
                    return;
                }
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        }
        this.f584b = iArr;
    }

    /* renamed from: z */
    private static String m925z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 117;
                    break;
                case 1:
                    i2 = 90;
                    break;
                case 2:
                    i2 = 94;
                    break;
                case 3:
                    i2 = C0607n.co;
                    break;
                default:
                    i2 = 97;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m926z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 97);
        }
        return toCharArray;
    }

    /* renamed from: a */
    int m927a() {
        return this.f584b.length - 1;
    }

    /* renamed from: a */
    C0156b m928a(int i) {
        if (i == 0) {
            try {
                return this.f583a.m923c();
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } else if (i == 1) {
            return this;
        } else {
            int length = this.f584b.length;
            int[] iArr = new int[length];
            int i2 = 0;
            while (i2 < length) {
                try {
                    iArr[i2] = this.f583a.m917a(this.f584b[i2], i);
                    i2++;
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            }
            return new C0156b(this.f583a, iArr);
        }
    }

    /* renamed from: a */
    C0156b m929a(int i, int i2) {
        if (i < 0) {
            try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } else if (i2 == 0) {
            try {
                return this.f583a.m923c();
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } else {
            int length = this.f584b.length;
            int[] iArr = new int[(length + i)];
            int i3 = 0;
            while (i3 < length) {
                try {
                    iArr[i3] = this.f583a.m917a(this.f584b[i3], i2);
                    i3++;
                } catch (IllegalArgumentException e22) {
                    throw e22;
                }
            }
            return new C0156b(this.f583a, iArr);
        }
    }

    /* renamed from: a */
    C0156b m930a(C0156b c0156b) {
        try {
            if (this.f583a.equals(c0156b.f583a)) {
                try {
                    return c0156b.m936c() ? this : m935c(c0156b.m937d());
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            throw new IllegalArgumentException(f582z[0]);
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    /* renamed from: b */
    int m931b(int i) {
        int c;
        int i2 = 0;
        if (i == 0) {
            try {
                c = m934c(0);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } else if (i == 1) {
            int[] iArr = this.f584b;
            int length = iArr.length;
            c = 0;
            while (i2 < length) {
                i2++;
                c = this.f583a.m924d(c, iArr[i2]);
            }
        } else {
            i2 = this.f584b[0];
            int length2 = this.f584b.length;
            c = i2;
            i2 = 1;
            while (i2 < length2) {
                int d = this.f583a.m924d(this.f583a.m917a(i, c), this.f584b[i2]);
                i2++;
                c = d;
            }
        }
        return c;
    }

    /* renamed from: b */
    C0156b m932b(C0156b c0156b) {
        try {
            if (this.f583a.equals(c0156b.f583a)) {
                try {
                    if (!m936c()) {
                        if (!c0156b.m936c()) {
                            int[] iArr = this.f584b;
                            int length = iArr.length;
                            int[] iArr2 = c0156b.f584b;
                            int length2 = iArr2.length;
                            int[] iArr3 = new int[((length + length2) - 1)];
                            for (int i = 0; i < length; i++) {
                                int i2 = iArr[i];
                                int i3 = 0;
                                while (i3 < length2) {
                                    try {
                                        iArr3[i + i3] = this.f583a.m924d(iArr3[i + i3], this.f583a.m917a(i2, iArr2[i3]));
                                        i3++;
                                    } catch (IllegalArgumentException e) {
                                        throw e;
                                    }
                                }
                            }
                            return new C0156b(this.f583a, iArr3);
                        }
                    }
                    return this.f583a.m923c();
                } catch (IllegalArgumentException e2) {
                    throw e2;
                } catch (IllegalArgumentException e22) {
                    throw e22;
                }
            }
            throw new IllegalArgumentException(f582z[0]);
        } catch (IllegalArgumentException e222) {
            throw e222;
        }
    }

    /* renamed from: b */
    int[] m933b() {
        return this.f584b;
    }

    /* renamed from: c */
    int m934c(int i) {
        return this.f584b[(this.f584b.length - 1) - i];
    }

    /* renamed from: c */
    C0156b m935c(C0156b c0156b) {
        try {
            if (this.f583a.equals(c0156b.f583a)) {
                try {
                    if (m936c()) {
                        return c0156b;
                    }
                    try {
                        if (c0156b.m936c()) {
                            return this;
                        }
                        Object obj = this.f584b;
                        Object obj2 = c0156b.f584b;
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
                                obj4[i] = this.f583a.m924d(r1[i - length], obj[i]);
                                i++;
                            } catch (IllegalArgumentException e) {
                                throw e;
                            }
                        }
                        return new C0156b(this.f583a, obj4);
                    } catch (IllegalArgumentException e2) {
                        throw e2;
                    }
                } catch (IllegalArgumentException e22) {
                    throw e22;
                }
            }
            throw new IllegalArgumentException(f582z[0]);
        } catch (IllegalArgumentException e222) {
            throw e222;
        }
    }

    /* renamed from: c */
    boolean m936c() {
        try {
            return this.f584b[0] == 0;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* renamed from: d */
    C0156b m937d() {
        int i = 0;
        int length = this.f584b.length;
        int[] iArr = new int[length];
        while (i < length) {
            try {
                iArr[i] = this.f583a.m922c(0, this.f584b[i]);
                i++;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        return new C0156b(this.f583a, iArr);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(m927a() * 8);
        for (int a = m927a(); a >= 0; a--) {
            int c = m934c(a);
            if (c != 0) {
                if (c < 0) {
                    stringBuilder.append(f582z[3]);
                    c = -c;
                } else {
                    try {
                        if (stringBuilder.length() > 0) {
                            stringBuilder.append(f582z[1]);
                        }
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
                if (a == 0 || c != 1) {
                    try {
                        stringBuilder.append(c);
                    } catch (IllegalArgumentException e2) {
                        throw e2;
                    }
                }
                if (a == 0) {
                    continue;
                } else if (a == 1) {
                    try {
                        stringBuilder.append('x');
                    } catch (IllegalArgumentException e22) {
                        throw e22;
                    }
                } else {
                    stringBuilder.append(f582z[2]);
                    stringBuilder.append(a);
                }
            }
        }
        return stringBuilder.toString();
    }
}
