package fr.pcsoft.wdjava.net;

import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.utils.C0808l;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: fr.pcsoft.wdjava.net.g */
public class C0974g {
    /* renamed from: a */
    public static final int f2738a = 256;
    /* renamed from: b */
    public static final int f2739b = 64;
    /* renamed from: c */
    public static final int f2740c = 8;
    /* renamed from: d */
    public static final int f2741d = 4;
    /* renamed from: e */
    public static final String f2742e = C0974g.m7042z(C0974g.m7043z("g\u000fW5x\u001a<M9iX\u000fQ7`C\u0014W#"));
    /* renamed from: f */
    public static final int f2743f = 32;
    /* renamed from: g */
    public static final int f2744g = 1;
    /* renamed from: h */
    public static final int f2745h = 128;
    /* renamed from: i */
    public static final String f2746i = C0974g.m7042z(C0974g.m7043z("v\bL%nE\u0014B,u^\u0012V"));
    /* renamed from: j */
    public static final int f2747j = 16;
    /* renamed from: k */
    public static final int f2748k = 2;
    /* renamed from: l */
    public static final int f2749l = 512;
    /* renamed from: z */
    private static final String[] f2750z;

    static {
        r0 = new String[5];
        r0[0] = C0974g.m7042z(C0974g.m7043z("\u0006O\u000fc1\u0019M\u0016|"));
        r0[1] = C0974g.m7042z(C0974g.m7043z("u\u001cK$b\u0017"));
        r0[2] = C0974g.m7042z(C0974g.m7043z("~.w`9\u000fH\u0001`0"));
        r0[3] = C0974g.m7042z(C0974g.m7043z("B\u000e]?/Y\u001cU("));
        r0[4] = C0974g.m7042z(C0974g.m7043z("iU\u0010\u0016_\rRxc>\u0014 \u0012d;\u001eBdb>kR\u0007e)l#\u0002bAjW\u0011r;\bUc\u0013AjW\u0011rA\u001eB\u0010\u0016_\rRxr\"jW\u0011r)\rUc},\u000e \u0012d(\bU\u0010\u0011.\u001fS\u0012\u0011.\u001eW\u0011r)l#\u0017c>\u0014 \u0013d>\u001f!\u0016eZiR\u0007n\\\u001dT\u0011r(\bUdr)l#\u001b\u0010+\u001eT\u0007e\"\u001fS\u0012d(\bY"));
        f2750z = r0;
    }

    /* renamed from: a */
    public static final String m7035a() {
        String str = "";
        try {
            return InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            return f2750z[0];
        }
    }

    /* renamed from: a */
    public static final String m7036a(String str) {
        InetAddress byName;
        String str2 = "";
        if (str != null) {
            try {
                if (!str.equals("")) {
                    byName = InetAddress.getByName(str);
                    return byName == null ? byName.getHostName() : str2;
                }
            } catch (UnknownHostException e) {
                throw e;
            } catch (SecurityException e2) {
                return str2;
            } catch (UnknownHostException e3) {
                return str2;
            }
        }
        byName = InetAddress.getLocalHost();
        if (byName == null) {
        }
    }

    /* renamed from: a */
    public static final String m7037a(String str, int i) {
        StringBuilder stringBuilder = new StringBuilder();
        Matcher matcher = Pattern.compile(f2750z[4]).matcher(str);
        try {
            if (matcher.matches()) {
                String group;
                if ((i & 1) > 0) {
                    group = matcher.group(2);
                    try {
                        if (!C0808l.m4053k(group)) {
                            stringBuilder.append(group);
                        }
                    } catch (SecurityException e) {
                        throw e;
                    }
                }
                if ((i & 2) > 0) {
                    group = matcher.group(4);
                    try {
                        if (!C0808l.m4053k(group)) {
                            stringBuilder.append(group);
                        }
                    } catch (SecurityException e2) {
                        throw e2;
                    }
                }
                if ((i & 4) > 0) {
                    group = matcher.group(5);
                    try {
                        if (!C0808l.m4053k(group)) {
                            stringBuilder.append(group);
                        }
                    } catch (SecurityException e22) {
                        throw e22;
                    }
                }
                if ((i & 8) > 0) {
                    group = matcher.group(6);
                    try {
                        if (!C0808l.m4053k(group)) {
                            stringBuilder.append(group);
                        }
                    } catch (SecurityException e222) {
                        throw e222;
                    }
                }
                if ((i & 16) > 0) {
                    group = matcher.group(8);
                    try {
                        if (!C0808l.m4053k(group)) {
                            stringBuilder.append(group);
                        }
                    } catch (SecurityException e2222) {
                        throw e2222;
                    }
                }
                if ((i & 32) > 0) {
                    group = matcher.group(10);
                    try {
                        if (!C0808l.m4053k(group)) {
                            stringBuilder.append(group);
                        }
                    } catch (SecurityException e22222) {
                        throw e22222;
                    }
                }
                if ((i & 64) > 0) {
                    group = matcher.group(12);
                    try {
                        if (!C0808l.m4053k(group)) {
                            stringBuilder.append(group);
                        }
                    } catch (SecurityException e222222) {
                        throw e222222;
                    }
                }
                if ((i & 128) > 0) {
                    group = matcher.group(13);
                    try {
                        if (!C0808l.m4053k(group)) {
                            stringBuilder.append(group);
                        }
                    } catch (SecurityException e2222222) {
                        throw e2222222;
                    }
                }
                if ((i & 256) > 0) {
                    group = matcher.group(16);
                    try {
                        if (!C0808l.m4053k(group)) {
                            stringBuilder.append(group);
                        }
                    } catch (SecurityException e22222222) {
                        throw e22222222;
                    }
                }
                if ((i & 512) > 0) {
                    String group2 = matcher.group(18);
                    try {
                        if (!C0808l.m4053k(group2)) {
                            stringBuilder.append(group2);
                        }
                    } catch (SecurityException e222222222) {
                        throw e222222222;
                    }
                }
            }
            return stringBuilder.toString();
        } catch (SecurityException e2222222222) {
            throw e2222222222;
        }
    }

