package fr.pcsoft.wdjava.ui.champs.multimedia;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import fr.pcsoft.wdjava.api.WDAPIMediaPlayer;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.C0723g;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.C0743a;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.media.ib;
import fr.pcsoft.wdjava.ui.activite.C0492a;
import fr.pcsoft.wdjava.ui.activite.C1056i;
import fr.pcsoft.wdjava.ui.champs.fenetre.C0508h;
import fr.pcsoft.wdjava.ui.champs.fenetre.WDFenetre;
import fr.pcsoft.wdjava.ui.champs.gc;
import fr.pcsoft.wdjava.ui.champs.hc;
import fr.pcsoft.wdjava.ui.p065b.C1094e;
import fr.pcsoft.wdjava.ui.utils.C1503b;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Attr;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

@C0723g(a = {WDAPIMediaPlayer.class})
public class WDChampMultimedia extends hc implements C0492a, OnCompletionListener {
    public static final int Dc = 1;
    private static final int Fc = 2;
    private static final int Hc = 3;
    private static final int Ic = 100;
    private static final int Mc = 0;
    private static final int Nc = 1;
    private static final int Oc = 2;
    private static final int Qc = 1;
    private static final String[] Rc = new String[]{m1520z(m1521z("}Sq]A\u0010MbWW\u0016[aLK\u0013GhJ]\u0013W`WU")), m1520z(m1521z("6fPngd=\u000bic)<]qa*gF{:")), m1520z(m1521z("6fPn.q=SicpkKk`+pA0")), m1520z(m1521z("}BkM]\u0017FkPK\u0012WgJA\fW{WZ\bShWP\u001b")), m1520z(m1521z("\u0017Tqg-{Frq~v\u0003{l*`Ewf;2H9}:wJj}8{Ep`~vA>x?2Rwp·}\u0004G{+FQ|qp")), m1520z(m1521z(";F{p")), m1520z(m1521z("\u0017Tqg-{Frq~vA>f·qQný,wV>xygVr4:w\u0004ru~dMzý12}qa\ngF{:")), m1520z(m1521z("'f\u001ex{,Ej")), m1520z(m1521z("3w@wudqKp`;|P")), m1520z(m1521z("6fPn.q=Czu*s\ng{+fQ|qpqKs;8wAzgqsTw;({@{{-=")), m1520z(m1521z("+`H")), m1520z(m1521z("}Ql_Y\u000eMiKX\n[i[P\u0017S")), m1520z(m1521z("}Tm]\\\u0017WvA]\u0010W|WG\nSjJ"))};
    private String Cc;
    private String Ec;
    private boolean Gc;
    private MediaPlayer Jc;
    private int Kc;
    private C1235d Lc;
    private boolean Pc;

    public WDChampMultimedia() {
        this.Lc = null;
        this.Ec = "";
        this.Cc = "";
        this.Jc = null;
        this.Kc = 100;
        this.Pc = true;
        this.Gc = false;
        this.Lc = m1518b();
        ((ViewGroup) getCompConteneur()).addView(this.Lc);
    }

    /* renamed from: a */
    private final Uri m1516a(String str) {
        if (C0808l.m4053k(str)) {
            return null;
        }
        if (str.startsWith(Rc[2]) || str.startsWith(Rc[1])) {
            str = getUrlVideoRTSP(str);
        }
        return C0743a.m3212h(str);
    }

    /* renamed from: a */
    private final void m1517a(MediaPlayer mediaPlayer, boolean z) {
        this.Jc = mediaPlayer;
        this.Jc.setVolume(((float) this.Kc) / 100.0f, ((float) this.Kc) / 100.0f);
        if (!z) {
            this.Lc.m8668a().pause();
        }
    }

    /* renamed from: b */
    private C1235d m1518b() {
        return new C1235d(C1056i.m7562a());
    }

    /* renamed from: c */
    private final boolean m1519c() {
        return this.Jc != null;
    }

    protected static String extractYoutubeId(String str) throws MalformedURLException {
        String str2 = null;
        try {
            String query = new URL(str).getQuery();
            if (query != null) {
                for (String split : query.split("&")) {
                    String[] split2 = split.split("=");
                    if (split2[0].equals("v")) {
                        str2 = split2[1];
                    }
                }
            } else if (str.contains(Rc[5])) {
                str2 = str.substring(str.lastIndexOf("/") + 1);
            }
        } catch (Exception e) {
            C0691a.m2857a(Rc[4], e);
        }
        return str2;
    }

