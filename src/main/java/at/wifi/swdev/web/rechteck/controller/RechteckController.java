package at.wifi.swdev.web.rechteck.controller;

import at.wifi.swdev.web.rechteck.model.Rechteck;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RechteckController {

    public RechteckController() {
    }

    @GetMapping({"/", "/neu"})
    public String showNeu(Model model) {
        model.addAttribute("rechteck", new Rechteck());
        return "neu";
    }

    @PostMapping("/neu")
    public String doNeu(
            Model model,
            @ModelAttribute Rechteck rechteck) {

//        Validierung versucht - leider nicht geschafft, also auf HTML-View umgestiegen

//        List<String> errMsgs = new ArrayList<>();
//        if (rechteck.getSeitea() instanceof java.lang.String) {
//            System.out.println("Fehler bei der Validierung (seitea)! " + rechteck.getText());
//            errMsgs.add("Fehler bei der Eingabe! Nur Zahlen eingeben!");
//            model.addAttribute("errMsgTitle", "Nur Zahlen eingeben!");
//        }
//        if (Objects.nonNull(rechteck.getSeiteb())
//                && rechteck.getSeiteb().isString   {
//            System.out.println("Fehler bei der Validierung (seiteb)! " + rechteck.getText());
//            errMsgs.add("Fehler bei der Eingabe! Nur Zahlen eingeben!");
//            model.addAttribute("errMsgText", "Nur Zahlen eingeben!");
//        }
//        if (!errMsgs.isEmpty()) {
//            model.addAttribute("errMsgs", errMsgs);
//            model.addAttribute("rechteck", rechteck);
//            return "new";
//        }

        rechteck.setUmfang((rechteck.getSeitea() * 2) + (rechteck.getSeiteb() * 2));
        rechteck.setFlaeche(rechteck.getSeitea() * rechteck.getSeiteb());
        model.addAttribute("rechteck", rechteck);
        return "anzeige";
    }

}
