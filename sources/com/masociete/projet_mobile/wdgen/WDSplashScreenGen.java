package com.masociete.projet_mobile.wdgen;

import com.masociete.projet_mobile.C0485R;
import fr.pcsoft.wdjava.core.application.IWDSplashScreen;
import fr.pcsoft.wdjava.ui.style.degrade.IWDDegrade;

public class WDSplashScreenGen implements IWDSplashScreen {
    public int getIdImageFond() {
        return C0485R.drawable.s_p_l_a_s_c_r_e_e_n________3;
    }

    public int getModeAffichageImageFond() {
        return 8;
    }

    public int getIdNomApplication() {
        return C0485R.string.splashscreen_title;
    }

    public int getIdInfoVersion() {
        return C0485R.string.splashscreen_version;
    }

    public int getIdLogo() {
        return 0;
    }

    public boolean isAvecAnimationChargement() {
        return true;
    }

    public int getIdMessageChargement() {
        return C0485R.string.splashscreen_message;
    }

    public int getCouleurLibelle() {
        return 16777215;
    }

    public IWDDegrade getFondDegrade() {
        return null;
    }

    public int getCouleurFond() {
        return 16777215;
    }
}
