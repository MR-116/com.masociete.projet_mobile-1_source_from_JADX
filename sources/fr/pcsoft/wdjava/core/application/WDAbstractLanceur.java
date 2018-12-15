package fr.pcsoft.wdjava.core.application;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.ActivityCompat.OnRequestPermissionsResultCallback;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.core.utils.kb;
import fr.pcsoft.wdjava.p061q.p062a.C1014a;
import fr.pcsoft.wdjava.ui.activite.C1056i;
import fr.pcsoft.wdjava.ui.champs.fenetre.C0508h;
import fr.pcsoft.wdjava.ui.champs.fenetre.C1155i;
import fr.pcsoft.wdjava.ui.p064a.C1031a;
import fr.pcsoft.wdjava.ui.style.degrade.IWDDegrade;

public abstract class WDAbstractLanceur extends Activity implements C0535j, OnRequestPermissionsResultCallback {
    /* renamed from: b */
    private static final String f983b = m1548z(m1549z("uOairCxZJ}PnWwYGe"));
    /* renamed from: c */
    private static final int f984c = 1000;
    /* renamed from: e */
    private static final int f985e = 3;
    /* renamed from: f */
    private static final int f986f = 1;
    /* renamed from: g */
    private static final int f987g = 2000;
    /* renamed from: h */
    private static final int f988h = 2;
    /* renamed from: i */
    private static final String f989i = m1548z(m1549z("Dy\u001ci}QdTm0Q{^xmJT]kwGeFxjKd\\FjCi^|j"));
    /* renamed from: z */
    private static final String[] f990z;
    /* renamed from: a */
    private Drawable f991a = null;
    /* renamed from: d */
    private AsyncTask f992d = null;

    static {
        r0 = new String[10];
        r0[0] = m1548z(m1549z("gSfK_}\\vWQvBtP]c_{VP"));
        r0[1] = m1548z(m1549z("gSfK_}I}VJ}XfXLv"));
        r0[2] = m1548z(m1549z("Dy\u001ci}QdTm0UoXxhC%\\vjKm[zVb]w0uO|vjKm[zVb]w\\PdS}}CxFK{An[o{P"));
        r0[3] = m1548z(m1549z("kfBvmQbPu{\u0002o\u0015ppQSw}Kn@9rC+QuQxW9zG+V|mAy[ijKd\\9zW+AirCxZ9mAyW|p\u0002oW9r\u0005jBirKhSmwMe\u001c"));
        r0[4] = m1548z(m1549z("gSfK_}[`\\SkN`\\AdN|\\JpN"));
        r0[5] = m1548z(m1549z("agSjmG+Tk0RhAvxV%E}tC}S7pM[wAjFpqL%e]PM[wAjFpqLI@vFhSjjpnQ|wTn@9pMe\u0012mlM~Dð{\f"));
        r0[6] = m1548z(m1549z("\u0001JbIPcFw:"));
        r0[7] = m1548z(m1549z("\u0001]wKMkD|:"));
        r0[8] = m1548z(m1549z("\u0002e\u0015x>RjA9÷Vâ\u0012mlM~Dð{\f"));
        r0[9] = m1548z(m1549z("nj\u0012{LáFk{\u0002"));
        f990z = r0;
    }

