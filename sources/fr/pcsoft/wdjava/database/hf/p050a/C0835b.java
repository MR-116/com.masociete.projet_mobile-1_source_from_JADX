package fr.pcsoft.wdjava.database.hf.p050a;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.database.hf.C0542t;
import fr.pcsoft.wdjava.database.hf.C0833j;
import fr.pcsoft.wdjava.database.hf.db;
import fr.pcsoft.wdjava.database.hf.eb;
import java.util.LinkedList;

/* renamed from: fr.pcsoft.wdjava.database.hf.a.b */
public class C0835b implements C0542t {
    private static final String[] Rd = new String[]{C0835b.m5377z(C0835b.m5378z("@=\u0013~(G")), C0835b.m5377z(C0835b.m5378z("?X")), C0835b.m5377z(C0835b.m5378z("3>\rt&3")), C0835b.m5377z(C0835b.m5378z("34\u0016v\"GX")), C0835b.m5377z(C0835b.m5378z("W*\u0010kKG9\u001dw.31\u0019\u001b.K1\fo83")), C0835b.m5377z(C0835b.m5378z("Z6\u000b~,V*k9Z5\u001ei233\u001abKR-\u000bt\"];\r~&V6\u000b\u001b%\\,u>_4")), C0835b.m5377z(C0835b.m5378z("3<\u001a}*F4\u000b\u001b%F4\u0013")), C0835b.m5377z(C0835b.m5378z("G=\u0007o")), C0835b.m5377z(C0835b.m5378z("Z6\u000b~,V*")), C0835b.m5377z(C0835b.m5378z("Q4\u0010y")), C0835b.m5377z(C0835b.m5378z("A=\u001ew")), C0835b.m5377z(C0835b.m5378z("3<\u001a}*F4\u000b\u001b")), C0835b.m5377z(C0835b.m5378z("P*\u001az?VX\u000bz)_="))};

    /* renamed from: a */
    public static final Object m5371a(Object obj, int i) {
        switch (i) {
            case 11:
                return C0725i.m3083l(obj.toString());
            case 14:
                return C0725i.m3076g(obj.toString());
            case 34:
                return C0725i.m3030a(obj.toString());
            default:
                return obj;
        }
    }

    /* renamed from: a */
    public static final String m5372a(db dbVar, eb ebVar) {
        StringBuffer stringBuffer = new StringBuffer("");
        stringBuffer.append(ebVar.m5818a(true, null)).append(" ");
        switch (ebVar.m5848f()) {
            case 2:
            case 11:
            case 12:
            case 14:
            case 17:
            case 29:
            case 34:
            case 35:
            case 39:
            case 40:
                stringBuffer.append(Rd[7]);
                break;
            case 3:
            case 4:
            case 5:
            case 9:
            case 25:
            case 26:
            case 27:
            case 36:
            case 37:
                stringBuffer.append(Rd[8]);
                break;
            case 6:
            case 7:
            case 41:
                stringBuffer.append(Rd[10]);
                break;
            case 24:
            case 38:
                stringBuffer.append(Rd[5]);
                break;
            case 28:
            case 30:
                stringBuffer.append(Rd[9]);
                break;
        }
        if (ebVar.m5806H() != null && !ebVar.mo3138c()) {
            stringBuffer.append(Rd[11]).append(dbVar.m3616V().mo3173a(ebVar, ebVar.m5806H(), 0));
        } else if (ebVar.m5807I()) {
            stringBuffer.append(Rd[6]);
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static final String m5373a(String str) {
        return Rd[4] + str;
    }

    /* renamed from: a */
    public static final String m5374a(String str, String str2, String str3, String str4, int i) {
        StringBuffer stringBuffer = new StringBuffer("");
        stringBuffer.append(Rd[0]).append(str).append(Rd[2]).append(str2).append(str3).append(str4);
        if (i > -1) {
            stringBuffer.append(Rd[3]).append(i);
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static final String m5375a(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z) {
        StringBuffer stringBuffer = new StringBuffer("");
        stringBuffer.append(Rd[0]).append(str).append(Rd[2]).append(str2).append(str3).append(str4).append(Rd[3]).append(j).append(Rd[1]).append(j2);
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static final String[] m5376a(db dbVar) {
        String c;
        LinkedList linkedList = new LinkedList();
        StringBuffer stringBuffer = new StringBuffer(Rd[12]);
        stringBuffer.append(dbVar.mo2741a(true, null)).append("(");
        for (eb ebVar : dbVar.m3614S().values()) {
            if (!ebVar.m5853j()) {
                stringBuffer.append(C0835b.m5372a(dbVar, ebVar));
                stringBuffer.append(Rd[1]);
            }
            if (ebVar.mo3136a()) {
                c = C0833j.m5284c(dbVar, ebVar);
                if (!(c == null || c.equals(""))) {
                    linkedList.add(c);
                }
            }
        }
        c = stringBuffer.toString().trim();
        if (c.lastIndexOf(44) == c.length() - 1) {
            c = c.substring(0, c.length() - 1);
        }
        linkedList.add(0, c + ")");
        return (String[]) linkedList.toArray(new String[linkedList.size()]);
    }

    /* renamed from: z */
    private static String m5377z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 19;
                    break;
                case 1:
                    i2 = C0607n.co;
                    break;
                case 2:
                    i2 = 95;
                    break;
                case 3:
                    i2 = 59;
                    break;
                default:
                    i2 = 107;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m5378z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 107);
        }
        return toCharArray;
    }
}
