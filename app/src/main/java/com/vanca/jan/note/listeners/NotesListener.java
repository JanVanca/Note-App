package com.vanca.jan.note.listeners;

import com.vanca.jan.note.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
