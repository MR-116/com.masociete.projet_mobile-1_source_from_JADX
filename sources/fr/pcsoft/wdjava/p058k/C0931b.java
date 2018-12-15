package fr.pcsoft.wdjava.p058k;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/* renamed from: fr.pcsoft.wdjava.k.b */
public class C0931b {
    /* renamed from: a */
    public static final char f2543a = '[';
    /* renamed from: b */
    private static final char f2544b = '=';
    /* renamed from: c */
    public static final char f2545c = ']';
    /* renamed from: d */
    private static final char f2546d = ';';
    /* renamed from: f */
    private static final int f2547f = 1024;
    /* renamed from: g */
    private static final char[] f2548g = new char[]{f2543a, f2545c};
    /* renamed from: z */
    private static final String f2549z = C0931b.m6772z(C0931b.m6773z("UN"));
    /* renamed from: e */
    private Map f2550e;
    /* renamed from: h */
    private String f2551h;

    public C0931b(String str) {
        if (!C0931b.m6771e(str)) {
            str = "";
        }
        this.f2551h = str;
        this.f2550e = new HashMap();
    }

    /* renamed from: a */
    private C0932c m6769a(String str) {
        return (C0932c) this.f2550e.get(str);
    }

    static String access$000(C0931b c0931b) {
        return c0931b.m6770d();
    }

    /* renamed from: d */
    private String m6770d() {
        return f2543a + this.f2551h.trim() + f2545c;
    }

    /* renamed from: e */
    private static boolean m6771e(String str) {
        if (str.trim().equals("")) {
            return false;
        }
        for (char indexOf : f2548g) {
            if (str.indexOf(indexOf) >= 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: z */
    private static String m6772z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 88;
                    break;
                case 1:
                    i2 = 68;
                    break;
                case 2:
                    i2 = 9;
                    break;
                case 3:
                    i2 = 105;
                    break;
                default:
                    i2 = 44;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m6773z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 44);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public String m6774a() {
        return this.f2551h;
    }

    /* renamed from: a */
    public void m6775a(BufferedReader bufferedReader) throws IOException {
        while (bufferedReader.ready()) {
            bufferedReader.mark(1024);
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                String trim = readLine.trim();
                try {
                    if (trim.length() > 0) {
                        if (trim.charAt(0) == f2543a) {
                            bufferedReader.reset();
                            return;
                        }
                    }
                    try {
                        if (!trim.equals("")) {
                            try {
                                if (trim.charAt(0) != f2546d) {
                                    int i = -1;
                                    int length = trim.length();
                                    int i2 = 0;
                                    while (i2 < length && i < 0) {
                                        try {
                                            if ((trim.charAt(i2) == f2544b ? 1 : 0) != 0) {
                                                i = i2;
                                            }
                                            i2++;
                                        } catch (IOException e) {
                                            throw e;
                                        }
                                    }
                                    if (i == 0) {
                                        continue;
                                    } else if (i < 0) {
                                        try {
                                            m6777a(trim, "");
                                        } catch (IOException e2) {
                                            throw e2;
                                        }
                                    } else {
                                        m6777a(trim.substring(0, i), trim.substring(i + 1));
                                    }
                                } else {
                                    continue;
                                }
                            } catch (IOException e22) {
                                throw e22;
                            }
                        }
                    } catch (IOException e222) {
                        throw e222;
                    }
                } catch (IOException e2222) {
                    throw e2222;
                } catch (IOException e22222) {
                    throw e22222;
                }
            }
            return;
        }
    }

    /* renamed from: a */
    public void m6776a(PrintWriter printWriter) throws IOException {
        for (C0932c c0932c : this.f2550e.values()) {
            try {
                printWriter.println(c0932c.toString());
            } catch (IOException e) {
                throw e;
            }
        }
        try {
            if (printWriter.checkError()) {
                throw new IOException();
            }
        } catch (IOException e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    public boolean m6777a(String str, String str2) {
        String access$100 = C0930a.m6752d(str);
        if (m6782d(access$100)) {
            return m6769a(access$100).m6788b(str2);
        }
        this.f2550e.put(access$100, new C0932c(str, str2));
        return true;
    }

    /* renamed from: b */
    public String m6778b() {
        StringBuffer stringBuffer = new StringBuffer("");
        for (C0932c c : this.f2550e.values()) {
            stringBuffer.append(c.m6789c().trim()).append(f2549z);
        }
        return stringBuffer.toString();
    }

    /* renamed from: b */
    public String m6779b(String str) {
        String access$100 = C0930a.m6752d(str);
        return m6782d(access$100) ? m6769a(access$100).m6786a() : null;
    }

    /* renamed from: c */
    public void m6780c() {
        this.f2551h = null;
        if (this.f2550e != null) {
            for (C0932c c0932c : this.f2550e.values()) {
                if (c0932c != null) {
                    c0932c.m6787b();
                }
            }
            this.f2550e.clear();
            this.f2550e = null;
        }
    }

    /* renamed from: c */
    public boolean m6781c(String str) {
        String access$100 = C0930a.m6752d(str);
        if (!m6782d(access$100)) {
            return false;
        }
        this.f2550e.remove(access$100);
        return true;
    }

    /* renamed from: d */
    public boolean m6782d(String str) {
        return this.f2550e.containsKey(C0930a.m6752d(str));
    }
}
