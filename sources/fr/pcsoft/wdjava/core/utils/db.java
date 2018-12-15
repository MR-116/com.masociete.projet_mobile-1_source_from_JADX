package fr.pcsoft.wdjava.core.utils;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.application.WDAppManager;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.p035c.C0664f;
import fr.pcsoft.wdjava.core.ressources.C0743a;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.C0548s;
import fr.pcsoft.wdjava.file.C0897o;
import fr.pcsoft.wdjava.file.C0901s;
import fr.pcsoft.wdjava.ui.activite.C1056i;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class db {
    /* renamed from: a */
    private static final int f2048a = 0;
    /* renamed from: b */
    private static final int f2049b = 2;
    /* renamed from: c */
    private static final int f2050c = 3;
    /* renamed from: d */
    private static final String f2051d = m3865z(m3866z("L\b\u0018zA"));
    /* renamed from: e */
    private static final int f2052e = 2;
    /* renamed from: f */
    private static final int f2053f = 1;
    /* renamed from: g */
    private static final int f2054g = 1;
    /* renamed from: z */
    private static final String[] f2055z;

    static {
        r0 = new String[28];
        r0[0] = m3865z(m3866z("'k"));
        r0[1] = m3865z(m3866z("K\u000f\u0010m\u0014C\u0005Zv\u0015^\u0004\u001akUK\u0002\u0000v\u0014DO'Z5n>9J7~($S>"));
        r0[2] = m3865z(m3866z("^\u0004\fkTZ\r\u0015v\u0015"));
        r0[3] = m3865z(m3866z("\t\";Q(~ :K>u(:\\4x31\\/o"));
        r0[4] = m3865z(m3866z("\t'=\\3c$&@2d$,V(~ :K"));
        r0[5] = m3865z(m3866z("\t$&M$l(7W2o3+^+z-=\\:~(;Q"));
        r0[6] = m3865z(m3866z("\u0000N^"));
        r0[7] = m3865z(m3866z("K\u000f\u0010m\u0014C\u0005Zv\u0015^\u0004\u001akUK\u0002\u0000v\u0014DO'Z5n"));
        r0[8] = m3865z(m3866z("K\u000f\u0010m\u0014C\u0005Zv\u0015^\u0004\u001akUO\u0019\u0000m\u001a\u00042 M>k,"));
        r0[9] = m3865z(m3866z("\t/;@:z18V8k5=P5u15M/k&1"));
        r0[10] = m3865z(m3866z("K\u000f\u0010m\u0014C\u0005Zv\u0015^\u0004\u001akUO\u0019\u0000m\u001a\u000451G/"));
        r0[11] = m3865z(m3866z("K\u000f\u0010m\u0014C\u0005Zv\u0015^\u0004\u001akUK\u0002\u0000v\u0014DO'Z5n5;"));
        r0[12] = m3865z(m3866z("^\u0004\u0018"));
        r0[13] = m3865z(m3866z("\t.!I)c3+\\4g,1"));
        r0[14] = m3865z(m3866z("\t$&M$e4\"Z)~4&Z$n.7J6o/ "));
        r0[15] = m3865z(m3866z("K\u000f\u0010m\u0014C\u0005Zv\u0015^\u0004\u001akUK\u0002\u0000v\u0014DO\"V>}"));
        r0[16] = m3865z(m3866z("\t(9^<o"));
        r0[17] = m3865z(m3866z("\t$&M$e4\"Z)~4&Z$n.7J6o/ @I"));
        r0[18] = m3865z(m3866z("Y\f\u0007k\u0014"));
        r0[19] = m3865z(m3866z("\t51G/o"));
        r0[20] = m3865z(m3866z("\t ![2e"));
        r0[21] = m3865z(m3866z("Y\f\u0007"));
        r0[22] = m3865z(m3866z("K\u000f\u0010m\u0014C\u0005Zv\u0015^\u0004\u001akUK\u0002\u0000v\u0014DO0V:f"));
        r0[23] = m3865z(m3866z("\t7=[>e"));
        r0[24] = m3865z(m3866z("\t$&M>3+S:d\"1@:z18V"));
        r0[25] = m3865z(m3866z("\t$&M$k1$S2u(:Z#c2 ^5~$"));
        r0[26] = m3865z(m3866z("k\u0011\u0004s\u0012I\u0000\u0000v\u0014DA9~\tA\u0004\u0000?\u0015E\u000fTk\tE\u0014\u0002ö\u001e\u0004"));
        r0[27] = m3865z(m3866z("G\u0000\u0006t\u001e^[[0\u001fO\u0015\u0015v\u0017Y^\u001d{F"));
        f2055z = r0;
    }

    /* renamed from: a */
    public static final void m3861a(String str) throws C0664f {
        Intent launchIntentForPackage = WDAppManager.m2551J().getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            try {
                String str2 = f2055z[24];
                String[] strArr = new String[2];
                strArr[0] = str;
                strArr[1] = C0745b.m3222b(f2055z[25], str);
                throw new C0664f(C0745b.m3222b(str2, strArr));
            } catch (ActivityNotFoundException e) {
                throw e;
            }
        }
        try {
            WDAppManager.m2544C().startActivity(launchIntentForPackage);
        } catch (ActivityNotFoundException e2) {
            throw new C0664f(C0745b.m3222b(f2055z[24], str) + "\n" + e2.getMessage());
        }
    }

    /* renamed from: a */
    public static final void m3862a(WDObjet... wDObjetArr) throws C0901s {
        int length = wDObjetArr.length;
        try {
            int i;
            int i2;
            if (wDObjetArr.length <= 1 || wDObjetArr[0].checkType(C0548s.class) == null) {
                i = 0;
                i2 = 1;
            } else {
                length--;
                i2 = wDObjetArr[0].getInt();
                i = 1;
            }
            Intent intent = new Intent();
            String str;
            if (i2 == 2) {
                String stringBuilder;
                intent.setAction(f2055z[7]);
                intent.setType(f2055z[2]);
                str = "";
                if (length > 1) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    int length2 = wDObjetArr.length;
                    while (i < length2) {
                        if (i > 0) {
                            try {
                                stringBuilder2.append(f2055z[0]);
                            } catch (C0901s e) {
                                throw e;
                            }
                        }
                        stringBuilder2.append(wDObjetArr[i].getString());
                        i++;
                    }
                    stringBuilder = stringBuilder2.toString();
                } else if (length > 0) {
                    try {
                        stringBuilder = wDObjetArr[i].getString();
                    } catch (C0901s e2) {
                        throw e2;
                    }
                } else {
                    stringBuilder = "";
                }
                intent.putExtra(f2055z[10], stringBuilder);
            } else if (i2 != 1) {
                WDErreurManager.m2883a(C0745b.m3222b(f2055z[3], new String[0]));
            } else if (length == 1) {
                intent.setAction(f2055z[7]);
                File j = C0897o.m6290j(wDObjetArr[i].getString());
                try {
                    if (j.exists()) {
                        try {
                            if (WDAppManager.m2568a(j)) {
                                throw new C0901s(C0745b.m3222b(f2055z[5], j.getPath()));
                            }
                            intent.setType(C0897o.m6241a(j));
                            intent.putExtra(f2055z[8], Uri.fromFile(j));
                        } catch (C0901s e22) {
                            throw e22;
                        }
                    }
                    throw new C0901s(C0745b.m3222b(f2055z[4], j.getPath()));
                } catch (C0901s e222) {
                    throw e222;
                }
            } else {
                String substring;
                intent.setAction(f2055z[1]);
                ArrayList arrayList = new ArrayList();
                String[] strArr = new String[length];
                int length3 = wDObjetArr.length;
                while (i < length3) {
                    File j2 = C0897o.m6290j(wDObjetArr[i].getString());
                    try {
                        if (j2.exists()) {
                            try {
                                if (WDAppManager.m2568a(j2)) {
                                    throw new C0901s(C0745b.m3222b(f2055z[5], j2.getPath()));
                                }
                                arrayList.add(C0743a.m3212h(j2.getPath()));
                                strArr[arrayList.size() - 1] = C0897o.m6241a(j2);
                                i++;
                            } catch (C0901s e2222) {
                                throw e2222;
                            }
                        }
                        throw new C0901s(C0745b.m3222b(f2055z[4], j2.getPath()));
                    } catch (C0901s e22222) {
                        throw e22222;
                    }
                }
                str = strArr[0];
                i = str.indexOf(47);
                if (i > 0) {
                    try {
                        substring = str.substring(0, i + 1);
                    } catch (C0901s e222222) {
                        throw e222222;
                    }
                }
                substring = null;
                String str2 = str;
                int i3 = 1;
                while (i3 < length) {
                    try {
                        if (!str2.equals(strArr[i3])) {
                            if (substring != null) {
                                if (strArr[i3].startsWith(substring)) {
                                    str2 = substring + C0607n.Vc;
                                }
                            }
                            str2 = f2055z[6];
                            break;
                        }
                        i3++;
                    } catch (C0901s e2222222) {
                        throw e2222222;
                    } catch (C0901s e22222222) {
                        throw e22222222;
                    }
                }
                intent.setType(str2);
                intent.putParcelableArrayListExtra(f2055z[8], arrayList);
            }
            Activity a = C1056i.m7562a();
            List queryIntentActivities = a.getPackageManager().queryIntentActivities(intent, 65536);
            if (queryIntentActivities != null) {
                try {
                    if (!queryIntentActivities.isEmpty()) {
                        CharSequence titreSuivant = WDProjet.getInstance().getTitreSuivant();
                        if (titreSuivant == null) {
                            titreSuivant = "";
                        }
                        a.startActivity(Intent.createChooser(intent, titreSuivant));
                        return;
                    }
                } catch (C0901s e222222222) {
                    throw e222222222;
                }
            }
            throw new C0901s(C0745b.m3222b(f2055z[9], new String[0]));
        } catch (C0901s e2222222222) {
            throw e2222222222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    public static final void m3863b(java.lang.String r10) throws fr.pcsoft.wdjava.core.p035c.C0664f {
        /*
        r9 = 3;
        r7 = 1;
        r8 = 0;
        r1 = new android.content.Intent;
        r1.<init>();
        r0 = f2055z;
        r2 = 15;
        r0 = r0[r2];
        r1.setAction(r0);
        r0 = 58;
        r0 = r10.indexOf(r0);
        if (r0 < 0) goto L_0x006b;
    L_0x0019:
        r2 = 0;
        r0 = r0 + 1;
        r0 = r10.substring(r2, r0);	 Catch:{ ActivityNotFoundException -> 0x0069 }
    L_0x0020:
        r2 = f2051d;	 Catch:{ ActivityNotFoundException -> 0x006e }
        r0 = r0.equalsIgnoreCase(r2);	 Catch:{ ActivityNotFoundException -> 0x006e }
        if (r0 == 0) goto L_0x010f;
    L_0x0028:
        r0 = f2051d;	 Catch:{ ActivityNotFoundException -> 0x0070 }
        r0 = r10.startsWith(r0);	 Catch:{ ActivityNotFoundException -> 0x0070 }
        if (r0 == 0) goto L_0x004a;
    L_0x0030:
        r0 = r10.length();	 Catch:{ ActivityNotFoundException -> 0x0070 }
        r2 = f2051d;	 Catch:{ ActivityNotFoundException -> 0x0070 }
        r2 = r2.length();	 Catch:{ ActivityNotFoundException -> 0x0070 }
        r2 = r2 + 1;
        if (r0 <= r2) goto L_0x004a;
    L_0x003e:
        r0 = f2051d;
        r0 = r0.length();
        r0 = r0 + 1;
        r10 = r10.substring(r0);
    L_0x004a:
        r0 = fr.pcsoft.wdjava.file.C0897o.m6290j(r10);
        r2 = r0.exists();	 Catch:{ ActivityNotFoundException -> 0x0067 }
        if (r2 != 0) goto L_0x0072;
    L_0x0054:
        r0 = new fr.pcsoft.wdjava.core.c.f;	 Catch:{ ActivityNotFoundException -> 0x0067 }
        r1 = f2055z;	 Catch:{ ActivityNotFoundException -> 0x0067 }
        r2 = 14;
        r1 = r1[r2];	 Catch:{ ActivityNotFoundException -> 0x0067 }
        r2 = 0;
        r2 = new java.lang.String[r2];	 Catch:{ ActivityNotFoundException -> 0x0067 }
        r1 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r1, r2);	 Catch:{ ActivityNotFoundException -> 0x0067 }
        r0.<init>(r1);	 Catch:{ ActivityNotFoundException -> 0x0067 }
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0067 }
    L_0x0067:
        r0 = move-exception;
        throw r0;
    L_0x0069:
        r0 = move-exception;
        throw r0;
    L_0x006b:
        r0 = f2051d;
        goto L_0x0020;
    L_0x006e:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0070 }
    L_0x0070:
        r0 = move-exception;
        throw r0;
    L_0x0072:
        r2 = fr.pcsoft.wdjava.file.C0897o.m6241a(r0);
        r3 = "";
        r3 = r2.equals(r3);	 Catch:{ ActivityNotFoundException -> 0x008d }
        if (r3 != 0) goto L_0x008f;
    L_0x007e:
        r0 = android.net.Uri.fromFile(r0);	 Catch:{ ActivityNotFoundException -> 0x008d }
        r1.setDataAndType(r0, r2);	 Catch:{ ActivityNotFoundException -> 0x008d }
    L_0x0085:
        r0 = fr.pcsoft.wdjava.ui.activite.C1056i.m7562a();	 Catch:{ ActivityNotFoundException -> 0x0159 }
        r0.startActivity(r1);	 Catch:{ ActivityNotFoundException -> 0x0159 }
        return;
    L_0x008d:
        r0 = move-exception;
        throw r0;
    L_0x008f:
        r2 = new android.app.AlertDialog$Builder;
        r3 = fr.pcsoft.wdjava.ui.activite.C1056i.m7562a();
        r2.<init>(r3);
        r2.setCancelable(r7);
        r3 = f2055z;
        r4 = 13;
        r3 = r3[r4];
        r4 = new java.lang.String[r8];
        r3 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3224c(r3, r4);
        r2.setTitle(r3);
        r3 = new int[r7];
        r4 = fr.pcsoft.wdjava.core.utils.C0806j.m3952b();
        r3[r8] = r4;
        r4 = 4;
        r4 = new java.lang.String[r4];
        r5 = f2055z;
        r6 = 16;
        r5 = r5[r6];
        r6 = new java.lang.String[r8];
        r5 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3224c(r5, r6);
        r4[r8] = r5;
        r5 = f2055z;
        r6 = 23;
        r5 = r5[r6];
        r6 = new java.lang.String[r8];
        r5 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3224c(r5, r6);
        r4[r7] = r5;
        r5 = 2;
        r6 = f2055z;
        r7 = 20;
        r6 = r6[r7];
        r7 = new java.lang.String[r8];
        r6 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3224c(r6, r7);
        r4[r5] = r6;
        r5 = f2055z;
        r6 = 19;
        r5 = r5[r6];
        r6 = new java.lang.String[r8];
        r5 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3224c(r5, r6);
        r4[r9] = r5;
        r5 = new fr.pcsoft.wdjava.core.utils.cc;
        r5.<init>(r1, r0);
        r2.setItems(r4, r5);
        r0 = r2.create();
        r2 = new fr.pcsoft.wdjava.core.utils.k;
        r2.<init>(r3);
        r0.setOnDismissListener(r2);
        r0.show();
        r4 = 0;
        r0 = r3[r8];
        r2 = 0;
        fr.pcsoft.wdjava.core.utils.C0806j.m3950a(r4, r0, r9, r2);
        goto L_0x0085;
    L_0x010f:
        r0 = android.net.Uri.parse(r10);
        r2 = r0.getScheme();
        r3 = f2055z;	 Catch:{ ActivityNotFoundException -> 0x0131 }
        r4 = 12;
        r3 = r3[r4];	 Catch:{ ActivityNotFoundException -> 0x0131 }
        r3 = r2.equals(r3);	 Catch:{ ActivityNotFoundException -> 0x0131 }
        if (r3 == 0) goto L_0x0133;
    L_0x0123:
        r2 = f2055z;	 Catch:{ ActivityNotFoundException -> 0x0131 }
        r3 = 22;
        r2 = r2[r3];	 Catch:{ ActivityNotFoundException -> 0x0131 }
        r1.setAction(r2);	 Catch:{ ActivityNotFoundException -> 0x0131 }
    L_0x012c:
        r1.setData(r0);
        goto L_0x0085;
    L_0x0131:
        r0 = move-exception;
        throw r0;
    L_0x0133:
        r3 = f2055z;	 Catch:{ ActivityNotFoundException -> 0x0157 }
        r4 = 21;
        r3 = r3[r4];	 Catch:{ ActivityNotFoundException -> 0x0157 }
        r3 = r2.equals(r3);	 Catch:{ ActivityNotFoundException -> 0x0157 }
        if (r3 != 0) goto L_0x014b;
    L_0x013f:
        r3 = f2055z;	 Catch:{ ActivityNotFoundException -> 0x0155 }
        r4 = 18;
        r3 = r3[r4];	 Catch:{ ActivityNotFoundException -> 0x0155 }
        r2 = r2.equals(r3);	 Catch:{ ActivityNotFoundException -> 0x0155 }
        if (r2 == 0) goto L_0x012c;
    L_0x014b:
        r2 = f2055z;	 Catch:{ ActivityNotFoundException -> 0x0155 }
        r3 = 11;
        r2 = r2[r3];	 Catch:{ ActivityNotFoundException -> 0x0155 }
        r1.setAction(r2);	 Catch:{ ActivityNotFoundException -> 0x0155 }
        goto L_0x012c;
    L_0x0155:
        r0 = move-exception;
        throw r0;
    L_0x0157:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0155 }
    L_0x0159:
        r0 = move-exception;
        r0 = new fr.pcsoft.wdjava.core.c.f;
        r1 = f2055z;
        r2 = 17;
        r1 = r1[r2];
        r2 = new java.lang.String[r8];
        r1 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r1, r2);
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.core.utils.db.b(java.lang.String):void");
    }

    /* renamed from: c */
    public static final void m3864c(String str) {
        Intent intent = new Intent(f2055z[15]);
        if (C0808l.m4053k(str)) {
            str = WDAppManager.m2597x().packageName;
        }
        intent.setData(Uri.parse(f2055z[27] + str));
        intent.setFlags(268435456);
        try {
            WDAppManager.m2544C().startActivity(intent);
        } catch (Exception e) {
            C0691a.m2857a(f2055z[26], e);
        }
    }

    /* renamed from: z */
    private static String m3865z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 42;
                    break;
                case 1:
                    i2 = 97;
                    break;
                case 2:
                    i2 = 116;
                    break;
                case 3:
                    i2 = 31;
                    break;
                default:
                    i2 = 123;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m3866z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 123);
        }
        return toCharArray;
    }
}
