package fr.pcsoft.wdjava.core.application;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.utils.bb;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

/* renamed from: fr.pcsoft.wdjava.core.application.k */
public class C0651k {
    /* renamed from: a */
    public static final String f1616a = C0651k.m2647z(C0651k.m2648z("\u0007p_"));
    /* renamed from: b */
    public static final String f1617b = C0651k.m2647z(C0651k.m2648z("\u001fk]\f\u000e\\lF\u000e\u001e\u0017p"));
    /* renamed from: c */
    public static final String f1618c = C0651k.m2647z(C0651k.m2648z("\u0002m@\n\b\u001bm]<\u0010\u001b`V\u000f\u0010\u0017]P\f\u0011\u0002cG<N@"));
    /* renamed from: d */
    public static final String f1619d = C0651k.m2647z(C0651k.m2648z("\u001cmG\n\u001a-rF\u0010\u0014-dZ\u0011\u0019\u0010c@\u0006"));
    /* renamed from: e */
    public static final String f1620e = C0651k.m2647z(C0651k.m2648z("\u0002pZ\u0015\u001d\u0006gl\u0002\f\u001b]X\u0006\u0005"));
    /* renamed from: f */
    public static final String f1621f = C0651k.m2647z(C0651k.m2648z("\u001fcY\f\u000e\\lF\u000e\u001e\u0017p"));
    /* renamed from: g */
    public static final String f1622g = C0651k.m2647z(C0651k.m2648z("\u0000gE\n\u000f\u001bm]M\u0012\u0007oQ\u0006\u000e"));
    /* renamed from: h */
    public static final String f1623h = C0651k.m2647z(C0651k.m2648z("\u001fqT\u0001\u0013\n]C\u0006\u000e\u0001m"));
    /* renamed from: i */
    public static final String f1624i = C0651k.m2647z(C0651k.m2648z("\u0013aG\n\n\u0013vZ\f\u0012-cF\u0017\u0013"));
    /* renamed from: j */
    public static final String f1625j = C0651k.m2647z(C0651k.m2648z("\u001dq\u001d\u0002\u000e\u0011j"));
    /* renamed from: k */
    public static final String f1626k = C0651k.m2647z(C0651k.m2648z("\u0005f\u001d\u0013\u000e\u001dr\u001d\u0010\u0019\u001e]A\u0006\f-fV\u0005\u001d\u0007v"));
    /* renamed from: l */
    private static HashMap<C0638a, Properties> f1627l = new HashMap();
    /* renamed from: m */
    public static final String f1628m = C0651k.m2647z(C0651k.m2648z("\u0005f\u001d\u0013\u000e\u001dr\u001d\u0010\u0019\u001e]A\u0006\f-uZ\r\u0018\u001du@"));
    /* renamed from: n */
    public static final String f1629n = C0651k.m2647z(C0651k.m2648z("\u0011nV<\u001d\u0002r_\n\u001f\u0013vZ\f\u0012"));
    /* renamed from: o */
    public static final String f1630o = C0651k.m2647z(C0651k.m2648z("\u001emP\u0002\u0010\u0017"));
    /* renamed from: p */
    public static final String f1631p = C0651k.m2647z(C0651k.m2648z("\u0017zC\u0011\u0019\u0001q"));
    /* renamed from: q */
    public static final String f1632q = C0651k.m2647z(C0651k.m2648z("\u0010wZ\u000f\u0018\\lF\u000e\u001e\u0017p"));
    /* renamed from: z */
    private static final String[] f1633z;

    static {
        String[] strArr = new String[7];
        strArr[0] = C0651k.m2647z(C0651k.m2648z("\u0000g@L"));
        strArr[1] = C0651k.m2647z(C0651k.m2648z("\u0000cD"));
        strArr[2] = C0651k.m2647z(C0651k.m2648z(";oC\f\u000f\u0001kQ\u000f\u0019RfVC\u001f\u001acA\u0004\u0019\u0000\"_\u0006\u000fRrA\f\f\u0000kÚ\u0017\u0001\"W\u0006\\\u0010wZ\u000f\u0018\\"));
        strArr[3] = C0651k.m2647z(C0651k.m2648z("\u000bg@"));
        strArr[4] = C0651k.m2647z(C0651k.m2648z("\u0006pF\u0006"));
        strArr[5] = C0651k.m2647z(C0651k.m2648z("\u001dwZ"));
        strArr[6] = C0651k.m2647z(C0651k.m2648z("\u0004pR\n"));
        f1633z = strArr;
    }

    /* renamed from: a */
    public static String m2644a(C0638a c0638a, String str, String str2) {
        Properties a = C0651k.m2645a(c0638a);
        if (a == null) {
            return str2;
        }
        String property = a.getProperty(str);
        return property != null ? property : str2;
    }

    /* renamed from: a */
    private static final Properties m2645a(C0638a c0638a) {
        try {
            Properties properties;
            if (c0638a == C0638a.SYSTEM) {
                properties = System.getProperties();
            } else {
                properties = (Properties) f1627l.get(c0638a);
                if (properties == null) {
                    properties = new Properties();
                    Closeable closeable = null;
                    try {
                        closeable = C0651k.class.getClassLoader().getResourceAsStream(f1633z[0] + f1633z[1] + "/" + c0638a.getFileName());
                        if (closeable != null) {
                            properties.load(closeable);
                            f1627l.put(c0638a, properties);
                        }
                        bb.m3844a(closeable);
                    } catch (IOException e) {
                        throw e;
                    } catch (Exception e2) {
                        try {
                            C0691a.m2857a(f1633z[2], e2);
                        } finally {
                            bb.m3844a(closeable);
                        }
                    }
                }
            }
            return properties;
        } catch (IOException e3) {
            throw e3;
        }
    }

    /* renamed from: a */
    public static boolean m2646a(C0638a c0638a, String str, boolean z) {
        Properties a = C0651k.m2645a(c0638a);
        if (a == null) {
            return z;
        }
        String property = a.getProperty(str);
        if (property == null) {
            return z;
        }
        property = property.toLowerCase();
        return (property.equals("y") || property.equals(f1633z[3]) || property.equals("o") || property.equals(f1633z[5]) || property.equals(f1633z[4]) || property.equals(f1633z[6])) ? true : z;
    }

    /* renamed from: z */
    private static String m2647z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 114;
                    break;
                case 1:
                    i2 = 2;
                    break;
                case 2:
                    i2 = 51;
                    break;
                case 3:
                    i2 = 99;
                    break;
                default:
                    i2 = C0607n.Hn;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2648z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ C0607n.Hn);
        }
        return toCharArray;
    }
}