    /* renamed from: a */
    public static final String m7038a(String str, String str2) {
        StringBuffer stringBuffer = new StringBuffer();
        if (str == null) {
            str = "";
        }
        try {
            stringBuffer.append(str);
            stringBuffer.append(':');
            if (str2 == null) {
                str2 = "";
            }
            stringBuffer.append(str2);
            return f2750z[1] + C0725i.m3035a(C0808l.m4045c(C0725i.m3039a(stringBuffer.toString(), f2750z[2])), f2750z[2]);
        } catch (SecurityException e) {
            throw e;
        }
    }

    /* renamed from: a */
    public static final void m7039a(String str, Map<String, String> map) {
        try {
            if (!C0808l.m4053k(str)) {
                for (String str2 : C0808l.m4029a(str, "&")) {
                    Object substring;
                    Object obj = null;
                    int indexOf = str2.indexOf(61);
                    if (indexOf > 0) {
                        try {
                            if (indexOf != str2.length() - 1) {
                                substring = str2.substring(0, indexOf);
                                obj = str2.substring(indexOf + 1);
                                map.put(substring, obj);
                            }
                        } catch (SecurityException e) {
                            throw e;
                        }
                    }
                    substring = str2;
                    map.put(substring, obj);
                }
            }
        } catch (SecurityException e2) {
            throw e2;
        }
    }

    /* renamed from: b */
    public static final String m7040b() {
        try {
            return System.getProperty(f2750z[3]);
        } catch (Exception e) {
            return "";
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    public static final java.lang.String m7041b(java.lang.String r3, int r4) {
        /*
        r0 = "";
        if (r3 == 0) goto L_0x000c;
    L_0x0004:
        r1 = "";
        r1 = r3.equals(r1);	 Catch:{ UnknownHostException -> 0x0026 }
        if (r1 == 0) goto L_0x0014;
    L_0x000c:
        r1 = java.net.InetAddress.getLocalHost();	 Catch:{ UnknownHostException -> 0x0026 }
        r3 = r1.getHostName();	 Catch:{ UnknownHostException -> 0x0026 }
    L_0x0014:
        r1 = java.net.InetAddress.getAllByName(r3);	 Catch:{ UnknownHostException -> 0x0026 }
        if (r4 < 0) goto L_0x0023;
    L_0x001a:
        r2 = r1.length;	 Catch:{ UnknownHostException -> 0x0024 }
        if (r4 >= r2) goto L_0x0023;
    L_0x001d:
        r0 = r1[r4];	 Catch:{ UnknownHostException -> 0x0026 }
        r0 = r0.getHostAddress();	 Catch:{ UnknownHostException -> 0x0026 }
    L_0x0023:
        return r0;
    L_0x0024:
        r0 = move-exception;
        throw r0;	 Catch:{ UnknownHostException -> 0x0026 }
    L_0x0026:
        r0 = move-exception;
        r0 = "";
        goto L_0x0023;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.net.g.b(java.lang.String, int):java.lang.String");
    }

    /* renamed from: z */
    private static String m7042z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 55;
                    break;
                case 1:
                    i2 = 125;
                    break;
                case 2:
                    i2 = 56;
                    break;
                case 3:
                    i2 = 77;
                    break;
                default:
                    i2 = 1;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7043z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 1);
        }
        return toCharArray;
    }
}
