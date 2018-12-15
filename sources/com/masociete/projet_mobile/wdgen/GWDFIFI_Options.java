package com.masociete.projet_mobile.wdgen;

import fr.pcsoft.wdjava.api.WDAPIFenetre_Commun;
import fr.pcsoft.wdjava.api.WDAPIHF;
import fr.pcsoft.wdjava.api.WDAPIToast;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.parcours.IWDParcours;
import fr.pcsoft.wdjava.core.parcours.hf.WDParcoursFichier;
import fr.pcsoft.wdjava.core.types.WDChaineMultilangue;
import fr.pcsoft.wdjava.core.types.WDChaineU;
import fr.pcsoft.wdjava.ui.cadre.WDCadreFactory;
import fr.pcsoft.wdjava.ui.champs.fenetreinterne.WDFenetreInterne;
import fr.pcsoft.wdjava.ui.champs.image.WDChampImage;
import fr.pcsoft.wdjava.ui.champs.libelle.WDLibelle;
import fr.pcsoft.wdjava.ui.champs.zml.WDZoneMultiligne;
import fr.pcsoft.wdjava.ui.champs.zml.WDZoneMultiligne.LigneZMLStatique;
import fr.pcsoft.wdjava.ui.p069g.C1409j;

public class GWDFIFI_Options extends WDFenetreInterne {
    public GWDZM_menu mWD_ZM_menu;

    class GWDZM_menu extends WDZoneMultiligne {
        public GWDIMG_Fermer mWD_IMG_Fermer = new GWDIMG_Fermer();
        public GWDIMG_Parametres mWD_IMG_Parametres = new GWDIMG_Parametres();
        public GWDIMG_Puce mWD_IMG_Puce = new GWDIMG_Puce();
        public GWDIMG_Puce1 mWD_IMG_Puce1 = new GWDIMG_Puce1();
        public GWDIMG_Puce2 mWD_IMG_Puce2 = new GWDIMG_Puce2();
        public GWDIMG_Puce3 mWD_IMG_Puce3 = new GWDIMG_Puce3();
        public GWDIMG_Puce4 mWD_IMG_Puce4 = new GWDIMG_Puce4();
        public GWDIMG_Sigaler mWD_IMG_Sigaler = new GWDIMG_Sigaler();
        public GWDIMG_Vignette mWD_IMG_Vignette = new GWDIMG_Vignette();
        public GWDIMG_Vignette1 mWD_IMG_Vignette1 = new GWDIMG_Vignette1();
        public GWDLIB_Fermer mWD_LIB_Fermer = new GWDLIB_Fermer();
        public GWDLIB_Libelle1 mWD_LIB_Libelle1 = new GWDLIB_Libelle1();
        public GWDLIB_Libelle2 mWD_LIB_Libelle2 = new GWDLIB_Libelle2();
        public GWDLIB_Parametre mWD_LIB_Parametre = new GWDLIB_Parametre();
        public GWDLIB_SignalerIncident mWD_LIB_SignalerIncident = new GWDLIB_SignalerIncident();
        public GWDZM_menu_Ligne1 mWD_ZM_menu_Ligne1 = new GWDZM_menu_Ligne1();
        public GWDZM_menu_Ligne2 mWD_ZM_menu_Ligne2 = new GWDZM_menu_Ligne2();
        public GWDZM_menu_Ligne3 mWD_ZM_menu_Ligne3 = new GWDZM_menu_Ligne3();
        public GWDZM_menu_Ligne4 mWD_ZM_menu_Ligne4 = new GWDZM_menu_Ligne4();
        public GWDZM_menu_Ligne5 mWD_ZM_menu_Ligne5 = new GWDZM_menu_Ligne5();

        class GWDIMG_Fermer extends WDChampImage {
            GWDIMG_Fermer() {
            }

            public void initialiserObjet() {
                super.initialiserObjet();
                super.setFenetreInterne(GWDFIFI_Options.this.getWDFenetreInterneThis());
                super.setQuid(3095652594541449709L);
                super.setChecksum("1218369487");
                super.setNom("IMG_Fermer");
                super.setType(8);
                super.setLibelle(WDChaineMultilangue.getString("", ""));
                super.setMenuContextuelSysteme();
                super.setNote("", WDChaineMultilangue.getString("", ""));
                super.setNavigable(false);
                super.setEtatInitial(0);
                super.setPositionInitiale(8, 6);
                super.setTailleInitiale(36, 36);
                super.setValeurInitiale(WDChaineMultilangue.getString("C:\\Mes Projets Mobile\\Projet_Mobile\\securite_48.png", "C:\\Mes Projets Mobile\\Projet_Mobile\\securite_48.png"));
                super.setPlan(0);
                super.setTailleMin(0, 0);
                super.setTailleMax(Integer.MAX_VALUE, Integer.MAX_VALUE);
                super.setVisibleInitial(true);
                super.setAltitude(2);
                super.setAncrageInitial(1, 1000, 1000, 1000, 500, 0);
                super.setTransparence(1);
                super.setParamImage(2097160, 0, true, 100);
                super.setSymetrie(0);
                super.setZoneClicage(false);
                super.setPCodeMultitouch(false);
                super.setChargementEnTacheDeFond(true);
                super.setOrientationExif(true);
                super.setParamAnimation(1, 1, false, C1409j.f4188e, true, false);
                super.setAnimationInitiale(false);
                super.setTauxParallaxe(0, 0);
                super.setPresenceLibelle(false);
                super.setStyleLibelle(3355443, creerPolice_GEN("Roboto", -9.0d, 0), -1, 0, C0607n.Xv);
                super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 15132390, 6710886, -1, 4, 4, 0, 1), 0, 0, 0, 0);
                activerEcoute();
                super.terminerInitialisation();
            }

