package fr.pcsoft.wdjava.p058k;

import fr.pcsoft.wdjava.core.C0728o;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.utils.bb;
import fr.pcsoft.wdjava.file.C0895m;
import fr.pcsoft.wdjava.file.C0897o;
import fr.pcsoft.wdjava.file.C0901s;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.LinkedHashMap;

/* renamed from: fr.pcsoft.wdjava.k.a */
public class C0930a {
    /* renamed from: z */
    private static final String f2541z = C0930a.m6753z(C0930a.m6754z("\u0018q"));
    /* renamed from: a */
    private LinkedHashMap f2542a = new LinkedHashMap();

    /* renamed from: a */
    public static String m6749a(String str, String str2, String str3, String str4) {
        if (!(str4 == null || str2 == null)) {
            File j = C0897o.m6290j(str4);
            try {
                if (j.exists()) {
                    C0930a c0930a = new C0930a();
                    try {
                        c0930a.m6756a(j);
                        try {
                            if (str.compareTo("") == 0 && str2.compareTo("") == 0) {
                                str3 = c0930a.m6762b();
                            } else if (str2.compareTo("") == 0) {
                                if (c0930a.m6759a(str)) {
                                    str3 = c0930a.m6751c(str).m6778b();
                                    c0930a.m6755a();
                                } else {
                                    c0930a.m6755a();
                                }
                            } else if (!c0930a.m6759a(str)) {
                                c0930a.m6755a();
                            } else if (c0930a.m6766c(str, str2)) {
                                str3 = c0930a.m6763b(str, str2);
                                c0930a.m6755a();
                            } else {
                                c0930a.m6755a();
                            }
                        } finally {
                            c0930a.m6755a();
                        }
                    } catch (IOException e) {
                        c0930a.m6755a();
                    }
                }
            } catch (IOException e2) {
                throw e2;
            }
        }
        return str3;
    }

    /* renamed from: a */
    public static boolean m6750a(String str, WDObjet wDObjet, WDObjet wDObjet2, String str2) {
        Throwable th;
        File j = C0897o.m6290j(str2);
        if (str == null) {
            return false;
        }
        try {
            if (str.equalsIgnoreCase("")) {
                return false;
            }
            C0930a c0930a = null;
            C0930a c0930a2;
            try {
                if (j.exists() || j.createNewFile()) {
                    c0930a2 = new C0930a();
                    try {
                        boolean z;
                        c0930a2.m6756a(j);
                        String string = wDObjet.getString();
                        String string2 = wDObjet2.getString();
                        if (wDObjet.isNull() || string.compareTo("") == 0) {
                            c0930a2.m6767e(str);
                            z = true;
                        } else if (wDObjet2.isNull() || string2.compareTo("") == 0) {
                            c0930a2.m6760a(str, string);
                            z = true;
                        } else if (c0930a2.m6759a(str) || c0930a2.m6765b(str)) {
                            z = c0930a2.m6761a(str, string, string2);
                        } else if (c0930a2 == null) {
                            return false;
                        } else {
                            try {
                                c0930a2.m6755a();
                                return false;
                            } catch (IOException e) {
                                throw e;
                            }
                        }
                        if (z) {
                            c0930a2.m6764b(j);
                        }
                        if (c0930a2 != null) {
                            try {
                                c0930a2.m6755a();
                            } catch (IOException e2) {
                                throw e2;
                            }
                        }
                        return z;
                    } catch (IOException e3) {
                        c0930a = c0930a2;
                        if (c0930a != null) {
                            return false;
                        }
                        try {
                            c0930a.m6755a();
                            return false;
                        } catch (IOException e22) {
                            throw e22;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (c0930a2 != null) {
                            try {
                                c0930a2.m6755a();
                            } catch (IOException e222) {
                                throw e222;
                            }
                        }
                        throw th;
                    }
                } else if (c0930a == null) {
                    return false;
                } else {
                    try {
                        c0930a.m6755a();
                        return false;
                    } catch (IOException e2222) {
                        throw e2222;
                    }
                }
            } catch (IOException e4) {
                if (c0930a != null) {
                    return false;
                }
                c0930a.m6755a();
                return false;
            } catch (Throwable th3) {
                th = th3;
                c0930a2 = c0930a;
                if (c0930a2 != null) {
                    c0930a2.m6755a();
                }
                throw th;
            }
        } catch (IOException e22222) {
            throw e22222;
        }
    }

    /* renamed from: c */
    private C0931b m6751c(String str) {
        return (C0931b) this.f2542a.get(C0930a.m6752d(str));
    }

    /* renamed from: d */
    private static String m6752d(String str) {
        return str.toLowerCase().trim();
    }

    /* renamed from: z */
    private static String m6753z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 21;
                    break;
                case 1:
                    i2 = 123;
                    break;
                case 2:
                    i2 = 26;
                    break;
                case 3:
                    i2 = 19;
                    break;
                default:
                    i2 = 69;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m6754z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 69);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public void m6755a() {
        if (this.f2542a != null) {
            for (C0931b c0931b : this.f2542a.values()) {
                if (c0931b != null) {
                    c0931b.m6780c();
                }
            }
            this.f2542a.clear();
            this.f2542a = null;
        }
    }

