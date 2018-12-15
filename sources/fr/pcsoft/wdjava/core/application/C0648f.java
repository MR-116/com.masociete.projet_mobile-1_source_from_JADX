package fr.pcsoft.wdjava.core.application;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;

/* renamed from: fr.pcsoft.wdjava.core.application.f */
public final class C0648f extends SQLiteOpenHelper {
    /* renamed from: a */
    private static final String f1612a = C0648f.m2639z(C0648f.m2640z("fw^syzEh{`thotx"));
    /* renamed from: b */
    private static final int f1613b = 100;
    /* renamed from: z */
    private static final String[] f1614z;

    static {
        r0 = new String[14];
        r0[0] = C0648f.m2639z(C0648f.m2640z("8!"));
        r0[1] = C0648f.m2639z(C0648f.m2640z("1NDM@1YNYXPND5Z^Y@FQ1OO\\ED_!ZZ1YN[R]SBA4C_QYUR_-5"));
        r0[2] = C0648f.m2639z(C0648f.m2640z("RHDT@T:UTV]_!"));
        r0[3] = C0648f.m2639z(C0648f.m2640z("b`gwyEi|geusl"));
        r0[4] = C0648f.m2639z(C0648f.m2640z("Nse"));
        r0[5] = C0648f.m2639z(C0648f.m2640z("1VN[S=:"));
        r0[6] = C0648f.m2639z(C0648f.m2640z("1NDM@1YNYXPND5Z^Y@FQ"));
        r0[7] = C0648f.m2639z(C0648f.m2640z("`odgm"));
        r0[8] = C0648f.m2639z(C0648f.m2640z("1SOAQV_S5DCSLTFH:JPM=:"));
        r0[9] = C0648f.m2639z(C0648f.m2640z("u{up"));
        r0[10] = C0648f.m2639z(C0648f.m2640z("fsoq{fEotyt"));
        r0[11] = C0648f.m2639z(C0648f.m2640z("ruoaqn;:;"));
        r0[12] = C0648f.m2639z(C0648f.m2640z("UHNE4E[CYQ1SG5QISRAG1idtfrr^}}bnngm"));
        r0[13] = C0648f.m2639z(C0648f.m2640z("fw^syzEh{`thotx?~c"));
        f1614z = r0;
    }

    public C0648f(Context context) {
        super(context, f1614z[13], null, 100);
    }

    /* renamed from: z */
    private static String m2639z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 17;
                    break;
                case 1:
                    i2 = 26;
                    break;
                case 2:
                    i2 = 1;
                    break;
                case 3:
                    i2 = 21;
                    break;
                default:
                    i2 = 20;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2640z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 20);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public final Uri m2641a(String str) {
        return Uri.parse(new StringBuilder(f1614z[11]).append(WDAppManager.f1594t.getPackageName()).append("/").append(f1612a).append("/").append(str).toString());
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(f1614z[2]).append(f1614z[3]).append("(").append(f1614z[4]).append(f1614z[8]).append(f1614z[7]).append(f1614z[1]).append(f1614z[9]).append(f1614z[5]).append(f1614z[10]).append(f1614z[6]).append(f1614z[0]);
        sQLiteDatabase.execSQL(stringBuilder.toString());
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL(f1614z[12]);
        onCreate(sQLiteDatabase);
    }
}
