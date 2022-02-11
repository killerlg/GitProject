package Service;

import Model.Note;

import java.sql.SQLException;
import java.util.List;

public interface INoteMethod {
    public List<Note> getAllNote() throws SQLException;
    public Note getNodeById(String id);
    public List<Note> searchNote(String keyword);
    public boolean deleteNoteById(String id);
    public boolean insertNote(Note note);
    public boolean updateNote(Note note);
}
