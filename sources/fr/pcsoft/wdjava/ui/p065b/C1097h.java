package fr.pcsoft.wdjava.ui.p065b;

import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.p061q.p062a.C1014a;
import fr.pcsoft.wdjava.ui.activite.C1056i;
import fr.pcsoft.wdjava.ui.utils.C1511l;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: fr.pcsoft.wdjava.ui.b.h */
public abstract class C1097h extends AsyncTask<Object, Void, Drawable> {
    /* renamed from: z */
    private static final String f3324z = C1097h.m7946z(C1097h.m7947z("\u0003h\n\u0006e4:\u001c\u0016b't\fC|#:\u001b\u000bq4}\u001d\u000eu(nX\u0007ufv_\n}'}\u001dM"));
    /* renamed from: a */
    private C1099j f3325a = null;
    /* renamed from: b */
    private ProgressBar f3326b = null;

    public C1097h(C1099j c1099j) {
        this.f3325a = c1099j;
    }

    /* renamed from: c */
    private final void m7945c() {
        try {
            if (this.f3326b != null) {
                if (this.f3326b.getParent() == null) {
                    mo3471b(this.f3326b);
                }
                mo3469a(this.f3326b);
            }
        } catch (RejectedExecutionException e) {
            throw e;
        } catch (RejectedExecutionException e2) {
            throw e2;
        }
    }

    /* renamed from: z */
    private static String m7946z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 70;
                    break;
                case 1:
                    i2 = 26;
                    break;
                case 2:
                    i2 = C0607n.co;
                    break;
                case 3:
                    i2 = 99;
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
    private static char[] m7947z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 16);
        }
        return toCharArray;
    }

    /* renamed from: a */
    protected Drawable m7948a(Object... objArr) {
        try {
            if (this.f3325a == null) {
                return null;
            }
            this.f3325a.run();
            try {
                return (Drawable) this.f3325a.m3088a();
            } catch (Exception e) {
                C0691a.m2857a(f3324z, e);
                return null;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    public final void m7949a() {
        try {
            if (this.f3326b != null) {
                mo3469a(this.f3326b);
            }
        } catch (RejectedExecutionException e) {
            throw e;
        }
    }

    /* renamed from: a */
    protected void mo3468a(Drawable drawable) {
        mo3470b();
    }

    /* renamed from: a */
    protected abstract void mo3469a(ProgressBar progressBar);

    /* renamed from: a */
    public final void m7952a(boolean z) {
        if (z) {
            try {
                if (this.f3326b == null) {
                    this.f3326b = new C1096g(this, C1056i.m7562a(), null, 16842871);
                    int i = C1511l.f4645s;
                    this.f3326b.setPadding(i, i, i, i);
                }
            } catch (RejectedExecutionException e) {
                throw e;
            }
        }
        try {
            C1014a.m7327b().mo3289a((AsyncTask) this, new Object[0]);
        } catch (RejectedExecutionException e2) {
            this.f3325a.run();
        }
    }

    /* renamed from: b */
    protected void mo3470b() {
        this.f3325a = null;
        m7956e();
    }

    /* renamed from: b */
    protected abstract void mo3471b(ProgressBar progressBar);

    /* renamed from: d */
    public final String m7955d() {
        try {
            return this.f3325a != null ? this.f3325a.mo3347c() : null;
        } catch (RejectedExecutionException e) {
            throw e;
        }
    }

    protected /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        return m7948a(objArr);
    }

    /* renamed from: e */
    public final void m7956e() {
        try {
            if (this.f3326b != null) {
                if (this.f3326b.getParent() != null) {
                    ((ViewGroup) this.f3326b.getParent()).removeView(this.f3326b);
                }
            }
            this.f3326b = null;
        } catch (RejectedExecutionException e) {
            throw e;
        } catch (RejectedExecutionException e2) {
            throw e2;
        }
    }

    /* renamed from: f */
    public final void m7957f() {
        m7956e();
        cancel(true);
    }

    protected void onCancelled() {
        mo3470b();
    }

    protected /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        mo3468a((Drawable) obj);
    }

    protected void onPreExecute() {
        m7945c();
    }
}
