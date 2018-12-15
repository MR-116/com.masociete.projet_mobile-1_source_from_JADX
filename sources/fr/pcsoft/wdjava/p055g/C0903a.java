package fr.pcsoft.wdjava.p055g;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.p042b.C0657a;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.ui.C0490q;
import fr.pcsoft.wdjava.ui.champs.fc;
import fr.pcsoft.wdjava.ui.champs.fenetre.WDFenetre;

/* renamed from: fr.pcsoft.wdjava.g.a */
public abstract class C0903a implements C0902f {
    /* renamed from: z */
    private static final String[] f2446z = new String[]{C0903a.m6345z(C0903a.m6346z("\fr$b\u0016`s%m\u0016js\"{\u0015{`?q\u0003ph?d\u0007ch5w")), C0903a.m6345z(C0903a.m6346z("\fw4`\u0015fn?m\u000fab>\u0016nu8p\nj~0|\u0002}n8v"))};

    protected C0903a() {
    }

    /* renamed from: a */
    public static C0902f m6344a(int i, Object obj) {
        switch (i) {
            case 1:
                return new C0905c(obj.toString());
            case 2:
                return new C0904b(obj.toString());
            case 3:
                if (!WDProjet.getInstance().isVersionCompatible(C0657a.FROYO.getNumero())) {
                    WDErreurManager.m2883a(C0745b.m3222b(f2446z[1], new String[0]));
                }
                return new C0906d(obj, 0);
            case 4:
                if (!WDProjet.getInstance().isVersionCompatible(C0657a.FROYO.getNumero())) {
                    WDErreurManager.m2883a(C0745b.m3222b(f2446z[1], new String[0]));
                }
                return new C0906d(obj, 1);
            default:
                WDErreurManager.m2883a(C0745b.m3222b(f2446z[0], new String[0]));
                return null;
        }
    }

    /* renamed from: z */
    private static String m6345z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 47;
                    break;
                case 1:
                    i2 = 33;
                    break;
                case 2:
                    i2 = 113;
                    break;
                case 3:
                    i2 = 50;
                    break;
                default:
                    i2 = 70;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m6346z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 70);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public String mo3187a(String str, fc fcVar, String str2) {
        WDObjet superChamp = fcVar.getSuperChamp();
        return superChamp != null ? mo3187a(str2 + superChamp.getNom() + str, superChamp, str2) : str;
    }

    /* renamed from: a */
    public void mo3188a(fc fcVar, boolean z) {
    }

    /* renamed from: b */
    public String mo3189b(C0490q c0490q) {
        return "";
    }

    /* renamed from: b */
    public void mo3190b() {
    }

    /* renamed from: b */
    public void mo3191b(WDFenetre wDFenetre) {
    }
}
