package fr.pcsoft.wdjava.ui.menu;

import android.view.ViewConfiguration;
import fr.pcsoft.wdjava.api.WDAPIMenu;
import fr.pcsoft.wdjava.core.C0723g;
import fr.pcsoft.wdjava.core.application.WDAppManager;
import fr.pcsoft.wdjava.core.debug.C0691a;
import java.lang.reflect.Field;

@C0723g(a = {WDAPIMenu.class})
public class WDMenuPrincipal extends C0499g {
    static {
        try {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(WDAppManager.m2544C());
            Field declaredField = ViewConfiguration.class.getDeclaredField(m1330z(m1331z("v\u000e?$w`436I`(*\u001aBk3\u00152^")));
            if (declaredField != null) {
                declaredField.setAccessible(true);
                declaredField.setBoolean(viewConfiguration, false);
            }
        } catch (Exception e) {
            throw e;
        } catch (Exception e2) {
            C0691a.m2857a(m1330z(m1331z("@4,2Rwf28Uvf:2\u0007ia?4Dí5~6R%+;:Ew#~\u0001N`1\u001d8Ic/9\"Ud278I+5\u00166TU#,:Fk#0#j`(+\u001cB|f.6U%/0#Uj5.2Dq/19\t")), e2);
        }
    }

    /* renamed from: z */
    private static String m1330z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 5;
                    break;
                case 1:
                    i2 = 70;
                    break;
                case 2:
                    i2 = 94;
                    break;
                case 3:
                    i2 = 87;
                    break;
                default:
                    i2 = 39;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1331z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 39);
        }
        return toCharArray;
    }

    public int getNbSousOptions() {
        return 0;
    }
}
