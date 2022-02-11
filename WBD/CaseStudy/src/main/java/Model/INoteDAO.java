package Model;

import java.sql.SQLException;
import java.util.List;

public interface INoteDAO {
    public List<Note> getAllNote() throws SQLException;
    public Note getNodeById(String id);
    public List<Note> searchNote(String keyword);
    public boolean deleteNoteById(String id);
    public boolean insertNote(Note note);
    public boolean updateNote(Note note);
}
