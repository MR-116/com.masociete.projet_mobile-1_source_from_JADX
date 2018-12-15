package fr.pcsoft.wdjava.core.application;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import fr.pcsoft.wdjava.core.WDIndirection;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.ressources.C0743a;
import fr.pcsoft.wdjava.ui.activite.C1056i;
import fr.pcsoft.wdjava.ui.champs.nb;

public class WDCollProcAndroid extends WDCollProc {
    /* renamed from: z */
    private static final String f1601z = m2605z(m2606z("AtB$\u0017$sOa\u0018e7X¨\u0017qgÃ3\u0015p~E/T`b\n\"\u001bigE2\u0015jc\n1\u0006myI(\u0004e{\n%Sqy\n\"\u001cezZa\u0010ag_(\u0007$s_a\u0017ksOa\u001aecC'"));

    protected static final Activity __getCtxAndroidInternal() {
        return C1056i.m7562a();
    }

    protected static final Activity getActiviteEnCours() {
        return __getCtxAndroidInternal();
    }

    protected static final Context getApplicationContext() {
        return getContexteApplication();
    }

    protected static final Context getContexteApplication() {
        return WDAppManager.m2544C();
    }

    protected static final Activity getCurrentActivity() {
        return getActiviteEnCours();
    }

    protected static final int getIdResource(String str) {
        return getIdRessource(str);
    }

    protected static final int getIdRessource(String str) {
        return C0743a.m3214j(str);
    }

    protected static View getView(String str) {
        try {
            WDObjet 2 = WDIndirection.get2(str, 4);
            if (2 != null) {
                if (2.isChamp()) {
                    Object uIComp = ((nb) 2).getUIComp();
                    if (uIComp instanceof View) {
                        return (View) uIComp;
                    }
                }
            }
        } catch (Exception e) {
            throw e;
        } catch (Exception e2) {
            C0691a.m2857a(f1601z, e2);
        }
        return null;
    }

    /* renamed from: z */
    private static String m2605z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 4;
                    break;
                case 1:
                    i2 = 23;
                    break;
                case 2:
                    i2 = 42;
                    break;
                case 3:
                    i2 = 65;
                    break;
                default:
                    i2 = 116;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2606z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 116);
        }
        return toCharArray;
    }
}
