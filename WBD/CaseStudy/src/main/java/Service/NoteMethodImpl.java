package Service;

import Model.Note;
import Model.NoteDAO;

import java.util.List;

public class NoteMethodImpl implements INoteMethod{
    private NoteDAO noteDAO = new NoteDAO();

    @Override
    public List<Note> getAllNote()  {
        return noteDAO.getAllNote();
    }

    @Override
    public Note getNodeById(String id) {
        return noteDAO.getNodeById(id);
    }

    @Override
    public List<Note> searchNote(String keyword) {
        return noteDAO.searchNote(keyword);
    }

    @Override
    public boolean deleteNoteById(String id) {
        return noteDAO.deleteNoteById(id);
    }

    @Override
    public boolean insertNote(Note note) {
        return noteDAO.insertNote(note);
    }

    @Override
    public boolean updateNote(Note note) {
        return noteDAO.updateNote(note);
    }
}