            public void activerEcoute() {
            }
        }

        class GWDIMG_Parametres extends WDChampImage {
            GWDIMG_Parametres() {
            }

            public void initialiserObjet() {
                super.initialiserObjet();
                super.setFenetreInterne(GWDFIFI_Options.this.getWDFenetreInterneThis());
                super.setQuid(3095652594540532158L);
                super.setChecksum("1217451936");
                super.setNom("IMG_Parametres");
                super.setType(8);
                super.setLibelle(WDChaineMultilangue.getString("", ""));
                super.setMenuContextuelSysteme();
                super.setNote("", WDChaineMultilangue.getString("", ""));
                super.setNavigable(false);
                super.setEtatInitial(0);
                super.setPositionInitiale(8, 6);
                super.setTailleInitiale(36, 36);
                super.setValeurInitiale(WDChaineMultilangue.getString("C:\\Mes Projets Mobile\\Projet_Mobile\\Parametre.png", "C:\\Mes Projets Mobile\\Projet_Mobile\\Parametre.png"));
                super.setPlan(0);
                super.setTailleMin(0, 0);
                super.setTailleMax(Integer.MAX_VALUE, Integer.MAX_VALUE);
                super.setVisibleInitial(true);
                super.setAltitude(2);
                super.setAncrageInitial(1, 1000, 1000, 1000, 500, 0);
                super.setTransparence(1);
                super.setParamImage(2097160, 0, true, 100);
                super.setSymetrie(0);
                super.setZoneClicage(false);
                super.setPCodeMultitouch(false);
                super.setChargementEnTacheDeFond(true);
                super.setOrientationExif(true);
                super.setParamAnimation(1, 1, false, C1409j.f4188e, true, false);
                super.setAnimationInitiale(false);
                super.setTauxParallaxe(0, 0);
                super.setPresenceLibelle(false);
                super.setStyleLibelle(3355443, creerPolice_GEN("Roboto", -9.0d, 0), -1, 0, C0607n.Xv);
                super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 15132390, 6710886, -1, 4, 4, 0, 1), 0, 0, 0, 0);
                activerEcoute();
                super.terminerInitialisation();
            }

            public void activerEcoute() {
            }
        }

        class GWDIMG_Puce1 extends WDChampImage {
            GWDIMG_Puce1() {
            }

            public void initialiserObjet() {
                super.initialiserObjet();
                super.setFenetreInterne(GWDFIFI_Options.this.getWDFenetreInterneThis());
                super.setQuid(3095652594540859854L);
                super.setChecksum("1217779632");
                super.setNom("IMG_Puce1");
                super.setType(8);
                super.setLibelle(WDChaineMultilangue.getString("", ""));
                super.setMenuContextuelSysteme();
                super.setNote("", WDChaineMultilangue.getString("", ""));
                super.setNavigable(false);
                super.setEtatInitial(0);
                super.setPositionInitiale(235, 0);
                super.setTailleInitiale(10, 48);
                super.setValeurInitiale(WDChaineMultilangue.getString("C:\\Mes Projets Mobile\\Projet_Mobile\\iOS_ZR_Arrow.png", "C:\\Mes Projets Mobile\\Projet_Mobile\\iOS_ZR_Arrow.png"));
                super.setPlan(0);
                super.setTailleMin(0, 0);
                super.setTailleMax(Integer.MAX_VALUE, Integer.MAX_VALUE);
                super.setVisibleInitial(true);
                super.setAltitude(3);
                super.setAncrageInitial(6, 1000, 1000, 1000, 1000, 0);
                super.setTransparence(1);
                super.setParamImage(2097162, 0, true, 100);
                super.setSymetrie(0);
                super.setZoneClicage(false);
                super.setPCodeMultitouch(false);
                super.setChargementEnTacheDeFond(false);
                super.setOrientationExif(false);
                super.setParamAnimation(1, 1, false, C1409j.f4188e, true, false);
                super.setAnimationInitiale(false);
                super.setTauxParallaxe(0, 0);
                super.setPresenceLibelle(false);
                super.setStyleLibelle(3355443, creerPolice_GEN("Roboto", -9.0d, 0), -1, 0, C0607n.Xv);
                super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 15132390, 6710886, -1, 4, 4, 0, 1), 0, 0, 0, 0);
                activerEcoute();
                super.terminerInitialisation();
            }

            public void activerEcoute() {
            }
        }

        class GWDIMG_Puce2 extends WDChampImage {
            GWDIMG_Puce2() {
            }

            public void initialiserObjet() {
                super.initialiserObjet();
                super.setFenetreInterne(GWDFIFI_Options.this.getWDFenetreInterneThis());
                super.setQuid(3095652594541777389L);
                super.setChecksum("1218697167");
                super.setNom("IMG_Puce2");
                super.setType(8);
                super.setLibelle(WDChaineMultilangue.getString("", ""));
                super.setMenuContextuelSysteme();
                super.setNote("", WDChaineMultilangue.getString("", ""));
                super.setNavigable(false);
                super.setEtatInitial(0);
                super.setPositionInitiale(235, 0);
                super.setTailleInitiale(10, 48);
                super.setValeurInitiale(WDChaineMultilangue.getString("C:\\Mes Projets Mobile\\Projet_Mobile\\iOS_ZR_Arrow.png", "C:\\Mes Projets Mobile\\Projet_Mobile\\iOS_ZR_Arrow.png"));
                super.setPlan(0);
                super.setTailleMin(0, 0);
                super.setTailleMax(Integer.MAX_VALUE, Integer.MAX_VALUE);
                super.setVisibleInitial(true);
                super.setAltitude(3);
                super.setAncrageInitial(6, 1000, 1000, 1000, 1000, 0);
                super.setTransparence(1);
                super.setParamImage(2097162, 0, true, 100);
                super.setSymetrie(0);
                super.setZoneClicage(false);
                super.setPCodeMultitouch(false);
                super.setChargementEnTacheDeFond(false);
                super.setOrientationExif(false);
                super.setParamAnimation(1, 1, false, C1409j.f4188e, true, false);
                super.setAnimationInitiale(false);
                super.setTauxParallaxe(0, 0);
                super.setPresenceLibelle(false);
                super.setStyleLibelle(3355443, creerPolice_GEN("Roboto", -9.0d, 0), -1, 0, C0607n.Xv);
                super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 15132390, 6710886, -1, 4, 4, 0, 1), 0, 0, 0, 0);
                activerEcoute();
                super.terminerInitialisation();
            }

            public void activerEcoute() {
            }
        }

        class GWDIMG_Puce3 extends WDChampImage {
            GWDIMG_Puce3() {
            }

            public void initialiserObjet() {
                super.initialiserObjet();
                super.setFenetreInterne(GWDFIFI_Options.this.getWDFenetreInterneThis());
                super.setQuid(3099775062599845076L);
                super.setChecksum("753233939");
                super.setNom("IMG_Puce3");
                super.setType(8);
                super.setLibelle(WDChaineMultilangue.getString("", ""));
                super.setMenuContextuelSysteme();
                super.setNote("", WDChaineMultilangue.getString("", ""));
                super.setNavigable(false);
                super.setEtatInitial(0);
                super.setPositionInitiale(235, 0);
                super.setTailleInitiale(10, 46);
                super.setValeurInitiale(WDChaineMultilangue.getString("C:\\Mes Projets Mobile\\Projet_Mobile\\iOS_ZR_Arrow.png", "C:\\Mes Projets Mobile\\Projet_Mobile\\iOS_ZR_Arrow.png"));
                super.setPlan(0);
                super.setTailleMin(0, 0);
                super.setTailleMax(Integer.MAX_VALUE, Integer.MAX_VALUE);
                super.setVisibleInitial(true);
                super.setAltitude(3);
                super.setAncrageInitial(6, 1000, 1000, 1000, 1000, 0);
                super.setTransparence(1);
                super.setParamImage(2097162, 0, true, 100);
                super.setSymetrie(0);
                super.setZoneClicage(false);
                super.setPCodeMultitouch(false);
                super.setChargementEnTacheDeFond(false);
                super.setOrientationExif(false);
                super.setParamAnimation(1, 1, false, C1409j.f4188e, true, false);
                super.setAnimationInitiale(false);
                super.setTauxParallaxe(0, 0);
                super.setPresenceLibelle(false);
                super.setStyleLibelle(3355443, creerPolice_GEN("Roboto", -9.0d, 0), -1, 0, C0607n.Xv);
                super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 15132390, 6710886, -1, 4, 4, 0, 1), 0, 0, 0, 0);
                activerEcoute();
                super.terminerInitialisation();
            }

            public void activerEcoute() {
            }
        }

        class GWDIMG_Puce4 extends WDChampImage {
            GWDIMG_Puce4() {
            }

            public void initialiserObjet() {
                super.initialiserObjet();
                super.setFenetreInterne(GWDFIFI_Options.this.getWDFenetreInterneThis());
                super.setQuid(3099796339884514372L);
                super.setChecksum("769923805");
                super.setNom("IMG_Puce4");
                super.setType(8);
                super.setLibelle(WDChaineMultilangue.getString("", ""));
                super.setMenuContextuelSysteme();
                super.setNote("", WDChaineMultilangue.getString("", ""));
                super.setNavigable(false);
                super.setEtatInitial(0);
                super.setPositionInitiale(235, 0);
                super.setTailleInitiale(10, 48);
                super.setValeurInitiale(WDChaineMultilangue.getString("C:\\Mes Projets Mobile\\Projet_Mobile\\iOS_ZR_Arrow.png", "C:\\Mes Projets Mobile\\Projet_Mobile\\iOS_ZR_Arrow.png"));
                super.setPlan(0);
                super.setTailleMin(0, 0);
                super.setTailleMax(Integer.MAX_VALUE, Integer.MAX_VALUE);
                super.setVisibleInitial(true);
                super.setAltitude(3);
                super.setAncrageInitial(6, 1000, 1000, 1000, 1000, 0);
                super.setTransparence(1);
                super.setParamImage(2097162, 0, true, 100);
                super.setSymetrie(0);
                super.setZoneClicage(false);
                super.setPCodeMultitouch(false);
                super.setChargementEnTacheDeFond(false);
                super.setOrientationExif(false);
                super.setParamAnimation(1, 1, false, C1409j.f4188e, true, false);
                super.setAnimationInitiale(false);
                super.setTauxParallaxe(0, 0);
                super.setPresenceLibelle(false);
                super.setStyleLibelle(3355443, creerPolice_GEN("Roboto", -9.0d, 0), -1, 0, C0607n.Xv);
                super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 15132390, 6710886, -1, 4, 4, 0, 1), 0, 0, 0, 0);
                activerEcoute();
                super.terminerInitialisation();
            }

            public void activerEcoute() {
            }
        }

        class GWDIMG_Puce extends WDChampImage {
            GWDIMG_Puce() {
            }

            public void initialiserObjet() {
                super.initialiserObjet();
                super.setFenetreInterne(GWDFIFI_Options.this.getWDFenetreInterneThis());
                super.setQuid(3095652594539942318L);
                super.setChecksum("1216862096");
                super.setNom("IMG_Puce");
                super.setType(8);
                super.setLibelle(WDChaineMultilangue.getString("", ""));
                super.setMenuContextuelSysteme();
                super.setNote("", WDChaineMultilangue.getString("", ""));
                super.setNavigable(false);
                super.setEtatInitial(0);
                super.setPositionInitiale(235, 0);
                super.setTailleInitiale(10, 48);
                super.setValeurInitiale(WDChaineMultilangue.getString("C:\\Mes Projets Mobile\\Projet_Mobile\\iOS_ZR_Arrow.png", "C:\\Mes Projets Mobile\\Projet_Mobile\\iOS_ZR_Arrow.png"));
                super.setPlan(0);
                super.setTailleMin(0, 0);
                super.setTailleMax(Integer.MAX_VALUE, Integer.MAX_VALUE);
                super.setVisibleInitial(true);
                super.setAltitude(3);
                super.setAncrageInitial(6, 1000, 1000, 1000, 1000, 0);
                super.setTransparence(1);
                super.setParamImage(2097162, 0, true, 100);
                super.setSymetrie(0);
                super.setZoneClicage(false);
                super.setPCodeMultitouch(false);
                super.setChargementEnTacheDeFond(false);
                super.setOrientationExif(false);
                super.setParamAnimation(1, 1, false, C1409j.f4188e, true, false);
                super.setAnimationInitiale(false);
                super.setTauxParallaxe(0, 0);
                super.setPresenceLibelle(false);
                super.setStyleLibelle(3355443, creerPolice_GEN("Roboto", -9.0d, 0), -1, 0, C0607n.Xv);
                super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 15132390, 6710886, -1, 4, 4, 0, 1), 0, 0, 0, 0);
                activerEcoute();
                super.terminerInitialisation();
            }

            public void activerEcoute() {
            }
        }

        class GWDIMG_Sigaler extends WDChampImage {
            GWDIMG_Sigaler() {
            }

            public void initialiserObjet() {
                super.initialiserObjet();
                super.setFenetreInterne(GWDFIFI_Options.this.getWDFenetreInterneThis());
                super.setQuid(3095652594539614623L);
                super.setChecksum("1216534401");
                super.setNom("IMG_Sigaler");
                super.setType(8);
                super.setLibelle(WDChaineMultilangue.getString("", ""));
                super.setMenuContextuelSysteme();
                super.setNote("", WDChaineMultilangue.getString("", ""));
                super.setNavigable(false);
                super.setEtatInitial(0);
                super.setPositionInitiale(8, 6);
                super.setTailleInitiale(36, 36);
                super.setValeurInitiale(WDChaineMultilangue.getString("C:\\Mes Projets Mobile\\Projet_Mobile\\logoo_36.png", "C:\\Mes Projets Mobile\\Projet_Mobile\\logoo_36.png"));
                super.setPlan(0);
                super.setTailleMin(0, 0);
                super.setTailleMax(Integer.MAX_VALUE, Integer.MAX_VALUE);
                super.setVisibleInitial(true);
                super.setAltitude(2);
                super.setAncrageInitial(1, 1000, 1000, 1000, 500, 0);
                super.setTransparence(1);
                super.setParamImage(2097160, 0, true, 100);
                super.setSymetrie(0);
                super.setZoneClicage(false);
                super.setPCodeMultitouch(false);
                super.setChargementEnTacheDeFond(true);
                super.setOrientationExif(true);
                super.setParamAnimation(1, 1, false, C1409j.f4188e, true, false);
                super.setAnimationInitiale(false);
                super.setTauxParallaxe(0, 0);
                super.setPresenceLibelle(false);
                super.setStyleLibelle(3355443, creerPolice_GEN("Roboto", -9.0d, 0), -1, 0, C0607n.Xv);
                super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 15132390, 6710886, -1, 4, 4, 0, 1), 0, 0, 0, 0);
                activerEcoute();
                super.terminerInitialisation();
            }

            public void activerEcoute() {
            }
        }

        class GWDIMG_Vignette1 extends WDChampImage {
            GWDIMG_Vignette1() {
            }

            public void initialiserObjet() {
                super.initialiserObjet();
                super.setFenetreInterne(GWDFIFI_Options.this.getWDFenetreInterneThis());
                super.setQuid(3099796339884186661L);
                super.setChecksum("769596094");
                super.setNom("IMG_Vignette1");
                super.setType(8);
                super.setLibelle(WDChaineMultilangue.getString("", ""));
                super.setMenuContextuelSysteme();
                super.setNote("", WDChaineMultilangue.getString("", ""));
                super.setNavigable(false);
                super.setEtatInitial(0);
                super.setPositionInitiale(8, 6);
                super.setTailleInitiale(36, 36);
                super.setValeurInitiale(WDChaineMultilangue.getString("", ""));
                super.setPlan(0);
                super.setTailleMin(0, 0);
                super.setTailleMax(Integer.MAX_VALUE, Integer.MAX_VALUE);
                super.setVisibleInitial(true);
                super.setAltitude(2);
                super.setAncrageInitial(1, 1000, 1000, 1000, 500, 0);
                super.setTransparence(1);
                super.setParamImage(2097160, 0, true, 100);
                super.setSymetrie(0);
                super.setZoneClicage(false);
                super.setPCodeMultitouch(false);
                super.setChargementEnTacheDeFond(true);
                super.setOrientationExif(true);
                super.setParamAnimation(1, 1, false, C1409j.f4188e, true, false);
                super.setAnimationInitiale(false);
                super.setTauxParallaxe(0, 0);
                super.setPresenceLibelle(false);
                super.setStyleLibelle(3355443, creerPolice_GEN("Roboto", -9.0d, 0), -1, 0, C0607n.Xv);
                super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 15132390, 6710886, -1, 4, 4, 0, 1), 0, 0, 0, 0);
                activerEcoute();
                super.terminerInitialisation();
            }

            public void activerEcoute() {
            }
        }

        class GWDIMG_Vignette extends WDChampImage {
            GWDIMG_Vignette() {
            }

            public void initialiserObjet() {
                super.initialiserObjet();
                super.setFenetreInterne(GWDFIFI_Options.this.getWDFenetreInterneThis());
                super.setQuid(3099775062599517334L);
                super.setChecksum("752906197");
                super.setNom("IMG_Vignette");
                super.setType(8);
                super.setLibelle(WDChaineMultilangue.getString("", ""));
                super.setMenuContextuelSysteme();
                super.setNote("", WDChaineMultilangue.getString("", ""));
                super.setNavigable(false);
                super.setEtatInitial(0);
                super.setPositionInitiale(8, 6);
                super.setTailleInitiale(34, 34);
                super.setValeurInitiale(WDChaineMultilangue.getString("C:\\Mes Projets Mobile\\Projet_Mobile\\Quitter.png", "C:\\Mes Projets Mobile\\Projet_Mobile\\Quitter.png"));
                super.setPlan(0);
                super.setTailleMin(0, 0);
                super.setTailleMax(Integer.MAX_VALUE, Integer.MAX_VALUE);
                super.setVisibleInitial(true);
                super.setAltitude(2);
                super.setAncrageInitial(1, 1000, 1000, 1000, 500, 0);
                super.setTransparence(1);
                super.setParamImage(2097160, 0, true, 100);
                super.setSymetrie(0);
                super.setZoneClicage(false);
                super.setPCodeMultitouch(false);
                super.setChargementEnTacheDeFond(true);
                super.setOrientationExif(true);
                super.setParamAnimation(1, 1, false, C1409j.f4188e, true, false);
                super.setAnimationInitiale(false);
                super.setTauxParallaxe(0, 0);
                super.setPresenceLibelle(false);
                super.setStyleLibelle(3355443, creerPolice_GEN("Roboto", -9.0d, 0), -1, 0, C0607n.Xv);
                super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 15132390, 6710886, -1, 4, 4, 0, 1), 0, 0, 0, 0);
                activerEcoute();
                super.terminerInitialisation();
            }

            public void activerEcoute() {
            }
        }

        class GWDLIB_Fermer extends WDLibelle {
            GWDLIB_Fermer() {
            }

            public void initialiserObjet() {
                super.initialiserObjet();
                super.setFenetreInterne(GWDFIFI_Options.this.getWDFenetreInterneThis());
                super.setQuid(3095652594541187549L);
                super.setChecksum("1218105047");
                super.setNom("LIB_Fermer");
                super.setType(3);
                super.setTypeSaisie(0);
                super.setMasqueSaisie(new WDChaineU(WDChaineMultilangue.getString("0", "0")));
                super.setLibelle(WDChaineMultilangue.getString("Mes incidents", "مراسلاتي"));
                super.setNote("", WDChaineMultilangue.getString("", ""));
                super.setEtatInitial(0);
                super.setPositionInitiale(50, 13);
                super.setTailleInitiale(183, 22);
                super.setPlan(0);
                super.setCadrageHorizontal(0);
                super.setCadrageVertical(0);
                super.setTailleMin(0, 0);
                super.setTailleMax(Integer.MAX_VALUE, Integer.MAX_VALUE);
                super.setVisibleInitial(true);
                super.setAltitude(1);
                super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);
                super.setEllipse(32768);
                super.setTauxParallaxe(0, 0);
                super.setPresenceLibelle(true);
                super.setStyleLibelle(3355443, -1, creerPolice_GEN("Arial", -8.0d, 1), 3, 0, C0607n.Xv);
                super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 15132390, 6710886, -1, 4, 4, 1, 1), 0, 0, 0, 0);
                activerEcoute();
                super.terminerInitialisation();
            }

            public void activerEcoute() {
            }
        }

        class GWDLIB_Libelle1 extends WDLibelle {
            GWDLIB_Libelle1() {
            }

            public void initialiserObjet() {
                super.initialiserObjet();
                super.setFenetreInterne(GWDFIFI_Options.this.getWDFenetreInterneThis());
                super.setQuid(3099775062599189576L);
                super.setChecksum("752576159");
                super.setNom("LIB_Libellé1");
                super.setType(3);
                super.setTypeSaisie(0);
                super.setMasqueSaisie(new WDChaineU(WDChaineMultilangue.getString("0", "0")));
                super.setLibelle(WDChaineMultilangue.getString("Fermer", "خروج"));
                super.setNote("", WDChaineMultilangue.getString("", ""));
                super.setEtatInitial(0);
                super.setPositionInitiale(48, 12);
                super.setTailleInitiale(185, 22);
                super.setPlan(0);
                super.setCadrageHorizontal(0);
                super.setCadrageVertical(0);
                super.setTailleMin(0, 0);
                super.setTailleMax(Integer.MAX_VALUE, Integer.MAX_VALUE);
                super.setVisibleInitial(true);
                super.setAltitude(1);
                super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);
                super.setEllipse(32768);
                super.setTauxParallaxe(0, 0);
                super.setPresenceLibelle(true);
                super.setStyleLibelle(3355443, -1, creerPolice_GEN("Arial", -8.0d, 1), 3, 0, C0607n.Xv);
                super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 15132390, 6710886, -1, 4, 4, 1, 1), 0, 0, 0, 0);
                activerEcoute();
                super.terminerInitialisation();
            }

            public void activerEcoute() {
            }
        }

        class GWDLIB_Libelle2 extends WDLibelle {
            GWDLIB_Libelle2() {
            }

            public void initialiserObjet() {
                super.initialiserObjet();
                super.setFenetreInterne(GWDFIFI_Options.this.getWDFenetreInterneThis());
                super.setQuid(3099796339883924501L);
                super.setChecksum("769331654");
                super.setNom("LIB_Libellé2");
                super.setType(3);
                super.setTypeSaisie(0);
                super.setMasqueSaisie(new WDChaineU(WDChaineMultilangue.getString("0", "0")));
                super.setLibelle(WDChaineMultilangue.getString("Reintialiser", "اعادة تثبيت"));
                super.setNote("", WDChaineMultilangue.getString("", ""));
                super.setEtatInitial(0);
                super.setPositionInitiale(50, 13);
                super.setTailleInitiale(183, 22);
                super.setPlan(0);
                super.setCadrageHorizontal(0);
                super.setCadrageVertical(0);
                super.setTailleMin(0, 0);
                super.setTailleMax(Integer.MAX_VALUE, Integer.MAX_VALUE);
                super.setVisibleInitial(true);
                super.setAltitude(1);
                super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);
                super.setEllipse(32768);
                super.setTauxParallaxe(0, 0);
                super.setPresenceLibelle(true);
                super.setStyleLibelle(3355443, -1, creerPolice_GEN("Arial", -8.0d, 1), 3, 0, C0607n.Xv);
                super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 15132390, 6710886, -1, 4, 4, 1, 1), 0, 0, 0, 0);
                activerEcoute();
                super.terminerInitialisation();
            }

            public void activerEcoute() {
            }
        }

        class GWDLIB_Parametre extends WDLibelle {
            GWDLIB_Parametre() {
            }

            public void initialiserObjet() {
                super.initialiserObjet();
                super.setFenetreInterne(GWDFIFI_Options.this.getWDFenetreInterneThis());
                super.setQuid(3095652594540270014L);
                super.setChecksum("1217187512");
                super.setNom("LIB_Parametre");
                super.setType(3);
                super.setTypeSaisie(0);
                super.setMasqueSaisie(new WDChaineU(WDChaineMultilangue.getString("0", "0")));
                super.setLibelle(WDChaineMultilangue.getString("Paramètres", "Paramètres"));
                super.setNote("", WDChaineMultilangue.getString("", ""));
                super.setEtatInitial(0);
                super.setPositionInitiale(50, 13);
                super.setTailleInitiale(183, 22);
                super.setPlan(0);
                super.setCadrageHorizontal(0);
                super.setCadrageVertical(0);
                super.setTailleMin(0, 0);
                super.setTailleMax(Integer.MAX_VALUE, Integer.MAX_VALUE);
                super.setVisibleInitial(true);
                super.setAltitude(1);
                super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);
                super.setEllipse(32768);
                super.setTauxParallaxe(0, 0);
                super.setPresenceLibelle(true);
                super.setStyleLibelle(3355443, -1, creerPolice_GEN("Arial", -8.0d, 1), 3, 0, C0607n.Xv);
                super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 15132390, 6710886, -1, 4, 4, 1, 1), 0, 0, 0, 0);
                activerEcoute();
                super.terminerInitialisation();
            }

            public void activerEcoute() {
            }
        }

        class GWDLIB_SignalerIncident extends WDLibelle {
            GWDLIB_SignalerIncident() {
            }

            public void initialiserObjet() {
                super.initialiserObjet();
                super.setFenetreInterne(GWDFIFI_Options.this.getWDFenetreInterneThis());
                super.setQuid(3095652594539352479L);
                super.setChecksum("1216269977");
                super.setNom("LIB_SignalerIncident");
                super.setType(3);
                super.setTypeSaisie(0);
                super.setMasqueSaisie(new WDChaineU(WDChaineMultilangue.getString("0", "0")));
                super.setLibelle(WDChaineMultilangue.getString("Signaler incident", "ارسال معلومة"));
                super.setNote("", WDChaineMultilangue.getString("", ""));
                super.setEtatInitial(0);
                super.setPositionInitiale(50, 13);
                super.setTailleInitiale(183, 22);
                super.setPlan(0);
                super.setCadrageHorizontal(0);
                super.setCadrageVertical(0);
                super.setTailleMin(0, 0);
                super.setTailleMax(Integer.MAX_VALUE, Integer.MAX_VALUE);
                super.setVisibleInitial(true);
                super.setAltitude(1);
                super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);
                super.setEllipse(32768);
                super.setTauxParallaxe(0, 0);
                super.setPresenceLibelle(true);
                super.setStyleLibelle(3355443, -1, creerPolice_GEN("Arial", -8.0d, 1), 3, 0, C0607n.Xv);
                super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 15132390, 6710886, -1, 4, 4, 1, 1), 0, 0, 0, 0);
                activerEcoute();
                super.terminerInitialisation();
            }

            public void activerEcoute() {
            }
        }

        class GWDZM_menu_Ligne1 extends LigneZMLStatique {
            GWDZM_menu_Ligne1() {
                super();
            }

            public void initialiserSousObjets() {
                super.initialiserSousObjets();
                GWDZM_menu.this.mWD_LIB_SignalerIncident.initialiserObjet();
                super.ajouterChamp(GWDZM_menu.this.mWD_LIB_SignalerIncident);
                GWDZM_menu.this.mWD_IMG_Sigaler.initialiserObjet();
                super.ajouterChamp(GWDZM_menu.this.mWD_IMG_Sigaler);
                GWDZM_menu.this.mWD_IMG_Puce.initialiserObjet();
                super.ajouterChamp(GWDZM_menu.this.mWD_IMG_Puce);
            }

            public void initialiserObjet() {
                super.initialiserObjet();
                super.setHauteurInitiale(48);
                super.setVisibleInitial(true);
                super.setModeSelection(-1);
                initialiserSousObjets();
                super.terminerInitialisation();
            }
        }

        class GWDZM_menu_Ligne2 extends LigneZMLStatique {
            GWDZM_menu_Ligne2() {
                super();
            }

            public void initialiserSousObjets() {
                super.initialiserSousObjets();
                GWDZM_menu.this.mWD_LIB_Parametre.initialiserObjet();
                super.ajouterChamp(GWDZM_menu.this.mWD_LIB_Parametre);
                GWDZM_menu.this.mWD_IMG_Parametres.initialiserObjet();
                super.ajouterChamp(GWDZM_menu.this.mWD_IMG_Parametres);
                GWDZM_menu.this.mWD_IMG_Puce1.initialiserObjet();
                super.ajouterChamp(GWDZM_menu.this.mWD_IMG_Puce1);
            }

            public void initialiserObjet() {
                super.initialiserObjet();
                super.setHauteurInitiale(48);
                super.setVisibleInitial(true);
                super.setModeSelection(-1);
                initialiserSousObjets();
                super.terminerInitialisation();
            }
        }

        class GWDZM_menu_Ligne3 extends LigneZMLStatique {
            GWDZM_menu_Ligne3() {
                super();
            }

            public void initialiserSousObjets() {
                super.initialiserSousObjets();
                GWDZM_menu.this.mWD_LIB_Fermer.initialiserObjet();
                super.ajouterChamp(GWDZM_menu.this.mWD_LIB_Fermer);
                GWDZM_menu.this.mWD_IMG_Fermer.initialiserObjet();
                super.ajouterChamp(GWDZM_menu.this.mWD_IMG_Fermer);
                GWDZM_menu.this.mWD_IMG_Puce2.initialiserObjet();
                super.ajouterChamp(GWDZM_menu.this.mWD_IMG_Puce2);
            }

            public void initialiserObjet() {
                super.initialiserObjet();
                super.setHauteurInitiale(48);
                super.setVisibleInitial(true);
                super.setModeSelection(-1);
                initialiserSousObjets();
                super.terminerInitialisation();
            }
        }

        class GWDZM_menu_Ligne4 extends LigneZMLStatique {
            GWDZM_menu_Ligne4() {
                super();
            }

            public void initialiserSousObjets() {
                super.initialiserSousObjets();
                GWDZM_menu.this.mWD_LIB_Libelle2.initialiserObjet();
                super.ajouterChamp(GWDZM_menu.this.mWD_LIB_Libelle2);
                GWDZM_menu.this.mWD_IMG_Vignette1.initialiserObjet();
                super.ajouterChamp(GWDZM_menu.this.mWD_IMG_Vignette1);
                GWDZM_menu.this.mWD_IMG_Puce4.initialiserObjet();
                super.ajouterChamp(GWDZM_menu.this.mWD_IMG_Puce4);
            }

            public void initialiserObjet() {
                super.initialiserObjet();
                super.setHauteurInitiale(48);
                super.setVisibleInitial(true);
                super.setModeSelection(-1);
                initialiserSousObjets();
                super.terminerInitialisation();
            }
        }

        class GWDZM_menu_Ligne5 extends LigneZMLStatique {
            GWDZM_menu_Ligne5() {
                super();
            }

            public void initialiserSousObjets() {
                super.initialiserSousObjets();
                GWDZM_menu.this.mWD_LIB_Libelle1.initialiserObjet();
                super.ajouterChamp(GWDZM_menu.this.mWD_LIB_Libelle1);
                GWDZM_menu.this.mWD_IMG_Vignette.initialiserObjet();
                super.ajouterChamp(GWDZM_menu.this.mWD_IMG_Vignette);
                GWDZM_menu.this.mWD_IMG_Puce3.initialiserObjet();
                super.ajouterChamp(GWDZM_menu.this.mWD_IMG_Puce3);
            }

            public void initialiserObjet() {
                super.initialiserObjet();
                super.setHauteurInitiale(46);
                super.setVisibleInitial(true);
                super.setModeSelection(-1);
                initialiserSousObjets();
                super.terminerInitialisation();
            }
        }

        GWDZM_menu() {
        }

        public void initialiserSousObjets() {
            super.initialiserSousObjets();
            this.mWD_ZM_menu_Ligne1.initialiserObjet();
            super.ajouterLigne(this.mWD_ZM_menu_Ligne1);
            this.mWD_ZM_menu_Ligne2.initialiserObjet();
            super.ajouterLigne(this.mWD_ZM_menu_Ligne2);
            this.mWD_ZM_menu_Ligne3.initialiserObjet();
            super.ajouterLigne(this.mWD_ZM_menu_Ligne3);
            this.mWD_ZM_menu_Ligne4.initialiserObjet();
            super.ajouterLigne(this.mWD_ZM_menu_Ligne4);
            this.mWD_ZM_menu_Ligne5.initialiserObjet();
            super.ajouterLigne(this.mWD_ZM_menu_Ligne5);
        }

        public void initialiserObjet() {
            super.initialiserObjet();
            super.setFenetreInterne(GWDFIFI_Options.this.getWDFenetreInterneThis());
            super.setPresenceLibelle(false);
            super.setQuid(3095648436989857488L);
            super.setChecksum("1195159410");
            super.setNom("ZM_menu");
            super.setType(97);
            super.setLibelle(WDChaineMultilangue.getString("Zone multiligne", "Multiline zone"));
            super.setMenuContextuelSysteme();
            super.setNote("", WDChaineMultilangue.getString("", ""));
            super.setNavigable(true);
            super.setEtatInitial(0);
            super.setPositionInitiale(0, 32);
            super.setTailleInitiale(256, 238);
            super.setPlan(0);
            super.setTailleMin(0, 0);
            super.setTailleMax(Integer.MAX_VALUE, Integer.MAX_VALUE);
            super.setVisibleInitial(true);
            super.setNumTab(1);
            super.setAltitude(1);
            super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);
            super.setIndiceModeleLigneDynamique(0);
            super.setTauxParallaxe(0, 0);
            super.setCouleurTexteAutomatique(C0607n.Kw);
            super.setStyleLibelle(3355443, creerPolice_GEN("Roboto", -9.0d, 0), -1, 0, C0607n.Xv);
            super.setCouleurSeparateur(15132390);
            super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 16777215, 8355711, -1, 4, 4, 1, 1), 0, 0, 0, 0);
            super.setCadreInterne(WDCadreFactory.creerCadre_GEN(15, 15132390, 6710886, 16777215, 9, 9, 1, 1));
            super.setStyleSelection(WDCadreFactory.creerCadre_GEN(1, 15132390, 6710886, 13941760, 4, 4, 1, 1));
            activerEcoute();
            initialiserSousObjets();
            super.terminerInitialisation();
        }

        public void selectionLigne() {
            super.selectionLigne();
            if (opEgal(1)) {
                WDAPIFenetre_Commun.ouvreFille(GWDPProjet_Mobile.ms_Project.mWD_FEN_Signaler_incident);
                GWDPProjet_Mobile.ms_Project.getFEN_Signaler_incident().mWD_SAI_Titre_incident.setValeur("");
                GWDPProjet_Mobile.ms_Project.getFEN_Signaler_incident().mWD_SAI_Description_incident.setValeur("");
                GWDPProjet_Mobile.ms_Project.getFEN_Signaler_incident().mWD_IMG_Multimedia_incident.setValeur("");
            } else if (!opEgal(2)) {
                if (opEgal(3)) {
                    WDAPIFenetre_Commun.ouvreFille(GWDPProjet_Mobile.ms_Project.mWD_FEN_Mes_incidents);
                } else if (opEgal(4)) {
                    IWDParcours parcours1 = null;
                    try {
                        parcours1 = WDParcoursFichier.pourTout(WDAPIHF.getFichierSansCasseNiAccent("langues"), WDAPIHF.getRubriqueSansCasseNiAccent("idlangues"), true);
                        while (parcours1.testParcours()) {
                            WDAPIHF.hSupprime(WDAPIHF.getFichierSansCasseNiAccent("langues"));
                        }
                        IWDParcours parcours2 = null;
                        try {
                            parcours2 = WDParcoursFichier.pourTout(WDAPIHF.getFichierSansCasseNiAccent("utilisateur"), WDAPIHF.getRubriqueSansCasseNiAccent("idutilisateur"), true);
                            while (parcours2.testParcours()) {
                                WDAPIHF.hSupprime(WDAPIHF.getFichierSansCasseNiAccent("utilisateur"));
                            }
                            IWDParcours parcours3 = null;
                            try {
                                parcours3 = WDParcoursFichier.pourTout(WDAPIHF.getFichierSansCasseNiAccent("express_incident"), WDAPIHF.getRubriqueSansCasseNiAccent("idexpress_incident"), true);
                                while (parcours3.testParcours()) {
                                    WDAPIHF.hSupprime(WDAPIHF.getFichierSansCasseNiAccent("express_incident"));
                                }
                                WDAPIToast.toastAffiche("Reintialisation effectuée avec succès");
                                WDAPIFenetre_Commun.ferme();
                            } finally {
                                if (parcours3 != null) {
                                    parcours3.finParcours();
                                }
                            }
                        } finally {
                            if (parcours2 != null) {
                                parcours2.finParcours();
                            }
                        }
                    } finally {
                        if (parcours1 != null) {
                            parcours1.finParcours();
                        }
                    }
                } else if (opEgal(5)) {
                    WDAPIFenetre_Commun.ferme();
                }
            }
        }

        public void activerEcoute() {
            super.activerEcouteurSelection();
        }
    }

    public void declarerGlobale(WDObjet[] WD_tabParam) {
        super.declarerGlobale(WD_tabParam);
        if (WD_tabParam != null) {
            int WD_ntabParamLen = WD_tabParam.length;
        }
    }

    public void activerEcoute() {
    }

    protected void creerChamps() {
        this.mWD_ZM_menu = new GWDZM_menu();
    }

    public void initialiserObjet() {
        super.initialiserObjet();
        super.setQuid(3095648436989791952L);
        super.setChecksum("1195064234");
        super.setNom("FI_Options");
        super.setMenuContextuelSysteme();
        super.setNote("", WDChaineMultilangue.getString("", ""));
        super.setTailleInitiale(258, 297);
        super.setTailleMin(0, 0);
        super.setTailleMax(Integer.MAX_VALUE, Integer.MAX_VALUE);
        super.setCouleurFond(-1);
        activerEcoute();
        this.mWD_ZM_menu.initialiserObjet();
        super.ajouter("ZM_menu", this.mWD_ZM_menu);
        super.terminerInitialisation();
    }

    public boolean isUniteAffichageLogique() {
        return false;
    }
}
