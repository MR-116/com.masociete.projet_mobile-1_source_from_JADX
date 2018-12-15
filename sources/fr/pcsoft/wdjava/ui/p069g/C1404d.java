package fr.pcsoft.wdjava.ui.p069g;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.context.WDAppelContexte;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.ui.C0489p;
import fr.pcsoft.wdjava.ui.activite.C0502g;
import fr.pcsoft.wdjava.ui.activite.C1056i;
import fr.pcsoft.wdjava.ui.champs.fenetre.WDFenetre;
import fr.pcsoft.wdjava.ui.champs.gc;
import fr.pcsoft.wdjava.ui.champs.slidingmenu.C0526d;
import fr.pcsoft.wdjava.ui.champs.zml.C0532f;
import fr.pcsoft.wdjava.ui.champs.zr.bb;

/* renamed from: fr.pcsoft.wdjava.ui.g.d */
public class C1404d {
    /* renamed from: a */
    private static final int f4142a = 7;
    /* renamed from: b */
    private static final int f4143b = 4;
    /* renamed from: c */
    private static final int f4144c = 9;
    /* renamed from: d */
    private static final int f4145d = 5;
    /* renamed from: e */
    private static C1406g f4146e = null;
    /* renamed from: f */
    private static final int f4147f = 3;
    /* renamed from: g */
    private static final int f4148g = 2;
    /* renamed from: h */
    public static final int f4149h = -1;
    /* renamed from: i */
    public static final int f4150i = 131072;
    /* renamed from: j */
    private static final int f4151j = 12;
    /* renamed from: k */
    private static final int f4152k = 1;
    /* renamed from: l */
    private static final int f4153l = 6;
    /* renamed from: m */
    private static final int f4154m = 8;
    /* renamed from: n */
    private static final int f4155n = 10;
    /* renamed from: o */
    private static final int f4156o = -1;
    /* renamed from: p */
    public static final int f4157p = 65536;
    /* renamed from: q */
    private static final int f4158q = 16;
    /* renamed from: r */
    private static final int f4159r = 11;
    /* renamed from: s */
    public static final int f4160s = 196608;
    /* renamed from: t */
    private static final int f4161t = 14;
    /* renamed from: u */
    private static final int f4162u = 15;
    /* renamed from: v */
    public static final int f4163v = 0;
    /* renamed from: w */
    private static final int f4164w = 13;
    /* renamed from: z */
    private static final String[] f4165z = new String[]{C1404d.m9974z(C1404d.m9975z("\u0001\u000boj\u00021U~aK8\u0013kfM;Rq`Lu\u0000zlM;\u001cj!")), C1404d.m9974z(C1404d.m9975z("v7M]}\u0014\"OJn\n3QFo\u0014&V@l\n8PZg")), C1404d.m9974z(C1404d.m9975z("&\u001evkG\n\u0007o")), C1404d.m9974z(C1404d.m9975z("\n\u001bq")), C1404d.m9974z(C1404d.m9975z(":\u0004z}N4\u0002@zR")), C1404d.m9974z(C1404d.m9975z("&\u0017onP4\u0006zPF:\u0005q")), C1404d.m9974z(C1404d.m9975z("\n\u001dj{")), C1404d.m9974z(C1404d.m9975z("&\u001evkG\n\u0000vhJ!")), C1404d.m9974z(C1404d.m9975z(":\u0004z}N4\u0002@}K2\u001ak")), C1404d.m9974z(C1404d.m9975z("&\u001evkG\n\u001eziV")), C1404d.m9974z(C1404d.m9975z(":\u0004z}N4\u0002@kM\"\u001c")), C1404d.m9974z(C1404d.m9975z("4\u001cvb")), C1404d.m9974z(C1404d.m9975z(":\u0004z}N4\u0002@cG3\u0006")), C1404d.m9974z(C1404d.m9975z("&\u001evkG\n\u0016pxL")), C1404d.m9974z(C1404d.m9975z("3\u001ev}=\u001dmfX:\u001cknN")), C1404d.m9974z(C1404d.m9975z("v7M]}\u0014\"OJn\n3QFo\u0014&V@l\n\"MJr\u0014 Z"))};

    /* renamed from: a */
    private static final int m9970a(Resources resources, int i, boolean z) {
        String str = "";
        switch (i) {
            case 1:
                return z ? 17432576 : 17432577;
            case 2:
                str = f4165z[7];
                break;
            case 3:
                str = f4165z[9];
                break;
            case 4:
                str = f4165z[2];
                break;
            case 5:
                str = f4165z[13];
                break;
            case 6:
                str = f4165z[8];
                break;
            case 7:
                str = f4165z[12];
                break;
            case 8:
                str = f4165z[4];
                break;
            case 9:
                str = f4165z[10];
                break;
            case 15:
                str = f4165z[5];
                break;
            case 16:
                str = f4165z[14];
                break;
            default:
                C0691a.m2856a(f4165z[0]);
                break;
        }
        return resources.getIdentifier(str + (z ? f4165z[3] : f4165z[6]), f4165z[11], WDProjet.getInstance().getPackageRacine());
    }