    /* renamed from: a */
    private ViewGroup m1546a(Activity activity, IWDSplashScreen iWDSplashScreen) {
        CharSequence string;
        View imageView;
        View textView;
        ViewGroup viewGroup;
        IWDDegrade fondDegrade;
        View relativeLayout = new RelativeLayout(activity);
        int idNomApplication = iWDSplashScreen.getIdNomApplication();
        View textView2 = new TextView(activity);
        textView2.setId(1);
        if (idNomApplication > 0) {
            string = activity.getString(idNomApplication);
            if (string.indexOf(f990z[6]) >= 0) {
                string = C0808l.m4018a((String) string, f990z[6], activity.getString(WDProjet.getInstance().getIdNomApplication()));
            }
            textView2.setText(string);
            textView2.setTextSize(1, 30.0f);
            textView2.setTextColor(C1031a.m7467k(iWDSplashScreen.getCouleurLibelle()));
            textView2.setGravity(17);
        } else {
            textView2.setVisibility(4);
        }
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(15);
        layoutParams.addRule(14);
        relativeLayout.addView(textView2, layoutParams);
        int idLogo = iWDSplashScreen.getIdLogo();
        if (idLogo > 0) {
            imageView = new ImageView(activity);
            imageView.setId(2);
            imageView.setImageResource(idLogo);
            imageView.setScaleType(ScaleType.CENTER_INSIDE);
            layoutParams = idNomApplication > 0 ? new RelativeLayout.LayoutParams(-1, -1) : new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(2, 1);
            layoutParams.addRule(14);
            if (idNomApplication > 0) {
                layoutParams.bottomMargin = 20;
                layoutParams.topMargin = 20;
            }
            relativeLayout.addView(imageView, layoutParams);
        }
        imageView = new LinearLayout(activity);
        boolean z = false;
        if (iWDSplashScreen.isAvecAnimationChargement()) {
            View progressBar = new ProgressBar(activity, null, C1031a.m7474r(C1031a.m7467k(iWDSplashScreen.getCouleurLibelle())) ? 16843399 : 16842871);
            progressBar.setIndeterminate(true);
            layoutParams = new LinearLayout.LayoutParams(-2, -2);
            imageView.addView(progressBar, layoutParams);
            layoutParams.bottomMargin = 20;
            z = true;
        }
        int idMessageChargement = iWDSplashScreen.getIdMessageChargement();
        if (idMessageChargement > 0) {
            textView = new TextView(activity);
            textView.setId(3);
            textView.setText(idMessageChargement);
            textView.setTextSize(1, 15.0f);
            textView.setTextColor(C1031a.m7467k(iWDSplashScreen.getCouleurLibelle()));
            LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.topMargin = 20;
            imageView.addView(textView, layoutParams2);
            z = true;
        }
        if (z) {
            imageView.setOrientation(1);
            imageView.setGravity(17);
            layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            if (idNomApplication > 0 || idLogo > 0) {
                layoutParams.addRule(3, 1);
                layoutParams.addRule(14);
            } else {
                layoutParams.addRule(15);
                layoutParams.addRule(14);
            }
            relativeLayout.addView(imageView, layoutParams);
        }
        int idInfoVersion = iWDSplashScreen.getIdInfoVersion();
        if (idInfoVersion > 0) {
            string = activity.getString(idInfoVersion);
            if (string.indexOf(f990z[7]) >= 0) {
                string = C0808l.m4018a((String) string, f990z[7], WDProjet.getInstance().getVersionApplication());
            }
            View textView3 = new TextView(activity);
            textView3.setText(string);
            textView3.setTextSize(1, 10.0f);
            textView3.setTextColor(C1031a.m7467k(iWDSplashScreen.getCouleurLibelle()));
            layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(12);
            layoutParams.leftMargin = 5;
            relativeLayout.addView(textView3, layoutParams);
        }
        idInfoVersion = iWDSplashScreen.getIdImageFond();
        if (idInfoVersion > 0) {
            Options options = new Options();
            options.inJustDecodeBounds = true;
            options.inScaled = false;
            BitmapFactory.decodeResource(activity.getResources(), idInfoVersion, options);
            if (options.outHeight > 0 && options.outWidth > 0) {
                Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
                int width = defaultDisplay.getWidth();
                idLogo = defaultDisplay.getHeight();
                if (options.outHeight > idLogo || options.outWidth > width) {
                    options.inSampleSize = Math.max(Math.round(((float) options.outHeight) / ((float) idLogo)), Math.round(((float) options.outWidth) / ((float) width)));
                }
                options.inJustDecodeBounds = false;
                Bitmap decodeResource = BitmapFactory.decodeResource(activity.getResources(), idInfoVersion, options);
                if (decodeResource != null) {
                    this.f991a = new BitmapDrawable(activity.getResources(), decodeResource);
                    ViewGroup frameLayout = new FrameLayout(activity);
                    textView2 = new ImageView(activity);
                    C1014a.m7327b().mo3294c(textView2);
                    textView2.setImageDrawable(this.f991a);
                    textView2.setScaleType(iWDSplashScreen.getModeAffichageImageFond() == 8 ? ScaleType.CENTER_CROP : ScaleType.FIT_CENTER);
                    layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    frameLayout.addView(textView2, layoutParams);
                    frameLayout.addView(relativeLayout, layoutParams);
                    viewGroup = frameLayout;
                    fondDegrade = iWDSplashScreen.getFondDegrade();
                    if (fondDegrade != null) {
                        Drawable a = fondDegrade.mo3808a();
                        a.setDither(true);
                        viewGroup.setBackgroundDrawable(a);
                        Window window = getWindow();
                        window.setFormat(1);
                        window.addFlags(4096);
                    } else if (!C1031a.m7473q(iWDSplashScreen.getCouleurFond())) {
                        viewGroup.setBackgroundColor(C1031a.m7467k(iWDSplashScreen.getCouleurFond()));
                    }
                    return viewGroup;
                }
            }
        }
        textView = relativeLayout;
        fondDegrade = iWDSplashScreen.getFondDegrade();
        if (fondDegrade != null) {
            Drawable a2 = fondDegrade.mo3808a();
            a2.setDither(true);
            viewGroup.setBackgroundDrawable(a2);
            Window window2 = getWindow();
            window2.setFormat(1);
            window2.addFlags(4096);
        } else if (C1031a.m7473q(iWDSplashScreen.getCouleurFond())) {
            viewGroup.setBackgroundColor(C1031a.m7467k(iWDSplashScreen.getCouleurFond()));
        }
        return viewGroup;
    }

