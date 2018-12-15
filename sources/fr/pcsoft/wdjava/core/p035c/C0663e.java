package fr.pcsoft.wdjava.core.p035c;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.ui.C0489p;

/* renamed from: fr.pcsoft.wdjava.core.c.e */
public class C0663e extends C0539d {
    /* renamed from: z */
    private static final String[] f1647z = new String[]{C0663e.m2669z(C0663e.m2670z(":\u0012\u0003Zx\\")), C0663e.m2669z(C0663e.m2670z(":\u0015\u0001D|V\u0017\u0001Uq\\\u0004\u001aZ}U\u001e")), C0663e.m2669z(C0663e.m2670z(":\u0018\u0001VrX\u0015\n^`P\u0015\u0018ZsP\u001f\u000bD|Q\u001a\u0003K`_\u001e\u0000DvW\u000f\u000bIq\\")), C0663e.m2669z(C0663e.m2670z(":\u0018\u0006ZrI")), C0663e.m2669z(C0663e.m2670z(":\u0018\u0001VrX\u0015\n^`P\u0015\u0018ZsP\u001f\u000bD~M\u000f\u001cR}L\u000f\u0011Am")), C0663e.m2669z(C0663e.m2670z(":\u0018\u0001VrX\u0015\n^`P\u0015\u0018ZsP\u001f\u000bD|V\u0016\fT")), C0663e.m2669z(C0663e.m2670z(":\u0018\u0001VrX\u0015\n^`P\u0015\u0018ZsP\u001f\u000bDkX\u0019\u0002^")), C0663e.m2669z(C0663e.m2670z(":\u0016\u000fNiX\u0012\u001dDk@\u000b\u000bD|Q\u001a\u0003K")), C0663e.m2669z(C0663e.m2670z(":\u001d\u0001Ir\\")), C0663e.m2669z(C0663e.m2670z(":\u0018\u0001Ui\\\t\u001dRpW\u0004\u0007VoV\b\u001dR}U\u001e")), C0663e.m2669z(C0663e.m2670z(":\u0018\u0001VrX\u0015\n^`P\u0015\u0018ZsP\u001f\u000bD|Q\u001a\u0003K")), C0663e.m2669z(C0663e.m2670z(":\u000f\u0017KzF\u0014\fQzM")), C0663e.m2669z(C0663e.m2670z("U>nL{V9$~K9»nw\u0018v)'|Vw>nZ97i~Mk>;i\u001fw|/;Ox(nòKð{'uVm2/wVj²`")), C0663e.m2669z(C0663e.m2670z(":\u0016\u000fNiX\u0012\u001dDk@\u000b\u000bDr\\\u0015\u001b")), C0663e.m2669z(C0663e.m2670z(":\u000f\u000fYs\\\u0004\u0006RzK\u001a\u001cXwP\n\u001b^")), C0663e.m2669z(C0663e.m2670z(":\u001a\u001cYm\\")), C0663e.m2669z(C0663e.m2670z(":\u0018\u0001VrX\u0015\n^`P\u0015\u0018ZsP\u001f\u000bDeK")), C0663e.m2669z(C0663e.m2670z(":\u0018\u0006ZrI\u0004\u0007U|V\u0015\u0000N")), C0663e.m2669z(C0663e.m2670z(":\u0017\u0007YzU\u0017\u000b")), C0663e.m2669z(C0663e.m2670z(":\u0018\u0001VrX\u0015\n^`P\u0015\u0018ZsP\u001f\u000bDsP\b\u001a^"))};
    /* renamed from: b */
    private WDObjet f1648b = null;

    public C0663e(WDObjet wDObjet) {
        super("");
        this.f1648b = wDObjet;
    }

    /* renamed from: z */
    private static String m2669z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 25;
                    break;
                case 1:
                    i2 = 91;
                    break;
                case 2:
                    i2 = 78;
                    break;
                case 3:
                    i2 = 27;
                    break;
                default:
                    i2 = 63;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2670z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 63);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public String m2671a(int i) {
        C0691a.m2860a(this.f1648b != null, f1647z[12]);
        if (this.f1648b == null) {
            return "";
        }
        if (i < 1000 || i >= 2000) {
            return C0745b.m3222b(f1647z[9], this.f1648b.getNomType(), C0725i.m3045b(i));
        } else if (this.f1648b.isObjetAPCode()) {
            switch (i) {
                case 1000:
                    return C0745b.m3222b(f1647z[17], this.f1648b.getString());
                case 1001:
                    return C0745b.m3222b(f1647z[10], ((C0489p) this.f1648b).getName(), C0745b.m3220a(f1647z[15], new String[0]));
                case 1004:
                    return C0745b.m3222b(f1647z[1], ((C0489p) this.f1648b).getName()) + "\n" + C0745b.m3222b(f1647z[11], this.f1648b.getNomType());
                case C0607n.vr /*1005*/:
                    return C0745b.m3222b(f1647z[19], ((C0489p) this.f1648b).getName());
                case 1007:
                    return C0745b.m3222b(f1647z[10], ((C0489p) this.f1648b).getName(), C0745b.m3220a(f1647z[18], new String[0]));
                case 1008:
                    return C0745b.m3222b(f1647z[5], ((C0489p) this.f1648b).getName());
                case 1010:
                    return C0745b.m3222b(f1647z[10], ((C0489p) this.f1648b).getName(), C0745b.m3220a(f1647z[0], new String[0]));
                case 1011:
                case 1019:
                case 1020:
                    return C0745b.m3222b(f1647z[13], ((C0489p) this.f1648b).getName(), this.f1648b.getNomType());
                case 1012:
                    return C0745b.m3222b(f1647z[10], ((C0489p) this.f1648b).getName(), C0745b.m3220a(f1647z[8], new String[0]));
                case 1014:
                    return C0745b.m3222b(f1647z[16], ((C0489p) this.f1648b).getName(), this.f1648b.getNomType());
                case 1015:
                    return C0745b.m3222b(f1647z[4], ((C0489p) this.f1648b).getName(), this.f1648b.getNomType());
                case 1016:
                    return C0745b.m3222b(f1647z[6], ((C0489p) this.f1648b).getName(), this.f1648b.getNomType());
                case 1017:
                    return C0745b.m3222b(f1647z[7], ((C0489p) this.f1648b).getName(), C0745b.m3220a(f1647z[14], new String[0]));
                case 1018:
                    return C0745b.m3222b(f1647z[2], ((C0489p) this.f1648b).getName(), this.f1648b.getNomType());
                default:
                    return C0745b.m3222b(f1647z[10], ((C0489p) this.f1648b).getName(), C0725i.m3045b(i));
            }
        } else {
            return C0745b.m3222b(f1647z[9], this.f1648b.getNomType(), C0745b.m3220a(f1647z[3], new String[0]));
        }
    }
}
