package fr.pcsoft.wdjava.p061q.p062a;

import android.animation.LayoutTransition;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory.Options;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.media.MediaRecorder;
import android.os.AsyncTask;
import android.provider.Settings.Secure;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebSettings;
import android.widget.AbsSeekBar;
import android.widget.SeekBar;
import fr.pcsoft.wdjava.core.application.WDAppManager;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.p035c.C0665g;
import fr.pcsoft.wdjava.core.p042b.C0657a;
import fr.pcsoft.wdjava.core.utils.kb;
import fr.pcsoft.wdjava.ui.activite.C1056i;
import java.io.File;
import java.lang.reflect.Field;

/* renamed from: fr.pcsoft.wdjava.q.a.a */
public class C1014a {
    /* renamed from: a */
    private static C1014a f2912a = null;
    /* renamed from: z */
    private static final String[] f2913z = new String[]{C1014a.m7328z(C1014a.m7329z("@{\ty[%|\u0004<T\"y\u0011l]i8\u0005y\u0018iyAqÑqp\u000ex]%O\u0004~k`l\u0015uVbkBo]qH\ri_lv\u0012YVdz\ry\\%h\u0000n\u0018lv\u0015nWvh\u0004Llw\u000f2")), C1014a.m7328z(C1014a.m7329z("v}\u0015LTp\brK@v\u0000~T`|")), C1014a.m7328z(C1014a.m7329z("v}\u0015ZWw}\u0006nWpv\u0005")), C1014a.m7328z(C1014a.m7329z("kw\u0015u^l{\u0000hQjv")), C1014a.m7328z(C1014a.m7329z("@{\ty[%|\u0004<T\"y\u0011l]i8\u0005y\u0018iyAqÑqp\u000ex]%k\u0004h~jj\u0004{Jjm\u000fx\u0018uy\u0013<Qkl\u0013sKu}\u0002hQjvO")), C1014a.m7328z(C1014a.m7329z("iw\u0002}Llw\u000fCHww\u0017u\\`j\u0012CYit\u000ek]a")), C1014a.m7328z(C1014a.m7329z("hL\tiUg")), C1014a.m7328z(C1014a.m7329z("Lu\u0011sKvq\u0003p]%|\u0004<Jì{\u0014lÑw}\u0013<T\"q\f}_`8\u0005i\u0018fm\u0013o]pjAx]%t\u0000<k`}\n^Yw8\u0011}J%q\u000fhJjk\u0011y[qq\u000er\u0016"))};

    protected C1014a() {
    }

    /* renamed from: b */
    public static final C1014a m7327b() {
        if (f2912a == null) {
            int p = kb.m3986p();
            if (p >= C0657a.NOUGAT.getNumero()) {
                f2912a = new C1024k();
            } else if (p >= C0657a.LOLLIPOP.getNumero()) {
                f2912a = new C1023j();
            } else if (p >= C0657a.JELLY_BEAN_MR1.getNumero()) {
                f2912a = new C1021h();
            } else if (p >= C0657a.JELLY_BEAN.getNumero()) {
                f2912a = new C1020g();
            } else if (p >= C0657a.ICE_CREAM_SANDWICH.getNumero()) {
                f2912a = new C1019f();
            } else if (p >= C0657a.HONEYCOMB.getNumero()) {
                f2912a = new C1018e();
            } else if (p >= C0657a.GINGERBREAD.getNumero()) {
                f2912a = new C1017d();
            } else if (p >= C0657a.FROYO.getNumero()) {
                f2912a = new C1016c();
            } else if (p >= C0657a.ECLAIR.getNumero()) {
                f2912a = new C1015b();
            } else {
                f2912a = new C1014a();
            }
        }
        return f2912a;
    }

