package com.masociete.projet_mobile.wdgen;

import fr.pcsoft.wdjava.api.WDAPIAlbum;
import fr.pcsoft.wdjava.api.WDAPICamera;
import fr.pcsoft.wdjava.api.WDAPIDate_Commun;
import fr.pcsoft.wdjava.api.WDAPIDessin_Commun;
import fr.pcsoft.wdjava.api.WDAPIDialogue;
import fr.pcsoft.wdjava.api.WDAPIFenetre_Commun;
import fr.pcsoft.wdjava.api.WDAPIFichier_Commun;
import fr.pcsoft.wdjava.api.WDAPIGPS;
import fr.pcsoft.wdjava.api.WDAPIHF;
import fr.pcsoft.wdjava.api.WDAPIMedia;
import fr.pcsoft.wdjava.api.WDAPINet;
import fr.pcsoft.wdjava.api.WDAPIRPL;
import fr.pcsoft.wdjava.api.WDAPISys;
import fr.pcsoft.wdjava.api.WDAPIToast;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.WDVarNonAllouee;
import fr.pcsoft.wdjava.core.application.C0536n;
import fr.pcsoft.wdjava.core.poo.WDInstance;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDChaineMultilangue;
import fr.pcsoft.wdjava.core.types.WDChaineOptionnelle;
import fr.pcsoft.wdjava.core.types.WDChaineU;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.core.types.collection.WDSerie;
import fr.pcsoft.wdjava.geo.WDGeoPosition;
import fr.pcsoft.wdjava.ui.actionbar.WDActionBar;
import fr.pcsoft.wdjava.ui.activite.WDActivite;
import fr.pcsoft.wdjava.ui.cadre.WDCadreFactory;
import fr.pcsoft.wdjava.ui.champs.bouton.WDBouton;
import fr.pcsoft.wdjava.ui.champs.fenetre.WDFenetre;
import fr.pcsoft.wdjava.ui.champs.image.WDChampImage;
import fr.pcsoft.wdjava.ui.champs.libelle.WDLibelle;
import fr.pcsoft.wdjava.ui.champs.multimedia.WDChampMultimedia;
import fr.pcsoft.wdjava.ui.champs.saisie.WDChampSaisieMultiLigne;
import fr.pcsoft.wdjava.ui.champs.saisie.WDChampSaisieSimple;
import fr.pcsoft.wdjava.ui.menu.WDMenuPrincipal;
import fr.pcsoft.wdjava.ui.menu.WDOptionMenu;
import fr.pcsoft.wdjava.ui.p069g.C1409j;

public class GWDFFEN_Signaler_incident extends WDFenetre {
    public GWDACTB_ActionBar mWD_ACTB_ActionBar;
    public GWDBTN_AlbumPhoto mWD_BTN_AlbumPhoto;
    public GWDBTN_AppareilPhoto mWD_BTN_AppareilPhoto;
    public GWDBTN_ecouter mWD_BTN_ecouter;
    public GWDBTN_enregistrer mWD_BTN_enregistrer;
    public GWDBTN_stop mWD_BTN_stop;
    public GWDIMG_Multimedia_incident mWD_IMG_Multimedia_incident;
    public GWDLIB_SansNom1 mWD_LIB_SansNom1;
    public GWDLIB_SansNom2 mWD_LIB_SansNom2;
    public GWDMMENU__Menu mWD_MENU__Menu;
    public GWDMM_mVocal mWD_MM_mVocal;
    public GWDSAI_Description_incident mWD_SAI_Description_incident;
    public GWDSAI_Titre_incident mWD_SAI_Titre_incident;

    class GWDACTB_ActionBar extends WDActionBar {
        GWDACTB_ActionBar() {
        }

        public void initialiserObjet() {
            super.initialiserObjet();
            super.setFenetre(GWDFFEN_Signaler_incident.this.getWDFenetreThis());
            super.setNom("ACTB_ActionBar");
            super.setNote("", WDChaineMultilangue.getString("", ""));
            super.setParamBoutonGauche(true, 1, WDChaineMultilangue.getString("", ""), WDChaineMultilangue.getString("C:\\Mes Projets Mobile\\Projet_Mobile\\logonew.png", "C:\\Mes Projets Mobile\\Projet_Mobile\\logonew.png"));
            super.setParamBoutonDroit(false, 0, WDChaineMultilangue.getString("", ""), WDChaineMultilangue.getString("", ""));
            super.setStyleActionBar(C0607n.Sj, 16777215, false);
            super.setImageFond(WDChaineMultilangue.getString("", ""));
            super.terminerInitialisation();
        }
    }

    class GWDBTN_AlbumPhoto extends WDBouton {
        GWDBTN_AlbumPhoto() {
        }

