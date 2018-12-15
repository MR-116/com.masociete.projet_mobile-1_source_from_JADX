package fr.pcsoft.wdjava.database.p048a;

import android.database.Cursor;
import fr.pcsoft.wdjava.core.debug.C0691a;

/* renamed from: fr.pcsoft.wdjava.database.a.a */
public class C0830a {
    /* renamed from: z */
    private static final String f2205z = C0830a.m4263z(C0830a.m4264z("Z\u0018:\\'vV:Pdp\u00192Z*}\u0013~\\*e\u00172\\ vX"));

    /* renamed from: a */
    public static final void m4258a(Cursor cursor) {
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }

    /* renamed from: a */
    public static final boolean m4259a(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return cursor.getInt(columnIndex) != 0;
        } else {
            C0691a.m2856a(f2205z);
            return false;
        }
    }

    /* renamed from: b */
    public static final String m4260b(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return cursor.getString(columnIndex);
        }
        C0691a.m2856a(f2205z);
        return "";
    }

    /* renamed from: c */
    public static final long m4261c(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return cursor.getLong(columnIndex);
        }
        C0691a.m2856a(f2205z);
        return 0;
    }

    /* renamed from: d */
    public static final int m4262d(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return cursor.getInt(columnIndex);
        }
        C0691a.m2856a(f2205z);
        return 0;
    }

    /* renamed from: z */
    private static String m4263z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 19;
                    break;
                case 1:
                    i2 = 118;
                    break;
                case 2:
                    i2 = 94;
                    break;
                case 3:
                    i2 = 53;
                    break;
                default:
                    i2 = 68;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m4264z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 68);
        }
        return toCharArray;
    }
}
