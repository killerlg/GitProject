package Model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class NoteDAO implements INoteDAO{
    private String jdbcURL = "jdbc:mysql://localhost:3306/casestudy?useSSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "Dodinhquanganh1";
    public NoteDAO() {
    }

    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return connection;
    }



    @Override
    public List<Note> getAllNote()  {
        List<Note> listNote = new ArrayList<>();
        String query = "select * from note";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query);
        ) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String title = rs.getString("title");
                String content = rs.getString("content");
                Note note = new Note(id, title, content);
                listNote.add(note);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return listNote;
    }

    @Override
    public Note getNodeById(String id) {
        Note note = null;
        String query = "Select * from note where id = ?";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query);
        ) {
            preparedStatement.setString(1,id);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int idNote = rs.getInt("id");
                String title = rs.getString("title");
                String content = rs.getString("content");
                note = new Note(idNote, title, content);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return note;
    }

    @Override
    public List<Note> searchNote(String keyword) {
        List<Note> listNote = new ArrayList<>();
        String query = "Select * from note where id like ? or title like ? or content like ?";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query);
        ) {
            keyword = "%"+keyword+"%";
            preparedStatement.setString(1,keyword);
            preparedStatement.setString(2,keyword);
            preparedStatement.setString(3,keyword);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int idNote = rs.getInt("id");
                String title = rs.getString("title");
                String content = rs.getString("content");
                Note note = new Note(idNote, title, content);
                listNote.add(note);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listNote;
    }

    @Override
    public boolean deleteNoteById(String id) {
        String query = "delete from note where id = ?";
        boolean deleted = false;
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query);
        ) {
            preparedStatement.setString(1,id);
            deleted = preparedStatement.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return deleted;
    }

    @Override
    public boolean insertNote(Note note) {
        String query = "INSERT INTO `note` (`title`, `content`) VALUES (?, ?);";
        boolean inserted = false;
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query);
        ) {
            preparedStatement.setString(1,note.getTitle());
            preparedStatement.setString(2,note.getContent());
            inserted = preparedStatement.executeUpdate() > 0 ;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return inserted;
    }

    @Override
    public boolean updateNote(Note note) {
        String query = "UPDATE `note` SET `title` = ?, `content` = ? WHERE (`id` = ?);";
        boolean updated = false;
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query);
        ) {
            preparedStatement.setString(1,note.getTitle());
            preparedStatement.setString(2,note.getContent());
            preparedStatement.setInt(3,note.getId());
            updated = preparedStatement.executeUpdate() > 0 ;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return updated;
    }
}
