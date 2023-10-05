package edu.uc.cech.soit.myclassjournal.service;

import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JournalServiceStub implements IJournalService {
    private final List<JournalEntry> allJournalEntries = new ArrayList<>();

    @Override
    public void save(JournalEntry journalEntry) {
        allJournalEntries.add(journalEntry);
    }

    @Override
    public List<JournalEntry> fetchAll() {
        return allJournalEntries;
    }
}
