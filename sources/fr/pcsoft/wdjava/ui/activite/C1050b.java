package fr.pcsoft.wdjava.ui.activite;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.application.WDAppManager;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.p032m.C0938m;
import fr.pcsoft.wdjava.ui.champs.fenetre.C0508h;
import fr.pcsoft.wdjava.ui.champs.fenetre.WDFenetre;
import fr.pcsoft.wdjava.ui.utils.C1504c;

/* renamed from: fr.pcsoft.wdjava.ui.activite.b */
public class C1050b {
    /* renamed from: a */
    private static final int f3006a = 9;
    /* renamed from: b */
    private static final int f3007b = 67108864;
    /* renamed from: c */
    private static boolean f3008c = false;
    /* renamed from: d */
    private static final int f3009d = 8;
    /* renamed from: e */
    private static boolean f3010e = false;
    /* renamed from: f */
    private static final int f3011f = 16777216;
    /* renamed from: z */
    private static final String f3012z = C1050b.m7556z(C1050b.m7557z("Qa \u0016`D|h\u0012-@wd\u0007uV=o\u0016j\u0019DJ'S~@o\u0004o^v|4fDvo\u0013"));

    /* renamed from: a */
    static final void m7540a(C0502g c0502g) {
        if (f3008c || WDAppManager.m2580g()) {
            WDAppManager.m2554M();
            WDProjet.getInstance().appelPCode(C0607n.Tv);
            WDFenetre b = c0502g.mo1766b();
            if (b != null) {
                b.appelPCode(C0607n.Tv);
            }
        }
        f3010e = false;
        f3008c = false;
        c0502g.mo1757a();
        C1056i.m7564a(c0502g.mo1775i());
        C1504c.m10454a(new C1058k(c0502g));
    }

    /* renamed from: a */
    public static final void m7541a(C0502g c0502g, int i, int i2, Intent intent) {
        c0502g.mo1758a(i, i2, intent);
        c0502g.mo1766b().activity_onActivityResult(c0502g.mo1775i(), i, i2, intent);
        WDAppManager.m2563a(c0502g.mo1775i(), i, i2, intent);
    }

    /* renamed from: a */
    static final void m7542a(C0502g c0502g, Intent intent) {
        c0502g.mo1759a(intent);
        c0502g.mo1766b().activity_onNewIntent(c0502g.mo1775i(), intent);
    }

    /* renamed from: a */
    static final void m7543a(C0502g c0502g, Configuration configuration) {
        c0502g.mo1760a(configuration);
        c0502g.mo1766b().activity_OnConfigurationChanged(configuration);
    }

    /* renamed from: a */
    static final void m7544a(C0502g c0502g, Bundle bundle) {
        c0502g.mo1761a(bundle);
        c0502g.mo1766b().activity_onSaveInstanceState(c0502g.mo1775i(), bundle);
    }

    /* renamed from: a */
    static final boolean m7545a(C0502g c0502g, int i, KeyEvent keyEvent) {
        if (i != 4) {
            return c0502g.mo1763a(i, keyEvent) || c0502g.mo1766b().traiterLettreAppel(keyEvent);
        } else {
            WDFenetre b = c0502g.mo1766b();
            if (b.traiterLettreAppel(keyEvent)) {
                return true;
            }
            if (keyEvent.getRepeatCount() != 0) {
                return false;
            }
            C0938m.m6814b(new C1057j(b));
            return true;
        }
    }

    /* renamed from: a */
    static final boolean m7546a(C0502g c0502g, Menu menu) {
        boolean a = c0502g.mo1764a(menu);
        if (a) {
            c0502g.mo1766b().activity_onPrepareOptionsMenu(c0502g.mo1775i(), menu);
        }
        return a;
    }

    /* renamed from: a */
    static final boolean m7547a(C0502g c0502g, MenuItem menuItem) {
        boolean a = c0502g.mo1765a(menuItem);
        if (!a) {
            c0502g.mo1766b().activity_onOptionsItemSelected(c0502g.mo1775i(), menuItem);
        }
        return a;
    }

