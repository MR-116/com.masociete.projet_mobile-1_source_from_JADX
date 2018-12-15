package fr.pcsoft.wdjava.ui.champs.image;

import android.graphics.drawable.Drawable;
import fr.pcsoft.wdjava.core.C0506k;
import fr.pcsoft.wdjava.ui.champs.nb;
import fr.pcsoft.wdjava.ui.dessin.C0519e;
import java.io.OutputStream;

/* renamed from: fr.pcsoft.wdjava.ui.champs.image.c */
public interface C0520c extends nb, C0506k, C0519e {
    void convertirPositionDansImage(int[] iArr);

    int getParamAnimationImage(String str);

    boolean isClicable();

    void libererImageMemoire();

    boolean sauverImage(OutputStream outputStream);

    void setDrawable(Drawable drawable);

    void setParamAnimationImage(String str, int i);
}
