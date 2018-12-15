package fr.pcsoft.wdjava.core.application;

import fr.pcsoft.wdjava.ui.style.degrade.IWDDegrade;

public interface IWDSplashScreen {
    /* renamed from: a */
    public static final String f1094a = "#APPNAME#";
    /* renamed from: b */
    public static final String f1095b = "#VERSION#";

    int getCouleurFond();

    int getCouleurLibelle();

    IWDDegrade getFondDegrade();

    int getIdImageFond();

    int getIdInfoVersion();

    int getIdLogo();

    int getIdMessageChargement();

    int getIdNomApplication();

    int getModeAffichageImageFond();

    boolean isAvecAnimationChargement();
}