    /* renamed from: a */
    public void m6756a(File file) throws IOException {
        BufferedReader bufferedReader = null;
        C0728o c0728o = new C0728o();
        try {
            String str;
            InputStream a = bb.m3842a((Object) file, c0728o);
            C0895m c0895m = (C0895m) c0728o.m3093a();
            if (c0895m != null) {
                str = null;
                bufferedReader = new BufferedReader(new InputStreamReader(a, c0895m.m6228c()));
            } else {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(a));
                str = null;
                bufferedReader = bufferedReader2;
            }
            while (bufferedReader.ready()) {
                String trim = bufferedReader.readLine().trim();
                if (trim.length() > 0 && trim.charAt(0) == C0931b.f2543a) {
                    int indexOf = trim.indexOf(93);
                    if (indexOf >= 0) {
                        str = trim.substring(1, indexOf);
                        m6765b(str);
                    }
                }
                if (str != null) {
                    m6751c(str).m6775a(bufferedReader);
                }
            }
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (C0901s e) {
                    throw e;
                }
            }
        } catch (C0901s e2) {
            throw e2;
        } catch (C0901s e22) {
            throw new IOException(e22.getMessage());
        } catch (Throwable th) {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (C0901s e222) {
                    throw e222;
                }
            }
        }
    }

    /* renamed from: a */
    public void m6757a(OutputStream outputStream) throws IOException {
        m6758a(new OutputStreamWriter(outputStream));
    }

    /* renamed from: a */
    public void m6758a(OutputStreamWriter outputStreamWriter) throws IOException {
        Throwable th;
        PrintWriter printWriter;
        try {
            printWriter = new PrintWriter(outputStreamWriter, true);
            try {
                for (C0931b c0931b : this.f2542a.values()) {
                    printWriter.println(C0931b.access$000(c0931b));
                    c0931b.m6776a(printWriter);
                }
                if (printWriter != null) {
                    try {
                        printWriter.close();
                    } catch (IOException e) {
                        throw e;
                    }
                }
                if (outputStreamWriter != null) {
                    try {
                        outputStreamWriter.close();
                    } catch (IOException e2) {
                        throw e2;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (printWriter != null) {
                    try {
                        printWriter.close();
                    } catch (IOException e22) {
                        throw e22;
                    }
                }
                if (outputStreamWriter != null) {
                    try {
                        outputStreamWriter.close();
                    } catch (IOException e222) {
                        throw e222;
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            printWriter = null;
            if (printWriter != null) {
                printWriter.close();
            }
            if (outputStreamWriter != null) {
                outputStreamWriter.close();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public boolean m6759a(String str) {
        return this.f2542a.containsKey(C0930a.m6752d(str));
    }

    /* renamed from: a */
    public boolean m6760a(String str, String str2) {
        return m6759a(str) ? m6751c(str).m6781c(str2) : false;
    }

    /* renamed from: a */
    public boolean m6761a(String str, String str2, String str3) {
        return m6759a(str) ? m6751c(str).m6777a(str2, str3) : false;
    }

    /* renamed from: b */
    public String m6762b() {
        StringBuffer stringBuffer = new StringBuffer("");
        for (C0931b a : this.f2542a.values()) {
            stringBuffer.append(a.m6774a()).append(f2541z);
        }
        return stringBuffer.toString();
    }

    /* renamed from: b */
    public String m6763b(String str, String str2) {
        if (m6759a(str)) {
            C0931b c = m6751c(str);
            if (c.m6782d(str2)) {
                return c.m6779b(str2);
            }
        }
        return null;
    }

    /* renamed from: b */
    public void m6764b(File file) throws IOException {
        OutputStream fileOutputStream = new FileOutputStream(file);
        m6757a(fileOutputStream);
        fileOutputStream.close();
    }

    /* renamed from: b */
    public boolean m6765b(String str) {
        String d = C0930a.m6752d(str);
        if (m6759a(d)) {
            return false;
        }
        this.f2542a.put(d, new C0931b(str));
        return true;
    }

    /* renamed from: c */
    public boolean m6766c(String str, String str2) {
        return m6759a(str) && m6751c(str).m6782d(str2);
    }

    /* renamed from: e */
    public boolean m6767e(String str) {
        String d = C0930a.m6752d(str);
        if (!m6759a(d)) {
            return false;
        }
        this.f2542a.remove(d);
        return true;
    }

    /* renamed from: f */
    public void m6768f(String str) throws IOException {
        m6764b(new File(str));
    }
}
