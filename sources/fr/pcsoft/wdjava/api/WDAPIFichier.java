package fr.pcsoft.wdjava.api;

import fr.pcsoft.wdjava.core.application.WDAppManager;
import fr.pcsoft.wdjava.core.context.C0677k;
import fr.pcsoft.wdjava.core.context.WDContexte;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.C0743a;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.file.C0901s;

public class WDAPIFichier extends WDAPIFichier_Commun {
    /* renamed from: z */
    private static final String[] f1153z = new String[]{m1621z(m1622z("%birHRvw~DYvsdCIqdtU")), m1621z(m1622z("%bi{YUpshBCwexETgs"))};

    public static final WDBooleen fExtraitRessource(String str) {
        return fExtraitRessource(str, "");
    }

    public static final WDBooleen fExtraitRessource(String str, String str2) {
        WDBooleen wDBooleen;
        boolean z = false;
        WDContexte a = C0677k.m2775a(f1153z[0]);
        try {
            if (C0743a.m3207c(str, str2) > 0) {
                z = true;
            }
            wDBooleen = new WDBooleen(z);
        } catch (C0901s e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static final WDChaine fListeRessource() {
        WDContexte a = C0677k.m2775a(f1153z[1]);
        try {
            WDChaine wDChaine = new WDChaine(C0743a.m3199a());
            return wDChaine;
        } finally {
            a.m2735v();
        }
    }

    public static final WDChaine fRepCache() {
        return new WDChaine(WDAppManager.m2573c().getPath());
    }

    public static final WDChaine fRepDonnees() {
        return new WDChaine(WDAppManager.m2581h().getPath());
    }

    /* renamed from: z */
    private static String m1621z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 6;
                    break;
                case 1:
                    i2 = 36;
                    break;
                case 2:
                    i2 = 54;
                    break;
                case 3:
                    i2 = 55;
                    break;
                default:
                    i2 = 16;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1622z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 16);
        }
        return toCharArray;
    }
}
