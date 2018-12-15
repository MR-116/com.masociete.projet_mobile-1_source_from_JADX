package p000a.p001a.p002a.p011c.p012a.p013a.p014a;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.ui.p083l.C1449i;
import p000a.p001a.p002a.C0212s;
import p000a.p001a.p002a.C0213t;
import p000a.p001a.p002a.p019g.C0185f;

/* renamed from: a.a.a.c.a.a.a.h */
final class C0077h {
    /* renamed from: z */
    private static final String f225z = C0077h.m463z(C0077h.m464z("|UEqJQ^A>GVFGrG\\\u0010Gr^PQHkC]BO}\u000eNQJkK\u0002\u0010"));
    /* renamed from: a */
    private final StringBuilder f226a = new StringBuilder();
    /* renamed from: b */
    private final C0185f f227b;
    /* renamed from: c */
    private final C0070a f228c = new C0070a();

    C0077h(C0185f c0185f) {
        this.f227b = c0185f;
    }

    /* renamed from: a */
    static int m449a(C0185f c0185f, int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        while (i4 < i2) {
            try {
                if (c0185f.m1149c(i + i4)) {
                    i3 |= 1 << ((i2 - i4) - 1);
                }
                i4++;
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        return i3;
    }

    /* renamed from: a */
    private C0078i m450a() throws C0212s {
        while (m462i(this.f228c.m421a())) {
            C0072c d = m456d(this.f228c.m421a());
            this.f228c.m422a(d.m430a());
            if (d.m432c()) {
                return new C0078i(new C0073d(this.f228c.m421a(), this.f226a.toString()), true);
            }
            this.f226a.append(d.m431b());
        }
        try {
            if (m461h(this.f228c.m421a())) {
                this.f228c.m423b(3);
                this.f228c.m429g();
            } else {
                try {
                    if (m460g(this.f228c.m421a())) {
                        if (this.f228c.m421a() + 5 < this.f227b.m1136a()) {
                            this.f228c.m423b(5);
                        } else {
                            this.f228c.m422a(this.f227b.m1136a());
                        }
                        this.f228c.m427e();
                    }
                } catch (C0212s e) {
                    throw e;
                } catch (C0212s e2) {
                    throw e2;
                }
            }
            return new C0078i(false);
        } catch (C0212s e22) {
            throw e22;
        }
    }

    /* renamed from: a */
    private boolean m451a(int i) {
        try {
            if (i + 1 > this.f227b.m1136a()) {
                return false;
            }
            int i2 = 0;
            while (i2 < 4) {
                try {
                    if (i2 + i >= this.f227b.m1136a()) {
                        break;
                    } else if (this.f227b.m1149c(i + i2)) {
                        return false;
                    } else {
                        i2++;
                    }
                } catch (IllegalStateException e) {
                    throw e;
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            }
            return true;
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    /* renamed from: b */
    private C0074e m452b(int i) throws C0212s {
        if (i + 7 > this.f227b.m1136a()) {
            int a = m465a(i, 4);
            if (a != 0) {
                return new C0074e(this.f227b.m1136a(), a - 1, 10);
            }
            try {
                return new C0074e(this.f227b.m1136a(), 10, 10);
            } catch (C0212s e) {
                throw e;
            }
        }
        int a2 = m465a(i, 7);
        return new C0074e(i + 7, (a2 - 8) / 11, (a2 - 8) % 11);
    }

    /* renamed from: b */
    private C0078i m453b() {
        while (m459f(this.f228c.m421a())) {
            C0072c c = m454c(this.f228c.m421a());
            this.f228c.m422a(c.m430a());
            if (c.m432c()) {
                return new C0078i(new C0073d(this.f228c.m421a(), this.f226a.toString()), true);
            }
            this.f226a.append(c.m431b());
        }
        try {
            if (m461h(this.f228c.m421a())) {
                this.f228c.m423b(3);
                this.f228c.m429g();
            } else {
                try {
                    if (m460g(this.f228c.m421a())) {
                        if (this.f228c.m421a() + 5 < this.f227b.m1136a()) {
                            this.f228c.m423b(5);
                        } else {
                            this.f228c.m422a(this.f227b.m1136a());
                        }
                        this.f228c.m426d();
                    }
                } catch (IllegalStateException e) {
                    throw e;
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            }
            return new C0078i(false);
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    /* renamed from: c */
    private C0072c m454c(int i) {
        int a = m465a(i, 5);
        if (a == 15) {
            try {
                return new C0072c(i + 5, '$');
            } catch (IllegalStateException e) {
                throw e;
            }
        } else if (a < 5 || a >= 15) {
            a = m465a(i, 6);
            if (a < 32 || a >= 58) {
                char c;
                switch (a) {
                    case 58:
                        c = '*';
                        break;
                    case 59:
                        c = ',';
                        break;
                    case 60:
                        c = '-';
                        break;
                    case 61:
                        c = '.';
                        break;
                    case 62:
                        c = '/';
                        break;
                    default:
                        throw new IllegalStateException(f225z + a);
                }
                return new C0072c(i + 6, c);
            }
            try {
                return new C0072c(i + 6, (char) (a + 33));
            } catch (IllegalStateException e2) {
                throw e2;
            }
        } else {
            try {
                return new C0072c(i + 5, (char) ((a + 48) - 5));
            } catch (IllegalStateException e22) {
                throw e22;
            }
        }
    }

    /* renamed from: c */
    private C0078i m455c() throws C0212s {
        while (m458e(this.f228c.m421a())) {
            C0074e b = m452b(this.f228c.m421a());
            try {
                this.f228c.m422a(b.m430a());
                if (b.m437c()) {
                    return new C0078i(b.m436b() ? new C0073d(this.f228c.m421a(), this.f226a.toString()) : new C0073d(this.f228c.m421a(), this.f226a.toString(), b.m438d()), true);
                }
                this.f226a.append(b.m440f());
                if (b.m436b()) {
                    return new C0078i(new C0073d(this.f228c.m421a(), this.f226a.toString()), true);
                }
                this.f226a.append(b.m438d());
            } catch (C0212s e) {
                throw e;
            }
        }
        try {
            if (m451a(this.f228c.m421a())) {
                this.f228c.m427e();
                this.f228c.m423b(4);
            }
            return new C0078i(false);
        } catch (C0212s e2) {
            throw e2;
        }
    }

    /* renamed from: d */
    private C0072c m456d(int i) throws C0212s {
        int a = m465a(i, 5);
        if (a == 15) {
            try {
                return new C0072c(i + 5, '$');
            } catch (C0212s e) {
                throw e;
            }
        } else if (a < 5 || a >= 15) {
            a = m465a(i, 7);
            if (a >= 64 && a < 90) {
                try {
                    return new C0072c(i + 7, (char) (a + 1));
                } catch (C0212s e2) {
                    throw e2;
                }
            } else if (a < 90 || a >= 116) {
                char c;
                switch (m465a(i, 8)) {
                    case 232:
                        c = '!';
                        break;
                    case 233:
                        c = '\"';
                        break;
                    case C0607n.Jn /*234*/:
                        c = '%';
                        break;
                    case 235:
                        c = '&';
                        break;
                    case 236:
                        c = '\'';
                        break;
                    case C0607n.yk /*237*/:
                        c = '(';
                        break;
                    case 238:
                        c = ')';
                        break;
                    case C0607n.Au /*239*/:
                        c = '*';
                        break;
                    case 240:
                        c = '+';
                        break;
                    case C0607n.bh /*241*/:
                        c = ',';
                        break;
                    case 242:
                        c = '-';
                        break;
                    case C0607n.Xn /*243*/:
                        c = '.';
                        break;
                    case C0607n.uw /*244*/:
                        c = '/';
                        break;
                    case 245:
                        c = ':';
                        break;
                    case 246:
                        c = ';';
                        break;
                    case 247:
                        c = '<';
                        break;
                    case 248:
                        c = '=';
                        break;
                    case 249:
                        c = '>';
                        break;
                    case C0607n.Ux /*250*/:
                        c = '?';
                        break;
                    case 251:
                        c = C1449i.hb;
                        break;
                    case 252:
                        c = ' ';
                        break;
                    default:
                        throw C0212s.m1267a();
                }
                return new C0072c(i + 8, c);
            } else {
                try {
                    return new C0072c(i + 7, (char) (a + 7));
                } catch (C0212s e22) {
                    throw e22;
                }
            }
        } else {
            try {
                return new C0072c(i + 5, (char) ((a + 48) - 5));
            } catch (C0212s e222) {
                throw e222;
            }
        }
    }

    /* renamed from: d */
    private C0073d m457d() throws C0212s {
        C0078i c0078i;
        boolean a;
        do {
            int a2 = this.f228c.m421a();
            C0078i b;
            if (this.f228c.m424b()) {
                b = m453b();
                a = b.m468a();
                c0078i = b;
            } else if (this.f228c.m428f()) {
                b = m450a();
                a = b.m468a();
                c0078i = b;
            } else {
                b = m455c();
                a = b.m468a();
                c0078i = b;
            }
            try {
                if ((a2 != this.f228c.m421a() ? 1 : null) == null && !a) {
                    break;
                }
            } catch (C0212s e) {
                throw e;
            }
        } while (!a);
        return c0078i.m469b();
    }

    /* renamed from: e */
    private boolean m458e(int i) {
        try {
            if (i + 7 > this.f227b.m1136a()) {
                return i + 4 <= this.f227b.m1136a();
            } else {
                int i2 = i;
                while (i2 < i + 3) {
                    try {
                        if (this.f227b.m1149c(i2)) {
                            return true;
                        }
                        i2++;
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                }
                return this.f227b.m1149c(i + 3);
            }
        } catch (IllegalStateException e2) {
            throw e2;
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    /* renamed from: f */
    private boolean m459f(int i) {
        boolean z = true;
        try {
            if (i + 5 > this.f227b.m1136a()) {
                return false;
            }
            int a = m465a(i, 5);
            if (a >= 5 && a < 16) {
                return true;
            }
            try {
                if (i + 6 > this.f227b.m1136a()) {
                    return false;
                }
                a = m465a(i, 6);
                if (a < 16 || a >= 63) {
                    z = false;
                }
                return z;
            } catch (IllegalStateException e) {
                throw e;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    /* renamed from: g */
    private boolean m460g(int i) {
        try {
            if (i + 1 > this.f227b.m1136a()) {
                return false;
            }
            int i2 = 0;
            while (i2 < 5) {
                try {
                    if (i2 + i >= this.f227b.m1136a()) {
                        break;
                    }
                    if (i2 == 2) {
                        try {
                            if (!this.f227b.m1149c(i + 2)) {
                                return false;
                            }
                        } catch (IllegalStateException e) {
                            throw e;
                        }
                    }
                    try {
                        if (this.f227b.m1149c(i + i2)) {
                            return false;
                        }
                    } catch (IllegalStateException e2) {
                        throw e2;
                    }
                    i2++;
                } catch (IllegalStateException e22) {
                    throw e22;
                } catch (IllegalStateException e222) {
                    throw e222;
                }
            }
            return true;
        } catch (IllegalStateException e2222) {
            throw e2222;
        }
    }

    /* renamed from: h */
    private boolean m461h(int i) {
        try {
            if (i + 3 > this.f227b.m1136a()) {
                return false;
            }
            int i2 = i;
            while (i2 < i + 3) {
                try {
                    if (this.f227b.m1149c(i2)) {
                        return false;
                    }
                    i2++;
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
            return true;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    /* renamed from: i */
    private boolean m462i(int i) {
        boolean z = true;
        try {
            if (i + 5 > this.f227b.m1136a()) {
                return false;
            }
            int a = m465a(i, 5);
            if (a >= 5 && a < 16) {
                return true;
            }
            try {
                if (i + 7 > this.f227b.m1136a()) {
                    return false;
                }
                a = m465a(i, 7);
                if (a >= 64 && a < 116) {
                    return true;
                }
                try {
                    if (i + 8 > this.f227b.m1136a()) {
                        return false;
                    }
                    a = m465a(i, 8);
                    if (a < 232 || a >= 253) {
                        z = false;
                    }
                    return z;
                } catch (IllegalStateException e) {
                    throw e;
                }
            } catch (IllegalStateException e2) {
                throw e2;
            }
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    /* renamed from: z */
    private static String m463z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 56;
                    break;
                case 1:
                    i2 = 48;
                    break;
                case 2:
                    i2 = 38;
                    break;
                case 3:
                    i2 = 30;
                    break;
                default:
                    i2 = 46;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m464z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 46);
        }
        return toCharArray;
    }

    /* renamed from: a */
    int m465a(int i, int i2) {
        return C0077h.m449a(this.f227b, i, i2);
    }

    /* renamed from: a */
    C0073d m466a(int i, String str) throws C0212s {
        try {
            this.f226a.setLength(0);
            if (str != null) {
                this.f226a.append(str);
            }
            this.f228c.m422a(i);
            C0073d d = m457d();
            if (d != null) {
                try {
                    if (d.m435d()) {
                        return new C0073d(this.f228c.m421a(), this.f226a.toString(), d.m434c());
                    }
                } catch (C0212s e) {
                    throw e;
                }
            }
            return new C0073d(this.f228c.m421a(), this.f226a.toString());
        } catch (C0212s e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    String m467a(StringBuilder stringBuilder, int i) throws C0213t, C0212s {
        String str = null;
        while (true) {
            C0073d a = m466a(i, str);
            str = C0076g.m445a(a.m433b());
            if (str != null) {
                try {
                    stringBuilder.append(str);
                } catch (C0213t e) {
                    throw e;
                }
            }
            str = a.m435d() ? String.valueOf(a.m434c()) : null;
            try {
                if (i == a.m430a()) {
                    return stringBuilder.toString();
                }
                i = a.m430a();
            } catch (C0213t e2) {
                throw e2;
            }
        }
    }
}
