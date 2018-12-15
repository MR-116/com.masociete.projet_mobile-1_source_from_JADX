package fr.pcsoft.wdjava.ui.champs.slidingmenu.p071b;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.ui.actionbar.C0491d;
import fr.pcsoft.wdjava.ui.champs.fenetre.WDFenetre;
import java.lang.reflect.Field;

/* renamed from: fr.pcsoft.wdjava.ui.champs.slidingmenu.b.b */
class C1276b extends ActionBarDrawerToggle {
    /* renamed from: z */
    private static final String[] f3776z = new String[]{C1276b.m8919z(C1276b.m8920z("yg\u0013\bZqQ(\u0004LsF")), C1276b.m8919z(C1276b.m8920z("]N\u0011\u0006^gJ\u0003\u0005H4G\u0004I@{G\b\u000fDqQA\u0005L4@\u000e\u001cAqV\u0013IIq\u0003\rNDwL\u000f\f\u0003"))};
    final C1275a this$0;
    final WDFenetre val$fenetre;

    C1276b(C1275a c1275a, Activity activity, DrawerLayout drawerLayout, int i, int i2, int i3, WDFenetre wDFenetre) {
        this.this$0 = c1275a;
        this.val$fenetre = wDFenetre;
        super(activity, drawerLayout, i, i2, i3);
    }

    /* renamed from: z */
    private static String m8919z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 20;
                    break;
                case 1:
                    i2 = 35;
                    break;
                case 2:
                    i2 = 97;
                    break;
                case 3:
                    i2 = 105;
                    break;
                default:
                    i2 = 45;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m8920z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 45);
        }
        return toCharArray;
    }

    public void syncState() {
        super.syncState();
        try {
            Field declaredField = ActionBarDrawerToggle.class.getDeclaredField(f3776z[0]);
            declaredField.setAccessible(true);
            C0491d actionBar = this.val$fenetre.getActionBar();
            if (actionBar != null) {
                actionBar.transformDrawable((Drawable) declaredField.get(this));
            }
        } catch (Exception e) {
            throw e;
        } catch (Exception e2) {
            C0691a.m2857a(f3776z[1], e2);
        }
    }
}
