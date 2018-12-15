package fr.pcsoft.wdjava.core.application;

import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDCallback;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.context.WDAppelContexte;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.poo.C0735q;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import java.lang.reflect.Method;

public abstract class WDProcedureInterne implements C0612h {
    /* renamed from: z */
    private static final String[] f1603z = new String[]{m2609z(m2610z("rl\u000ei")), m2609z(m2610z("7~\u0018dRZy\u0015fLFz\u0007iNUw\u0006tLWp"))};

    /* renamed from: z */
    private static String m2609z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 20;
                    break;
                case 1:
                    i2 = 59;
                    break;
                case 2:
                    i2 = 74;
                    break;
                case 3:
                    i2 = 54;
                    break;
                default:
                    i2 = 13;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2610z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 13);
        }
        return toCharArray;
    }

    public WDObjet executer(WDObjet... wDObjetArr) {
        return null;
    }

    public void executer_void(WDObjet... wDObjetArr) {
    }

    public void finExecProcInterne() {
        WDAppelContexte.getContexte().m2736x();
    }

    public WDCallback getCallback(int i) {
        String str = f1603z[0] + C0725i.m3031a(getNom(), true);
        Method a = C0735q.m3122a(getClass(), str, i);
        return a != null ? new WDCallback(str, a, this) : null;
    }

    public abstract String getNom();

    public void initExecProcInterne() {
        WDAppelContexte.getContexte().m2694a(this);
    }

    public String toString() {
        return getNom();
    }

    protected void verifNbParametres(int i, int i2) {
        if (i < i2) {
            WDErreurManager.m2883a(C0745b.m3222b(f1603z[1], getNom(), String.valueOf(i), String.valueOf(i2)));
        }
    }
}
