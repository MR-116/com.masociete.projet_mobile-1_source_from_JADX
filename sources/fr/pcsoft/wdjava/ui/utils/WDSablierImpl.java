package fr.pcsoft.wdjava.ui.utils;

import android.app.Activity;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.utils.C0806j;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.p032m.C0938m;
import fr.pcsoft.wdjava.ui.activite.C0492a;
import fr.pcsoft.wdjava.ui.activite.C1056i;
import fr.pcsoft.wdjava.ui.activite.WDActivite;
import java.util.Stack;

public class WDSablierImpl implements C0857z {
    /* renamed from: b */
    private C1522x f4550b = null;
    /* renamed from: c */
    private int f4551c = 0;
    /* renamed from: d */
    private Stack<String> f4552d = new Stack();
    /* renamed from: e */
    private C0492a f4553e;
    /* renamed from: f */
    private Activity f4554f = null;
    /* renamed from: g */
    private int f4555g = 0;

    public WDSablierImpl() {
        Activity a = C1056i.m7562a();
        if (a instanceof Activity) {
            this.f4554f = a;
            if (a instanceof WDActivite) {
                this.f4553e = new C1506g(this);
                ((WDActivite) a).mo1766b().ajouterEcouteurActivite(this.f4553e);
            }
        }
    }

    /* renamed from: a */
    public final boolean m10413a() {
        return (this.f4555g & 1) == 0;
    }

    public void destroy() {
        if (C0938m.m6815b()) {
            if (this.f4553e != null && (this.f4554f instanceof WDActivite)) {
                ((WDActivite) this.f4554f).mo1766b().supprimerEcouteurActivite(this.f4553e);
                this.f4553e = null;
            }
            this.f4554f = null;
            if (this.f4552d != null) {
                this.f4552d.clear();
            }
            if (this.f4550b != null) {
                this.f4550b.dismiss();
                this.f4550b = null;
            }
        }
    }

    public int getOptions() {
        return this.f4555g;
    }

    public void hide() {
        if (C0938m.m6815b() && isShown()) {
            this.f4551c--;
            this.f4552d.pop();
            if (this.f4551c > 0) {
                updateMessage(this.f4552d.isEmpty() ? "" : (String) this.f4552d.peek());
            } else {
                destroy();
            }
        }
    }

    public boolean isDestroyed() {
        return this.f4554f == null;
    }

    public final boolean isShown() {
        return this.f4550b != null && this.f4551c > 0;
    }

    public void show(String str) {
        show(str, 0);
    }

    public void show(String str, int i) {
        if (C0938m.m6815b()) {
            this.f4555g |= i;
            if (C0808l.m4053k(str)) {
                str = WDProjet.getInstance().getTitreSuivant();
            }
            if (!isShown()) {
                if (this.f4554f == null || this.f4554f.isFinishing()) {
                    destroy();
                    return;
                } else {
                    this.f4550b = new C1522x(this.f4554f);
                    this.f4550b.show();
                }
            }
            this.f4551c++;
            this.f4552d.push(str);
            updateMessage(str);
        }
    }

    public void updateMessage(String str) {
        if (C0938m.m6815b() && isShown()) {
            this.f4550b.m10573a(str);
            C1515p.m10542a(-50);
        }
    }

    public void updateUI() {
        if (C0938m.m6815b()) {
            C0806j.m3953c();
        }
    }
}