    /* renamed from: b */
    static final void m7548b(C0502g c0502g) {
        c0502g.mo1779m();
        C1504c.m10454a(new C1051c(c0502g));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    static final void m7549b(fr.pcsoft.wdjava.ui.activite.C0502g r7, android.os.Bundle r8) {
        /*
        r6 = 1;
        r5 = 2;
        r7.mo1767b(r8);	 Catch:{ ClassNotFoundException -> 0x0016 }
        r0 = fr.pcsoft.wdjava.core.application.WDProjet.isCree();	 Catch:{ ClassNotFoundException -> 0x0016 }
        if (r0 != 0) goto L_0x0018;
    L_0x000b:
        fr.pcsoft.wdjava.core.application.WDAppManager.m2545D();	 Catch:{ ClassNotFoundException -> 0x0016 }
        r0 = r7.mo1775i();	 Catch:{ ClassNotFoundException -> 0x0016 }
        r0.finish();	 Catch:{ ClassNotFoundException -> 0x0016 }
    L_0x0015:
        return;
    L_0x0016:
        r0 = move-exception;
        throw r0;
    L_0x0018:
        r0 = r7.mo1775i();
        fr.pcsoft.wdjava.ui.activite.C1056i.m7564a(r0);
        r0 = r7.mo1775i();
        r1 = r0.getWindow();
        r2 = r7.mo1766b();
        r0 = r7.mo1775i();
        fr.pcsoft.wdjava.ui.p081j.C1437c.m10095a(r0, r2);
        r0 = r2.isAvecBarreDeTitre();
        r3 = r2.isMaximisee();	 Catch:{ ClassNotFoundException -> 0x007c }
        if (r3 == 0) goto L_0x003e;
    L_0x003c:
        if (r0 != 0) goto L_0x0042;
    L_0x003e:
        r3 = 1;
        r1.requestFeature(r3);	 Catch:{ ClassNotFoundException -> 0x007e }
    L_0x0042:
        r3 = r2.isMaximisee();	 Catch:{ ClassNotFoundException -> 0x0080 }
        if (r3 != 0) goto L_0x0082;
    L_0x0048:
        r0 = fr.pcsoft.wdjava.p061q.p062a.C1014a.m7327b();	 Catch:{ ClassNotFoundException -> 0x0080 }
        r3 = r7.mo1775i();	 Catch:{ ClassNotFoundException -> 0x0080 }
        r4 = 0;
        r0.mo3287a(r3, r4);	 Catch:{ ClassNotFoundException -> 0x0080 }
    L_0x0054:
        r0 = fr.pcsoft.wdjava.core.application.WDProjet.getInstance();	 Catch:{ ClassNotFoundException -> 0x00e9 }
        r3 = fr.pcsoft.wdjava.core.p042b.C0657a.JELLY_BEAN;	 Catch:{ ClassNotFoundException -> 0x00e9 }
        r3 = r3.getNumero();	 Catch:{ ClassNotFoundException -> 0x00e9 }
        r0 = r0.isVersionCompatible(r3);	 Catch:{ ClassNotFoundException -> 0x00e9 }
        if (r0 == 0) goto L_0x006e;
    L_0x0064:
        r2.setHardwareAccelerated();	 Catch:{ ClassNotFoundException -> 0x00e9 }
        r0 = 16777216; // 0x1000000 float:2.3509887E-38 double:8.289046E-317;
        r3 = 16777216; // 0x1000000 float:2.3509887E-38 double:8.289046E-317;
        r1.setFlags(r0, r3);	 Catch:{ ClassNotFoundException -> 0x00e9 }
    L_0x006e:
        r0 = 50;
        r1.setSoftInputMode(r0);
        r0 = new fr.pcsoft.wdjava.ui.activite.h;
        r0.<init>(r2, r7, r8);
        fr.pcsoft.wdjava.ui.utils.C1504c.m10454a(r0);
        goto L_0x0015;
    L_0x007c:
        r0 = move-exception;
        throw r0;	 Catch:{ ClassNotFoundException -> 0x007e }
    L_0x007e:
        r0 = move-exception;
        throw r0;
    L_0x0080:
        r0 = move-exception;
        throw r0;
    L_0x0082:
        r3 = r2.isAvecBarreSysteme();	 Catch:{ ClassNotFoundException -> 0x00cf }
        if (r3 != 0) goto L_0x00d1;
    L_0x0088:
        r3 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r4 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r1.setFlags(r3, r4);	 Catch:{ ClassNotFoundException -> 0x00cf }
    L_0x008f:
        r3 = r2.isAvecActionBarExt();
        if (r3 == 0) goto L_0x00af;
    L_0x0095:
        r4 = 8;
        r1.requestFeature(r4);
        r4 = r2.getModeActionBar();
        if (r4 == r5) goto L_0x00aa;
    L_0x00a0:
        if (r4 != r6) goto L_0x00af;
    L_0x00a2:
        r4 = fr.pcsoft.wdjava.core.p042b.C0657a.LOLLIPOP;	 Catch:{ ClassNotFoundException -> 0x00e7 }
        r4 = fr.pcsoft.wdjava.core.utils.kb.m3965a(r4);	 Catch:{ ClassNotFoundException -> 0x00e7 }
        if (r4 == 0) goto L_0x00af;
    L_0x00aa:
        r4 = 9;
        r1.requestFeature(r4);	 Catch:{ ClassNotFoundException -> 0x00e7 }
    L_0x00af:
        if (r0 == 0) goto L_0x0054;
    L_0x00b1:
        if (r3 == 0) goto L_0x00b9;
    L_0x00b3:
        r0 = r2.isMaterialDesign();	 Catch:{ ClassNotFoundException -> 0x00c3 }
        if (r0 != 0) goto L_0x0054;
    L_0x00b9:
        r0 = f3012z;	 Catch:{ ClassNotFoundException -> 0x00c3 }
        java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x00c3 }
        r0 = 5;
        r1.requestFeature(r0);	 Catch:{ ClassNotFoundException -> 0x00c3 }
        goto L_0x0054;
    L_0x00c3:
        r0 = move-exception;
        throw r0;	 Catch:{ ClassNotFoundException -> 0x00c5 }
    L_0x00c5:
        r0 = move-exception;
        if (r3 != 0) goto L_0x0054;
    L_0x00c8:
        r0 = 2;
        r1.requestFeature(r0);	 Catch:{ ClassNotFoundException -> 0x00cd }
        goto L_0x0054;
    L_0x00cd:
        r0 = move-exception;
        throw r0;
    L_0x00cf:
        r0 = move-exception;
        throw r0;
    L_0x00d1:
        r3 = r2.getModeBarreSysteme();	 Catch:{ ClassNotFoundException -> 0x00e5 }
        if (r3 != r5) goto L_0x008f;
    L_0x00d7:
        r3 = fr.pcsoft.wdjava.core.application.WDAppManager.m2592s();	 Catch:{ ClassNotFoundException -> 0x00e3 }
        if (r3 == 0) goto L_0x008f;
    L_0x00dd:
        r3 = 67108864; // 0x4000000 float:1.5046328E-36 double:3.31561842E-316;
        r1.addFlags(r3);	 Catch:{ ClassNotFoundException -> 0x00e3 }
        goto L_0x008f;
    L_0x00e3:
        r0 = move-exception;
        throw r0;
    L_0x00e5:
        r0 = move-exception;
        throw r0;	 Catch:{ ClassNotFoundException -> 0x00e3 }
    L_0x00e7:
        r0 = move-exception;
        throw r0;
    L_0x00e9:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.ui.activite.b.b(fr.pcsoft.wdjava.ui.activite.g, android.os.Bundle):void");
    }

    /* renamed from: b */
    static final boolean m7550b(C0502g c0502g, Menu menu) {
        boolean b = c0502g.mo1768b(menu);
        if (b) {
            c0502g.mo1766b().activity_onCreateOptionsMenu(c0502g.mo1775i(), menu);
        }
        return b;
    }

    /* renamed from: c */
    static final void m7551c(C0502g c0502g) {
        c0502g.mo1762a(true);
        c0502g.mo1774h();
    }

    /* renamed from: d */
    static final void m7552d(C0502g c0502g) {
        if (!c0502g.mo1770d()) {
            C0508h b = c0502g.mo1766b();
            if (b != null && b.estOuverte()) {
                b.ferme(false, false, null);
            }
        }
        c0502g.mo1777k();
        c0502g.mo1766b().activity_onDestroy(c0502g.mo1775i());
        c0502g.mo1773g();
    }

    /* renamed from: e */
    static final void m7553e(C0502g c0502g) {
        c0502g.mo1776j();
        C1056i.m7564a(c0502g.mo1775i());
        WDFenetre b = c0502g.mo1766b();
        if (c0502g.mo1778l()) {
            c0502g.mo1762a(false);
        } else {
            C1504c.m10454a(new C1053e(b, c0502g));
        }
    }

    /* renamed from: f */
    static final void m7554f(C0502g c0502g) {
        f3010e = true;
        c0502g.mo1772f();
        c0502g.mo1766b().activity_onPause(c0502g.mo1775i());
    }

    /* renamed from: g */
    static final void m7555g(C0502g c0502g) {
        WDProjet.getInstance().notifSaturationMemoire();
        c0502g.mo1771e();
        c0502g.mo1766b().activity_onLowMemory(c0502g.mo1775i());
    }

    /* renamed from: z */
    private static String m7556z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 55;
                    break;
                case 1:
                    i2 = 19;
                    break;
                case 2:
                    i2 = 14;
                    break;
                case 3:
                    i2 = 102;
                    break;
                default:
                    i2 = 3;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7557z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 3);
        }
        return toCharArray;
    }
}
