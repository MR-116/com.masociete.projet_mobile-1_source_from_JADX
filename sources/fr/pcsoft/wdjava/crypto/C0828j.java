package fr.pcsoft.wdjava.crypto;

import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.file.C0889f;
import fr.pcsoft.wdjava.file.C0897o;
import fr.pcsoft.wdjava.file.C0901s;
import java.io.File;
import java.io.IOException;

/* renamed from: fr.pcsoft.wdjava.crypto.j */
public class C0828j {
    /* renamed from: a */
    public static final int f2200a = 1;
    /* renamed from: b */
    public static final int f2201b = 0;
    /* renamed from: c */
    private static final String f2202c = C0828j.m4256z(C0828j.m4257z("'^NpG4\u000b_hO#BO<X8BHl\\8_IZ2O\fzG9J@<X8BHl\\>]MhKwXX}Z>H\fOZ%BB{Z.[I<G9XX}@4NCz\u000e4GMo]'^NpG4\u000b_hO#BO<X8BH<C6BB-\u001cc\u0013\u001d*\u001de\u001d\u0018-\u001co\u0019\u0019*\u001bf\u0019\u001d,\u001cc\u0019\u001c(\u0016c\u001b\u0015*\u0016f\u0012\u001e-\u0018d\u0013\u0018/\u001c`\u001d\u0014*\u001bb\u0018\u001a-\u001df\u001b\u001b."));
    /* renamed from: d */
    public static final int f2203d = 2;
    /* renamed from: z */
    private static final String[] f2204z;

    static {
        r0 = new String[10];
        r0[0] = C0828j.m4256z(C0828j.m4257z("tdyJk\u0005yNk\bbaLa\u0004xe^b\u0012"));
        r0[1] = C0828j.m4256z(C0828j.m4257z("toi_|\u000e{x]i\u0012tjUm\u001fbiNq\u001ef|S}\u0004bnPk"));
        r0[2] = C0828j.m4256z(C0828j.m4257z("tme_f\u001en~Cg\u0019~S{\u0001jnPk"));
        r0[3] = C0828j.m4256z(C0828j.m4257z("tjo_k\u0004t~Yh\u0002xi"));
        r0[4] = C0828j.m4256z(C0828j.m4257z("tj`[a\bh~E~\u0003jkYq\u001eez]b\u001eoi"));
        r0[5] = C0828j.m4256z(C0828j.m4257z("tfcHq\u0013nsLo\u0004xiCx\u001eoi"));
        r0[6] = C0828j.m4256z(C0828j.m4257z("toi_|\u000e{x]i\u0012teQ~\u0018xUl\u001bn"));
        r0[7] = C0828j.m4256z(C0828j.m4257z("th~E~\u0003jkYq\u0011boTg\u0012ysUc\u0007dOg\u0015gi"));
        r0[8] = C0828j.m4256z(C0828j.m4257z("\u001eF\\s]$BNpKwOI<M%R\\hK%\u000b@}\u000e4CMu@2\u000bHy\u000e4J^}M#Ã^y\u0000"));
        r0[9] = C0828j.m4256z(C0828j.m4257z("\u001eF\\s]$BNpKwOI<J¾H^e^#N^<B6\u000bOtO>EI<J2\u000bO}\\6HXô\\2\u0005"));
        f2204z = r0;
    }

    /* renamed from: a */
    private static C0823b m4248a(int i, String str) {
        switch (i) {
            case 0:
                return new C0824c();
            case 2:
                return !str.equals("") ? new C0826e(str) : null;
            default:
                return str.equals("") ? null : new C0825d(str);
        }
    }

    /* renamed from: a */
    private static void m4249a(String str, int i) throws C0829k {
        try {
            if (str.equals("") && i != 0) {
                throw new C0829k(C0745b.m3222b(f2204z[5], new String[0]));
            } else if (i < 0 || i > 2) {
                try {
                    throw new C0829k(C0745b.m3222b(f2204z[4], new String[0]));
                } catch (C0829k e) {
                    throw e;
                }
            }
        } catch (C0829k e2) {
            throw e2;
        } catch (C0829k e22) {
            throw e22;
        }
    }

