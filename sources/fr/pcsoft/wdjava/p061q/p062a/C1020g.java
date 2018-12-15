package fr.pcsoft.wdjava.p061q.p062a;

import android.animation.LayoutTransition;
import android.annotation.TargetApi;
import android.graphics.drawable.Drawable;
import android.widget.SeekBar;

@TargetApi(16)
/* renamed from: fr.pcsoft.wdjava.q.a.g */
public class C1020g extends C1019f {
    /* renamed from: a */
    public Drawable mo3299a(SeekBar seekBar) {
        return seekBar.getThumb();
    }

    /* renamed from: a */
    public void mo3300a(LayoutTransition layoutTransition, int i) {
        layoutTransition.enableTransitionType(i);
    }

    /* renamed from: b */
    public void mo3301b(LayoutTransition layoutTransition, int i) {
        layoutTransition.disableTransitionType(i);
    }
}
