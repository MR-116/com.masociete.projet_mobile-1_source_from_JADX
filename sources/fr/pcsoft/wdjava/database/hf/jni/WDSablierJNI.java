package fr.pcsoft.wdjava.database.hf.jni;

import fr.pcsoft.wdjava.core.utils.hc;
import fr.pcsoft.wdjava.jni.IWDSablierJNI;

public class WDSablierJNI implements IWDSablierJNI {
    public void destroy() {
        hc.m3944b().destroy();
    }

    public int getOptions() {
        return hc.m3944b().getOptions();
    }

    public final void hide() {
        hc.m3944b().hide();
    }

    public boolean isDestroyed() {
        return hc.m3944b().isDestroyed();
    }

    public boolean isShown() {
        return hc.m3944b().isShown();
    }

    public void show(String str) {
        hc.m3944b().show(str);
    }

    public final void show(String str, int i) {
        hc.m3944b().show(str, i);
    }

    public final void updateMessage(String str) {
        hc.m3944b().updateMessage(str);
    }

    public final void updateUI() {
        hc.m3944b().updateUI();
    }
}
