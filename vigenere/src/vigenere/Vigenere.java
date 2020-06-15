// Galatis Athanasios & Vakouftsis Athanasios

package vigenere;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Vigenere 
{
    // the ciphertext which we can get from file "ciphertext.txt" 
    // or just assign it as a string
    static String encrypted = InputCiphertext.getText();
    static String encryptedManually = 
    "GZRSVNmk tT jPWVShW jMPaKPXIe rjfRGk Br VjTZEMVWjR Za N YBaYkXgqb VT nHbUm OeP TTcoITbVUG TImLYpWfSj TaSy UfMITb VGTMfY MV E mSkrigOeG lqxhVD QCm WITWZK LbFtIav hb NRRf. KzQY GVQhZGkQbT FLGrElkgZY RRX VwWmvR Dm rLRb VY vHPvIb c gRIlRblD dfCMEm. RI UQfINZW DLc ecaIVPm gk O jvGWfdXp XbRBJc sR dwfgNVR WWyOZC PChZV ZV gNx JLkTrgf. FKTUkaym kyVGOoW RZR GGHPyKmwg gU YAkekic rGVWqMkQRY MOED Epg PbaeD mg mOgGIP OiH kPhY vVRFIw vVR SVAgasU fw E RSiHZVT GMaEmO. RjS YGkTXj rObvW VVZ XYZRGM H VoEjkhl. zYRXSyg RII OOYI gWfYBIPo Hsg hb blLgWwOSzPKhdIj, IYYH YIpIptSQ Zf Al ojObEIUgZW, VQgNxY Mx Xfg aRIYAgaxaj vRHcmGZVT G IHVDMawZNX jEVmwWkP TQZdGp We OG aLo SngfNZZOgSq QfEXTcgW fN gNta TyPgem, faTH Tk yVfJI JOqMeO gU wV asXf ecaLZGnjfhZFR ROmEdMgKKZ. qoGfcbVYd-RXdfhVu ZWZiIiIOOEPXsIq eOa HV DnW yc UvWKUi Si QZVELQoRrchVUe FeSBg. uFVOOiX mcYTxYElMjkhVKj RXhwSjvRV O mMjS. n XBZO sW Y oSNYlRX gk dfKIPhdEc PNXF aLkX acb OK iETdngVu aJSi E kPeKta MC IvgQhZVD. LgrS fw XJS fRfea ItaIqSpkSf UW SXUzfZKc VVmIRbf OGJPEHc kRRTkImq yVVwX VVmSlOU StZUEIpcRVTX Ok kucfwMPU, pRRcgNHYMCIb cQPKjS mg wSjFYTQZW, lVNaMOSBMqgR QOjCegxiiv ST ajHZNVItaMyR mh RNZR, AgV iSezEN ca WVZiOvL EDXYeYf. yVCnjnhp zR EchTlbVTz JEx Fc xWRcVD Tk mOmzRI hcI WWYRHdMxK cnSZKeTl: - KjQlII GboMkg VJxUXsJgeOgOfN, dftke rW CioLVVgOvHXsSl cbQ cYIVZ BS ivJGf oS Ra VJxUXsXw gggGSLbkmaVEX; - eciJZVVTz HGDMmpg bL RN XkyOSCMUVZH ZLRTMPXI Xm khf JVSbYsOkvH GboMkTRSxUXC Jmt gRXmIVWx Oeu GQakYkQaM KLWyYpeSf, QeOpf fg ivWQimGV IPIxZW mSlvfbR; - uAmS nbkvKTWoc, TWaLBKIxXgcZVZp, AgV tfZxMP OpXYMaZBJMDc, ZtcNJcY kWkSiIIF hj Ej LNZt HRn QcugNMV SXUzfZKc; - rfZZVVgOHU JBSk fSaORL hX yObzRI dVVk Qa G MYExWYehVUe, WaWyVVI EU Oi MeQgOtaMxK mt O eKTEbnnbX GETht, OeWjT tZ RyRpgdhJZAmatb; - IvWQimGV IiGBSElMjkhl Zf Taoffk rKCWiWk bUK wLRsEj qT fKiVbUj OkKEEYn. xYM SaGKEwIlvOY ViEkWviZJMVS aSi bUK BUXoKpkhl GeD lgzbUEIUg jJ RVl GvJICW-aqbgXfL hj thYvV USXYiQge FLGrElkgZY ZS mZj gVtYTS ZWkIORBZLwIlv cS OUEglnhZvW. hcm IoIZVEL, XrI jcQX UW EgXtfTvQGbo JfZ fKvbVo IqvOORZSaejbk FJ KRZRkQgOxZ, QkOcu OYR RTmWrdkJ XQ SiJfZPK tU EmGcug cUcIVq AWiKYCZgc laRRxZW. SHcphVZp EllfPczWJaZRk qQKGaMDc cuhNHcIlZrSeK MU QjRTMeTxK asXf vVR SVTagig SP aJWXL R cfKK, H VERlkbT ViOVWxg, fI E VVmIRL bL xeImYrkca Oj SXUzfVCc CgnSTQNZxK asXf c ZRMZTbefhV vRVWoc. IMPGES XrEr cb RTkImq rOp IIRfZWVVg G LPRqPc wgRX, R Gkgzd fw YUSmW, RV RTMPVo SpiOaOjAmatb, R ySUh ncjbRS, HY WyQc pSgcfRdasU UvZKQZ. ijbNHEPWrMli Oa OUEglnhp zW VVZ QVIaY HM GyRaniQOeG mZfh ZEHGSY XYM VJxUXsXw kb hYV ChjwSjGSPRn Xf bUK xUXsXw vVNZ ZT VdfWdJ XQ PZ EeL gNNZ MC WYkR gU SE TmyVVEXKQ. vYkPRTMPGkXgqb VY kHX kjQlII KRZRkQSOvHXsSl qT RTkImajg ZE aJWXL R XeUHM Sp TmugRYjIgY fb ZuIPhdXp Qf bxYMpMcf. oa KeTblD OTtIUg oS R alYMLQ sW cpQNVjUeSySU zR YVVX YIf HxJSwI ipcjT RS Tf fQTFYPh. zRXITOGN Mx El cQg UW AnlmSeKMEOoMfV PGG aEuI nnOPK fN Xnjfp rXVShTk bb GvJICW Y ecaZiOedjR TFQRioMeO feLaIw, Olqka Gj A eglWe, NLGb V WVZiOvL JBSk cb NVgLbUfhZFR Kg mIhcRYMLH, yV ccQU ZZMX S sSkNSTY VGTMfY BZ ToVdqfZKU. vTjDWex WagoId IaJ GLXGSpm gRIlRblD dfCMEWZW Ra jKES EC EnrZVIRTbgs fVHYKfZQVVgY vHR nMavOgK kHX XwShLIPQt SW MaZBac kYrjSaZZCTlnce. kLG SqMUMaIx YICYjvWaM WRhe fb VJXCPgMjPRJ BKIxXgvm VY dAbfyOZEIF Pt XYM PUFWYDMli RRbZCX as kYrX Kg mIWMeXxK Xy Eq c gRIlRblD QfEXGlo. xYM YGMaIB VcoOVTj SXUzfVCc ChoETPRJ MV IFIpA iaOk OY otfb IISiZWkMQ HR aLo GmtfRYgOgVnbX vRVWoc. r aRINYMDc aqbgKoT VSs PV vbEVVRXMQ RHJEvPw cQeUjS TVifVJW UdVGVa NTw TEI Fc vfNTjMblySU FZGf V RVbjUKR IwFmfWRJ ZN mZj fVHYGgo aZbU cAPGr Mr kg NYjOVafhVu. vGgjYiKR GvJICW aqbgXfL tUhSjJ GQboVfT, bTx VJ DLc eSaZiAe lmSdvW QT oLZa OUHR, MC Ejuc eKWEkjjR kF EU OXGVaf GNaLyVguOgOfN hj xWdGPa OpXYWeOLHXsSl. Kh VY RBhmy SewSTQdRX I cXxKIpMlgR NITElk ucczGa. HcI XWNR BZ Xy GmpTVTV TaW fQkzSPg jJ RV RTMPXI Slnm gU kHX kjfmzGGg VRU bb ZAL GyQnwhVTX RXktiitIU hcEk Qg OL LRDMrnSQ Zf. th hwSmvRV Oi ETKRYL WSvMaA TeUd SnTASiJMQb, oLV KbTMYSvW rjOg KeFhjhS ZK WJcpPU JR LHYIwSqv QNVRBeW tT SzRFWiK TWZVNaMxK YehVbZTbWx hf rYVVZRkQPGMLH sHcphVZZEl Sy OeP JKbZ PVdRR HM GyQnwhNZZOg, lmS jtSRS jJ nPVIA TEI Fc cb RTkIkW fRUIIUg nTRKR UK HX DLc vOfQ RNW lmfVrH NSqIc. BUKLL FsRbkbTY RRX cscnE EU gZGlZR GLZSmMYvWbTj. a lSkS RtGGgn-GfVgXHS TyPgem cXVVXfyg cvEMObI fN NIvLWC Xm wbNakHhjngVu YUSmW UQeKvaPI Sp kbQOiEVlqm ZE EPm nXRbR Uy aLo YlfSeRpIgY hcdGYVWiK jgfZxT. eC ac jOiK RLkWfRp DIPhdSeMQ, OwLRDMrA SfZRBeaxVdvRV Wn XYM PUKUIBWrqbR UW EgXtfTzRI Oic iMfUNYGo EaeSfY-TOglwcc GSNWXc. uIgG tUH wIquOTK jEVmwWkP eNhcSlOU ZAL XoVk fOgG jEVmwWkP MU UZRVZVI, BaW EWc kg ZGZNeq hcetITbZH nQgN FVHsJgeOgOfN WWySTKMQb, jVZOVT tbXrIlvWPOkY, Tfi QfEJKRZRkQNRBac yJ bchN ZYAm ax PVzRI dmSTMfYxK Mx-Qcocee, fR pZnZV IIUWYMeO bT t ZXyVYiS ZKUIne tf ULVKbb XiIaYFPWCMmp ciKi A VgrdlKIT bZXnWeQ, B.L. E wIquOTK. DOWakWTrXKci HVbRIMPSx Sp uWZVcY WSyO ZEXGUmMkg NRHUI sW lqh bL mAemj hf uEVO nITceOMf YxPcug VZ ZS VgrPZEIF kdXY WeOzPR kYrjSaZZCblD. oe vEXSnHiWcVBUK oRrkhl SRY ThuZp KLG gVQV LNZt-PRDIetWge gRhUjRlIIU OaXVZ UGOPRq MlvSeIVPmWi Oeu QQRdJZMQ JtaE sXcog, YKRDbfl hYv VGQZMmQaM xUXsXw vc faTCXkxTlCPa jZVZNl ZAL MxXcifVZp OY lmS SIICQcIU LNZt IYD agvVbak RXSqWjzRI Wo aRa ZUwPJsIb. VVhY, UAmS nbkvKTWoc Za hYNHPvc aqaOOeEW onhY JSOS aSiU bL HYMqMl cigNVNmahWkP, IPgpVZVT ZAHX kR gphRMiImq-hVVtO Uih Mj QaJxLH qIlgfNZVD Uq f ZVxMVWhEkM RTMPXI, Xfg ceOXIgSq gfLVES jJ kPR JtaE. cIawfR JRTT ashVxVKht, SeM PUFIMxIb yWgN fRbYnb RLXJSiXZKVZR, WVyXcehf GXAbfxh RE YPOpXYWeOLLH ETbchR UW DTlf. qfEJKRZRkQNRBac sW rjS cXfCXkx cW JICZdRX LNZt bWsRe c YReVD WSyO-jtVCaWPZVT GENSBMrja fU kHTl tbcP E FSnMXVNZxK IxXgvm, bTV Wblm YeFaNSYKV WS ZAL Ooc, gu OORV Th SudcP XJS mImMeYx aVkRqhceSRTbgs Oeu VGhmMVdR ZAL HkXY kb VZj OkalWerP HcmQ. KPR MHHP sW rq deKmEgl iWjtPQgpVV WS OGMSBQYvWbT kO nffikySTWnIU MaZBaMoW. Gp O fKeSX, VfhR tSPTdHVVgOtSMDc acb OK lSXV fg R DIEVVRZaZ LHY IxJmtQVTX AVUjgj KS KbaSiUNZBVR. dLc wbQKiLrasU TFWV, VjaVdRX, vHR lI ntcUOSImaAS jF XJOo ETKRYL-JSxXpqZ ZKTHTfngdJ ETS bIeMeGESc xSr dOfKU Og VfhR tSPTdHVVgOtSMDc. BchN IfNYaiSeKMCZdXp ZRStPRC E bkgPOgLbfj cW zXU crR ZV fKvbVsXw. Kh VY jEeWhhZMINm VTgTVKw aS CIluWgOmE bfkciDEVWjR kPNZ POIx HguQYUjEW jjglCXU Wi QVIfaKHFvI mt ia-SVAlmwOSCI NcnW fN fUFL OsRb. PcaXVPnVnOkzSP BjRiMcawPEDMmp cS GTTbgs Wj KLG dmSTMfY uf arMaj Oa KeTblD Wj GVGjZRkMQ LKVQ nIlAWaM gAklnQZGEVWjR ZV N ZKHRCEavWbT VImZjf RJ EP WiMkQNZBUK yV Y tSPKZVbfl Seu. xJS YIWQaOMPSx Mq wZgOdAmWqm RGTNWXESTR ZH WVoZcphVTX Agq ufftIUg jV R bUXxHH yJ czSPakIhf wieEMPU jR SMUGEM Sp El gbQ ajEk lt QZIGWaqIeb gNx IMxHgpU bL kHX ShhZEK KRZRkQge PPXr Xfg ZRMZTbefhV vRVWoc. rTgNHbKr Slg aVMYT TjliV KLCh iSeZRVNKMkXgqb PGe BX ShQfDTNWnLVL fOFWPI Fw rfbJlCbfl OluMV OiH kZNTLHGDMmp heGZLl as O jvGWfZ EeL N IHUXBSjnOORV FTkmWfE, E RimMjb jUNSH kWqgfg ZYAm S qSXrPNm WMeLVTz USxVcriQORTbgs QRE FG jZVp PNXw aS BIYnWfK. uEgafZ drc CZrEpa gGDL SxI dqfZ Ui AggyVVI. rGjZVkPRRxZW, nMekhNR jIZffhlIIU PVWVL bT IbFvMa mSl IiYiltUirTJm VRU I PUFIMxErkca UW TTeuSi-GVQca LRZQctYI kRb ucSZnAkW rcULPGg cEmM PUFL E vSli kNe kOpSwR VJXCPgMjPVTz cIBMdkOORV NhfwSgLHKOoMfV fKKcMmIq, rOeZZCndffcP JQf dRZbVGMPRq IlvWgOVS, b.W. yVfJI ISiIiIgOGN MxJmtaNZZOg. sAOZCEDWgMkg nbtPPkFgnWge RDWjjgjvW VVZ MjahK HM HsWpwdgOeG TUhSjJ XQ QjQgcgOGN VoWmwfPKj AgV xSiMMESn. xYM geIL Sp HgufhVkIhf rOp IEPUZ JiWZ IHTTBSkkgVTX TaW kietXKciW fN N VtYXsGsnOe YVRoahS fI E UmnXVU gU vVQzPcvSYe UEgqnbX rGESnW kW VZ. nUHoV YnZ POiCnexhREGGg, dX Za aGMbVkP dqf hYVRl gk OeP GQakYkQaM LLVFMag hb KoPXUy fVrWQbVFcM eKLWSxWc vWZKj TaSy Oiv GQakEiIORx aS yV kwQU HVTmWw hYrR JihEe-bb-NNTEx MlvSeGTTbgsg fMIT O oIcMcNHUI vMlg, TbX ZNllfbTv, XQ OoXRQa ZAL WkQc uSebZCX. HwckvGVWiK TWZVNaMxK pggbaiCXk kffD IZhmIdM QKzYEnErkca UW PXjkciDEPQZ Si NeUF KIvMZgfNZV DXfnOc FJ USmZZKR ZtRIC TpkceOkY hnjf kyI GbaSiKRSxUX yJ Ypm NITElk-hceKVQZ kScQPe. T KIxMYn-cS-YVRoahS RKXCQf Mj WaK BU arMaj O QKcIUWwOkv LKUc ZfThSx VJ lSewg eKhUXkyg RII USiX kW N YxYZsGc rfbbZDXj. YVV zRVSiX Za gU DLIz PciWgOdAmW zgVIW QT oLV aRXOPGo Jpqa hYZNZ ay. oe rXVOXO Ra favO Qkc ZtWaM kHX kjfmzGG hj Mka gNKLWrSjf QNVRCblD, ZVrZKbb Mk LRJBJEDIb vc UGeDeasU drPKQdSla eKJbICXq kbfZVAW gk ZVxMVWhEkM bTxZ. xrI kcbVLVSmSyWfE QCm mIjcYZ BU IHXpgaRRp SegB fVJTQbnI kQZKL HRn TmvSaZZAedD aRP PGOY Xf I PUFWPoXc kbUOSImatb fw WGfqMTM NTw bPDMkchRRp A lZzhUFaP RpI kW gNx LbrEsuhVUe OY jzbkzQG fZWfceIxZ, WEGf cg eKRL hj xSTFRFOmc jbbXtNI yV lghjUiK lghYVKW. rcrIiNhR taXkGiu Of YlCa efm WLVVVZV SZVTz KSGR Yp SaZZRX fjhnFVM On aZLR GL aLo MlvSeTVT mg f QiraN. KcIe IhZAVVsWcf ifKiS Tjj bfK EDZZ Xf aRTw YIAYcuhf Ui RXShV R JITjdGV, Qg HxJSwIq c gRIfNWSwm TFRESmR kW UGOL XrEr uSebZCX WsTfIGG Oi ETKRYL-JSxXpqZ cUcIVq. KiiKLGfhSiM, gNx TIBI czWfZVNVW tT kyI USmZZKR OL LRDMpgZl ZYRXSySevH. uSXYiQge FLGrElkgZY kHTl uffKIEh oLV IiGBSElMjkhl UW CheuikzRI fZWfceIxZ KEEpf OTGZNll AOizSWg oLiMNZL VJ sRrgfeagTbgs Oeu HGZdFVZNZx HGDMmpg bL jLhonbX uSYb V WVZiOvL SB VcpRRXZNZ ay QfDTNSoIcg VTtJGoWqkPYK. uEmWhhZFR CbY TiMiKGaMyR mh RbY RTmShYj yEXS ZQVZTKw HW kQmpU gNV LXSiWex WGQpVZbl OLZYoW gp hUOj EkS tT TFQRioMeO bbxY TEFjkQ aKkWhjpg. zK WJcpPU JR THaIn Xfch QOjRnhyWfEW NSVHZVT ZH KIxMYn cS YVRoahS drc QQXYi Ig JBMJoVcph YUTAmatbj rPQbb XYM cGMO FoXugSa G TLbWsh REH C gZVmMe, OGJPEHgpU gNV FhdqcnzRI: - wi XYM RTOPVyRkgbg UW TaW xSiMMES cIiM gNx ZIBZgeS VY gRXnjbkvH HfjQ fJgGBUMxK pggbaiCXk sSVuIF TjV Zbf VKVToV czSPakIhf. YVV rXVOXOVZ SUvbWoW mp SkNRUllnbX tSOdpXZVT XxZSEVagg bL kHX kDgkvQ Kb rLZKU ZAL WoVtkQR Oj HhkySU. - ZR VVZ IedVXHUQoRr qT gNV Ceajbk KLG hVVXMg YxYZsGc kg QOmEkljR WISO fZWgWaJBUK DS jgUVZZMTlj fVHYGgoIia NTw KIkPgpU jOkH nkjTlC GQahYeQPGMPSxW ZA kNe fF TlySdGXKbb Xf ZRYIVRn Xm c aNYjIoW gcdsETRhIeb bL KHRnSk eZVKeT fWxgRxIU WiWkMNJ. - TSSxK rjS cGkH UWykVvR EZdIebf GGK XrI qgfiKi TaW fhkrGMSm MebRXvLTDW YpR gNVN WaxQRIHU inIWcY XxXYoWru hb ZYE lWwjZtI. ecnX fN fKvbVsXw USPaiImq nb TFQRioMeO, NY BU ExcrjWaM VLlW, hcdvW YWoL TWfZ tUH yZctVRGU. taSy QfJX UVjYcL OK IbX sR ngffVVCmaAS nzXJ hcI mIYax VJ DLc rfbZVCmWi fVJSWfXIj. BUK vVWD Sd uSPaiImq mOj KS DS kVfXbXMPSxErg hb ZYE egxgVJ MPQpViMQ LKVQ kRw uSPaiImq gfVrGJSn. meaVMGPJsGYph YUjSXk ic eFX TSlYZZR YBNRsJgeOaZcY aalVVI WGQpVZbl IHZXC. qccghXZNZ hthVEXKOg Pfaf OL USD E bghRXdIgaxhZt TTcXIja; jUKZX-mEqg gPKeAkatg kyITSaSiM NXx aS lI YughSVD. Bf viREXKTdESTR ZxYQC, Xfg QbYk OY kjQlIMVm nLfcYJ uL PoWq vVNT kHTl tT VEXKfZPp ZRVEHGsRe c deUkEVljR TFQRioMeO NYLLX sRaniQOeG blx RRKE CbY JlVPZBVRkPgvm. oKZNZ SgZV KS SiVRkQSe OHVsSsu SYKdEglx cW IMUY ZRRJYKL aLo HcxSYUgMXfy cW zRHcmQVL cUEPGsIq vVNZ SAeSsQV KLG QjWk WS YxJYBMrA kVZY TaW gSevJKhn SW QaIKLECIb uOSKkY. MZwSRKW JOqI kW OK vVRCMbgfRJ VVXf nb YzKJZt WVKhXx LRFMpqbZKeTl. LmS gISDOWMcQge HM VEMl kb N IfMimyWex MPTmEjbeavaYBI, cxSa cYEg jjZRKMXSgc cWj, YAVYvH Zg hUK URbnnbX wEEhjV SMUOGK XrI ntciOjIhf tT jvGWfdXp. pbcxcIB, Slg QNTeOm SqkRPW Rio Gfag ZH ZImYpkhl. oeVTknce FJ RfdZRKl, YNJL kW nwPYOTLr WCdfJMPU V TVZfUG TInMacZ eKTOkVx, QRE FG RZXiQZKGaEv Xm vVR VVRlgs, SmvR YVZR jMRSBUKvc lq ehGeTbXnOSCI RVtWZKNR AHVw Mq kbSRZCmWi ce KLG dZVjWa GGK XrI fgOYZY-CTjj diFZKRZV. JgfZxT MxXcifVZp: A ijjZluI Vc nITceOMf mxXcifVZp OY asTfIQChdSe XeUvLWCMli kNY kHX XtQlJ SH OoXVVgOHU Mx IYtZl YkAZWx cW KLG RZZVTbVFLRDW gp WaLfRfSyWfE XGQcRfTbMR. mMBWr, vVR TVEW Xtf R JXTWXX jMcGKHXsSl dSgcVEg S wieEMPU XSebeUE WVyKpca NTU UlWw ci rTRZdGRbVUG WVyKpcaf cRS TVifVJWGR ZZVV VT uHWsG qkbTRV-UlWw gpJXGan. sgMeGMPRq WwuhRSj AgV mOiuaCfZ EUdNTvLQoRru ghIY Al lmcjv TKciIVZRJ uf XrI GDA fejTXe 360 fbU JcUhZQ 370 WIZOEf LkZc nSQ Zf MndyWlJIT gtWkMZY MOED EaecZSfDTlj O crVIS iYdJRX HM YCIpu. HUK VXXUzhZFR QT hYcbVVEL TBSaggfKj AWVwSjJMPU V GfUZUG TIwSpA aRGeT mZfh fEI RfjGVaf SNZX lI ntSiKeTXV kffD SXSmaiQgOGN QoQmtm YUTAmatbj KLCh VVV IfYBNRoH rq OaUkHXj ufftIUg. vHUZRYL-ZTkGc uScGiAmatb, kyITSaSiM, UGw aS lI kcWaZRIgWi We sSVV oLV dVXMbEv WrqfNMV AlknUevH Vc V TiWPKLZ ExH rjS eKRL fWrciP FNcXOj cfKw HX BYlvWZK. zN XSwZp Zfo gtWkMZY MOMC TpqPYKd WTk fRUIIUgZH nQgN LaSBEeg-deUkEVlnce BIag rLVZR G IHVDMawZNX gRhUjgj rRF hcI jbbXtNI kWqkUaKU Th ay Oiv EUgjGZIgKw dMDL Y wbVWlE lltfRxI MSt XYIg SNZX wEreV VL kHX hwcTvWU Wn EcTbcxK Xy EaeSfY kHX kycirKG. oic RbgKFWX lc Y rfbIVSl lt gkFVG RVXR WhZLPHo Sd khf GjSbYsSU sPQQfW fN ZKFVVI Mq tSPUXNbkjR SP XJS cEiLjGKL HEI rq aVYdAmUmSU JXQfVKV-XeUMLGDMmp YRej. ig AGA jPWVSh 360 XYZbazO WIWrga 390 NTU BXqtbU, KLG QjRkZbR IYSqVYo RRLZNbfl hYv SRSmEkQaM LfWDIk kg VYfLTljR WISO inIi XeUzYEwW ZA aRGeS hX f hnF-WVOoI ZVfZKbGDMmp SkKTUmatb VEZKfjRdMaZ. mOICI ryc fZRTXk ffV tENZZH jccKKcMCSp uhNZV AgV uffsPGa-kVfOeGF ZXkXc. C gcKTITd xSk FJ OOXLZVR OGZXBYavWbTj IgUqiUzRI WiTlb-baMWYD GmoaNTUS mg yVV zRRio-SlbcaM JLkRlgZf GeD fWrciP EU kZPc If GwKVoWq-udNIV-MTffUVDIPh dRjbeavaMyRq cfR UgEkSgZV FRNm rLVV gNx ZcCXco Wf XlNgasU ZE WWdZVmQfUK ZXkXc. VVR IfNmjtZ gISIfVQ kgcOvHPvc czSPakEl as glGITjdWfZ fZtaI GLgnS hYVR ijtUirQU OgaRgf KQLGEXc kb gNV PkggZVD-TTcbVRU fZtaI. gLcp Oa GgPeahOkzSP fZUlMfZL aLo WctjVIVS hX yVV tSPhmSc XeUzYEw, WseV NY gEkXtfdzRI WiTlb-baMWYD, E pgehKjT bk ngjLIF hj XYM PUGaVyP ntcTXRM. MZj QfEXTcg TiWTXtT, IHIawhVTX Ig lmS jLTGfqMjWe YMHXo, Jgtgg KoAfasSj KLG fZUlMfZ MV QkOc uieK kHTl nh nzPN bjX VfPKxK XrI jqUVIRL UgzbUrVKSn SW bUK IYSlPco deUXRTe gSWFVG hcI iMdaxZX sW czSPakEW. LmS RJWWfVRTM cXHcMnIb dm ZUUEkf tdVIEVWiK jgfZxTW sR gucYGkIgY hcetYTfZRkTl XNURsRe wgRX RPidnQRKMQbn EeL PUGaVyP ntcTXRMl ax hYv OGm oS VVSUKJMxK rjS fKTUkaym TFRVfjPj bUGM H GyQnwhRX jYllja gISXWYIj. AhIA PWyPYvWbT ZS YmwhYvV GloIeLRJ MV JsRct ZRbVLl gk QfDTWhdRX caOMZ, XrEr qT RdVCnlnce KLTSVHj. BUK GLInW dqf VYfLTlnce vUWOgPp IcVEf Xy Xfg hUXVAWk jlVtYVWiK ZV N YBUKvI YfReKjS lhfQV. R GNOnWZKNR xeEwTjg cS ZYE UWsSWzXU TmSd eRRE-KICMepSQ OjOeSyWfE QGQcEeQfSL HVo JmwbQ Oe TaW kSRKYTSn XYIg GKL IwFcfRRJ ZN mZj QfEXTcg TiWTXtT Sp Xfg glYkEf 390 SsR ZKW FSmMmIgOOL TvErhceSj. taWxS dvGJOiMjUf GKL IHXcpRRJ kO VgASi EIY gjJkeNXx JSwTmpSaZj TaSy Oiv XKUcXcg eKEHXoH rq hUK TOglwcc GVQUmEd. waK HM XrIqg QbSgOgWshj zW VVZ WVKhXBac CIpxWPK cArWw, kYzGJ Wn MedbQxK FI ZYtWbaj RXktiitI OOiEXMeY tUH kPqq Pl YpSmWr QfDTQbZRka gU FLHsErg OPIVSl lt gpJXGa mIjWhXvLW. PSspRNZZOgk tT jvGWfdXp IaJ tJGoWq ecaZiOe as QfDTWhdRX iPIxZW mSlvfbR ZN VgrdlKMPU dW dWgOOHXoH ZA hUK eEXV yc UzZWZbI RKPKLZ Xy MlhceSRTbgs Oeu EXOdPRJYK vVQzYrkbT XVShmwQVJ EPR nIidVIxZ Xy EsvVbXZSXV jbkzXKSn SeTl. gG LRDMrA Wf G XEgWwWT KITa oLRb eKyLVC Xm cb NIkIoW fUVEX EOkESTR Uy PRsXgchVTX Ok hjfWFVOWiK R KbSIbXkXgqb bL jOfW xciK, JQf ZbRUcRx, HR oRb wgRX ZNogpWex E EchQRVQ UK H TBSetOZ, G gRhYwOdDMPU VKVVg GvaMxK mp PRNRLY gk O lJIT, O mYeVVTz KEoQmp deUTElk, f hYIICR jJ VfRINaMyR, Y jcfZZNZ kDgkvQ, Qf V RVbjUKRMxK bgjVIV,. aVUjgj DSFSn GRV OK uYSkHjA QNZVGhjngVu MPhj XYM NHBSMDc rq fRGU Ok owWkv MPTjVdIgOHU arIrjSe Oe TaW fRUIIUg nTRKR Uy HR obceigOeG ijtQVJW, Qb V WVKbTwHVI WrqfNMV, Ok gs O evXYcmO fZ N VxYMzLctOY JVVbUj. HYzW CPdPZbl ItU Fo IvrZVIZTeq jlgIIUgZH Sg N JBYImX ntWiOcEZW ucjJIUgZH Sg gNx HGDMli SaZZTr gw WeuMTSXXcg gNKVYqL qgfiOTEl SsR TFQRioMeO gGLRW DLYv hUK VNmaym ZJ ENZjaVL gU xeImYrg. o caiIll rOp GSUS oLV YhKLaMyR mh kUKkHXj ySdGSTOmMcg ZUwPJIMli QbSgUmWw WewSTaVXZWa cBaLyYr jOiOeG mg wSRu MV OiH ZV N ctf XrEr nSNbVS blx TZEEN goEkM hTvOExKcf Wf IfNlaxhVEX YWoL kPR JxMMxMrkca UW AVUjgj tSPhmSc. BUK EPOoPw cbfcVR bk yVRK WWQc ETbVbBac mSluhVZlTXk f PivEEV oS RKPKLZ GyRrtcY GeD mZzg ZK WJcpPU JR MNHVnIb cUNOeSm. GyVVIaKgZ, SeM bL MOI pYlfOZKeTTd xSTLVKht XVVRZL VJ BIqqieIV AoSnZRsMNWoc SMPUFLW kX pkgX UW BXasU TFQRfjQZaRJ. TcEsPYdWYOkY hX hcdGYVWiK iMfUNYGoW fcg VTUEXV xhfFH Cg V WpagKF HRn RcvkbXb SXUzfZKc EciGVZa Uy PXC Sup. thXkHXjrciv, GQbXYiZRTM HGmIqu hb OeFhjrOkzSP hcEk Qf HxPRq QmfWSOVD Xnjb kvQRcmEiQYe uf EEXfqfVYVD hj zbRLXJcmMjMQ KGaMDMcu Wf IcETjqm lEEEQZTkIORx. lZyPsvWbT fF VgrdlKMPU ncjbRSL MVyQ qkbTRV-UlWw hf DYNhdYjMe StJLsRcu ZRJ kO mZj bVtIUgdXp WS YAPIvHgpU hYVRl SsR iLRPWiK gZbIxZWoW dtcZ UeE TfthYvV. gOmPp XeUMLGDMmp aRIYAgaxaj tSPgdWkMQ Uy OEBHucfR GeD hhjfRKMPU ncjbRSL JSwTmpSaZj. snTxShLIPhgc, gWYOvf-FkWcf OhZYOkaxOkzSP gpFjgfZxTW rEtg SZKiGXV. HceKVQZgMeO NIvLWC Xm ecZVlTbfl gpJXGan Mj bUK yPVCX bgTRTTE TYfWeJX FWnGcWfOGN MxJmtaNZZOg lt ierYVVjVZaRJ xUXsXggg. FejTXex Oeu RGhrSiS NIvLWC Mq dOfKU Og lwijKIF aZXYWQY yVV sHcphVLpIgY zgVIW CbY TiWTXtTQsRe cURTkS. LWhiiv MFSiXZNVItaMyR gu hUK TOkfjfjKSPS jJ dWQKKU GyQnwhVTX SXUzfZKc. vVZ EUdRTM VJ xIryceQZNZ SsR UzWVfdFlbRJ vVQzYrkbT NRS eWi hf KLG dmScQSKKHXsSl qT PUdPnlnbX zHGboMkQRY. VVRCIowSaZcY, bVjbkzXa aVRRORSxUX rEq gjbRmEW Sx O UzWEWkPZVR Uy PXC Sup. HUK XOTd ng kF QKhdKRbR ZAL GyWr qT ZGZNmSnbZEK KRZRkQge KLTyWgvceOVS mZfh drc GldWk Qa ZAL TyXcphVGcLr S rmizEF ca WpagKFZ YCIb dm N YZNZdj SeKITdmMjM, RTyVVmMli QbTjIlljbTP EPR VGYQRbBUK ERYoPVMlOnk rOgGMPU jJ ZLRTMPXsIq tScXVSXfyWex XJS nEdM RTMPXI Sp oiYZZPeW jbkzXKSn GfTYGuVVkXgpU gUXEmZjf. rLXQaVXZWa Uy PRDIp-gbgKiPkaxS VOGJOiKVa UGL MYBXfgf aKTElknhRKIF hcI UZVbx MSB JcfSeGkEW aiSeKMVm ncjbRSL. hW k VcuiYZ, kHX khcgv SH Oi MUMaZBac sW czhRTUIgY BScC FGmjRU bUK vVRpMlgg bL RN hjlOezWChdSe. EVZA HPv Xfg OfYfCbSySU tSOdgIoQgOxZ, E zYpkgg VVRlhjQkzZG gZIba N aGPJsIb ocQKc OY kjQlII KRZRkQSOvHXsSl. CZgNfUZZ yVZJ MU TVV WZbS uLMxK YeVVKmEW as hYv VGOg afZYJ, tUc CYaj OgZVMilx QRE SPZt FVVRLBa GyQnwhVTX SXUzfZKc. tSVP-nWeRw LbkQnnSf UW AVUjgj tSPhmSc IeK tIYxHYph NTU VTjD OTtSTRdRX bb ZAL RoIbu OaJ gOeahWVJ HKQoEkMQ HR aLo GgtQhSjTTfhSj. RX C PVWZK YKOLP, EWctg bL kHX kfaV FVIOiMjIgOHU EBI etOaZVD TUhSjJ XQ gcEiMQ IHTTEXgpU eKjOnjhSj sEUSY Se bUK KVPoW ccQU ajEk ax SeKMVZZH kW jOMOMx Xfg ceMRNbkfhZFR. cb ZRkMeVKPWo QYA PR IfNVWwbVu SXSm PfaVTz PXC GmodRZZTbnj SUxI UVjYcL VZL aVkHc uSPXVTl TjQfDI Mbjae bb OMZ GyQnghVZfRl. s kWerREWVP ZVfZBaYDMmp VNY VVXjD bVvH Vc XSeNVTx bTnErgg VT ZTl jjQfIHU hj PVOVZBTEDI rtOaYRCmatbj FRNm VRU bb VKVXoGr vVRS WRhe jlgFWWfZ Xf caGNaLyVguSQ OeDbnnRlrPU OiH ZVfZBaYDMmpg. JNZLX S uOkzIPh hIUQPGE YImSpfg ZGp Nhl gS fw EPm dQdMQOtaI pMlcbPORL ZSnb, fEI EOiRfb caM H TBMag hb ZYEbj ufZMEEm. vGTMfY vVRDVmn Wf KmOennbX wVQa dXj beGwPXsSlcZ UUjT-VWshizG ROmEUQTS MV VoWmwfPKj AgV jbkzXKSn XYIg ZKHRCEav ciKi LTjlS evXYcmOj If cBKI kW rjS VTkEkfjh. KyI Ncr-PVdRR tJGoWq-ecaZiOe hwWmzPGUZW fN gNx IECMa tSNJ RNW owWkv SH WiJfZZGMPSx Epg bbc dOoasU lG E NSqIc PVMALV DS gpQYaUE TlyfZsYVSn XYIg StRI ET Y rfbLZLX Xtf RE IPhdXp. BUKLL EBI rjS RRVMXfyg kyEV adQZK eKtS-PsJc wgRX VNmayZVDIPhn WlKU GL aLo TpkjVRVGX gk VRMMPU V FRVXOGN EmGmwbg, NRVbfl O TIIFWo-GRZQ TNTFoV, mt PROeG TkxWXEIF O rIcT-QKyPRoH pqZR. zYE ijtQVJWGg iIVLRJ MV QkMlvOVT VNmaym gISHWgMeO TGOL VsWc vc jNRT bk wSWvVTSY Xf If OwLRDMrA aNTRGXejbk, NLKQc Mj QaJxLH k TpgZhJV Th Ssm RtGGgn-GfVgXHS QoGfcbVYd. im ax QfEGGfiIU eVZA aLo XpwggKU MXlmcUJ SH aVRROVTz HRn IveVNTXIgY jbkzXa SiXZbYKFLRDW mp jNXZOnk hcdGYVWiK jgfZxTW kRb tSfUlRVW rOerKGfn. mUMaZBac wElcURSVNm XtfdJ XJS aSlVQGMPSx Sl yVVIY AVUjgj tSPhmSc Qf HtZIn. ml vVVY THThySi NI KboVfLhIx aLo QYkb PUeCXhyg SvLKbY GfUcaMPRq WceieOkY. PW gSXzR YWoL R JeOxM SFIpxWRc fF lWhiizXa hcVVIgY. pL XrIl gZNHfRTlj ce KLG aVNfZ RRxTIxXq qT fejTXex gVtYTWoc, ZV cGKaMmYjcf gNV AlhjQkJ WWfmSlVQOGN MnIlvWSOTAmatb REH CioLVVgOvHXsSl. YS UOXHealVk KLG WhTfZgGGJI yJ qAggKd IgljUizXa On E gZRRNKI DS qgQhXV CheuikzRI. KZ HVNVTx dLkX gu aRGeT Uq f gVtYTWoc TWaZxeX kRb fWfIlSl ayg gISRObEkQbT tSSxK rjS hTZTl gk QfDTWhdRX ebXD. zYlWcsiRTkLr, oj RVCZG WiXf bUK IHVkHgiaf UW AVUjgj tSPhmSc IaJ HbXvMlg hUK VLXejbkJ WWfmSlVQOGN XBYqv OaJ RSlmwOetI, KbXPlLVTz HR sRrtcQaTTbgs hf KLG QjRWQaKFLRD TpqPYKd. wX UtbTCYFS rMkP NT HcIBZggk bL kHX efXfI WGQpVZbl-JxZMqR ntWaIZPeWx.";
    
    /* frequencies of a-z in English
    ** Vigenere applies different Caesar ciphers to consecutive letters
    ** so we can still make use of statistical cryptanalysis */
    final static double freq[] =  {
        0.08167, 0.01492, 0.02782, 0.04253, 0.12702, 0.02228, 0.02015,
        0.06094, 0.06966, 0.00153, 0.00772, 0.04025, 0.02406, 0.06749,
        0.07507, 0.01929, 0.00095, 0.05987, 0.06327, 0.09056, 0.02758,
        0.00978, 0.02360, 0.00150, 0.01974, 0.00074
    }; 
 

    public static void main(String[] args) 
    {
        int encryptedLength = encrypted.length();
        char[] encoded = new char [encryptedLength] ;
        char[] key =  new char [encryptedLength] ;
        String plaintext, sKey = "", sEncoded;
        encrypted.getChars(0, encryptedLength, encoded, 0);
        int text[] = new int[encryptedLength], tLength =0;
        double fit, best_fit = 1e100;

        
        for (int i = 0; i < encryptedLength; i++){
            if (Character.isUpperCase(encoded[i]))
                text[tLength++] = encoded[i] - 'A';
            else if(Character.isLowerCase(encoded[i]))
                text[tLength++] = encoded[i] - 'a';
        }
        
        //minimum letters of key = 1  and maximum = 30
        for (int i = 1; i < 31; i++) {
            fit = frequency(text, tLength, i, key);
            System.out.printf("KeyLength: %2d, f: %.4f, ", i, fit);
            System.out.print(key);
            
            // find most possible fitness for the key
            if (fit < best_fit) {
                best_fit = fit;

                //we store the value of the last most possible key to our variable
                sKey = String.copyValueOf(key);
                
                // take care of key length or pattern repeat won't work right
                //  when we'll try to decrypt
                sKey =  sKey.substring(0,i);
            }
            
            // if the fitness is < 0.05 the key should be right
            // even in pretty evenly distributed data
            // so we just did that for efficiency purposes
             if (fit < 0.05) break;
            
            System.out.print("\n");
            
        }
        
        sEncoded = String.copyValueOf(encoded);
        System.out.println("The best fit: " + best_fit);
        System.out.println("\nThe right key:");
        System.out.println(sKey + "\n");
        plaintext = decrypt(encrypted, sKey);
        System.out.println(plaintext);
        
        try {
            (new OutputPlaintext()).plaintext(plaintext, sKey);
        } catch (IOException ex) {
            Logger.getLogger(Vigenere.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
 
 
    static String decrypt(String encryptedText, final String key) 
    {
        String plaintext = "";
        encryptedText = encryptedText.toUpperCase();

        for (int i = 0, j = 0; i < encryptedText.length(); i++) {
            char c = encryptedText.charAt(i);
            
            //if char is whitespace it remains unchanged 
            if (Character.isWhitespace(c))
                plaintext += (char) c;
            
            //if character is punctuation
            else if (Character.toString(c).matches("\\p{Punct}"))
                plaintext += (char) c;
                        
            //if char is not inside our alphabet continue
            if (c < 'A' || c > 'Z') 
                continue;
            
            //else decrypt
            plaintext += (char)((c - key.charAt(j) + 26) % 26 + 'A');

            //repeat the key if you reach the end of it.
            j = ++j % key.length();
            
        }
        
        return plaintext;
    }
 
    // find best match from expected frequency
    static int bestMatch(final double[] out, final double[] frequency) 
    {
        double sum = 0, fit, d, best_fit = 1e100;
        int rotate, best_rotate = 0;
        
        for (int i = 0; i < 26; i++)
            sum += out[i];
        
        // for rotation as big as the 26 numbers of our alphabet
        for (rotate = 0; rotate < 26; rotate++) {
            fit = 0; 
            
            for (int i = 0; i < 26; i++) {
                d = out [ (i + rotate) % 26] / sum - frequency[i];
                fit += d * d / frequency[i];
            }
            
            // find best fitness and rotation 
            if (fit < best_fit) {
                best_fit = fit;
                best_rotate = rotate;
            }
        }

        return best_rotate;
    }

    static double frequency(final int []message, int tLength, int interval, char[] key) 
    {
        int i, j, rotation;
        double sum, d, fit;
        double[] accu = new double [26];
        double[] out = new double [26];

        for (j = 0; j < interval; j++) {
            for (i = 0; i < 26; i++)
                out[i] = 0;
            
            for (i = j; i < tLength; i += interval)
                out[message[i]]++;
            rotation = bestMatch(out, freq);
            
            // for every key find the next letter of the rotation
            try {
                key[j] = (char)(rotation + 'A');
            } 
            // just in case something goes wrong
            catch (Exception e) {
                    System.out.print(e.getMessage());
            }
            
            for (i = 0; i < 26; i++)
                accu[i] += out [ (i + rotation) % 26];
        }

        for (i = 0, sum = 0; i < 26; i++)
            sum += accu[i];
        
        //calculate distance and ret
        for (i = 0, fit = 0; i < 26; i++) {
            d = accu[i] / sum - freq[i];
            fit += d * d / freq[i];
        }

        key[interval] = '\0';
        return fit;
    }
 
}