    public static String getUrlVideoRTSP(String str) {
        try {
            String str2 = Rc[9];
            NodeList elementsByTagName = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(((HttpURLConnection) new URL(str2 + extractYoutubeId(str)).openConnection()).getInputStream()).getDocumentElement().getElementsByTagName(Rc[8]);
            int i = 0;
            String str3 = str;
            while (i < elementsByTagName.getLength()) {
                Node item = elementsByTagName.item(i);
                if (item != null) {
                    NamedNodeMap attributes = item.getAttributes();
                    HashMap hashMap = new HashMap();
                    for (int i2 = 0; i2 < attributes.getLength(); i2++) {
                        Attr attr = (Attr) attributes.item(i2);
                        hashMap.put(attr.getName(), attr.getValue());
                    }
                    if (hashMap.containsKey(Rc[7])) {
                        str2 = (String) hashMap.get(Rc[7]);
                        if (hashMap.containsKey(Rc[10])) {
                            str3 = (String) hashMap.get(Rc[10]);
                        }
                        if (str2.equals("1")) {
                            return str3;
                        }
                    } else {
                        continue;
                    }
                }
                i++;
                str3 = str3;
            }
            return str3;
        } catch (Exception e) {
            C0691a.m2857a(Rc[6], e);
            return str;
        }
    }