    /* renamed from: z */
    private static String m7328z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 5;
                    break;
                case 1:
                    i2 = 24;
                    break;
                case 2:
                    i2 = 97;
                    break;
                case 3:
                    i2 = 28;
                    break;
                default:
                    i2 = 56;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7329z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 56);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public int mo3278a(MotionEvent motionEvent) {
        return 1;
    }

    /* renamed from: a */
    public int mo3286a(View view) throws C0665g {
        throw new C0665g(C0657a.HONEYCOMB);
    }

    /* renamed from: a */
    public Point mo3295a(boolean z) {
        Point point = new Point();
        Activity a = C1056i.m7562a();
        if (a != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            a.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            point.x = displayMetrics.widthPixels;
            point.y = displayMetrics.heightPixels;
        }
        return point;
    }

    /* renamed from: a */
    public Drawable mo3279a(ConstantState constantState, Resources resources) {
        return constantState.newDrawable();
    }

    /* renamed from: a */
    public Drawable mo3299a(SeekBar seekBar) {
        try {
            Field declaredField = AbsSeekBar.class.getDeclaredField(f2913z[6]);
            declaredField.setAccessible(true);
            return (Drawable) declaredField.get(seekBar);
        } catch (Exception e) {
            C0691a.m2857a(f2913z[7], e);
            return null;
        }
    }

    /* renamed from: a */
    public File mo3282a(Context context) {
        return null;
    }

    /* renamed from: a */
    public void mo3300a(LayoutTransition layoutTransition, int i) {
    }

    /* renamed from: a */
    public void mo3303a(Activity activity) {
    }

    /* renamed from: a */
    public void mo3287a(Activity activity, boolean z) {
    }

    /* renamed from: a */
    public void mo3280a(Service service, int i) {
        try {
            Service.class.getMethod(f2913z[2], new Class[]{Boolean.TYPE}).invoke(service, new Object[]{Boolean.FALSE});
            NotificationManager notificationManager = (NotificationManager) WDAppManager.m2544C().getSystemService(f2913z[3]);
            if (notificationManager != null) {
                try {
                    notificationManager.cancel(i);
                } catch (Exception e) {
                    throw e;
                }
            }
        } catch (Exception e2) {
            C0691a.m2857a(f2913z[4], e2);
        }
    }

    /* renamed from: a */
    public void mo3281a(Service service, int i, Notification notification) {
        try {
            Service.class.getMethod(f2913z[2], new Class[]{Boolean.TYPE}).invoke(service, new Object[]{Boolean.TRUE});
            NotificationManager notificationManager = (NotificationManager) WDAppManager.m2544C().getSystemService(f2913z[3]);
            if (notificationManager != null) {
                try {
                    notification.flags |= 32;
                    notificationManager.notify(i, notification);
                } catch (Exception e) {
                    throw e;
                }
            }
        } catch (Exception e2) {
            C0691a.m2857a(f2913z[4], e2);
        }
    }

    /* renamed from: a */
    public void mo3288a(Options options, boolean z) throws C0665g {
        throw new C0665g(C0657a.HONEYCOMB);
    }

    /* renamed from: a */
    public void mo3283a(MediaRecorder mediaRecorder, boolean z) {
        mediaRecorder.setOutputFormat(0);
        mediaRecorder.setAudioEncoder(0);
        mediaRecorder.setVideoEncoder(0);
    }

    /* renamed from: a */
    public <T> void mo3289a(AsyncTask asyncTask, T... tArr) {
        asyncTask.execute(tArr);
    }

    /* renamed from: a */
    public void mo3290a(View view, int i, Paint paint) throws C0665g {
        throw new C0665g(C0657a.HONEYCOMB);
    }

    /* renamed from: a */
    public void mo3304a(View view, Drawable drawable) {
    }

    /* renamed from: a */
    public void mo3291a(ViewGroup viewGroup) {
    }

    /* renamed from: a */
    public void mo3305a(Window window, int i) {
    }

    /* renamed from: a */
    public void mo3284a(WebSettings webSettings, boolean z) {
        try {
            WebSettings.class.getMethod(f2913z[1], new Class[]{Boolean.TYPE}).invoke(webSettings, new Object[]{Boolean.valueOf(z)});
        } catch (Exception e) {
            C0691a.m2857a(f2913z[0], e);
        }
    }

    /* renamed from: a */
    public boolean mo3302a() {
        return !TextUtils.isEmpty(Secure.getString(WDAppManager.m2553L(), f2913z[5]));
    }

    /* renamed from: a */
    public boolean mo3296a(View view, int i) {
        return false;
    }

    /* renamed from: b */
    public void mo3301b(LayoutTransition layoutTransition, int i) {
    }

    /* renamed from: b */
    public void mo3297b(Activity activity, boolean z) {
    }

    /* renamed from: b */
    public void mo3292b(View view) {
    }

    /* renamed from: b */
    public void mo3293b(ViewGroup viewGroup) {
    }

    /* renamed from: b */
    public boolean mo3306b(Activity activity) {
        return false;
    }

    /* renamed from: b */
    public boolean mo3298b(View view, int i) {
        return false;
    }

    /* renamed from: c */
    public String mo3285c() throws C0665g {
        throw new C0665g(C0657a.GINGERBREAD);
    }

    /* renamed from: c */
    public void mo3294c(View view) {
    }
}
