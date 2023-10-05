package edu.uc.cech.soit.myclassjournal;

import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import edu.uc.cech.soit.myclassjournal.service.JournalServiceStub;

@Controller
public class MyClassJournalController {
    /**
     * Handle the / endpoint
     * @return
     */
    @RequestMapping("/")
    public String index() {
        return "start";
    }

    @PostMapping("/submit")
    public String submitJournalEntry(@RequestParam String notes, @RequestParam String date) {
        // create JournalEntry object
        JournalEntry journalEntry = new JournalEntry();
        JournalServiceStub journalServiceStub = new JournalServiceStub();
        journalEntry.setNotes(notes);
        journalEntry.setDate(date);

        // save JournalEntry to JournalService
        journalServiceStub.save(journalEntry);

        return "redirect:/";
    }


}