    /* renamed from: a */
    private final void m1547a(String str, WDObjet[] wDObjetArr) {
        boolean z = false;
        if (!C0808l.m4053k(str)) {
            C0508h fenetre = WDProjet.getInstance().getFenetre(str, false);
            if (fenetre != null) {
                z = true;
            }
            C0691a.m2860a(z, f990z[9] + str + f990z[8]);
            if (fenetre == null) {
                return;
            }
            if (fenetre.estOuverteEtAffichee()) {
                fenetre.afficherPremierPlan();
            } else {
                fenetre.ouvre(C1155i.NON_MODALE, wDObjetArr);
            }
        }
    }

    /* renamed from: z */
    private static String m1548z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 34;
                    break;
                case 1:
                    i2 = 11;
                    break;
                case 2:
                    i2 = 50;
                    break;
                case 3:
                    i2 = 25;
                    break;
                default:
                    i2 = 30;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1549z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 30);
        }
        return toCharArray;
    }

    public abstract void init();

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        WDAppManager.m2563a((Context) this, i, i2, intent);
    }

    public void onChangementTitre(String str) {
        runOnUiThread(new C0642e(this, str));
    }

    public void onCharsetChanged(String str) {
    }

    protected void onCreate(Bundle bundle) {
        String action;
        int i;
        boolean z;
        View linearLayout;
        IWDSplashScreen iWDSplashScreen;
        WDProjet instance;
        requestWindowFeature(1);
        Window window = getWindow();
        window.setFlags(1024, 1024);
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                try {
                    if (extras.getParcelable(f990z[0]) != null) {
                        action = intent.getAction();
                        try {
                            Intent intent2 = new Intent(this, Class.forName(f990z[2]));
                            try {
                                intent2.setAction(action);
                                intent2.putExtras(extras);
                                if (WDProjet.isCree()) {
                                    sendBroadcast(intent2);
                                    finish();
                                    return;
                                }
                                WDAppManager.m2560a(PendingIntent.getBroadcast(this, 0, intent2, 0));
                            } catch (ClassNotFoundException e) {
                                throw e;
                            }
                        } catch (Exception e2) {
                            C0691a.m2857a(f990z[5], e2);
                            finish();
                            return;
                        }
                    }
                    action = extras.getString(f990z[4]);
                    try {
                        if (!WDProjet.isCree() || C0808l.m4053k(action)) {
                            if (extras.getBoolean(f990z[1], false)) {
                                i = 1;
                            } else {
                                z = false;
                            }
                            if (WDProjet.isCree()) {
                                linearLayout = new LinearLayout(this);
                                try {
                                    window.setBackgroundDrawable(null);
                                    C1056i.m7564a((Activity) this);
                                    init();
                                    if (i != 0) {
                                        WDAppManager.m2550I();
                                    }
                                    try {
                                        if (!C0808l.m4053k(action)) {
                                            WDAppManager.m2564a(intent);
                                        }
                                        z = WDAppManager.m2583j();
                                        if (!z) {
                                            try {
                                                iWDSplashScreen = (IWDSplashScreen) Class.forName(getClass().getPackage().getName() + "." + f983b).newInstance();
                                            } catch (Exception e22) {
                                                C0691a.m2857a(f990z[3], e22);
                                            }
                                            if (!z || iWDSplashScreen == null) {
                                                setContentView(linearLayout);
                                                new Handler().postDelayed(new C0641d(this), (long) null);
                                                return;
                                            }
                                            try {
                                                if (kb.m3981k()) {
                                                    i = WDAppManager.m2556a(f989i, -1);
                                                    if (i >= 0 && (i == 4 || i == 0 || i == 1)) {
                                                        switch (i) {
                                                            case 0:
                                                                setRequestedOrientation(6);
                                                                break;
                                                            case 1:
                                                                setRequestedOrientation(7);
                                                                break;
                                                            case 4:
                                                                try {
                                                                    setRequestedOrientation(4);
                                                                    break;
                                                                } catch (ClassNotFoundException e3) {
                                                                    throw e3;
                                                                }
                                                        }
                                                    }
                                                }
                                                setContentView(m1546a((Activity) this, iWDSplashScreen));
                                                WDProjet.getInstance().ajouterEcouteurProjet(this);
                                                this.f992d = new C0652l(this);
                                                this.f992d.execute(new Object[0]);
                                                this.f992d = null;
                                                return;
                                            } catch (ClassNotFoundException e32) {
                                                throw e32;
                                            }
                                        }
                                        iWDSplashScreen = null;
                                        if (z) {
                                        }
                                        setContentView(linearLayout);
                                        new Handler().postDelayed(new C0641d(this), (long) null);
                                        return;
                                    } catch (ClassNotFoundException e322) {
                                        throw e322;
                                    }
                                } catch (ClassNotFoundException e3222) {
                                    throw e3222;
                                }
                            }
                            instance = WDProjet.getInstance();
                            try {
                                if (instance.getNbFenetreOuverte() == 0) {
                                    m1547a(instance.getNomPremiereFenetre(), null);
                                }
                                finish();
                            } catch (ClassNotFoundException e32222) {
                                throw e32222;
                            }
                        }
                        m1547a(action, C1056i.m7565a(extras));
                        finish();
                        return;
                    } catch (ClassNotFoundException e322222) {
                        throw e322222;
                    }
                } catch (ClassNotFoundException e3222222) {
                    throw e3222222;
                }
            }
        }
        action = null;
        z = false;
        if (WDProjet.isCree()) {
            linearLayout = new LinearLayout(this);
            window.setBackgroundDrawable(null);
            C1056i.m7564a((Activity) this);
            init();
            if (i != 0) {
                WDAppManager.m2550I();
            }
            if (C0808l.m4053k(action)) {
                WDAppManager.m2564a(intent);
            }
            z = WDAppManager.m2583j();
            if (z) {
                iWDSplashScreen = (IWDSplashScreen) Class.forName(getClass().getPackage().getName() + "." + f983b).newInstance();
                if (z) {
                }
                setContentView(linearLayout);
                new Handler().postDelayed(new C0641d(this), (long) null);
                return;
            }
            iWDSplashScreen = null;
            if (z) {
            }
            setContentView(linearLayout);
            new Handler().postDelayed(new C0641d(this), (long) null);
            return;
        }
        instance = WDProjet.getInstance();
        if (instance.getNbFenetreOuverte() == 0) {
            m1547a(instance.getNomPremiereFenetre(), null);
        }
        finish();
    }

    protected void onDestroy() {
        super.onDestroy();
        if (this.f991a instanceof BitmapDrawable) {
            ((BitmapDrawable) this.f991a).getBitmap().recycle();
            this.f991a = null;
        }
        WDProjet instance = WDProjet.getInstance();
        if (instance != null) {
            instance.supprimerEcouteurProjet(this);
        }
    }

    public void onFermetureProjet() {
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!(i != 4 || this.f992d == null || this.f992d.isCancelled())) {
            this.f992d.cancel(true);
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        WDAppManager.m2559a((Activity) this, i, strArr, iArr);
    }

    public abstract void run();
}