    /* renamed from: z */
    private static String m1520z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 94;
                    break;
                case 1:
                    i2 = 18;
                    break;
                case 2:
                    i2 = 36;
                    break;
                case 3:
                    i2 = 30;
                    break;
                default:
                    i2 = 20;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1521z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 20);
        }
        return toCharArray;
    }

    protected void activerEcouteurFinLecture() {
    }

    protected void appliquerCouleur(int i) {
    }

    protected void appliquerTransparent() {
    }

    public final void arreter() throws ib {
        this.Lc.m8668a().stopPlayback();
        this.Ec = "";
        this.Jc = null;
    }

    public final void charger(String str, boolean z, boolean z2) throws ib {
        this.Pc = false;
        this.Gc = false;
        arreter();
        Uri a = m1516a(str);
        if (a == null) {
            try {
                WDErreurManager.m2883a(C0745b.m3222b(Rc[12], str));
            } catch (Exception e) {
                throw e;
            }
        }
        if (z) {
            try {
                C1235d.access$300(this.Lc);
                this.Lc.m8668a().setOnErrorListener(new C1236e(this));
                this.Lc.m8668a().setOnPreparedListener(new C1238g(this, z2));
                this.Lc.m8668a().setVideoURI(a);
            } catch (Exception e2) {
                throw e2;
            }
        }
        try {
            new C1242k(this, z2, a).m1785a(1, "", 0);
        } catch (Exception e22) {
            if (e22 instanceof ib) {
                throw ((ib) e22);
            }
            throw new ib(e22.getMessage());
        } catch (Exception e222) {
            throw e222;
        }
        this.Ec = str;
    }

    protected void clicPrecedent() {
        initialiserAction();
    }

    protected void clicSuivant() {
        initialiserAction();
    }

    protected WDObjet executerPCode(int i) {
        switch (i) {
            case C0607n.wt /*1127*/:
                finLecture();
                return null;
            case C0607n.Ic /*1128*/:
                clicSuivant();
                return null;
            case C0607n.Qs /*1129*/:
                clicPrecedent();
                return null;
            default:
                return super.executerPCode(i);
        }
    }

    protected void finLecture() {
        initialiserAction();
    }

    public View getCompPrincipal() {
        return this.Lc;
    }

    public final int getDureeLecture() throws ib {
        try {
            if (m1519c()) {
                return this.Lc.m8668a().getDuration();
            }
            throw new ib(C0745b.m3222b(Rc[0], new String[0]));
        } catch (ib e) {
            throw e;
        }
    }

    public final int getEtatLecture() {
        if (m1519c()) {
            if (this.Lc.m8668a().isPlaying()) {
                return 3;
            }
            if (!this.Gc) {
                return 2;
            }
        }
        return 1;
    }

    public final int getHauteurVideo() throws ib {
        try {
            if (m1519c()) {
                return this.Jc.getVideoHeight();
            }
            throw new ib(C0745b.m3222b(Rc[0], new String[0]));
        } catch (ib e) {
            throw e;
        }
    }

    public final int getLargeurVideo() throws ib {
        try {
            if (m1519c()) {
                return this.Jc.getVideoWidth();
            }
            throw new ib(C0745b.m3222b(Rc[0], new String[0]));
        } catch (ib e) {
            throw e;
        }
    }

    public String getNomType() {
        return C0745b.m3220a(Rc[11], new String[0]);
    }

    public final int getPositionLecture() throws ib {
        try {
            if (this.Ec.equals("")) {
                throw new ib(C0745b.m3222b(Rc[0], new String[0]));
            }
            try {
                if (m1519c()) {
                    if (this.Gc) {
                        return getDureeLecture();
                    }
                }
                return this.Lc.m8668a().getCurrentPosition();
            } catch (ib e) {
                throw e;
            } catch (ib e2) {
                throw e2;
            }
        } catch (ib e22) {
            throw e22;
        }
    }

    public WDObjet getValeur() {
        return new WDChaine(this.Ec);
    }

    public WDObjet getValeurInitiale() {
        return new WDChaine(this.Cc);
    }

    public final int getVolume() {
        return this.Kc;
    }

    public final void interrompre() throws ib {
        try {
            if (m1519c()) {
                try {
                    if (this.Lc.m8668a().isPlaying()) {
                        this.Lc.m8668a().pause();
                        return;
                    }
                    return;
                } catch (ib e) {
                    throw e;
                }
            }
            throw new ib(C0745b.m3222b(Rc[0], new String[0]));
        } catch (ib e2) {
            throw e2;
        }
    }

    public boolean isChampFocusable() {
        return true;
    }

    public final boolean isControleVisible() {
        MediaController b = this.Lc.m8670b();
        return b != null && b.isShown();
    }

    public final void lire(String str, boolean z) throws ib {
        if (str != null) {
            try {
                if (!str.equals("")) {
                    charger(str, z, true);
                    this.Lc.m8668a().start();
                }
            } catch (ib e) {
                throw e;
            }
        }
        try {
            if (!m1519c()) {
                throw new ib(C0745b.m3222b(Rc[0], new String[0]));
            }
            this.Lc.m8668a().start();
        } catch (ib e2) {
            throw e2;
        }
    }

    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        this.Gc = true;
        appelPCode(C0607n.wt);
    }

    public void onConfigurationChanged(Activity activity, Configuration configuration) {
    }

    public void onCreate(Activity activity, Bundle bundle) {
    }

    public void onDestroy(Activity activity) {
    }

    public void onFinish(Activity activity) {
    }

    public void onLowMemory(Activity activity) {
    }

    public void onNewIntent(Activity activity, Intent intent) {
    }

    public void onPause(Activity activity) {
    }

    public void onResume(Activity activity) {
    }

    public void onSaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onSelectOption(Activity activity, MenuItem menuItem) {
    }

    public void onStart(Activity activity) {
        if (this.Pc && this.Ec != null && !m1519c()) {
            setValeur(this.Ec);
        }
    }

    public void onStop(Activity activity) {
    }

    public void release() {
        super.release();
        if (this.Lc != null) {
            this.Lc.m8668a().stopPlayback();
        }
        this.Jc = null;
        this.Lc = null;
        this.Ec = null;
    }

    public final boolean setControleVisible(boolean z, int i) {
        MediaController b = this.Lc.m8670b();
        if (b == null) {
            return false;
        }
        boolean isControleVisible = isControleVisible();
        if (z && !isControleVisible) {
            b.show(Math.max(0, i * 1000));
        } else if (!z) {
            b.hide();
        }
        return isControleVisible;
    }

    public void setFenetre(C0508h c0508h) {
        super.setFenetre(c0508h);
        ((WDFenetre) c0508h).ajouterEcouteurActivite(this);
        ((WDFenetre) c0508h).ajouterEcouteurAncrageFenetre(new C1240i(this));
        C1503b.m10435a((gc) this);
    }

    protected void setModeAffichage(int i) {
        switch (C1094e.m7937a(i)) {
            case 69:
                this.Lc.m8669a(C1234c.ETIRE);
                return;
            default:
                this.Lc.m8669a(C1234c.HOMOTHETIQUE_CENTRE);
                return;
        }
    }

    protected void setParamControles(int i) {
        switch (i) {
            case 1:
                this.Lc.m8671e();
                return;
            case 2:
                this.Lc.m8671e();
                this.Lc.m8670b().setPrevNextListeners(new C1233b(this), new C1232a(this));
                return;
            default:
                return;
        }
    }

    public final void setPositionLecture(int i) throws ib {
        boolean z = true;
        try {
            if (this.Ec.equals("")) {
                throw new ib(C0745b.m3222b(Rc[0], new String[0]));
            }
            int duration = this.Lc.m8668a().getDuration();
            if (i < 0 || i > duration) {
                try {
                    throw new ib(C0745b.m3222b(Rc[3], String.valueOf(i)));
                } catch (ib e) {
                    throw e;
                }
            }
            if (i < duration) {
                z = false;
            }
            this.Gc = z;
            this.Lc.m8668a().seekTo(i);
        } catch (ib e2) {
            throw e2;
        }
    }

    public void setPositionLectureDebut() throws ib {
        setPositionLecture(0);
    }

    public void setPositionLectureFin() throws ib {
        setPositionLecture(this.Lc.m8668a().getDuration());
    }

    public void setValeur(WDObjet wDObjet) {
        setValeur(wDObjet.getString());
    }

    public void setValeur(String str) {
        try {
            lire(str, false);
        } catch (Exception e) {
        }
    }

    public void setValeurInitiale(String str) {
        this.Ec = str;
        this.Cc = str;
    }

    public final int setVolume(int i) {
        int i2 = this.Kc;
        this.Kc = Math.max(0, Math.min(100, i));
        if (m1519c()) {
            this.Jc.setVolume(((float) this.Kc) / 100.0f, ((float) this.Kc) / 100.0f);
        }
        return i2;
    }

    public void terminerInitialisation() {
        super.terminerInitialisation();
        this.Lc.m8668a().setOnCompletionListener(this);
    }
}
