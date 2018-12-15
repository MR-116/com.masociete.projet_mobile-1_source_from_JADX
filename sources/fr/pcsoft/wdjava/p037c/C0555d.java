package fr.pcsoft.wdjava.p037c;

import android.os.Environment;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.utils.kb;
import fr.pcsoft.wdjava.file.C0884a;
import fr.pcsoft.wdjava.file.C0889f;
import fr.pcsoft.wdjava.file.C0897o;
import fr.pcsoft.wdjava.media.ib;
import fr.pcsoft.wdjava.ui.C1489s;
import fr.pcsoft.wdjava.ui.activite.C1056i;
import fr.pcsoft.wdjava.ui.dessin.C0519e;
import fr.pcsoft.wdjava.ui.p064a.C1032b;
import java.io.File;
import java.io.IOException;

/* renamed from: fr.pcsoft.wdjava.c.d */
public class C0555d extends C0554c {
    /* renamed from: z */
    private static final String[] f1257z = new String[]{C0555d.m1778z(C0555d.m1779z("\u0003\u00014")), C0555d.m1778z(C0555d.m1779z("P)\u001a\u0007Z:*\u0001\u001b[=*\u000b\rA'.\u001d\u0010")), C0555d.m1778z(C0555d.m1779z("P*\u000b\u0010W=<\u001a\u000b\\,!\u001c\nM!*\u0010\u000b\\=:\u0016")), C0555d.m1778z(C0555d.m1779z("P*\u0001\u0016M6,\u0001\rF&=\u0016\u001b_6\"\u001c\r@60\u0016\u001cF6=\u001d\u0001")), C0555d.m1778z(C0555d.m1779z("\u0005\u00067!}")), C0555d.m1778z(C0555d.m1779z("\u001a\u00022#w"))};

    /* renamed from: a */
    public static final void m1777a(WDObjet wDObjet) throws ib {
        String str = "";
        try {
            if (kb.m3985o() != 1) {
                throw new ib(C0745b.m3222b(f1257z[3], new String[0]));
            }
            C0519e c0519e = (C0519e) wDObjet.checkType(C0519e.class);
            if (c0519e == null) {
                File j = C0897o.m6290j(wDObjet.getString());
                try {
                    if (j.exists()) {
                        try {
                            if (!C0884a.m6200b(j)) {
                                int i;
                                str = C0897o.m6241a(j);
                                if (str.startsWith(f1257z[5])) {
                                    i = 1;
                                } else if (str.startsWith(f1257z[4])) {
                                    boolean z = false;
                                } else {
                                    throw new ib(C0745b.m3222b(f1257z[2], C0897o.m6259b(j.getPath(), 8)));
                                }
                                if (i != 0) {
                                    try {
                                        str = Environment.DIRECTORY_PICTURES;
                                    } catch (IOException e) {
                                        throw e;
                                    }
                                }
                                str = Environment.DIRECTORY_MOVIES;
                                File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(str);
                                String b = C0897o.m6259b(j.getPath(), 4);
                                String b2 = C0897o.m6259b(j.getPath(), 8);
                                File file = new File(externalStoragePublicDirectory, b + b2);
                                i = 1;
                                while (file.exists()) {
                                    StringBuilder append = new StringBuilder().append(b).append("_");
                                    int i2 = i + 1;
                                    File file2 = new File(externalStoragePublicDirectory, append.append(i).append(b2).toString());
                                    i = i2;
                                    file = file2;
                                }
                                str = file.getAbsolutePath();
                                try {
                                    C0889f.m6212a(j, file, new WDBooleen(false), false);
                                } catch (IOException e2) {
                                    throw new ib(e2.getMessage());
                                }
                            }
                            return;
                        } catch (IOException e22) {
                            throw e22;
                        }
                    }
                    throw new ib(C0745b.m3222b(f1257z[1], j.getPath()));
                } catch (IOException e222) {
                    throw e222;
                }
            }
            String str2 = C0897o.m6242a(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getPath()) + C0554c.m1772a(f1257z[0]);
            try {
                c0519e.getImagePeintre(1, false).mo3723a(str2, 0, (int) C1032b.f2968a, f1257z[0]);
                str = str2;
            } catch (C1489s e3) {
                throw new ib(e3.getMessage(), e3.m1561f());
            }
            new C0553b(C1056i.m7562a()).m1765a(str);
        } catch (IOException e2222) {
            throw e2222;
        }
    }

    /* renamed from: z */
    private static String m1778z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 115;
                    break;
                case 1:
                    i2 = 111;
                    break;
                case 2:
                    i2 = 83;
                    break;
                case 3:
                    i2 = 68;
                    break;
                default:
                    i2 = 18;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1779z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 18);
        }
        return toCharArray;
    }
}