    /* renamed from: a */
    public static void m4250a(String str, String str2, String str3, int i) throws C0829k, C0901s {
        C0828j.m4249a(str3, i);
        File j = C0897o.m6290j(str);
        try {
            if (!j.exists()) {
                throw new C0901s(C0745b.m3222b(f2204z[0], str), C0745b.m3222b(f2204z[2], new String[0]));
            } else if (i == 0) {
                try {
                    C0889f.m6213a(str, str2, 0, true, false);
                } catch (Exception e) {
                    throw e;
                }
            } else {
                File j2 = C0897o.m6290j(str2);
                try {
                    C0823b a = C0828j.m4248a(i, str3);
                    if (a != null) {
                        a.mo2760b(j, j2);
                    }
                } catch (Exception e2) {
                    try {
                        throw new C0829k(C0745b.m3222b(f2204z[7], new String[0]), e2 instanceof IOException ? C0745b.m3222b(f2204z[3], new String[0]) : "");
                    } catch (Exception e22) {
                        throw e22;
                    }
                }
            }
        } catch (Exception e222) {
            throw e222;
        }
    }

    /* renamed from: a */
    public static byte[] m4251a(byte[] bArr) {
        try {
            if (bArr.length == 0) {
                return bArr;
            }
            try {
                return new C0826e(f2202c).mo2761b(bArr);
            } catch (Exception e) {
                C0691a.m2863b(f2204z[9], e);
                return new byte[0];
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    public static byte[] m4252a(byte[] bArr, String str, int i) throws C0829k {
        try {
            C0828j.m4249a(str, i);
            if (bArr.length != 0) {
                C0823b a = C0828j.m4248a(i, str);
                if (a == null) {
                    try {
                        bArr = new byte[0];
                    } catch (Exception e) {
                        throw e;
                    }
                }
                try {
                    bArr = a.mo2759a(bArr);
                } catch (Exception e2) {
                    throw new C0829k(e2.getMessage());
                }
            }
            return bArr;
        } catch (Exception e22) {
            throw e22;
        }
    }

    /* renamed from: b */
    public static void m4253b(String str, String str2, String str3, int i) throws C0829k, C0901s {
        C0828j.m4249a(str3, i);
        File j = C0897o.m6290j(str);
        try {
            if (!j.exists()) {
                throw new C0901s(C0745b.m3222b(f2204z[0], str), C0745b.m3222b(f2204z[2], new String[0]));
            } else if (i == 0) {
                try {
                    C0889f.m6213a(str, str2, 0, true, false);
                } catch (Exception e) {
                    throw e;
                }
            } else {
                File j2 = C0897o.m6290j(str2);
                try {
                    C0823b a = C0828j.m4248a(i, str3);
                    if (a != null) {
                        a.mo2758a(j, j2);
                    }
                } catch (Exception e2) {
                    try {
                        throw new C0829k(C0745b.m3222b(f2204z[1], new String[0]), e2 instanceof IOException ? C0745b.m3222b(f2204z[3], new String[0]) : "");
                    } catch (Exception e22) {
                        throw e22;
                    }
                }
            }
        } catch (Exception e222) {
            throw e222;
        }
    }

    /* renamed from: b */
    public static byte[] m4254b(byte[] bArr) {
        try {
            if (bArr.length == 0) {
                return bArr;
            }
            try {
                return new C0826e(f2202c).mo2759a(bArr);
            } catch (Exception e) {
                C0691a.m2863b(f2204z[8], e);
                return new byte[0];
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* renamed from: b */
    public static byte[] m4255b(byte[] bArr, String str, int i) throws C0829k {
        try {
            C0828j.m4249a(str, i);
            if (bArr.length != 0) {
                C0823b a = C0828j.m4248a(i, str);
                if (a == null) {
                    try {
                        bArr = new byte[0];
                    } catch (Exception e) {
                        throw e;
                    }
                }
                try {
                    bArr = a.mo2761b(bArr);
                } catch (Exception e2) {
                    throw new C0829k(C0745b.m3222b(f2204z[6], new String[0]));
                }
            }
            return bArr;
        } catch (Exception e3) {
            throw e3;
        }
    }

    /* renamed from: z */
    private static String m4256z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 87;
                    break;
                case 1:
                    i2 = 43;
                    break;
                case 2:
                    i2 = 44;
                    break;
                case 3:
                    i2 = 28;
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
    private static char[] m4257z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 46);
        }
        return toCharArray;
    }
}
