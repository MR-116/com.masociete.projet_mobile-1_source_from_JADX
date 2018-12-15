package fr.pcsoft.wdjava.database.hf;

import fr.pcsoft.wdjava.core.debug.C0691a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: fr.pcsoft.wdjava.database.hf.h */
public class C0855h {
    /* renamed from: a */
    private static Pattern f2267a = null;
    /* renamed from: z */
    private static final String[] f2268z = new String[]{C0855h.m5976z(C0855h.m5977z("4\u0018j\u0001\u001d(':\nR\u000eA}OA D")), C0855h.m5976z(C0855h.m5977z("<\u001a2?|M;{IG?øÕñÒãÁ<A%\u0010:\u00007\u001e\rMXEßðÖîÄý9\u0017C=~O\u0014<\u001c")), C0855h.m5976z(C0855h.m5977z(")/N!z%3:1s3(]*x$")), C0855h.m5976z(C0855h.m5977z(".5_<i")), C0855h.m5976z(C0855h.m5977z("4(W!")), C0855h.m5976z(C0855h.m5977z(")/N!z%3")), C0855h.m5976z(C0855h.m5977z(".4W&x2")), C0855h.m5976z(C0855h.m5977z("4(T=t.5")), C0855h.m5976z(C0855h.m5977z("6 H&t. H=")), C0855h.m5976z(C0855h.m5977z("$.O&q%AJ6x#(I-r.")), C0855h.m5976z(C0855h.m5977z("-.T!d")), C0855h.m5976z(C0855h.m5977z("$ N!i),_")), C0855h.m5976z(C0855h.m5977z("4(T=t.5:1s3(]*x$")), C0855h.m5976z(C0855h.m5977z(".7[6~( H")), C0855h.m5976z(C0855h.m5977z("$ N!")), C0855h.m5976z(C0855h.m5977z("\"(]-s4AO*n)&T!y")), C0855h.m5976z(C0855h.m5977z("4$B0")), C0855h.m5976z(C0855h.m5977z("\"(]-s4")), C0855h.m5976z(C0855h.m5977z("#)[6|#5_6")), C0855h.m5976z(C0855h.m5977z("3,[(q)/NDh.2S#s%%")), C0855h.m5976z(C0855h.m5977z("3,[(q)/N")), C0855h.m5976z(C0855h.m5977z("&-U%i")), C0855h.m5976z(C0855h.m5977z("6 H'u!3")), C0855h.m5976z(C0855h.m5977z("\"-U&"))};

    /* renamed from: a */
    public static int m5971a(int i) {
        switch (i) {
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 9:
                return 9;
            case 11:
                return 11;
            case 12:
                return 26;
            case 14:
                return 14;
            case 17:
                return 17;
            case 24:
                return 1;
            case 25:
                return 19;
            case 26:
                return 22;
            case 27:
                return 20;
            case 29:
                return 15;
            case 30:
                return 18;
            case 34:
                return 24;
            case 35:
                return 25;
            case 36:
                return 12;
            case 37:
                return 27;
            case 38:
                return 28;
            case 39:
                return 29;
            case 40:
                return 30;
            case 41:
                return 31;
            case 99:
                return 23;
            default:
                return 0;
        }
    }

    /* renamed from: a */
    public static String[] m5972a(String str) {
        try {
            int i;
            String group;
            if (f2267a == null) {
                f2267a = Pattern.compile(f2268z[1]);
            }
            ArrayList arrayList = new ArrayList(10);
            Matcher matcher = f2267a.matcher(str);
            for (i = 0; matcher.find(i); i = matcher.end(1)) {
                group = matcher.group(1);
                if (group != null) {
                    try {
                        if (!arrayList.contains(group)) {
                            arrayList.add(group);
                        }
                    } catch (NumberFormatException e) {
                        throw e;
                    }
                }
            }
            String[] strArr = new String[arrayList.size()];
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                group = (String) it.next();
                int lastIndexOf = group.lastIndexOf(35);
                if (lastIndexOf > 0) {
                    String substring = group.substring(0, lastIndexOf);
                    try {
                        i = Integer.parseInt(group.substring(lastIndexOf + 1, group.length()));
                    } catch (NumberFormatException e2) {
                        i = 0;
                    }
                    strArr[i] = substring;
                }
            }
            return strArr;
        } catch (NumberFormatException e3) {
            throw e3;
        }
    }

    /* renamed from: b */
    public static final boolean m5973b(int i) {
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 17:
            case 24:
            case 25:
            case 26:
            case 27:
            case 36:
            case 38:
            case 41:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: c */
    public static String m5974c(int i) {
        switch (i) {
            case 2:
                return f2268z[22];
            case 3:
                return f2268z[20];
            case 4:
                return f2268z[7];
            case 5:
                return f2268z[5];
            case 6:
                return f2268z[21];
            case 7:
                return f2268z[9];
            case 9:
                return f2268z[19];
            case 11:
                return f2268z[4];
            case 12:
                try {
                    return f2268z[18];
                } catch (NumberFormatException e) {
                    throw e;
                }
            case 14:
                return f2268z[14];
            case 17:
                return f2268z[10];
            case 24:
                return f2268z[17];
            case 25:
                return f2268z[17];
            case 26:
                return f2268z[2];
            case 27:
                return f2268z[15];
            case 28:
                return f2268z[8];
            case 29:
                return f2268z[16];
            case 30:
                return f2268z[23];
            case 34:
                return f2268z[11];
            case 36:
                return f2268z[12];
            case 37:
                return f2268z[7];
            case 38:
                return f2268z[5];
            case 39:
                return f2268z[13];
            case 40:
                return f2268z[3];
            case 41:
                return f2268z[6];
            default:
                return "";
        }
    }

    /* renamed from: d */
    public static int m5975d(int i) {
        switch (i) {
            case 1:
                return 24;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 9:
                return 9;
            case 10:
                return 14;
            case 11:
                return 11;
            case 12:
                return 36;
            case 14:
                return 14;
            case 15:
                return 29;
            case 16:
                return 30;
            case 17:
                return 17;
            case 18:
                return 30;
            case 19:
                return 25;
            case 20:
                return 27;
            case 21:
                return 30;
            case 22:
                return 26;
            case 23:
                return 28;
            case 24:
                return 34;
            case 25:
                return 35;
            case 26:
                return 12;
            case 27:
                return 37;
            case 28:
                return 38;
            case 29:
                return 39;
            case 30:
                return 40;
            case 31:
                return 41;
            default:
                C0691a.m2856a(f2268z[0] + i);
                return 2;
        }
    }

    /* renamed from: z */
    private static String m5976z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 96;
                    break;
                case 1:
                    i2 = 97;
                    break;
                case 2:
                    i2 = 26;
                    break;
                case 3:
                    i2 = 100;
                    break;
                default:
                    i2 = 61;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m5977z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 61);
        }
        return toCharArray;
    }
}