        public void initialiserObjet() {
            super.initialiserObjet();
            super.setFenetre(GWDFFEN_Signaler_incident.this.getWDFenetreThis());
            super.setQuid(3095642926523120330L);
            super.setChecksum("1171419329");
            super.setNom("BTN_AlbumPhoto");
            super.setType(4);
            super.setLibelle(WDChaineMultilangue.getString("", ""));
            super.setMenuContextuelSysteme();
            super.setNote("", WDChaineMultilangue.getString("", ""));
            super.setNavigable(true);
            super.setEtatInitial(0);
            super.setPositionInitiale(84, C0536n.f1002n);
            super.setTailleInitiale(59, 48);
            super.setPlan(0);
            super.setImageEtat(5);
            super.setImageFondEtat(5);
            super.setTailleMin(0, 0);
            super.setTailleMax(Integer.MAX_VALUE, Integer.MAX_VALUE);
            super.setVisibleInitial(true);
            super.setAltitude(6);
            super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);
            super.setNumTab(4);
            super.setLettreAppel(65535);
            super.setTypeBouton(0);
            super.setTypeActionPredefinie(0);
            super.setBoutonOnOff(false);
            super.setTauxParallaxe(0, 0);
            super.setLibelleVAlign(1);
            super.setLibelleHAlign(1);
            super.setPresenceLibelle(true);
            super.setImage(WDChaineMultilangue.getString("C:\\Mes Projets Mobile\\Projet_Mobile\\imageAlbum.png?E5", "C:\\Mes Projets Mobile\\Projet_Mobile\\imageAlbum.png?E5"), 0, 2, 5, null, null, null);
            super.setStyleLibelleRepos(3355443, creerPolice_GEN("Roboto", -9.0d, 0), 0, C0607n.Xv);
            super.setStyleLibelleSurvol(3355443, creerPolice_GEN("Roboto", -9.0d, 0), 0, C0607n.Xv);
            super.setStyleLibelleEnfonce(3355443, creerPolice_GEN("Roboto", -9.0d, 0), 0, C0607n.Xv);
            super.setCadreRepos(WDCadreFactory.creerCadre_GEN(2, -1, 12566463, 13941760, 4, 4, 1, 1));
            super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(2, -1, 12566463, 13941760, 4, 4, 1, 1));
            super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(2, -1, 12566463, 13941760, 4, 4, 1, 1));
            super.setImageFond9Images(new int[]{1, 4, 1, 2, 2, 2, 1, 4, 1}, 10, 10, 8, 8);
            super.setImageFond(WDChaineMultilangue.getString("C:\\Mes Projets Mobile\\Projet_Mobile\\ActivAndroid 5_Btn_Std.png?E5_3NP_8_8_10_10", "C:\\Mes Projets Mobile\\Projet_Mobile\\ActivAndroid 5_Btn_Std.png?E5_3NP_8_8_10_10"), 1, 0, 1, 1);
            activerEcoute();
            super.terminerInitialisation();
        }

        public void clicSurBoutonGauche() {
            super.clicSurBoutonGauche();
            WDObjet vWD_sPhoto = new WDChaineU();
            WDObjet vWD_nTypeEnregistrement = new WDEntier4();
            vWD_sPhoto.setValeur(WDAPIAlbum.albumSelecteur(1));
            if (vWD_sPhoto.opDiff("")) {
                GWDFFEN_Signaler_incident.this.mWD_IMG_Multimedia_incident.setValeur(vWD_sPhoto);
            }
            if (WDAPIDialogue.dialogue("Souhaitez-vous importer une image ou une video ?", new WDSerie(new WDObjet[]{new WDChaineU("une image"), new WDChaineU("une video")}), 1, 2, C0607n.Ir).opEgal(1)) {
                vWD_nTypeEnregistrement.setValeur(1);
            } else {
                vWD_nTypeEnregistrement.setValeur(2);
            }
            if (vWD_sPhoto.opDiff("")) {
                GWDFFEN_Signaler_incident.this.mWD_IMG_Multimedia_incident.setValeur(vWD_sPhoto);
                if (vWD_nTypeEnregistrement.opEgal(1)) {
                    GWDFFEN_Signaler_incident.this.mWD_IMG_Multimedia_incident.setValeur(vWD_sPhoto);
                }
            }
        }

        public void activerEcoute() {
            super.activerEcouteurClic();
        }
    }

    class GWDBTN_AppareilPhoto extends WDBouton {
        GWDBTN_AppareilPhoto() {
        }

        public void initialiserObjet() {
            super.initialiserObjet();
            super.setFenetre(GWDFFEN_Signaler_incident.this.getWDFenetreThis());
            super.setQuid(3095642333817233041L);
            super.setChecksum("1171018750");
            super.setNom("BTN_AppareilPhoto");
            super.setType(4);
            super.setLibelle(WDChaineMultilangue.getString("", ""));
            super.setMenuContextuelSysteme();
            super.setNote("", WDChaineMultilangue.getString("", ""));
            super.setNavigable(true);
            super.setEtatInitial(0);
            super.setPositionInitiale(2, C0536n.f1002n);
            super.setTailleInitiale(57, 48);
            super.setPlan(0);
            super.setImageEtat(5);
            super.setImageFondEtat(5);
            super.setTailleMin(0, 0);
            super.setTailleMax(Integer.MAX_VALUE, Integer.MAX_VALUE);
            super.setVisibleInitial(true);
            super.setAltitude(5);
            super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);
            super.setNumTab(3);
            super.setLettreAppel(65535);
            super.setTypeBouton(0);
            super.setTypeActionPredefinie(0);
            super.setBoutonOnOff(false);
            super.setTauxParallaxe(0, 0);
            super.setLibelleVAlign(1);
            super.setLibelleHAlign(1);
            super.setPresenceLibelle(true);
            super.setImage(WDChaineMultilangue.getString("C:\\Mes Projets Mobile\\Projet_Mobile\\AppareilPhoto.png?E5", "C:\\Mes Projets Mobile\\Projet_Mobile\\AppareilPhoto.png?E5"), 0, 2, 5, null, null, null);
            super.setStyleLibelleRepos(3355443, creerPolice_GEN("Roboto", -9.0d, 0), 0, C0607n.Xv);
            super.setStyleLibelleSurvol(3355443, creerPolice_GEN("Roboto", -9.0d, 0), 0, C0607n.Xv);
            super.setStyleLibelleEnfonce(3355443, creerPolice_GEN("Roboto", -9.0d, 0), 0, C0607n.Xv);
            super.setCadreRepos(WDCadreFactory.creerCadre_GEN(2, -1, 12566463, 13941760, 4, 4, 1, 1));
            super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(2, -1, 12566463, 13941760, 4, 4, 1, 1));
            super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(2, -1, 12566463, 13941760, 4, 4, 1, 1));
            super.setImageFond9Images(new int[]{1, 4, 1, 2, 2, 2, 1, 4, 1}, 10, 10, 8, 8);
            super.setImageFond(WDChaineMultilangue.getString("C:\\Mes Projets Mobile\\Projet_Mobile\\ActivAndroid 5_Btn_Std.png?E5_3NP_8_8_10_10", "C:\\Mes Projets Mobile\\Projet_Mobile\\ActivAndroid 5_Btn_Std.png?E5_3NP_8_8_10_10"), 1, 0, 1, 1);
            activerEcoute();
            super.terminerInitialisation();
        }

        public void clicSurBoutonGauche() {
            super.clicSurBoutonGauche();
            WDObjet vWD_nTypeEnregistrement = new WDEntier4();
            WDObjet vWD_sPhoto = new WDChaineU();
            if (WDAPIDialogue.dialogue("Souhaitez-vous enregistrer une image ou une video ?", new WDSerie(new WDObjet[]{new WDChaineU("une image"), new WDChaineU("une video")}), 1, 2, C0607n.Ir).opEgal(1)) {
                vWD_nTypeEnregistrement.setValeur(2);
            } else {
                vWD_nTypeEnregistrement.setValeur(1);
            }
            vWD_sPhoto.setValeur(WDAPICamera.videoLanceAppli(vWD_nTypeEnregistrement.getInt()));
            if (vWD_sPhoto.opDiff("")) {
                GWDFFEN_Signaler_incident.this.mWD_IMG_Multimedia_incident.setValeur(vWD_sPhoto);
            }
        }

        public void activerEcoute() {
            super.activerEcouteurClic();
        }
    }

    class GWDBTN_ecouter extends WDBouton {
        GWDBTN_ecouter() {
        }

        public void initialiserObjet() {
            super.initialiserObjet();
            super.setFenetre(GWDFFEN_Signaler_incident.this.getWDFenetreThis());
            super.setQuid(3115957078233984080L);
            super.setChecksum("1253985764");
            super.setNom("BTN_ecouter");
            super.setType(4);
            super.setLibelle(WDChaineMultilangue.getString("", ""));
            super.setMenuContextuelSysteme();
            super.setNote("", WDChaineMultilangue.getString("", ""));
            super.setNavigable(true);
            super.setEtatInitial(0);
            super.setPositionInitiale(C0607n.Ug, 265);
            super.setTailleInitiale(99, 48);
            super.setPlan(0);
            super.setImageEtat(5);
            super.setImageFondEtat(5);
            super.setTailleMin(0, 0);
            super.setTailleMax(Integer.MAX_VALUE, Integer.MAX_VALUE);
            super.setVisibleInitial(true);
            super.setAltitude(8);
            super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);
            super.setNumTab(6);
            super.setLettreAppel(65535);
            super.setTypeBouton(0);
            super.setTypeActionPredefinie(0);
            super.setBoutonOnOff(false);
            super.setTauxParallaxe(0, 0);
            super.setLibelleVAlign(1);
            super.setLibelleHAlign(1);
            super.setPresenceLibelle(true);
            super.setImage(WDChaineMultilangue.getString("C:\\Mes Projets Mobile\\Projet_Mobile\\jouer.png?E5", "C:\\Mes Projets Mobile\\Projet_Mobile\\jouer.png?E5"), 0, 2, 5, null, null, null);
            super.setStyleLibelleRepos(3355443, creerPolice_GEN("Roboto", -9.0d, 0), 0, C0607n.Xv);
            super.setStyleLibelleSurvol(3355443, creerPolice_GEN("Roboto", -9.0d, 0), 0, C0607n.Xv);
            super.setStyleLibelleEnfonce(3355443, creerPolice_GEN("Roboto", -9.0d, 0), 0, C0607n.Xv);
            super.setCadreRepos(WDCadreFactory.creerCadre_GEN(2, -1, 12566463, 13941760, 4, 4, 1, 1));
            super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(2, -1, 12566463, 13941760, 4, 4, 1, 1));
            super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(2, -1, 12566463, 13941760, 4, 4, 1, 1));
            super.setImageFond9Images(new int[]{1, 4, 1, 2, 2, 2, 1, 4, 1}, 10, 10, 8, 8);
            super.setImageFond(WDChaineMultilangue.getString("C:\\Mes Projets Mobile\\Projet_Mobile\\ActivAndroid 5_Btn_Std.png?E5_3NP_8_8_10_10", "C:\\Mes Projets Mobile\\Projet_Mobile\\ActivAndroid 5_Btn_Std.png?E5_3NP_8_8_10_10"), 1, 0, 1, 1);
            activerEcoute();
            super.terminerInitialisation();
        }

        public void clicSurBoutonGauche() {
            super.clicSurBoutonGauche();
            WDAPIMedia.magnetoAction(1, WDAPIFichier_Commun.fRepEnCours().opPlus(new WDChaineOptionnelle(WDAPIFichier_Commun.fSep())).opPlus("messageVocal.wav").getString());
        }

        public void activerEcoute() {
            super.activerEcouteurClic();
        }
    }

    class GWDBTN_enregistrer extends WDBouton {
        GWDBTN_enregistrer() {
        }

        public void initialiserObjet() {
            super.initialiserObjet();
            super.setFenetre(GWDFFEN_Signaler_incident.this.getWDFenetreThis());
            super.setQuid(3115955214208896521L);
            super.setChecksum("1244704235");
            super.setNom("BTN_enregistrer");
            super.setType(4);
            super.setLibelle(WDChaineMultilangue.getString("", ""));
            super.setMenuContextuelSysteme();
            super.setNote("", WDChaineMultilangue.getString("", ""));
            super.setNavigable(true);
            super.setEtatInitial(0);
            super.setPositionInitiale(28, 263);
            super.setTailleInitiale(67, 50);
            super.setPlan(0);
            super.setImageEtat(5);
            super.setImageFondEtat(5);
            super.setTailleMin(0, 0);
            super.setTailleMax(Integer.MAX_VALUE, Integer.MAX_VALUE);
            super.setVisibleInitial(true);
            super.setAltitude(7);
            super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);
            super.setNumTab(5);
            super.setLettreAppel(65535);
            super.setTypeBouton(0);
            super.setTypeActionPredefinie(0);
            super.setBoutonOnOff(false);
            super.setTauxParallaxe(0, 0);
            super.setLibelleVAlign(1);
            super.setLibelleHAlign(1);
            super.setPresenceLibelle(true);
            super.setImage(WDChaineMultilangue.getString("C:\\Mes Projets Mobile\\Projet_Mobile\\micro.png?E5", "C:\\Mes Projets Mobile\\Projet_Mobile\\micro.png?E5"), 0, 2, 5, null, null, null);
            super.setStyleLibelleRepos(3355443, creerPolice_GEN("Roboto", -9.0d, 0), 0, C0607n.Xv);
            super.setStyleLibelleSurvol(3355443, creerPolice_GEN("Roboto", -9.0d, 0), 0, C0607n.Xv);
            super.setStyleLibelleEnfonce(3355443, creerPolice_GEN("Roboto", -9.0d, 0), 0, C0607n.Xv);
            super.setCadreRepos(WDCadreFactory.creerCadre_GEN(2, -1, 12566463, 13941760, 4, 4, 1, 1));
            super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(2, -1, 12566463, 13941760, 4, 4, 1, 1));
            super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(2, -1, 12566463, 13941760, 4, 4, 1, 1));
            super.setImageFond9Images(new int[]{1, 4, 1, 2, 2, 2, 1, 4, 1}, 10, 10, 8, 8);
            super.setImageFond(WDChaineMultilangue.getString("C:\\Mes Projets Mobile\\Projet_Mobile\\ActivAndroid 5_Btn_Std.png?E5_3NP_8_8_10_10", "C:\\Mes Projets Mobile\\Projet_Mobile\\ActivAndroid 5_Btn_Std.png?E5_3NP_8_8_10_10"), 1, 0, 1, 1);
            activerEcoute();
            super.terminerInitialisation();
        }

        public void clicSurBoutonGauche() {
            super.clicSurBoutonGauche();
            WDAPIMedia.magnetoAction(2, WDAPIFichier_Commun.fRepEnCours().opPlus(new WDChaineOptionnelle(WDAPIFichier_Commun.fSep())).opPlus("messageVocal.wav").getString());
            WDAPIToast.toastAffiche("Debut enregistrement ! ");
        }

        public void activerEcoute() {
            super.activerEcouteurClic();
        }
    }

    class GWDBTN_stop extends WDBouton {
        GWDBTN_stop() {
        }

        public void initialiserObjet() {
            super.initialiserObjet();
            super.setFenetre(GWDFFEN_Signaler_incident.this.getWDFenetreThis());
            super.setQuid(3116108037786996443L);
            super.setChecksum("1296513467");
            super.setNom("BTN_stop");
            super.setType(4);
            super.setLibelle(WDChaineMultilangue.getString("", ""));
            super.setMenuContextuelSysteme();
            super.setNote("", WDChaineMultilangue.getString("", ""));
            super.setNavigable(true);
            super.setEtatInitial(0);
            super.setPositionInitiale(114, 265);
            super.setTailleInitiale(80, 48);
            super.setPlan(0);
            super.setImageEtat(5);
            super.setImageFondEtat(5);
            super.setTailleMin(0, 0);
            super.setTailleMax(Integer.MAX_VALUE, Integer.MAX_VALUE);
            super.setVisibleInitial(true);
            super.setAltitude(10);
            super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);
            super.setNumTab(7);
            super.setLettreAppel(65535);
            super.setTypeBouton(0);
            super.setTypeActionPredefinie(0);
            super.setBoutonOnOff(false);
            super.setTauxParallaxe(0, 0);
            super.setLibelleVAlign(1);
            super.setLibelleHAlign(1);
            super.setPresenceLibelle(true);
            super.setImage(WDChaineMultilangue.getString("C:\\Mes Projets Mobile\\Projet_Mobile\\stop.png?E5", "C:\\Mes Projets Mobile\\Projet_Mobile\\stop.png?E5"), 0, 2, 5, null, null, null);
            super.setStyleLibelleRepos(3355443, creerPolice_GEN("Roboto", -9.0d, 0), 0, C0607n.Xv);
            super.setStyleLibelleSurvol(3355443, creerPolice_GEN("Roboto", -9.0d, 0), 0, C0607n.Xv);
            super.setStyleLibelleEnfonce(3355443, creerPolice_GEN("Roboto", -9.0d, 0), 0, C0607n.Xv);
            super.setCadreRepos(WDCadreFactory.creerCadre_GEN(2, -1, 12566463, 13941760, 4, 4, 1, 1));
            super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(2, -1, 12566463, 13941760, 4, 4, 1, 1));
            super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(2, -1, 12566463, 13941760, 4, 4, 1, 1));
            super.setImageFond9Images(new int[]{1, 4, 1, 2, 2, 2, 1, 4, 1}, 10, 10, 8, 8);
            super.setImageFond(WDChaineMultilangue.getString("C:\\Mes Projets Mobile\\Projet_Mobile\\ActivAndroid 5_Btn_Std.png?E5_3NP_8_8_10_10", "C:\\Mes Projets Mobile\\Projet_Mobile\\ActivAndroid 5_Btn_Std.png?E5_3NP_8_8_10_10"), 1, 0, 1, 1);
            activerEcoute();
            super.terminerInitialisation();
        }

        public void clicSurBoutonGauche() {
            super.clicSurBoutonGauche();
            WDAPIMedia.magnetoAction(3, WDAPIFichier_Commun.fRepEnCours().opPlus(new WDChaineOptionnelle(WDAPIFichier_Commun.fSep())).opPlus("messageVocal.wav").getString());
            GWDFFEN_Signaler_incident.this.mWD_MM_mVocal.setValeur(WDAPIFichier_Commun.fRepEnCours().opPlus(new WDChaineOptionnelle(WDAPIFichier_Commun.fSep())).opPlus("messageVocal.wav"));
            WDAPIHF.hAttacheMemo(WDAPIHF.getFichierSansCasseNiAccent("express_incident"), WDAPIHF.getRubriqueSansCasseNiAccent("multimedia_vocal"), WDAPIFichier_Commun.fRepEnCours().opPlus(new WDChaineOptionnelle(WDAPIFichier_Commun.fSep())).opPlus("messageVocal.wav").getString(), 21);
            WDAPIToast.toastAffiche("Fin enregistrement");
        }

        public void activerEcoute() {
            super.activerEcouteurClic();
        }
    }

    class GWDIMG_Multimedia_incident extends WDChampImage {
        GWDIMG_Multimedia_incident() {
        }

        public void initialiserObjet() {
            super.initialiserObjet();
            super.setFenetre(GWDFFEN_Signaler_incident.this.getWDFenetreThis());
            super.setQuid(3095634864841218558L);
            super.setChecksum("1143132096");
            super.setNom("IMG_Multimedia_incident");
            super.setType(30001);
            super.setLibelle(WDChaineMultilangue.getString("", ""));
            super.setMenuContextuelSysteme();
            super.setNote("", WDChaineMultilangue.getString("", ""));
            super.setNavigable(false);
            super.setEtatInitial(0);
            super.setPositionInitiale(180, 136);
            super.setTailleInitiale(C0607n.Fb, 97);
            super.setValeurInitiale(WDChaineMultilangue.getString("", ""));
            super.setPlan(0);
            super.setTailleMin(0, 0);
            super.setTailleMax(Integer.MAX_VALUE, Integer.MAX_VALUE);
            super.setVisibleInitial(true);
            super.setAltitude(3);
            super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);
            super.setTransparence(1);
            super.setParamImage(6, 0, true, 100);
            super.setSymetrie(0);
            super.setZoneClicage(true);
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

    class GWDLIB_SansNom1 extends WDLibelle {
        GWDLIB_SansNom1() {
        }

        public void initialiserObjet() {
            super.initialiserObjet();
            super.setFenetre(GWDFFEN_Signaler_incident.this.getWDFenetreThis());
            super.setQuid(3095642024572765396L);
            super.setChecksum("1164195889");
            super.setNom("LIB_SansNom1");
            super.setType(3);
            super.setTypeSaisie(0);
            super.setMasqueSaisie(new WDChaineU(WDChaineMultilangue.getString("0", "0")));
            super.setLibelle(WDChaineMultilangue.getString("Photo", "الصور"));
            super.setNote("", WDChaineMultilangue.getString("", ""));
            super.setEtatInitial(0);
            super.setPositionInitiale(4, 136);
            super.setTailleInitiale(116, 24);
            super.setPlan(0);
            super.setCadrageHorizontal(0);
            super.setCadrageVertical(0);
            super.setTailleMin(0, 0);
            super.setTailleMax(Integer.MAX_VALUE, Integer.MAX_VALUE);
            super.setVisibleInitial(true);
            super.setAltitude(4);
            super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);
            super.setEllipse(0);
            super.setTauxParallaxe(0, 0);
            super.setPresenceLibelle(true);
            super.setStyleLibelle(3355443, -1, creerPolice_GEN("Droid Sans", -7.0d, 0), 3, 0, C0607n.Xv);
            super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 15132390, 6710886, -1, 4, 4, 1, 1), 0, 0, 0, 0);
            activerEcoute();
            super.terminerInitialisation();
        }

        public void activerEcoute() {
        }
    }

    class GWDLIB_SansNom2 extends WDLibelle {
        GWDLIB_SansNom2() {
        }

        public void initialiserObjet() {
            super.initialiserObjet();
            super.setFenetre(GWDFFEN_Signaler_incident.this.getWDFenetreThis());
            super.setQuid(3115957344522412023L);
            super.setChecksum("1254440961");
            super.setNom("LIB_SansNom2");
            super.setType(3);
            super.setTypeSaisie(0);
            super.setMasqueSaisie(new WDChaineU(WDChaineMultilangue.getString("0", "0")));
            super.setLibelle(WDChaineMultilangue.getString("Message vocal", "رسالة صوتيه"));
            super.setNote("", WDChaineMultilangue.getString("", ""));
            super.setEtatInitial(0);
            super.setPositionInitiale(2, C0607n.yk);
            super.setTailleInitiale(116, 24);
            super.setPlan(0);
            super.setCadrageHorizontal(0);
            super.setCadrageVertical(0);
            super.setTailleMin(0, 0);
            super.setTailleMax(Integer.MAX_VALUE, Integer.MAX_VALUE);
            super.setVisibleInitial(true);
            super.setAltitude(9);
            super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);
            super.setEllipse(0);
            super.setTauxParallaxe(0, 0);
            super.setPresenceLibelle(true);
            super.setStyleLibelle(3355443, -1, creerPolice_GEN("Droid Sans", -7.0d, 0), 3, 0, C0607n.Xv);
            super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 15132390, 6710886, -1, 4, 4, 1, 1), 0, 0, 0, 0);
            activerEcoute();
            super.terminerInitialisation();
        }

        public void activerEcoute() {
        }
    }

    class GWDMMENU__Menu extends WDMenuPrincipal {
        public GWDMOPT_OK mWD_OPT_OK = new GWDMOPT_OK(true);

        class GWDMOPT_OK extends WDOptionMenu {
            public GWDMOPT_OK(boolean b) {
                super(b, true);
            }

            public void initialiserObjet() {
                super.initialiserObjet();
                super.setFenetre(GWDFFEN_Signaler_incident.this.getWDFenetreThis());
                super.setConteneurMenu(GWDMMENU__Menu.this);
                super.setQuid(3095634856239812822L);
                super.setNom("OPT_OK");
                super.setType(40001);
                super.setLibelle(WDChaineMultilangue.getString("OK", "ارسال"));
                super.setEtat(0);
                super.setImage("");
                super.setVisible(true);
                super.setCochee(false);
                super.setNumero(1);
                super.setAffichageDansActionBar(true);
                super.setIconePredefinie(7);
                activerEcoute();
            }

            public void selectionOptionMenu() {
                super.selectionOptionMenu();
                WDObjet vWD_MaPosition = WDVarNonAllouee.ref;
                WDObjet vWD_ResConnexion = new WDBooleen();
                vWD_MaPosition = new WDInstance(new WDGeoPosition());
                vWD_MaPosition.setValeur(WDAPIGPS.gpsRecuperePosition(new WDEntier4(3000)));
                if ((vWD_MaPosition.getProp(EWDPropriete.PROP_LATITUDE).opEgal("") | vWD_MaPosition.getProp(EWDPropriete.PROP_LATITUDE).opEgal(0)) != 0) {
                    vWD_MaPosition.setValeur(WDAPIGPS.gpsDernierePosition());
                }
                if (WDObjet.ErreurDetectee.opEgal(true)) {
                    WDAPIToast.toastAffiche("Impossible de recuperer la position");
                }
                WDAPIHF.getFichierSansCasseNiAccent("express_incident").getRubriqueSansCasseNiAccent("latitude_geo_incident").setValeur(vWD_MaPosition.getProp(EWDPropriete.PROP_LATITUDE));
                WDAPIHF.getFichierSansCasseNiAccent("express_incident").getRubriqueSansCasseNiAccent("longitude_geo_incident").setValeur(vWD_MaPosition.getProp(EWDPropriete.PROP_LONGITUDE));
                WDAPIHF.getFichierSansCasseNiAccent("express_incident").getRubriqueSansCasseNiAccent("consulte").setValeur(0);
                WDAPIHF.getFichierSansCasseNiAccent("express_incident").getRubriqueSansCasseNiAccent("date_incident").setValeur(WDAPIDate_Commun.dateSys());
                WDAPIHF.getFichierSansCasseNiAccent("express_incident").getRubriqueSansCasseNiAccent("etat_incident").setValeur(0);
                WDAPIHF.getFichierSansCasseNiAccent("express_incident").getRubriqueSansCasseNiAccent("heure_incident").setValeur(WDAPIDate_Commun.heureSys());
                WDAPIHF.getFichierSansCasseNiAccent("express_incident").getRubriqueSansCasseNiAccent("num_serie_tel").setValeur(WDAPISys.sysIMEI("Cellular Line"));
                WDAPIHF.getFichierSansCasseNiAccent("express_incident").getRubriqueSansCasseNiAccent("type_incident").setValeur(0);
                WDAPIDessin_Commun.dSauveImageJPEG(GWDFFEN_Signaler_incident.this.mWD_IMG_Multimedia_incident, GWDFFEN_Signaler_incident.this.mWD_IMG_Multimedia_incident.getString(), 100);
                WDAPIHF.getFichierSansCasseNiAccent("express_incident").getRubriqueSansCasseNiAccent("multimedia_incident").setValeur(GWDFFEN_Signaler_incident.this.mWD_IMG_Multimedia_incident);
                WDAPIHF.getFichierSansCasseNiAccent("express_incident").getRubriqueSansCasseNiAccent("multimedia_vocal").setValeur(GWDFFEN_Signaler_incident.this.mWD_MM_mVocal);
                WDAPIHF.hAttacheMemo(WDAPIHF.getFichierSansCasseNiAccent("express_incident"), WDAPIHF.getRubriqueSansCasseNiAccent("multimedia_vocal"), WDAPIFichier_Commun.fRepEnCours().opPlus(new WDChaineOptionnelle(WDAPIFichier_Commun.fSep())).opPlus("messageVocal.wav").getString(), 21);
                WDAPIFenetre_Commun.ecranVersFichier();
                WDAPIHF.hAjoute(WDAPIHF.getFichierSansCasseNiAccent("express_incident"));
                vWD_ResConnexion.setValeur(WDAPINet.internetConnecte());
                if (!vWD_ResConnexion.opEgal(true)) {
                    WDAPIToast.toastAffiche("Problème de connexion");
                } else if (WDAPIRPL.replicOuvre("replic_mobile_incident", "", "41.188.113.206", "admin", "2018").opEgal(true)) {
                    if (WDAPIRPL.replicInfo("replic_mobile_incident", 2).opEgal(false)) {
                        WDAPIRPL.replicInitialise("replic_mobile_incident");
                    }
                    WDAPIRPL.replicSynchronise("replic_mobile_incident", 4);
                    WDAPIToast.toastAffiche("Données synchronisées");
                    WDAPIHF.hExecuteRequete(WDAPIHF.getRequeteSansCasseNiAccent("req_updateincident"));
                    WDAPIHF.hExecuteRequete(WDAPIHF.getRequeteSansCasseNiAccent("req_updateuser"));
                } else {
                    WDAPIToast.toastAffiche("Problème de connexion");
                }
                if (WDObjet.ErreurDetectee.opEgal(true)) {
                    WDAPIToast.toastAffiche("Erreur ! ");
                }
                WDAPIFenetre_Commun.ferme();
            }

            public void activerEcoute() {
                activerEcouteurSelectionMenu();
            }
        }

        GWDMMENU__Menu() {
        }

        public void initialiserSousObjets() {
            this.mWD_OPT_OK.initialiserObjet();
            super.ajouterMenu(this.mWD_OPT_OK);
        }

        public void initialiserObjet() {
            super.initialiserObjet();
            super.setFenetre(GWDFFEN_Signaler_incident.this.getWDFenetreThis());
            super.setQuid(3095634856239747286L);
            super.setNom("MENU__Menu");
            super.setType(40001);
            super.setStyleOptionRepos(C0607n.Ps, C0607n.Kw, GWDFFEN_Signaler_incident.this.creerPolice_GEN("Tahoma", -11.0d, 0));
            super.setStyleOptionSurvol(C0607n.Ps, C0607n.Kw, GWDFFEN_Signaler_incident.this.creerPolice_GEN("Tahoma", -11.0d, 0));
            GWDFFEN_Signaler_incident.this.activerEcoute();
            initialiserSousObjets();
        }
    }

    class GWDMM_mVocal extends WDChampMultimedia {
        GWDMM_mVocal() {
        }

        public void initialiserObjet() {
            super.initialiserObjet();
            super.setFenetre(GWDFFEN_Signaler_incident.this.getWDFenetreThis());
            super.setQuid(3117408188353209026L);
            super.setChecksum("838036085");
            super.setNom("MM_mVocal");
            super.setType(39);
            super.setLibelle(WDChaineMultilangue.getString("Multimédia", "Multimedia"));
            super.setMenuContextuelSysteme();
            super.setNote("", WDChaineMultilangue.getString("", ""));
            super.setValeurInitiale(WDChaineMultilangue.getString("", ""));
            super.setNavigable(true);
            super.setEtatInitial(0);
            super.setPositionInitiale(14, 320);
            super.setTailleInitiale(304, 60);
            super.setPlan(0);
            super.setTailleMin(0, 0);
            super.setTailleMax(Integer.MAX_VALUE, Integer.MAX_VALUE);
            super.setVisibleInitial(true);
            super.setAltitude(11);
            super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);
            super.setNumTab(8);
            super.setModeAffichage(6);
            super.setParamControles(1);
            super.setTauxParallaxe(0, 0);
            super.setPresenceLibelle(false);
            super.setStyleLibelle(3355443, creerPolice_GEN("Roboto", -9.0d, 0), -1, 0, C0607n.Xv);
            super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(2, 15132390, 6710886, -1, 4, 4, 1, 1), 0, 0, 0, 0);
            activerEcoute();
            super.terminerInitialisation();
        }

        public void activerEcoute() {
        }
    }

    class GWDSAI_Description_incident extends WDChampSaisieMultiLigne {
        GWDSAI_Description_incident() {
        }

        public void initialiserObjet() {
            super.initialiserObjet();
            super.setFenetre(GWDFFEN_Signaler_incident.this.getWDFenetreThis());
            super.setRectLibelle(0, 0, 294, 18);
            super.setRectCompPrincipal(0, 18, 294, 54);
            super.setQuid(3095634864840956414L);
            super.setChecksum("1142875074");
            super.setNom("SAI_Description_incident");
            super.setType(20001);
            super.setLibelle(WDChaineMultilangue.getString("Description", "التفاصيل"));
            super.setMenuContextuelSysteme();
            super.setNote("", WDChaineMultilangue.getString("", ""));
            super.setTaille(C0536n.f1006y);
            super.setNavigable(true);
            super.setEtatInitial(0);
            super.setPositionInitiale(14, 60);
            super.setTailleInitiale(294, 74);
            super.setValeurInitiale(WDChaineMultilangue.getString("", ""));
            super.setPlan(0);
            super.setCadrageHorizontal(0);
            super.setMotDePasse(false);
            super.setLiaisonFichier("express_incident", "description_incident");
            super.setTypeSaisie(0);
            super.setMasqueSaisie(new WDChaineU(WDChaineMultilangue.getString("1", "1")));
            super.setTailleMin(0, 0);
            super.setTailleMax(Integer.MAX_VALUE, Integer.MAX_VALUE);
            super.setVisibleInitial(true);
            super.setAltitude(1);
            super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);
            super.setEllipse(0);
            super.setIndication(WDChaineMultilangue.getString("Description de l'incident", "تفاصيل الإعلام"));
            super.setNumTab(2);
            super.setModeAscenseur(2, 2);
            super.setEffacementAutomatique(true);
            super.setFinSaisieAutomatique(false);
            super.setLettreAppel(65535);
            super.setSelectionEnAffichage(true);
            super.setPersistant(false);
            super.setClavierEnSaisie(true);
            super.setMasqueAffichage(new WDChaineU(WDChaineMultilangue.getString("", "")));
            super.setParamBtnActionClavier(0, WDChaineMultilangue.getString("", ""));
            super.setRetraitGauche(0);
            super.setMiseABlancSiZero(true);
            super.setVerifieOrthographe(true);
            super.setTauxParallaxe(0, 0);
            super.setBoutonSuppression(0);
            super.setPresenceLibelle(true);
            super.setStyleLibelle(3355443, creerPolice_GEN("Droid Sans", -7.0d, 0), 3, 0, C0607n.Xv);
            super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 15132390, 6710886, -1, 4, 4, 1, 1), 0, 0, 0, 0);
            super.setCadreInterne(WDCadreFactory.creerCadre_GEN("C:\\Mes Projets Mobile\\Projet_Mobile\\ActivAndroid 5_Edt.png?E5_3NP_8_8_8_8", new int[]{1, 4, 1, 4, 2, 4, 1, 4, 1}, new int[]{8, 8, 8, 8}, -1, 3, 5));
            super.setStyleSaisie(3355443, creerPolice_GEN("Droid Sans Mono", -7.0d, 0));
            activerEcoute();
            super.terminerInitialisation();
        }

        public void activerEcoute() {
        }
    }

    class GWDSAI_Titre_incident extends WDChampSaisieSimple {
        GWDSAI_Titre_incident() {
        }

        public void initialiserObjet() {
            super.initialiserObjet();
            super.setFenetre(GWDFFEN_Signaler_incident.this.getWDFenetreThis());
            super.setRectLibelle(0, 0, 294, 18);
            super.setRectCompPrincipal(0, 18, 294, 36);
            super.setQuid(3095634864841087486L);
            super.setChecksum("1142998288");
            super.setNom("SAI_Titre_incident");
            super.setType(20001);
            super.setLibelle(WDChaineMultilangue.getString("Titre", "الموضوع"));
            super.setMenuContextuelSysteme();
            super.setNote("", WDChaineMultilangue.getString("", ""));
            super.setTaille(50);
            super.setNavigable(true);
            super.setEtatInitial(0);
            super.setPositionInitiale(14, 2);
            super.setTailleInitiale(294, 56);
            super.setValeurInitiale(WDChaineMultilangue.getString("", ""));
            super.setPlan(0);
            super.setCadrageHorizontal(0);
            super.setMotDePasse(false);
            super.setLiaisonFichier("express_incident", "titre_incident");
            super.setTypeSaisie(0);
            super.setMasqueSaisie(new WDChaineU(WDChaineMultilangue.getString("1", "1")));
            super.setTailleMin(0, 0);
            super.setTailleMax(Integer.MAX_VALUE, Integer.MAX_VALUE);
            super.setVisibleInitial(true);
            super.setAltitude(2);
            super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);
            super.setEllipse(0);
            super.setIndication(WDChaineMultilangue.getString("Titre de l'incident", "موضوع الإعلام"));
            super.setNumTab(1);
            super.setModeAscenseur(2, 2);
            super.setEffacementAutomatique(true);
            super.setFinSaisieAutomatique(false);
            super.setLettreAppel(65535);
            super.setSelectionEnAffichage(true);
            super.setPersistant(false);
            super.setClavierEnSaisie(true);
            super.setMasqueAffichage(new WDChaineU(WDChaineMultilangue.getString("", "")));
            super.setParamBtnActionClavier(0, WDChaineMultilangue.getString("", ""));
            super.setRetraitGauche(0);
            super.setMiseABlancSiZero(true);
            super.setVerifieOrthographe(true);
            super.setTauxParallaxe(0, 0);
            super.setBoutonSuppression(0);
            super.setPresenceLibelle(true);
            super.setStyleLibelle(3355443, creerPolice_GEN("Droid Sans", -7.0d, 0), 3, 0, C0607n.Xv);
            super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 15132390, 6710886, -1, 4, 4, 1, 1), 0, 0, 0, 0);
            super.setCadreInterne(WDCadreFactory.creerCadre_GEN("C:\\Mes Projets Mobile\\Projet_Mobile\\ActivAndroid 5_Edt.png?E5_3NP_8_8_8_8", new int[]{1, 4, 1, 4, 2, 4, 1, 4, 1}, new int[]{8, 8, 8, 8}, -1, 3, 5));
            super.setStyleSaisie(3355443, creerPolice_GEN("Droid Sans Mono", -7.0d, 0));
            activerEcoute();
            super.terminerInitialisation();
        }

        public void activerEcoute() {
        }
    }

    public static class WDActiviteFenetre extends WDActivite {
        protected WDFenetre getFenetre() {
            return GWDPProjet_Mobile.ms_Project.mWD_FEN_Signaler_incident;
        }
    }

    public void declarerGlobale(WDObjet[] WD_tabParam) {
        super.declarerGlobale(WD_tabParam);
        if (WD_tabParam != null) {
            int WD_ntabParamLen = WD_tabParam.length;
        }
        WDAPIFenetre_Commun.fichierVersEcran();
    }

    public void activerEcoute() {
    }

    protected void creerChamps() {
        this.mWD_SAI_Description_incident = new GWDSAI_Description_incident();
        this.mWD_SAI_Titre_incident = new GWDSAI_Titre_incident();
        this.mWD_IMG_Multimedia_incident = new GWDIMG_Multimedia_incident();
        this.mWD_LIB_SansNom1 = new GWDLIB_SansNom1();
        this.mWD_BTN_AppareilPhoto = new GWDBTN_AppareilPhoto();
        this.mWD_BTN_AlbumPhoto = new GWDBTN_AlbumPhoto();
        this.mWD_BTN_enregistrer = new GWDBTN_enregistrer();
        this.mWD_BTN_ecouter = new GWDBTN_ecouter();
        this.mWD_LIB_SansNom2 = new GWDLIB_SansNom2();
        this.mWD_BTN_stop = new GWDBTN_stop();
        this.mWD_MM_mVocal = new GWDMM_mVocal();
        this.mWD_ACTB_ActionBar = new GWDACTB_ActionBar();
        this.mWD_MENU__Menu = new GWDMMENU__Menu();
    }

    public void initialiserObjet() {
        super.setQuid(3095634856239485142L);
        super.setChecksum("1137969631");
        super.setNom("FEN_Signaler_incident");
        super.setType(1);
        super.setMenuContextuelSysteme();
        super.setNote("", WDChaineMultilangue.getString("", ""));
        super.setCouleur(0);
        super.setCouleurFond(16777215);
        super.setPositionInitiale(0, 0);
        super.setTailleInitiale(320, 632);
        super.setTitre(WDChaineMultilangue.getString("Signaler incident", "ارسال اعلام"));
        super.setTailleMin(-1, -1);
        super.setTailleMax(20000, 20000);
        super.setVisibleInitial(true);
        super.setPositionFenetre(3);
        super.setPersistant(true);
        super.setGFI(true);
        super.setAnimationFenetre(0);
        super.setImageFond(WDChaineMultilangue.getString("", ""), 4, 0, 1);
        super.setCouleurTexteAutomatique(C0607n.xv);
        super.setCouleurBarreSysteme(C0607n.Kw);
        activerEcoute();
        this.mWD_SAI_Description_incident.initialiserObjet();
        super.ajouter("SAI_Description_incident", this.mWD_SAI_Description_incident);
        this.mWD_SAI_Titre_incident.initialiserObjet();
        super.ajouter("SAI_Titre_incident", this.mWD_SAI_Titre_incident);
        this.mWD_IMG_Multimedia_incident.initialiserObjet();
        super.ajouter("IMG_Multimedia_incident", this.mWD_IMG_Multimedia_incident);
        this.mWD_LIB_SansNom1.initialiserObjet();
        super.ajouter("LIB_SansNom1", this.mWD_LIB_SansNom1);
        this.mWD_BTN_AppareilPhoto.initialiserObjet();
        super.ajouter("BTN_AppareilPhoto", this.mWD_BTN_AppareilPhoto);
        this.mWD_BTN_AlbumPhoto.initialiserObjet();
        super.ajouter("BTN_AlbumPhoto", this.mWD_BTN_AlbumPhoto);
        this.mWD_BTN_enregistrer.initialiserObjet();
        super.ajouter("BTN_enregistrer", this.mWD_BTN_enregistrer);
        this.mWD_BTN_ecouter.initialiserObjet();
        super.ajouter("BTN_ecouter", this.mWD_BTN_ecouter);
        this.mWD_LIB_SansNom2.initialiserObjet();
        super.ajouter("LIB_SansNom2", this.mWD_LIB_SansNom2);
        this.mWD_BTN_stop.initialiserObjet();
        super.ajouter("BTN_stop", this.mWD_BTN_stop);
        this.mWD_MM_mVocal.initialiserObjet();
        super.ajouter("MM_mVocal", this.mWD_MM_mVocal);
        this.mWD_ACTB_ActionBar.initialiserObjet();
        super.ajouterActionBar(this.mWD_ACTB_ActionBar);
        this.mWD_MENU__Menu.initialiserObjet();
        ajouterMenuPrincipal(this.mWD_MENU__Menu);
        super.terminerInitialisation();
    }

    public boolean isUniteAffichageLogique() {
        return false;
    }

    public int getModeActionBar() {
        return 1;
    }

    public boolean isMaximisee() {
        return true;
    }

    public boolean isAvecBarreDeTitre() {
        return true;
    }

    public int getModeBarreSysteme() {
        return 1;
    }

    public boolean isAvecAscenseurAuto() {
        return true;
    }

    public boolean isThemeDark() {
        return false;
    }

    public boolean isMasquageAutomatiqueActionBar() {
        return false;
    }

    public String getNomGabarit() {
        return "200 ACTIVANDROID 5#WM";
    }
}