    /* renamed from: a */
    public static final void m9971a(int i, int i2) {
        if (f4146e == null) {
            WDErreurManager.m2883a(C0745b.m3222b(f4165z[1], new String[0]));
        }
        try {
            f4146e.m9980a(i, Math.max(0, i2 * 10), true);
        } finally {
            if (f4146e.getParent() != null) {
                f4146e.m9981b();
            }
            f4146e = null;
        }
    }

    /* renamed from: a */
    public static final void m9972a(C0502g c0502g, int i) {
        int i2;
        int i3;
        boolean z;
        Resources resources;
        int a;
        int i4 = 0;
        switch (i) {
            case -1:
                i2 = -1;
                i3 = -1;
                break;
            case 0:
                break;
            case 65536:
                i2 = 2;
                i3 = 3;
                break;
            case 131072:
                i3 = 8;
                i2 = 15;
                break;
            case 196608:
                i2 = 16;
                i3 = 16;
                break;
            default:
                C0691a.m2856a(f4165z[0]);
                break;
        }
        if (c0502g.mo1766b() != null && c0502g.mo1766b().isMaximisee()) {
            C0489p o = WDAppelContexte.getContexte().m2728o();
            if (o != null) {
                gc gcVar = (gc) o.checkType(gc.class);
                if (gcVar != null) {
                    boolean z2 = gcVar.checkType(bb.class) == null && gcVar.checkType(C0532f.class) == null && gcVar.getChampParent(bb.class) == null && gcVar.getChampParent(C0532f.class) == null;
                    z = (z2 || gcVar.getChampParent(C0526d.class) == null) ? z2 : true;
                    if (z) {
                        i2 = 2;
                        i3 = 3;
                        resources = c0502g.mo1775i().getResources();
                        if (i3 == -1) {
                            int a2 = C1404d.m9970a(resources, i3, true);
                            a = C1404d.m9970a(resources, i3, false);
                            i4 = a2;
                        } else {
                            a = 0;
                        }
                        if (i4 >= 0 && a >= 0) {
                            c0502g.mo1775i().overridePendingTransition(i4, a);
                        }
                        c0502g.mo1766b().ajouterEcouteurActivite(new C1401a(i2, c0502g));
                    }
                }
            }
        }
        z = true;
        if (z) {
            i2 = 2;
            i3 = 3;
            resources = c0502g.mo1775i().getResources();
            if (i3 == -1) {
                a = 0;
            } else {
                int a22 = C1404d.m9970a(resources, i3, true);
                a = C1404d.m9970a(resources, i3, false);
                i4 = a22;
            }
            c0502g.mo1775i().overridePendingTransition(i4, a);
            c0502g.mo1766b().ajouterEcouteurActivite(new C1401a(i2, c0502g));
        }
    }

    /* renamed from: a */
    public static final void m9973a(gc gcVar, int i, int i2, int i3, int i4) {
        View compPrincipal;
        if (f4146e != null) {
            WDErreurManager.m2883a(C0745b.m3222b(f4165z[15], new String[0]));
        }
        Rect rect = new Rect();
        if (i == -1 && i2 == -1 && i3 == -1 && i4 == -1) {
            compPrincipal = gcVar.getCompPrincipal();
            rect.right = compPrincipal.getWidth();
            rect.bottom = compPrincipal.getHeight();
        } else {
            WDFenetre wDFenetre = (WDFenetre) gcVar.checkType(WDFenetre.class);
            if (wDFenetre == null) {
                wDFenetre = (WDFenetre) gcVar.getFenetreMere();
            }
            compPrincipal = wDFenetre.getCompConteneur();
            int width = compPrincipal.getWidth();
            int height = compPrincipal.getHeight();
            rect.left = Math.min(Math.max(0, i), width);
            rect.top = Math.min(Math.max(0, i2), height);
            rect.right = rect.left + i3;
            rect.right = Math.min(Math.max(0, rect.right), width);
            rect.bottom = rect.top + i4;
            rect.bottom = Math.min(Math.max(0, rect.bottom), height);
        }
        int[] iArr = new int[2];
        compPrincipal.getLocationInWindow(iArr);
        rect.left += iArr[0];
        rect.top += iArr[1];
        rect.right += iArr[0];
        rect.bottom += iArr[1];
        f4146e = new C1406g(C1056i.m7562a(), rect);
    }

    /* renamed from: z */
    private static String m9974z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 85;
                    break;
                case 1:
                    i2 = 114;
                    break;
                case 2:
                    i2 = 31;
                    break;
                case 3:
                    i2 = 15;
                    break;
                default:
                    i2 = 34;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m9975z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 34);
        }
        return toCharArray;
    }
}
